---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:35:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.RemoteScope.Builder.html
title: WireFormats.RemoteScope.Builder
---

# WireFormats.RemoteScope.Builder

## Content

Package [akka.remote](package-summary.html)
## Class WireFormats.RemoteScope.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")\>
			- - akka.remote.WireFormats.RemoteScope.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[WireFormats.RemoteScopeOrBuilder](WireFormats.RemoteScopeOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[WireFormats.RemoteScope](WireFormats.RemoteScope.html "class in akka.remote")

---

```
public static final class WireFormats.RemoteScope.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")>
implements [WireFormats.RemoteScopeOrBuilder](WireFormats.RemoteScopeOrBuilder.html "interface in akka.remote")
```

Protobuf type `RemoteScope`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.RemoteScope](WireFormats.RemoteScope.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[WireFormats.RemoteScope](WireFormats.RemoteScope.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")` | `[clearNode](#clearNode())()` | `required .AddressData node = 1;` |
	| `[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[WireFormats.RemoteScope](WireFormats.RemoteScope.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote")` | `[getNode](#getNode())()` | `required .AddressData node = 1;` |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[getNodeBuilder](#getNodeBuilder())()` | `required .AddressData node = 1;` |
	| `[WireFormats.AddressDataOrBuilder](WireFormats.AddressDataOrBuilder.html "interface in akka.remote")` | `[getNodeOrBuilder](#getNodeOrBuilder())()` | `required .AddressData node = 1;` |
	| `boolean` | `[hasNode](#hasNode())()` | `required .AddressData node = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.WireFormats.RemoteScope))​([WireFormats.RemoteScope](WireFormats.RemoteScope.html "class in akka.remote") other)` |  |
	| `[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")` | `[mergeNode](#mergeNode(akka.remote.WireFormats.AddressData))​([WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") value)` | `required .AddressData node = 1;` |
	| `[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")` | `[setNode](#setNode(akka.remote.WireFormats.AddressData))​([WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") value)` | `required .AddressData node = 1;` |
	| `[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")` | `[setNode](#setNode(akka.remote.WireFormats.AddressData.Builder))​([WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") builderForValue)` | `required .AddressData node = 1;` |
	| `[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [WireFormats.RemoteScope](WireFormats.RemoteScope.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [WireFormats.RemoteScope](WireFormats.RemoteScope.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [WireFormats.RemoteScope](WireFormats.RemoteScope.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                        int index,
		                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote") mergeFrom​([WireFormats.RemoteScope](WireFormats.RemoteScope.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                 akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                          throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasNode
		
		
		
		```
		public boolean hasNode()
		```
		
		`required .AddressData node = 1;`
		
		Specified by:
		`[hasNode](WireFormats.RemoteScopeOrBuilder.html#hasNode())` in interface `[WireFormats.RemoteScopeOrBuilder](WireFormats.RemoteScopeOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the node field is set.
		- #### getNode
		
		
		
		```
		public [WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") getNode()
		```
		
		`required .AddressData node = 1;`
		
		Specified by:
		`[getNode](WireFormats.RemoteScopeOrBuilder.html#getNode())` in interface `[WireFormats.RemoteScopeOrBuilder](WireFormats.RemoteScopeOrBuilder.html "interface in akka.remote")`
		Returns:
		The node.
		- #### setNode
		
		
		
		```
		public [WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote") setNode​([WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") value)
		```
		
		`required .AddressData node = 1;`
		- #### setNode
		
		
		
		```
		public [WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote") setNode​([WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .AddressData node = 1;`
		- #### mergeNode
		
		
		
		```
		public [WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote") mergeNode​([WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") value)
		```
		
		`required .AddressData node = 1;`
		- #### clearNode
		
		
		
		```
		public [WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote") clearNode()
		```
		
		`required .AddressData node = 1;`
		- #### getNodeBuilder
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") getNodeBuilder()
		```
		
		`required .AddressData node = 1;`
		- #### getNodeOrBuilder
		
		
		
		```
		public [WireFormats.AddressDataOrBuilder](WireFormats.AddressDataOrBuilder.html "interface in akka.remote") getNodeOrBuilder()
		```
		
		`required .AddressData node = 1;`
		
		Specified by:
		`[getNodeOrBuilder](WireFormats.RemoteScopeOrBuilder.html#getNodeOrBuilder())` in interface `[WireFormats.RemoteScopeOrBuilder](WireFormats.RemoteScopeOrBuilder.html "interface in akka.remote")`
		- #### setUnknownFields
		
		
		
		```
		public final [WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteScope.Builder](WireFormats.RemoteScope.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AddressData.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AddressData.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AddressDataOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.RemoteScope.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.RemoteScope.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.RemoteScopeOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.RemoteScope.Builder.html](https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.RemoteScope.Builder.html)*