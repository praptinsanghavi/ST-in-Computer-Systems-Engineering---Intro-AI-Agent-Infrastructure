---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:34:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.PropsData.Builder.html
title: WireFormats.PropsData.Builder
---

# WireFormats.PropsData.Builder

## Content

Package [akka.remote](package-summary.html)
## Class WireFormats.PropsData.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")\>
			- - akka.remote.WireFormats.PropsData.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[WireFormats.PropsData](WireFormats.PropsData.html "class in akka.remote")

---

```
public static final class WireFormats.PropsData.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")>
implements [WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote")
```

```

 Serialization of akka.actor.Props
 
```

 Protobuf type `PropsData`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[addAllArgs](#addAllArgs(java.lang.Iterable))​(java.lang.Iterable<? extends akka.protobufv3.internal.ByteString> values)` | `repeated bytes args = 4;` |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[addAllHasManifest](#addAllHasManifest(java.lang.Iterable))​(java.lang.Iterable<? extends java.lang.Boolean> values)` | additionally a flag per position to indicate if it was  serialized with manifest or not |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[addAllManifests](#addAllManifests(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | serialized props parameters  older wire protocol: contains class name for each arg  newer wire protocol: contains string manifest for each arg |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[addAllSerializerIds](#addAllSerializerIds(java.lang.Iterable))​(java.lang.Iterable<? extends java.lang.Integer> values)` | newer wire protocol: serializer id for each arg |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[addArgs](#addArgs(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated bytes args = 4;` |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[addHasManifest](#addHasManifest(boolean))​(boolean value)` | additionally a flag per position to indicate if it was  serialized with manifest or not |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[addManifests](#addManifests(java.lang.String))​(java.lang.String value)` | serialized props parameters  older wire protocol: contains class name for each arg  newer wire protocol: contains string manifest for each arg |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[addManifestsBytes](#addManifestsBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | serialized props parameters  older wire protocol: contains class name for each arg  newer wire protocol: contains string manifest for each arg |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[addSerializerIds](#addSerializerIds(int))​(int value)` | newer wire protocol: serializer id for each arg |
	| `[WireFormats.PropsData](WireFormats.PropsData.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[WireFormats.PropsData](WireFormats.PropsData.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[clearArgs](#clearArgs())()` | `repeated bytes args = 4;` |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[clearClazz](#clearClazz())()` | `required string clazz = 3;` |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[clearDeploy](#clearDeploy())()` | `required .DeployData deploy = 2;` |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[clearHasManifest](#clearHasManifest())()` | additionally a flag per position to indicate if it was  serialized with manifest or not |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[clearManifests](#clearManifests())()` | serialized props parameters  older wire protocol: contains class name for each arg  newer wire protocol: contains string manifest for each arg |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[clearSerializerIds](#clearSerializerIds())()` | newer wire protocol: serializer id for each arg |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `akka.protobufv3.internal.ByteString` | `[getArgs](#getArgs(int))​(int index)` | `repeated bytes args = 4;` |
	| `int` | `[getArgsCount](#getArgsCount())()` | `repeated bytes args = 4;` |
	| `java.util.List<akka.protobufv3.internal.ByteString>` | `[getArgsList](#getArgsList())()` | `repeated bytes args = 4;` |
	| `java.lang.String` | `[getClazz](#getClazz())()` | `required string clazz = 3;` |
	| `akka.protobufv3.internal.ByteString` | `[getClazzBytes](#getClazzBytes())()` | `required string clazz = 3;` |
	| `[WireFormats.PropsData](WireFormats.PropsData.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `[WireFormats.DeployData](WireFormats.DeployData.html "class in akka.remote")` | `[getDeploy](#getDeploy())()` | `required .DeployData deploy = 2;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[getDeployBuilder](#getDeployBuilder())()` | `required .DeployData deploy = 2;` |
	| `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")` | `[getDeployOrBuilder](#getDeployOrBuilder())()` | `required .DeployData deploy = 2;` |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `boolean` | `[getHasManifest](#getHasManifest(int))​(int index)` | additionally a flag per position to indicate if it was  serialized with manifest or not |
	| `int` | `[getHasManifestCount](#getHasManifestCount())()` | additionally a flag per position to indicate if it was  serialized with manifest or not |
	| `java.util.List<java.lang.Boolean>` | `[getHasManifestList](#getHasManifestList())()` | additionally a flag per position to indicate if it was  serialized with manifest or not |
	| `java.lang.String` | `[getManifests](#getManifests(int))​(int index)` | serialized props parameters  older wire protocol: contains class name for each arg  newer wire protocol: contains string manifest for each arg |
	| `akka.protobufv3.internal.ByteString` | `[getManifestsBytes](#getManifestsBytes(int))​(int index)` | serialized props parameters  older wire protocol: contains class name for each arg  newer wire protocol: contains string manifest for each arg |
	| `int` | `[getManifestsCount](#getManifestsCount())()` | serialized props parameters  older wire protocol: contains class name for each arg  newer wire protocol: contains string manifest for each arg |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getManifestsList](#getManifestsList())()` | serialized props parameters  older wire protocol: contains class name for each arg  newer wire protocol: contains string manifest for each arg |
	| `int` | `[getSerializerIds](#getSerializerIds(int))​(int index)` | newer wire protocol: serializer id for each arg |
	| `int` | `[getSerializerIdsCount](#getSerializerIdsCount())()` | newer wire protocol: serializer id for each arg |
	| `java.util.List<java.lang.Integer>` | `[getSerializerIdsList](#getSerializerIdsList())()` | newer wire protocol: serializer id for each arg |
	| `boolean` | `[hasClazz](#hasClazz())()` | `required string clazz = 3;` |
	| `boolean` | `[hasDeploy](#hasDeploy())()` | `required .DeployData deploy = 2;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[mergeDeploy](#mergeDeploy(akka.remote.WireFormats.DeployData))​([WireFormats.DeployData](WireFormats.DeployData.html "class in akka.remote") value)` | `required .DeployData deploy = 2;` |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.WireFormats.PropsData))​([WireFormats.PropsData](WireFormats.PropsData.html "class in akka.remote") other)` |  |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[setArgs](#setArgs(int,akka.protobufv3.internal.ByteString))​(int index,  akka.protobufv3.internal.ByteString value)` | `repeated bytes args = 4;` |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[setClazz](#setClazz(java.lang.String))​(java.lang.String value)` | `required string clazz = 3;` |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[setClazzBytes](#setClazzBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string clazz = 3;` |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[setDeploy](#setDeploy(akka.remote.WireFormats.DeployData))​([WireFormats.DeployData](WireFormats.DeployData.html "class in akka.remote") value)` | `required .DeployData deploy = 2;` |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[setDeploy](#setDeploy(akka.remote.WireFormats.DeployData.Builder))​([WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") builderForValue)` | `required .DeployData deploy = 2;` |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[setHasManifest](#setHasManifest(int,boolean))​(int index,  boolean value)` | additionally a flag per position to indicate if it was  serialized with manifest or not |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[setManifests](#setManifests(int,java.lang.String))​(int index,  java.lang.String value)` | serialized props parameters  older wire protocol: contains class name for each arg  newer wire protocol: contains string manifest for each arg |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[setSerializerIds](#setSerializerIds(int,int))​(int index,  int value)` | newer wire protocol: serializer id for each arg |
	| `[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [WireFormats.PropsData](WireFormats.PropsData.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [WireFormats.PropsData](WireFormats.PropsData.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [WireFormats.PropsData](WireFormats.PropsData.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                              java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                      int index,
		                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                      java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") mergeFrom​([WireFormats.PropsData](WireFormats.PropsData.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                               akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                        throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasDeploy
		
		
		
		```
		public boolean hasDeploy()
		```
		
		`required .DeployData deploy = 2;`
		
		Specified by:
		`[hasDeploy](WireFormats.PropsDataOrBuilder.html#hasDeploy())` in interface `[WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the deploy field is set.
		- #### getDeploy
		
		
		
		```
		public [WireFormats.DeployData](WireFormats.DeployData.html "class in akka.remote") getDeploy()
		```
		
		`required .DeployData deploy = 2;`
		
		Specified by:
		`[getDeploy](WireFormats.PropsDataOrBuilder.html#getDeploy())` in interface `[WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The deploy.
		- #### setDeploy
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") setDeploy​([WireFormats.DeployData](WireFormats.DeployData.html "class in akka.remote") value)
		```
		
		`required .DeployData deploy = 2;`
		- #### setDeploy
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") setDeploy​([WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") builderForValue)
		```
		
		`required .DeployData deploy = 2;`
		- #### mergeDeploy
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") mergeDeploy​([WireFormats.DeployData](WireFormats.DeployData.html "class in akka.remote") value)
		```
		
		`required .DeployData deploy = 2;`
		- #### clearDeploy
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") clearDeploy()
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
		`[getDeployOrBuilder](WireFormats.PropsDataOrBuilder.html#getDeployOrBuilder())` in interface `[WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote")`
		- #### hasClazz
		
		
		
		```
		public boolean hasClazz()
		```
		
		`required string clazz = 3;`
		
		Specified by:
		`[hasClazz](WireFormats.PropsDataOrBuilder.html#hasClazz())` in interface `[WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the clazz field is set.
		- #### getClazz
		
		
		
		```
		public java.lang.String getClazz()
		```
		
		`required string clazz = 3;`
		
		Specified by:
		`[getClazz](WireFormats.PropsDataOrBuilder.html#getClazz())` in interface `[WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The clazz.
		- #### getClazzBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getClazzBytes()
		```
		
		`required string clazz = 3;`
		
		Specified by:
		`[getClazzBytes](WireFormats.PropsDataOrBuilder.html#getClazzBytes())` in interface `[WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for clazz.
		- #### setClazz
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") setClazz​(java.lang.String value)
		```
		
		`required string clazz = 3;`
		
		Parameters:
		`value` \- The clazz to set.
		Returns:
		This builder for chaining.
		- #### clearClazz
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") clearClazz()
		```
		
		`required string clazz = 3;`
		
		Returns:
		This builder for chaining.
		- #### setClazzBytes
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") setClazzBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string clazz = 3;`
		
		Parameters:
		`value` \- The bytes for clazz to set.
		Returns:
		This builder for chaining.
		- #### getArgsList
		
		
		
		```
		public java.util.List<akka.protobufv3.internal.ByteString> getArgsList()
		```
		
		`repeated bytes args = 4;`
		
		Specified by:
		`[getArgsList](WireFormats.PropsDataOrBuilder.html#getArgsList())` in interface `[WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote")`
		Returns:
		A list containing the args.
		- #### getArgsCount
		
		
		
		```
		public int getArgsCount()
		```
		
		`repeated bytes args = 4;`
		
		Specified by:
		`[getArgsCount](WireFormats.PropsDataOrBuilder.html#getArgsCount())` in interface `[WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The count of args.
		- #### getArgs
		
		
		
		```
		public akka.protobufv3.internal.ByteString getArgs​(int index)
		```
		
		`repeated bytes args = 4;`
		
		Specified by:
		`[getArgs](WireFormats.PropsDataOrBuilder.html#getArgs(int))` in interface `[WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The args at the given index.
		- #### setArgs
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") setArgs​(int index,
		                                             akka.protobufv3.internal.ByteString value)
		```
		
		`repeated bytes args = 4;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The args to set.
		Returns:
		This builder for chaining.
		- #### addArgs
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") addArgs​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated bytes args = 4;`
		
		Parameters:
		`value` \- The args to add.
		Returns:
		This builder for chaining.
		- #### addAllArgs
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") addAllArgs​(java.lang.Iterable<? extends akka.protobufv3.internal.ByteString> values)
		```
		
		`repeated bytes args = 4;`
		
		Parameters:
		`values` \- The args to add.
		Returns:
		This builder for chaining.
		- #### clearArgs
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") clearArgs()
		```
		
		`repeated bytes args = 4;`
		
		Returns:
		This builder for chaining.
		- #### getManifestsList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getManifestsList()
		```
		
		
		```
		
		 serialized props parameters
		 older wire protocol: contains class name for each arg
		 newer wire protocol: contains string manifest for each arg
		 
		```
		
		`repeated string manifests = 5;`
		
		Specified by:
		`[getManifestsList](WireFormats.PropsDataOrBuilder.html#getManifestsList())` in interface `[WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote")`
		Returns:
		A list containing the manifests.
		- #### getManifestsCount
		
		
		
		```
		public int getManifestsCount()
		```
		
		
		```
		
		 serialized props parameters
		 older wire protocol: contains class name for each arg
		 newer wire protocol: contains string manifest for each arg
		 
		```
		
		`repeated string manifests = 5;`
		
		Specified by:
		`[getManifestsCount](WireFormats.PropsDataOrBuilder.html#getManifestsCount())` in interface `[WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The count of manifests.
		- #### getManifests
		
		
		
		```
		public java.lang.String getManifests​(int index)
		```
		
		
		```
		
		 serialized props parameters
		 older wire protocol: contains class name for each arg
		 newer wire protocol: contains string manifest for each arg
		 
		```
		
		`repeated string manifests = 5;`
		
		Specified by:
		`[getManifests](WireFormats.PropsDataOrBuilder.html#getManifests(int))` in interface `[WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The manifests at the given index.
		- #### getManifestsBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getManifestsBytes​(int index)
		```
		
		
		```
		
		 serialized props parameters
		 older wire protocol: contains class name for each arg
		 newer wire protocol: contains string manifest for each arg
		 
		```
		
		`repeated string manifests = 5;`
		
		Specified by:
		`[getManifestsBytes](WireFormats.PropsDataOrBuilder.html#getManifestsBytes(int))` in interface `[WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the manifests at the given index.
		- #### setManifests
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") setManifests​(int index,
		                                                  java.lang.String value)
		```
		
		
		```
		
		 serialized props parameters
		 older wire protocol: contains class name for each arg
		 newer wire protocol: contains string manifest for each arg
		 
		```
		
		`repeated string manifests = 5;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The manifests to set.
		Returns:
		This builder for chaining.
		- #### addManifests
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") addManifests​(java.lang.String value)
		```
		
		
		```
		
		 serialized props parameters
		 older wire protocol: contains class name for each arg
		 newer wire protocol: contains string manifest for each arg
		 
		```
		
		`repeated string manifests = 5;`
		
		Parameters:
		`value` \- The manifests to add.
		Returns:
		This builder for chaining.
		- #### addAllManifests
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") addAllManifests​(java.lang.Iterable<java.lang.String> values)
		```
		
		
		```
		
		 serialized props parameters
		 older wire protocol: contains class name for each arg
		 newer wire protocol: contains string manifest for each arg
		 
		```
		
		`repeated string manifests = 5;`
		
		Parameters:
		`values` \- The manifests to add.
		Returns:
		This builder for chaining.
		- #### clearManifests
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") clearManifests()
		```
		
		
		```
		
		 serialized props parameters
		 older wire protocol: contains class name for each arg
		 newer wire protocol: contains string manifest for each arg
		 
		```
		
		`repeated string manifests = 5;`
		
		Returns:
		This builder for chaining.
		- #### addManifestsBytes
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") addManifestsBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		
		```
		
		 serialized props parameters
		 older wire protocol: contains class name for each arg
		 newer wire protocol: contains string manifest for each arg
		 
		```
		
		`repeated string manifests = 5;`
		
		Parameters:
		`value` \- The bytes of the manifests to add.
		Returns:
		This builder for chaining.
		- #### getSerializerIdsList
		
		
		
		```
		public java.util.List<java.lang.Integer> getSerializerIdsList()
		```
		
		
		```
		
		 newer wire protocol: serializer id for each arg
		 
		```
		
		`repeated int32 serializerIds = 6;`
		
		Specified by:
		`[getSerializerIdsList](WireFormats.PropsDataOrBuilder.html#getSerializerIdsList())` in interface `[WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote")`
		Returns:
		A list containing the serializerIds.
		- #### getSerializerIdsCount
		
		
		
		```
		public int getSerializerIdsCount()
		```
		
		
		```
		
		 newer wire protocol: serializer id for each arg
		 
		```
		
		`repeated int32 serializerIds = 6;`
		
		Specified by:
		`[getSerializerIdsCount](WireFormats.PropsDataOrBuilder.html#getSerializerIdsCount())` in interface `[WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The count of serializerIds.
		- #### getSerializerIds
		
		
		
		```
		public int getSerializerIds​(int index)
		```
		
		
		```
		
		 newer wire protocol: serializer id for each arg
		 
		```
		
		`repeated int32 serializerIds = 6;`
		
		Specified by:
		`[getSerializerIds](WireFormats.PropsDataOrBuilder.html#getSerializerIds(int))` in interface `[WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The serializerIds at the given index.
		- #### setSerializerIds
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") setSerializerIds​(int index,
		                                                      int value)
		```
		
		
		```
		
		 newer wire protocol: serializer id for each arg
		 
		```
		
		`repeated int32 serializerIds = 6;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The serializerIds to set.
		Returns:
		This builder for chaining.
		- #### addSerializerIds
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") addSerializerIds​(int value)
		```
		
		
		```
		
		 newer wire protocol: serializer id for each arg
		 
		```
		
		`repeated int32 serializerIds = 6;`
		
		Parameters:
		`value` \- The serializerIds to add.
		Returns:
		This builder for chaining.
		- #### addAllSerializerIds
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") addAllSerializerIds​(java.lang.Iterable<? extends java.lang.Integer> values)
		```
		
		
		```
		
		 newer wire protocol: serializer id for each arg
		 
		```
		
		`repeated int32 serializerIds = 6;`
		
		Parameters:
		`values` \- The serializerIds to add.
		Returns:
		This builder for chaining.
		- #### clearSerializerIds
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") clearSerializerIds()
		```
		
		
		```
		
		 newer wire protocol: serializer id for each arg
		 
		```
		
		`repeated int32 serializerIds = 6;`
		
		Returns:
		This builder for chaining.
		- #### getHasManifestList
		
		
		
		```
		public java.util.List<java.lang.Boolean> getHasManifestList()
		```
		
		
		```
		
		 additionally a flag per position to indicate if it was
		 serialized with manifest or not
		 
		```
		
		`repeated bool hasManifest = 7;`
		
		Specified by:
		`[getHasManifestList](WireFormats.PropsDataOrBuilder.html#getHasManifestList())` in interface `[WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote")`
		Returns:
		A list containing the hasManifest.
		- #### getHasManifestCount
		
		
		
		```
		public int getHasManifestCount()
		```
		
		
		```
		
		 additionally a flag per position to indicate if it was
		 serialized with manifest or not
		 
		```
		
		`repeated bool hasManifest = 7;`
		
		Specified by:
		`[getHasManifestCount](WireFormats.PropsDataOrBuilder.html#getHasManifestCount())` in interface `[WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The count of hasManifest.
		- #### getHasManifest
		
		
		
		```
		public boolean getHasManifest​(int index)
		```
		
		
		```
		
		 additionally a flag per position to indicate if it was
		 serialized with manifest or not
		 
		```
		
		`repeated bool hasManifest = 7;`
		
		Specified by:
		`[getHasManifest](WireFormats.PropsDataOrBuilder.html#getHasManifest(int))` in interface `[WireFormats.PropsDataOrBuilder](WireFormats.PropsDataOrBuilder.html "interface in akka.remote")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The hasManifest at the given index.
		- #### setHasManifest
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") setHasManifest​(int index,
		                                                    boolean value)
		```
		
		
		```
		
		 additionally a flag per position to indicate if it was
		 serialized with manifest or not
		 
		```
		
		`repeated bool hasManifest = 7;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The hasManifest to set.
		Returns:
		This builder for chaining.
		- #### addHasManifest
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") addHasManifest​(boolean value)
		```
		
		
		```
		
		 additionally a flag per position to indicate if it was
		 serialized with manifest or not
		 
		```
		
		`repeated bool hasManifest = 7;`
		
		Parameters:
		`value` \- The hasManifest to add.
		Returns:
		This builder for chaining.
		- #### addAllHasManifest
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") addAllHasManifest​(java.lang.Iterable<? extends java.lang.Boolean> values)
		```
		
		
		```
		
		 additionally a flag per position to indicate if it was
		 serialized with manifest or not
		 
		```
		
		`repeated bool hasManifest = 7;`
		
		Parameters:
		`values` \- The hasManifest to add.
		Returns:
		This builder for chaining.
		- #### clearHasManifest
		
		
		
		```
		public [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") clearHasManifest()
		```
		
		
		```
		
		 additionally a flag per position to indicate if it was
		 serialized with manifest or not
		 
		```
		
		`repeated bool hasManifest = 7;`
		
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.PropsData.Builder](WireFormats.PropsData.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.DeployData.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.DeployData.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.DeployDataOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.PropsData.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.PropsData.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.PropsDataOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.PropsData.Builder.html](https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.PropsData.Builder.html)*