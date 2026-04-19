---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:35:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.RemoteRouterConfig.Builder.html
title: WireFormats.RemoteRouterConfig.Builder
---

# WireFormats.RemoteRouterConfig.Builder

## Content

Package [akka.remote](package-summary.html)
## Class WireFormats.RemoteRouterConfig.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")\>
			- - akka.remote.WireFormats.RemoteRouterConfig.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[WireFormats.RemoteRouterConfigOrBuilder](WireFormats.RemoteRouterConfigOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[WireFormats.RemoteRouterConfig](WireFormats.RemoteRouterConfig.html "class in akka.remote")

---

```
public static final class WireFormats.RemoteRouterConfig.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")>
implements [WireFormats.RemoteRouterConfigOrBuilder](WireFormats.RemoteRouterConfigOrBuilder.html "interface in akka.remote")
```

Protobuf type `RemoteRouterConfig`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[addAllNodes](#addAllNodes(java.lang.Iterable))​(java.lang.Iterable<? extends [WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote")> values)` | `repeated .AddressData nodes = 2;` |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[addNodes](#addNodes(int,akka.remote.WireFormats.AddressData))​(int index,  [WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") value)` | `repeated .AddressData nodes = 2;` |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[addNodes](#addNodes(int,akka.remote.WireFormats.AddressData.Builder))​(int index,  [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") builderForValue)` | `repeated .AddressData nodes = 2;` |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[addNodes](#addNodes(akka.remote.WireFormats.AddressData))​([WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") value)` | `repeated .AddressData nodes = 2;` |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[addNodes](#addNodes(akka.remote.WireFormats.AddressData.Builder))​([WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") builderForValue)` | `repeated .AddressData nodes = 2;` |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[addNodesBuilder](#addNodesBuilder())()` | `repeated .AddressData nodes = 2;` |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[addNodesBuilder](#addNodesBuilder(int))​(int index)` | `repeated .AddressData nodes = 2;` |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.RemoteRouterConfig](WireFormats.RemoteRouterConfig.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[WireFormats.RemoteRouterConfig](WireFormats.RemoteRouterConfig.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[clearLocal](#clearLocal())()` | `required .Payload local = 1;` |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[clearNodes](#clearNodes())()` | `repeated .AddressData nodes = 2;` |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[WireFormats.RemoteRouterConfig](WireFormats.RemoteRouterConfig.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote")` | `[getLocal](#getLocal())()` | `required .Payload local = 1;` |
	| `[ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote")` | `[getLocalBuilder](#getLocalBuilder())()` | `required .Payload local = 1;` |
	| `[ContainerFormats.PayloadOrBuilder](ContainerFormats.PayloadOrBuilder.html "interface in akka.remote")` | `[getLocalOrBuilder](#getLocalOrBuilder())()` | `required .Payload local = 1;` |
	| `[WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote")` | `[getNodes](#getNodes(int))​(int index)` | `repeated .AddressData nodes = 2;` |
	| `[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")` | `[getNodesBuilder](#getNodesBuilder(int))​(int index)` | `repeated .AddressData nodes = 2;` |
	| `java.util.List<[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")>` | `[getNodesBuilderList](#getNodesBuilderList())()` | `repeated .AddressData nodes = 2;` |
	| `int` | `[getNodesCount](#getNodesCount())()` | `repeated .AddressData nodes = 2;` |
	| `java.util.List<[WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote")>` | `[getNodesList](#getNodesList())()` | `repeated .AddressData nodes = 2;` |
	| `[WireFormats.AddressDataOrBuilder](WireFormats.AddressDataOrBuilder.html "interface in akka.remote")` | `[getNodesOrBuilder](#getNodesOrBuilder(int))​(int index)` | `repeated .AddressData nodes = 2;` |
	| `java.util.List<? extends [WireFormats.AddressDataOrBuilder](WireFormats.AddressDataOrBuilder.html "interface in akka.remote")>` | `[getNodesOrBuilderList](#getNodesOrBuilderList())()` | `repeated .AddressData nodes = 2;` |
	| `boolean` | `[hasLocal](#hasLocal())()` | `required .Payload local = 1;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.WireFormats.RemoteRouterConfig))​([WireFormats.RemoteRouterConfig](WireFormats.RemoteRouterConfig.html "class in akka.remote") other)` |  |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[mergeLocal](#mergeLocal(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") value)` | `required .Payload local = 1;` |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[removeNodes](#removeNodes(int))​(int index)` | `repeated .AddressData nodes = 2;` |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[setLocal](#setLocal(akka.remote.ContainerFormats.Payload))​([ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") value)` | `required .Payload local = 1;` |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[setLocal](#setLocal(akka.remote.ContainerFormats.Payload.Builder))​([ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)` | `required .Payload local = 1;` |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[setNodes](#setNodes(int,akka.remote.WireFormats.AddressData))​(int index,  [WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") value)` | `repeated .AddressData nodes = 2;` |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[setNodes](#setNodes(int,akka.remote.WireFormats.AddressData.Builder))​(int index,  [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") builderForValue)` | `repeated .AddressData nodes = 2;` |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [WireFormats.RemoteRouterConfig](WireFormats.RemoteRouterConfig.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [WireFormats.RemoteRouterConfig](WireFormats.RemoteRouterConfig.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [WireFormats.RemoteRouterConfig](WireFormats.RemoteRouterConfig.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               int index,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                               java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") mergeFrom​([WireFormats.RemoteRouterConfig](WireFormats.RemoteRouterConfig.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                        akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                 throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasLocal
		
		
		
		```
		public boolean hasLocal()
		```
		
		`required .Payload local = 1;`
		
		Specified by:
		`[hasLocal](WireFormats.RemoteRouterConfigOrBuilder.html#hasLocal())` in interface `[WireFormats.RemoteRouterConfigOrBuilder](WireFormats.RemoteRouterConfigOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the local field is set.
		- #### getLocal
		
		
		
		```
		public [ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") getLocal()
		```
		
		`required .Payload local = 1;`
		
		Specified by:
		`[getLocal](WireFormats.RemoteRouterConfigOrBuilder.html#getLocal())` in interface `[WireFormats.RemoteRouterConfigOrBuilder](WireFormats.RemoteRouterConfigOrBuilder.html "interface in akka.remote")`
		Returns:
		The local.
		- #### setLocal
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") setLocal​([ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`required .Payload local = 1;`
		- #### setLocal
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") setLocal​([ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .Payload local = 1;`
		- #### mergeLocal
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") mergeLocal​([ContainerFormats.Payload](ContainerFormats.Payload.html "class in akka.remote") value)
		```
		
		`required .Payload local = 1;`
		- #### clearLocal
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") clearLocal()
		```
		
		`required .Payload local = 1;`
		- #### getLocalBuilder
		
		
		
		```
		public [ContainerFormats.Payload.Builder](ContainerFormats.Payload.Builder.html "class in akka.remote") getLocalBuilder()
		```
		
		`required .Payload local = 1;`
		- #### getLocalOrBuilder
		
		
		
		```
		public [ContainerFormats.PayloadOrBuilder](ContainerFormats.PayloadOrBuilder.html "interface in akka.remote") getLocalOrBuilder()
		```
		
		`required .Payload local = 1;`
		
		Specified by:
		`[getLocalOrBuilder](WireFormats.RemoteRouterConfigOrBuilder.html#getLocalOrBuilder())` in interface `[WireFormats.RemoteRouterConfigOrBuilder](WireFormats.RemoteRouterConfigOrBuilder.html "interface in akka.remote")`
		- #### getNodesList
		
		
		
		```
		public java.util.List<[WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote")> getNodesList()
		```
		
		`repeated .AddressData nodes = 2;`
		
		Specified by:
		`[getNodesList](WireFormats.RemoteRouterConfigOrBuilder.html#getNodesList())` in interface `[WireFormats.RemoteRouterConfigOrBuilder](WireFormats.RemoteRouterConfigOrBuilder.html "interface in akka.remote")`
		- #### getNodesCount
		
		
		
		```
		public int getNodesCount()
		```
		
		`repeated .AddressData nodes = 2;`
		
		Specified by:
		`[getNodesCount](WireFormats.RemoteRouterConfigOrBuilder.html#getNodesCount())` in interface `[WireFormats.RemoteRouterConfigOrBuilder](WireFormats.RemoteRouterConfigOrBuilder.html "interface in akka.remote")`
		- #### getNodes
		
		
		
		```
		public [WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") getNodes​(int index)
		```
		
		`repeated .AddressData nodes = 2;`
		
		Specified by:
		`[getNodes](WireFormats.RemoteRouterConfigOrBuilder.html#getNodes(int))` in interface `[WireFormats.RemoteRouterConfigOrBuilder](WireFormats.RemoteRouterConfigOrBuilder.html "interface in akka.remote")`
		- #### setNodes
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") setNodes​(int index,
		                                                       [WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") value)
		```
		
		`repeated .AddressData nodes = 2;`
		- #### setNodes
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") setNodes​(int index,
		                                                       [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") builderForValue)
		```
		
		`repeated .AddressData nodes = 2;`
		- #### addNodes
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") addNodes​([WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") value)
		```
		
		`repeated .AddressData nodes = 2;`
		- #### addNodes
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") addNodes​(int index,
		                                                       [WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote") value)
		```
		
		`repeated .AddressData nodes = 2;`
		- #### addNodes
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") addNodes​([WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") builderForValue)
		```
		
		`repeated .AddressData nodes = 2;`
		- #### addNodes
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") addNodes​(int index,
		                                                       [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") builderForValue)
		```
		
		`repeated .AddressData nodes = 2;`
		- #### addAllNodes
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") addAllNodes​(java.lang.Iterable<? extends [WireFormats.AddressData](WireFormats.AddressData.html "class in akka.remote")> values)
		```
		
		`repeated .AddressData nodes = 2;`
		- #### clearNodes
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") clearNodes()
		```
		
		`repeated .AddressData nodes = 2;`
		- #### removeNodes
		
		
		
		```
		public [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") removeNodes​(int index)
		```
		
		`repeated .AddressData nodes = 2;`
		- #### getNodesBuilder
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") getNodesBuilder​(int index)
		```
		
		`repeated .AddressData nodes = 2;`
		- #### getNodesOrBuilder
		
		
		
		```
		public [WireFormats.AddressDataOrBuilder](WireFormats.AddressDataOrBuilder.html "interface in akka.remote") getNodesOrBuilder​(int index)
		```
		
		`repeated .AddressData nodes = 2;`
		
		Specified by:
		`[getNodesOrBuilder](WireFormats.RemoteRouterConfigOrBuilder.html#getNodesOrBuilder(int))` in interface `[WireFormats.RemoteRouterConfigOrBuilder](WireFormats.RemoteRouterConfigOrBuilder.html "interface in akka.remote")`
		- #### getNodesOrBuilderList
		
		
		
		```
		public java.util.List<? extends [WireFormats.AddressDataOrBuilder](WireFormats.AddressDataOrBuilder.html "interface in akka.remote")> getNodesOrBuilderList()
		```
		
		`repeated .AddressData nodes = 2;`
		
		Specified by:
		`[getNodesOrBuilderList](WireFormats.RemoteRouterConfigOrBuilder.html#getNodesOrBuilderList())` in interface `[WireFormats.RemoteRouterConfigOrBuilder](WireFormats.RemoteRouterConfigOrBuilder.html "interface in akka.remote")`
		- #### addNodesBuilder
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") addNodesBuilder()
		```
		
		`repeated .AddressData nodes = 2;`
		- #### addNodesBuilder
		
		
		
		```
		public [WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote") addNodesBuilder​(int index)
		```
		
		`repeated .AddressData nodes = 2;`
		- #### getNodesBuilderList
		
		
		
		```
		public java.util.List<[WireFormats.AddressData.Builder](WireFormats.AddressData.Builder.html "class in akka.remote")> getNodesBuilderList()
		```
		
		`repeated .AddressData nodes = 2;`
		- #### setUnknownFields
		
		
		
		```
		public final [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.RemoteRouterConfig.Builder](WireFormats.RemoteRouterConfig.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Payload.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.Payload.html
- https://doc.akka.io/japi/akka/current/akka/remote/ContainerFormats.PayloadOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AddressData.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AddressData.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.AddressDataOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.RemoteRouterConfig.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.RemoteRouterConfig.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.RemoteRouterConfigOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.RemoteRouterConfig.Builder.html](https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.RemoteRouterConfig.Builder.html)*