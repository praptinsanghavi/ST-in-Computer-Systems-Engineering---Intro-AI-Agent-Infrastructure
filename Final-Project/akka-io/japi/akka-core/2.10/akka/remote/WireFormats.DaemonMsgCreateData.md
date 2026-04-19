---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:10:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.DaemonMsgCreateData.Builder.html
title: WireFormats.DaemonMsgCreateData.Builder
---

# WireFormats.DaemonMsgCreateData.Builder

## Content

Package [akka.remote](package-summary.html)
## Class WireFormats.DaemonMsgCreateData.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")\>
			- - akka.remote.WireFormats.DaemonMsgCreateData.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[WireFormats.DaemonMsgCreateDataOrBuilder](WireFormats.DaemonMsgCreateDataOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[WireFormats.DaemonMsgCreateData](WireFormats.DaemonMsgCreateData.html "class in akka.remote")

---

```
public static final class WireFormats.DaemonMsgCreateData.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")>
implements [WireFormats.DaemonMsgCreateDataOrBuilder](WireFormats.DaemonMsgCreateDataOrBuilder.html "interface in akka.remote")
```

```

 Defines akka.remote.DaemonMsgCreate
 
```

 Protobuf type `DaemonMsgCreateData`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.DaemonMsgCreateData](WireFormats.DaemonMsgCreateData.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[WireFormats.DaemonMsgCreateData](WireFormats.DaemonMsgCreateData.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[clearDeploy](#clearDeploy())()` | `required .DeployData deploy = 2;` |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[clearPath](#clearPath())()` | `required string path = 3;` |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[clearProps](#clearProps())()` | `required .PropsData props = 1;` |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[clearSupervisor](#clearSupervisor())()` | `required .ActorRefData supervisor = 4;` |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `[WireFormats.DaemonMsgCreateData](WireFormats.DaemonMsgCreateData.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `[WireFormats.DeployData](WireFormats.DeployData.html "class in akka.remote")` | `[getDeploy](#getDeploy())()` | `required .DeployData deploy = 2;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[getDeployBuilder](#getDeployBuilder())()` | `required .DeployData deploy = 2;` |
	| `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")` | `[getDeployOrBuilder](#getDeployOrBuilder())()` | `required .DeployData deploy = 2;` |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getPath](#getPath())()` | `required string path = 3;` |
	| `akka.protobufv3.internal.ByteString` | `[getPathBytes](#getPathBytes())()` | `required string path = 3;` |
	| `[WireFormats.PropsData](WireFormats.PropsData.html "class in akka.remote")` | `[getProps](#getProps())()` | `required .PropsData props = 1;` |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[getPropsBuilder](#getPropsBuilder())()` | `required .PropsData props = 1;` |
	| `[WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote")` | `[getPropsOrBuilder](#getPropsOrBuilder())()` | `required .PropsData props = 1;` |
	| `[WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote")` | `[getSupervisor](#getSupervisor())()` | `required .ActorRefData supervisor = 4;` |
	| `[WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote")` | `[getSupervisorBuilder](#getSupervisorBuilder())()` | `required .ActorRefData supervisor = 4;` |
	| `[WireFormats.ActorRefDataOrBuilder](WireFormats.ActorRefDataOrBuilder.html "interface in akka.remote")` | `[getSupervisorOrBuilder](#getSupervisorOrBuilder())()` | `required .ActorRefData supervisor = 4;` |
	| `boolean` | `[hasDeploy](#hasDeploy())()` | `required .DeployData deploy = 2;` |
	| `boolean` | `[hasPath](#hasPath())()` | `required string path = 3;` |
	| `boolean` | `[hasProps](#hasProps())()` | `required .PropsData props = 1;` |
	| `boolean` | `[hasSupervisor](#hasSupervisor())()` | `required .ActorRefData supervisor = 4;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[mergeDeploy](#mergeDeploy(akka.remote.WireFormats.DeployData))​([WireFormats.DeployData](WireFormats.DeployData.html "class in akka.remote") value)` | `required .DeployData deploy = 2;` |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.WireFormats.DaemonMsgCreateData))​([WireFormats.DaemonMsgCreateData](WireFormats.DaemonMsgCreateData.html "class in akka.remote") other)` |  |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[mergeProps](#mergeProps(akka.remote.WireFormats.PropsData))​([WireFormats.PropsData](WireFormats.PropsData.html "class in akka.remote") value)` | `required .PropsData props = 1;` |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[mergeSupervisor](#mergeSupervisor(akka.remote.WireFormats.ActorRefData))​([WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote") value)` | `required .ActorRefData supervisor = 4;` |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[setDeploy](#setDeploy(akka.remote.WireFormats.DeployData))​([WireFormats.DeployData](WireFormats.DeployData.html "class in akka.remote") value)` | `required .DeployData deploy = 2;` |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[setDeploy](#setDeploy(akka.remote.WireFormats.DeployData.Builder))​([WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") builderForValue)` | `required .DeployData deploy = 2;` |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[setPath](#setPath(java.lang.String))​(java.lang.String value)` | `required string path = 3;` |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[setPathBytes](#setPathBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string path = 3;` |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[setProps](#setProps(akka.remote.WireFormats.PropsData))​([WireFormats.PropsData](WireFormats.PropsData.html "class in akka.remote") value)` | `required .PropsData props = 1;` |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[setProps](#setProps(akka.remote.WireFormats.PropsData.Builder))​([WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") builderForValue)` | `required .PropsData props = 1;` |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[setSupervisor](#setSupervisor(akka.remote.WireFormats.ActorRefData))​([WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote") value)` | `required .ActorRefData supervisor = 4;` |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[setSupervisor](#setSupervisor(akka.remote.WireFormats.ActorRefData.Builder))​([WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") builderForValue)` | `required .ActorRefData supervisor = 4;` |
	| `[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData](WireFormats.DaemonMsgCreateData.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData](WireFormats.DaemonMsgCreateData.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData](WireFormats.DaemonMsgCreateData.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                        java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                int index,
		                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                                java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") mergeFrom​([WireFormats.DaemonMsgCreateData](WireFormats.DaemonMsgCreateData.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                         akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                                  throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasProps
		
		
		
		```
		public boolean hasProps()
		```
		
		`required .PropsData props = 1;`
		
		Specified by:
		`[hasProps](WireFormats.DaemonMsgCreateDataOrBuilder.html#hasProps())` in interface `[WireFormats.DaemonMsgCreateDataOrBuilder](WireFormats.DaemonMsgCreateDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the props field is set.
		- #### getProps
		
		
		
		```
		public [WireFormats.PropsData](WireFormats.PropsData.html "class in akka.remote") getProps()
		```
		
		`required .PropsData props = 1;`
		
		Specified by:
		`[getProps](WireFormats.DaemonMsgCreateDataOrBuilder.html#getProps())` in interface `[WireFormats.DaemonMsgCreateDataOrBuilder](WireFormats.DaemonMsgCreateDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The props.
		- #### setProps
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") setProps​([WireFormats.PropsData](WireFormats.PropsData.html "class in akka.remote") value)
		```
		
		`required .PropsData props = 1;`
		- #### setProps
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") setProps​([WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .PropsData props = 1;`
		- #### mergeProps
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") mergeProps​([WireFormats.PropsData](WireFormats.PropsData.html "class in akka.remote") value)
		```
		
		`required .PropsData props = 1;`
		- #### clearProps
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") clearProps()
		```
		
		`required .PropsData props = 1;`
		- #### getPropsBuilder
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") getPropsBuilder()
		```
		
		`required .PropsData props = 1;`
		- #### getPropsOrBuilder
		
		
		
		```
		public [WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote") getPropsOrBuilder()
		```
		
		`required .PropsData props = 1;`
		
		Specified by:
		`[getPropsOrBuilder](WireFormats.DaemonMsgCreateDataOrBuilder.html#getPropsOrBuilder())` in interface `[WireFormats.DaemonMsgCreateDataOrBuilder](WireFormats.DaemonMsgCreateDataOrBuilder.html "interface in akka.remote")`
		- #### hasDeploy
		
		
		
		```
		public boolean hasDeploy()
		```
		
		`required .DeployData deploy = 2;`
		
		Specified by:
		`[hasDeploy](WireFormats.DaemonMsgCreateDataOrBuilder.html#hasDeploy())` in interface `[WireFormats.DaemonMsgCreateDataOrBuilder](WireFormats.DaemonMsgCreateDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the deploy field is set.
		- #### getDeploy
		
		
		
		```
		public [WireFormats.DeployData](WireFormats.DeployData.html "class in akka.remote") getDeploy()
		```
		
		`required .DeployData deploy = 2;`
		
		Specified by:
		`[getDeploy](WireFormats.DaemonMsgCreateDataOrBuilder.html#getDeploy())` in interface `[WireFormats.DaemonMsgCreateDataOrBuilder](WireFormats.DaemonMsgCreateDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The deploy.
		- #### setDeploy
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") setDeploy​([WireFormats.DeployData](WireFormats.DeployData.html "class in akka.remote") value)
		```
		
		`required .DeployData deploy = 2;`
		- #### setDeploy
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") setDeploy​([WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .DeployData deploy = 2;`
		- #### mergeDeploy
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") mergeDeploy​([WireFormats.DeployData](WireFormats.DeployData.html "class in akka.remote") value)
		```
		
		`required .DeployData deploy = 2;`
		- #### clearDeploy
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") clearDeploy()
		```
		
		`required .DeployData deploy = 2;`
		- #### getDeployBuilder
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") getDeployBuilder()
		```
		
		`required .DeployData deploy = 2;`
		- #### getDeployOrBuilder
		
		
		
		```
		public [WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote") getDeployOrBuilder()
		```
		
		`required .DeployData deploy = 2;`
		
		Specified by:
		`[getDeployOrBuilder](WireFormats.DaemonMsgCreateDataOrBuilder.html#getDeployOrBuilder())` in interface `[WireFormats.DaemonMsgCreateDataOrBuilder](WireFormats.DaemonMsgCreateDataOrBuilder.html "interface in akka.remote")`
		- #### hasPath
		
		
		
		```
		public boolean hasPath()
		```
		
		`required string path = 3;`
		
		Specified by:
		`[hasPath](WireFormats.DaemonMsgCreateDataOrBuilder.html#hasPath())` in interface `[WireFormats.DaemonMsgCreateDataOrBuilder](WireFormats.DaemonMsgCreateDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the path field is set.
		- #### getPath
		
		
		
		```
		public java.lang.String getPath()
		```
		
		`required string path = 3;`
		
		Specified by:
		`[getPath](WireFormats.DaemonMsgCreateDataOrBuilder.html#getPath())` in interface `[WireFormats.DaemonMsgCreateDataOrBuilder](WireFormats.DaemonMsgCreateDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The path.
		- #### getPathBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getPathBytes()
		```
		
		`required string path = 3;`
		
		Specified by:
		`[getPathBytes](WireFormats.DaemonMsgCreateDataOrBuilder.html#getPathBytes())` in interface `[WireFormats.DaemonMsgCreateDataOrBuilder](WireFormats.DaemonMsgCreateDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for path.
		- #### setPath
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") setPath​(java.lang.String value)
		```
		
		`required string path = 3;`
		
		Parameters:
		`value` \- The path to set.
		Returns:
		This builder for chaining.
		- #### clearPath
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") clearPath()
		```
		
		`required string path = 3;`
		
		Returns:
		This builder for chaining.
		- #### setPathBytes
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") setPathBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string path = 3;`
		
		Parameters:
		`value` \- The bytes for path to set.
		Returns:
		This builder for chaining.
		- #### hasSupervisor
		
		
		
		```
		public boolean hasSupervisor()
		```
		
		`required .ActorRefData supervisor = 4;`
		
		Specified by:
		`[hasSupervisor](WireFormats.DaemonMsgCreateDataOrBuilder.html#hasSupervisor())` in interface `[WireFormats.DaemonMsgCreateDataOrBuilder](WireFormats.DaemonMsgCreateDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the supervisor field is set.
		- #### getSupervisor
		
		
		
		```
		public [WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote") getSupervisor()
		```
		
		`required .ActorRefData supervisor = 4;`
		
		Specified by:
		`[getSupervisor](WireFormats.DaemonMsgCreateDataOrBuilder.html#getSupervisor())` in interface `[WireFormats.DaemonMsgCreateDataOrBuilder](WireFormats.DaemonMsgCreateDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The supervisor.
		- #### setSupervisor
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") setSupervisor​([WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote") value)
		```
		
		`required .ActorRefData supervisor = 4;`
		- #### setSupervisor
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") setSupervisor​([WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .ActorRefData supervisor = 4;`
		- #### mergeSupervisor
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") mergeSupervisor​([WireFormats.ActorRefData](WireFormats.ActorRefData.html "class in akka.remote") value)
		```
		
		`required .ActorRefData supervisor = 4;`
		- #### clearSupervisor
		
		
		
		```
		public [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") clearSupervisor()
		```
		
		`required .ActorRefData supervisor = 4;`
		- #### getSupervisorBuilder
		
		
		
		```
		public [WireFormats.ActorRefData.Builder](WireFormats.ActorRefData.Builder.html "class in akka.remote") getSupervisorBuilder()
		```
		
		`required .ActorRefData supervisor = 4;`
		- #### getSupervisorOrBuilder
		
		
		
		```
		public [WireFormats.ActorRefDataOrBuilder](WireFormats.ActorRefDataOrBuilder.html "interface in akka.remote") getSupervisorOrBuilder()
		```
		
		`required .ActorRefData supervisor = 4;`
		
		Specified by:
		`[getSupervisorOrBuilder](WireFormats.DaemonMsgCreateDataOrBuilder.html#getSupervisorOrBuilder())` in interface `[WireFormats.DaemonMsgCreateDataOrBuilder](WireFormats.DaemonMsgCreateDataOrBuilder.html "interface in akka.remote")`
		- #### setUnknownFields
		
		
		
		```
		public final [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DaemonMsgCreateData.Builder](WireFormats.DaemonMsgCreateData.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.ActorRefData.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.ActorRefData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.ActorRefDataOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.DaemonMsgCreateData.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.DaemonMsgCreateData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.DaemonMsgCreateDataOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.DeployData.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.DeployData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.DeployDataOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.PropsData.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.PropsData.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.PropsDataOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.DaemonMsgCreateData.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/remote/WireFormats.DaemonMsgCreateData.Builder.html)*