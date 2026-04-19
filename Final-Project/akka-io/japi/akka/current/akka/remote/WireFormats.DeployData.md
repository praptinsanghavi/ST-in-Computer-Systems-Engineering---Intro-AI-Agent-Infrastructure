---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:34:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.DeployData.Builder.html
title: WireFormats.DeployData.Builder
---

# WireFormats.DeployData.Builder

## Content

Package [akka.remote](package-summary.html)
## Class WireFormats.DeployData.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")\>
			- - akka.remote.WireFormats.DeployData.Builder

- All Implemented Interfaces:
`akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`, `java.lang.Cloneable`

Enclosing class:
[WireFormats.DeployData](WireFormats.DeployData.html "class in akka.remote")

---

```
public static final class WireFormats.DeployData.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")>
implements [WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")
```

```

 Serialization of akka.actor.Deploy
 
```

 Protobuf type `DeployData`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[addAllTags](#addAllTags(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string tags = 12;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[addTags](#addTags(java.lang.String))​(java.lang.String value)` | `repeated string tags = 12;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[addTagsBytes](#addTagsBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string tags = 12;` |
	| `[WireFormats.DeployData](WireFormats.DeployData.html "class in akka.remote")` | `[build](#build())()` |  |
	| `[WireFormats.DeployData](WireFormats.DeployData.html "class in akka.remote")` | `[buildPartial](#buildPartial())()` |  |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[clear](#clear())()` |  |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[clearConfig](#clearConfig())()` | `optional bytes config = 2;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[clearConfigManifest](#clearConfigManifest())()` | `optional string configManifest = 9;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[clearConfigSerializerId](#clearConfigSerializerId())()` | `optional int32 configSerializerId = 8;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[clearDispatcher](#clearDispatcher())()` | `optional string dispatcher = 5;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[clearPath](#clearPath())()` | `required string path = 1;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[clearRouterConfig](#clearRouterConfig())()` | `optional bytes routerConfig = 3;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[clearRouterConfigManifest](#clearRouterConfigManifest())()` | `optional string routerConfigManifest = 11;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[clearRouterConfigSerializerId](#clearRouterConfigSerializerId())()` | `optional int32 routerConfigSerializerId = 10;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[clearScope](#clearScope())()` | `optional bytes scope = 4;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[clearScopeManifest](#clearScopeManifest())()` | `optional string scopeManifest = 7;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[clearScopeSerializerId](#clearScopeSerializerId())()` | older wire protocol: hardcoded class used to look up serializer  newer wire protocol: serializer id and manifest available for each |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[clearTags](#clearTags())()` | `repeated string tags = 12;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[clone](#clone())()` |  |
	| `akka.protobufv3.internal.ByteString` | `[getConfig](#getConfig())()` | `optional bytes config = 2;` |
	| `java.lang.String` | `[getConfigManifest](#getConfigManifest())()` | `optional string configManifest = 9;` |
	| `akka.protobufv3.internal.ByteString` | `[getConfigManifestBytes](#getConfigManifestBytes())()` | `optional string configManifest = 9;` |
	| `int` | `[getConfigSerializerId](#getConfigSerializerId())()` | `optional int32 configSerializerId = 8;` |
	| `[WireFormats.DeployData](WireFormats.DeployData.html "class in akka.remote")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `java.lang.String` | `[getDispatcher](#getDispatcher())()` | `optional string dispatcher = 5;` |
	| `akka.protobufv3.internal.ByteString` | `[getDispatcherBytes](#getDispatcherBytes())()` | `optional string dispatcher = 5;` |
	| `java.lang.String` | `[getPath](#getPath())()` | `required string path = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getPathBytes](#getPathBytes())()` | `required string path = 1;` |
	| `akka.protobufv3.internal.ByteString` | `[getRouterConfig](#getRouterConfig())()` | `optional bytes routerConfig = 3;` |
	| `java.lang.String` | `[getRouterConfigManifest](#getRouterConfigManifest())()` | `optional string routerConfigManifest = 11;` |
	| `akka.protobufv3.internal.ByteString` | `[getRouterConfigManifestBytes](#getRouterConfigManifestBytes())()` | `optional string routerConfigManifest = 11;` |
	| `int` | `[getRouterConfigSerializerId](#getRouterConfigSerializerId())()` | `optional int32 routerConfigSerializerId = 10;` |
	| `akka.protobufv3.internal.ByteString` | `[getScope](#getScope())()` | `optional bytes scope = 4;` |
	| `java.lang.String` | `[getScopeManifest](#getScopeManifest())()` | `optional string scopeManifest = 7;` |
	| `akka.protobufv3.internal.ByteString` | `[getScopeManifestBytes](#getScopeManifestBytes())()` | `optional string scopeManifest = 7;` |
	| `int` | `[getScopeSerializerId](#getScopeSerializerId())()` | older wire protocol: hardcoded class used to look up serializer  newer wire protocol: serializer id and manifest available for each |
	| `java.lang.String` | `[getTags](#getTags(int))​(int index)` | `repeated string tags = 12;` |
	| `akka.protobufv3.internal.ByteString` | `[getTagsBytes](#getTagsBytes(int))​(int index)` | `repeated string tags = 12;` |
	| `int` | `[getTagsCount](#getTagsCount())()` | `repeated string tags = 12;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getTagsList](#getTagsList())()` | `repeated string tags = 12;` |
	| `boolean` | `[hasConfig](#hasConfig())()` | `optional bytes config = 2;` |
	| `boolean` | `[hasConfigManifest](#hasConfigManifest())()` | `optional string configManifest = 9;` |
	| `boolean` | `[hasConfigSerializerId](#hasConfigSerializerId())()` | `optional int32 configSerializerId = 8;` |
	| `boolean` | `[hasDispatcher](#hasDispatcher())()` | `optional string dispatcher = 5;` |
	| `boolean` | `[hasPath](#hasPath())()` | `required string path = 1;` |
	| `boolean` | `[hasRouterConfig](#hasRouterConfig())()` | `optional bytes routerConfig = 3;` |
	| `boolean` | `[hasRouterConfigManifest](#hasRouterConfigManifest())()` | `optional string routerConfigManifest = 11;` |
	| `boolean` | `[hasRouterConfigSerializerId](#hasRouterConfigSerializerId())()` | `optional int32 routerConfigSerializerId = 10;` |
	| `boolean` | `[hasScope](#hasScope())()` | `optional bytes scope = 4;` |
	| `boolean` | `[hasScopeManifest](#hasScopeManifest())()` | `optional string scopeManifest = 7;` |
	| `boolean` | `[hasScopeSerializerId](#hasScopeSerializerId())()` | older wire protocol: hardcoded class used to look up serializer  newer wire protocol: serializer id and manifest available for each |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[mergeFrom](#mergeFrom(akka.remote.WireFormats.DeployData))​([WireFormats.DeployData](WireFormats.DeployData.html "class in akka.remote") other)` |  |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[setConfig](#setConfig(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional bytes config = 2;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[setConfigManifest](#setConfigManifest(java.lang.String))​(java.lang.String value)` | `optional string configManifest = 9;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[setConfigManifestBytes](#setConfigManifestBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string configManifest = 9;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[setConfigSerializerId](#setConfigSerializerId(int))​(int value)` | `optional int32 configSerializerId = 8;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[setDispatcher](#setDispatcher(java.lang.String))​(java.lang.String value)` | `optional string dispatcher = 5;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[setDispatcherBytes](#setDispatcherBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string dispatcher = 5;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[setPath](#setPath(java.lang.String))​(java.lang.String value)` | `required string path = 1;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[setPathBytes](#setPathBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `required string path = 1;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[setRouterConfig](#setRouterConfig(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional bytes routerConfig = 3;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[setRouterConfigManifest](#setRouterConfigManifest(java.lang.String))​(java.lang.String value)` | `optional string routerConfigManifest = 11;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[setRouterConfigManifestBytes](#setRouterConfigManifestBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string routerConfigManifest = 11;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[setRouterConfigSerializerId](#setRouterConfigSerializerId(int))​(int value)` | `optional int32 routerConfigSerializerId = 10;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[setScope](#setScope(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional bytes scope = 4;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[setScopeManifest](#setScopeManifest(java.lang.String))​(java.lang.String value)` | `optional string scopeManifest = 7;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[setScopeManifestBytes](#setScopeManifestBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `optional string scopeManifest = 7;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[setScopeSerializerId](#setScopeSerializerId(int))​(int value)` | older wire protocol: hardcoded class used to look up serializer  newer wire protocol: serializer id and manifest available for each |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[setTags](#setTags(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string tags = 12;` |
	| `[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")>`
		- #### clear
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [WireFormats.DeployData](WireFormats.DeployData.html "class in akka.remote") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [WireFormats.DeployData](WireFormats.DeployData.html "class in akka.remote") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [WireFormats.DeployData](WireFormats.DeployData.html "class in akka.remote") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")>`
		- #### setField
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")>`
		- #### clearField
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")>`
		- #### clearOneof
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")>`
		- #### setRepeatedField
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                       int index,
		                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")>`
		- #### addRepeatedField
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") mergeFrom​([WireFormats.DeployData](WireFormats.DeployData.html "class in akka.remote") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")>`
		- #### mergeFrom
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                         throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")>`
		Throws:
		`java.io.IOException`
		- #### hasPath
		
		
		
		```
		public boolean hasPath()
		```
		
		`required string path = 1;`
		
		Specified by:
		`[hasPath](WireFormats.DeployDataOrBuilder.html#hasPath())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the path field is set.
		- #### getPath
		
		
		
		```
		public java.lang.String getPath()
		```
		
		`required string path = 1;`
		
		Specified by:
		`[getPath](WireFormats.DeployDataOrBuilder.html#getPath())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The path.
		- #### getPathBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getPathBytes()
		```
		
		`required string path = 1;`
		
		Specified by:
		`[getPathBytes](WireFormats.DeployDataOrBuilder.html#getPathBytes())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for path.
		- #### setPath
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") setPath​(java.lang.String value)
		```
		
		`required string path = 1;`
		
		Parameters:
		`value` \- The path to set.
		Returns:
		This builder for chaining.
		- #### clearPath
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") clearPath()
		```
		
		`required string path = 1;`
		
		Returns:
		This builder for chaining.
		- #### setPathBytes
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") setPathBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`required string path = 1;`
		
		Parameters:
		`value` \- The bytes for path to set.
		Returns:
		This builder for chaining.
		- #### hasConfig
		
		
		
		```
		public boolean hasConfig()
		```
		
		`optional bytes config = 2;`
		
		Specified by:
		`[hasConfig](WireFormats.DeployDataOrBuilder.html#hasConfig())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the config field is set.
		- #### getConfig
		
		
		
		```
		public akka.protobufv3.internal.ByteString getConfig()
		```
		
		`optional bytes config = 2;`
		
		Specified by:
		`[getConfig](WireFormats.DeployDataOrBuilder.html#getConfig())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The config.
		- #### setConfig
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") setConfig​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional bytes config = 2;`
		
		Parameters:
		`value` \- The config to set.
		Returns:
		This builder for chaining.
		- #### clearConfig
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") clearConfig()
		```
		
		`optional bytes config = 2;`
		
		Returns:
		This builder for chaining.
		- #### hasRouterConfig
		
		
		
		```
		public boolean hasRouterConfig()
		```
		
		`optional bytes routerConfig = 3;`
		
		Specified by:
		`[hasRouterConfig](WireFormats.DeployDataOrBuilder.html#hasRouterConfig())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the routerConfig field is set.
		- #### getRouterConfig
		
		
		
		```
		public akka.protobufv3.internal.ByteString getRouterConfig()
		```
		
		`optional bytes routerConfig = 3;`
		
		Specified by:
		`[getRouterConfig](WireFormats.DeployDataOrBuilder.html#getRouterConfig())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The routerConfig.
		- #### setRouterConfig
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") setRouterConfig​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional bytes routerConfig = 3;`
		
		Parameters:
		`value` \- The routerConfig to set.
		Returns:
		This builder for chaining.
		- #### clearRouterConfig
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") clearRouterConfig()
		```
		
		`optional bytes routerConfig = 3;`
		
		Returns:
		This builder for chaining.
		- #### hasScope
		
		
		
		```
		public boolean hasScope()
		```
		
		`optional bytes scope = 4;`
		
		Specified by:
		`[hasScope](WireFormats.DeployDataOrBuilder.html#hasScope())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the scope field is set.
		- #### getScope
		
		
		
		```
		public akka.protobufv3.internal.ByteString getScope()
		```
		
		`optional bytes scope = 4;`
		
		Specified by:
		`[getScope](WireFormats.DeployDataOrBuilder.html#getScope())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The scope.
		- #### setScope
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") setScope​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional bytes scope = 4;`
		
		Parameters:
		`value` \- The scope to set.
		Returns:
		This builder for chaining.
		- #### clearScope
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") clearScope()
		```
		
		`optional bytes scope = 4;`
		
		Returns:
		This builder for chaining.
		- #### hasDispatcher
		
		
		
		```
		public boolean hasDispatcher()
		```
		
		`optional string dispatcher = 5;`
		
		Specified by:
		`[hasDispatcher](WireFormats.DeployDataOrBuilder.html#hasDispatcher())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the dispatcher field is set.
		- #### getDispatcher
		
		
		
		```
		public java.lang.String getDispatcher()
		```
		
		`optional string dispatcher = 5;`
		
		Specified by:
		`[getDispatcher](WireFormats.DeployDataOrBuilder.html#getDispatcher())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The dispatcher.
		- #### getDispatcherBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getDispatcherBytes()
		```
		
		`optional string dispatcher = 5;`
		
		Specified by:
		`[getDispatcherBytes](WireFormats.DeployDataOrBuilder.html#getDispatcherBytes())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for dispatcher.
		- #### setDispatcher
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") setDispatcher​(java.lang.String value)
		```
		
		`optional string dispatcher = 5;`
		
		Parameters:
		`value` \- The dispatcher to set.
		Returns:
		This builder for chaining.
		- #### clearDispatcher
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") clearDispatcher()
		```
		
		`optional string dispatcher = 5;`
		
		Returns:
		This builder for chaining.
		- #### setDispatcherBytes
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") setDispatcherBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string dispatcher = 5;`
		
		Parameters:
		`value` \- The bytes for dispatcher to set.
		Returns:
		This builder for chaining.
		- #### hasScopeSerializerId
		
		
		
		```
		public boolean hasScopeSerializerId()
		```
		
		
		```
		
		 older wire protocol: hardcoded class used to look up serializer
		 newer wire protocol: serializer id and manifest available for each
		 
		```
		
		`optional int32 scopeSerializerId = 6;`
		
		Specified by:
		`[hasScopeSerializerId](WireFormats.DeployDataOrBuilder.html#hasScopeSerializerId())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the scopeSerializerId field is set.
		- #### getScopeSerializerId
		
		
		
		```
		public int getScopeSerializerId()
		```
		
		
		```
		
		 older wire protocol: hardcoded class used to look up serializer
		 newer wire protocol: serializer id and manifest available for each
		 
		```
		
		`optional int32 scopeSerializerId = 6;`
		
		Specified by:
		`[getScopeSerializerId](WireFormats.DeployDataOrBuilder.html#getScopeSerializerId())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The scopeSerializerId.
		- #### setScopeSerializerId
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") setScopeSerializerId​(int value)
		```
		
		
		```
		
		 older wire protocol: hardcoded class used to look up serializer
		 newer wire protocol: serializer id and manifest available for each
		 
		```
		
		`optional int32 scopeSerializerId = 6;`
		
		Parameters:
		`value` \- The scopeSerializerId to set.
		Returns:
		This builder for chaining.
		- #### clearScopeSerializerId
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") clearScopeSerializerId()
		```
		
		
		```
		
		 older wire protocol: hardcoded class used to look up serializer
		 newer wire protocol: serializer id and manifest available for each
		 
		```
		
		`optional int32 scopeSerializerId = 6;`
		
		Returns:
		This builder for chaining.
		- #### hasScopeManifest
		
		
		
		```
		public boolean hasScopeManifest()
		```
		
		`optional string scopeManifest = 7;`
		
		Specified by:
		`[hasScopeManifest](WireFormats.DeployDataOrBuilder.html#hasScopeManifest())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the scopeManifest field is set.
		- #### getScopeManifest
		
		
		
		```
		public java.lang.String getScopeManifest()
		```
		
		`optional string scopeManifest = 7;`
		
		Specified by:
		`[getScopeManifest](WireFormats.DeployDataOrBuilder.html#getScopeManifest())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The scopeManifest.
		- #### getScopeManifestBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getScopeManifestBytes()
		```
		
		`optional string scopeManifest = 7;`
		
		Specified by:
		`[getScopeManifestBytes](WireFormats.DeployDataOrBuilder.html#getScopeManifestBytes())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for scopeManifest.
		- #### setScopeManifest
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") setScopeManifest​(java.lang.String value)
		```
		
		`optional string scopeManifest = 7;`
		
		Parameters:
		`value` \- The scopeManifest to set.
		Returns:
		This builder for chaining.
		- #### clearScopeManifest
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") clearScopeManifest()
		```
		
		`optional string scopeManifest = 7;`
		
		Returns:
		This builder for chaining.
		- #### setScopeManifestBytes
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") setScopeManifestBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string scopeManifest = 7;`
		
		Parameters:
		`value` \- The bytes for scopeManifest to set.
		Returns:
		This builder for chaining.
		- #### hasConfigSerializerId
		
		
		
		```
		public boolean hasConfigSerializerId()
		```
		
		`optional int32 configSerializerId = 8;`
		
		Specified by:
		`[hasConfigSerializerId](WireFormats.DeployDataOrBuilder.html#hasConfigSerializerId())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the configSerializerId field is set.
		- #### getConfigSerializerId
		
		
		
		```
		public int getConfigSerializerId()
		```
		
		`optional int32 configSerializerId = 8;`
		
		Specified by:
		`[getConfigSerializerId](WireFormats.DeployDataOrBuilder.html#getConfigSerializerId())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The configSerializerId.
		- #### setConfigSerializerId
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") setConfigSerializerId​(int value)
		```
		
		`optional int32 configSerializerId = 8;`
		
		Parameters:
		`value` \- The configSerializerId to set.
		Returns:
		This builder for chaining.
		- #### clearConfigSerializerId
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") clearConfigSerializerId()
		```
		
		`optional int32 configSerializerId = 8;`
		
		Returns:
		This builder for chaining.
		- #### hasConfigManifest
		
		
		
		```
		public boolean hasConfigManifest()
		```
		
		`optional string configManifest = 9;`
		
		Specified by:
		`[hasConfigManifest](WireFormats.DeployDataOrBuilder.html#hasConfigManifest())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the configManifest field is set.
		- #### getConfigManifest
		
		
		
		```
		public java.lang.String getConfigManifest()
		```
		
		`optional string configManifest = 9;`
		
		Specified by:
		`[getConfigManifest](WireFormats.DeployDataOrBuilder.html#getConfigManifest())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The configManifest.
		- #### getConfigManifestBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getConfigManifestBytes()
		```
		
		`optional string configManifest = 9;`
		
		Specified by:
		`[getConfigManifestBytes](WireFormats.DeployDataOrBuilder.html#getConfigManifestBytes())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for configManifest.
		- #### setConfigManifest
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") setConfigManifest​(java.lang.String value)
		```
		
		`optional string configManifest = 9;`
		
		Parameters:
		`value` \- The configManifest to set.
		Returns:
		This builder for chaining.
		- #### clearConfigManifest
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") clearConfigManifest()
		```
		
		`optional string configManifest = 9;`
		
		Returns:
		This builder for chaining.
		- #### setConfigManifestBytes
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") setConfigManifestBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string configManifest = 9;`
		
		Parameters:
		`value` \- The bytes for configManifest to set.
		Returns:
		This builder for chaining.
		- #### hasRouterConfigSerializerId
		
		
		
		```
		public boolean hasRouterConfigSerializerId()
		```
		
		`optional int32 routerConfigSerializerId = 10;`
		
		Specified by:
		`[hasRouterConfigSerializerId](WireFormats.DeployDataOrBuilder.html#hasRouterConfigSerializerId())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the routerConfigSerializerId field is set.
		- #### getRouterConfigSerializerId
		
		
		
		```
		public int getRouterConfigSerializerId()
		```
		
		`optional int32 routerConfigSerializerId = 10;`
		
		Specified by:
		`[getRouterConfigSerializerId](WireFormats.DeployDataOrBuilder.html#getRouterConfigSerializerId())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The routerConfigSerializerId.
		- #### setRouterConfigSerializerId
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") setRouterConfigSerializerId​(int value)
		```
		
		`optional int32 routerConfigSerializerId = 10;`
		
		Parameters:
		`value` \- The routerConfigSerializerId to set.
		Returns:
		This builder for chaining.
		- #### clearRouterConfigSerializerId
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") clearRouterConfigSerializerId()
		```
		
		`optional int32 routerConfigSerializerId = 10;`
		
		Returns:
		This builder for chaining.
		- #### hasRouterConfigManifest
		
		
		
		```
		public boolean hasRouterConfigManifest()
		```
		
		`optional string routerConfigManifest = 11;`
		
		Specified by:
		`[hasRouterConfigManifest](WireFormats.DeployDataOrBuilder.html#hasRouterConfigManifest())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		Whether the routerConfigManifest field is set.
		- #### getRouterConfigManifest
		
		
		
		```
		public java.lang.String getRouterConfigManifest()
		```
		
		`optional string routerConfigManifest = 11;`
		
		Specified by:
		`[getRouterConfigManifest](WireFormats.DeployDataOrBuilder.html#getRouterConfigManifest())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The routerConfigManifest.
		- #### getRouterConfigManifestBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getRouterConfigManifestBytes()
		```
		
		`optional string routerConfigManifest = 11;`
		
		Specified by:
		`[getRouterConfigManifestBytes](WireFormats.DeployDataOrBuilder.html#getRouterConfigManifestBytes())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The bytes for routerConfigManifest.
		- #### setRouterConfigManifest
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") setRouterConfigManifest​(java.lang.String value)
		```
		
		`optional string routerConfigManifest = 11;`
		
		Parameters:
		`value` \- The routerConfigManifest to set.
		Returns:
		This builder for chaining.
		- #### clearRouterConfigManifest
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") clearRouterConfigManifest()
		```
		
		`optional string routerConfigManifest = 11;`
		
		Returns:
		This builder for chaining.
		- #### setRouterConfigManifestBytes
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") setRouterConfigManifestBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`optional string routerConfigManifest = 11;`
		
		Parameters:
		`value` \- The bytes for routerConfigManifest to set.
		Returns:
		This builder for chaining.
		- #### getTagsList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getTagsList()
		```
		
		`repeated string tags = 12;`
		
		Specified by:
		`[getTagsList](WireFormats.DeployDataOrBuilder.html#getTagsList())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		A list containing the tags.
		- #### getTagsCount
		
		
		
		```
		public int getTagsCount()
		```
		
		`repeated string tags = 12;`
		
		Specified by:
		`[getTagsCount](WireFormats.DeployDataOrBuilder.html#getTagsCount())` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Returns:
		The count of tags.
		- #### getTags
		
		
		
		```
		public java.lang.String getTags​(int index)
		```
		
		`repeated string tags = 12;`
		
		Specified by:
		`[getTags](WireFormats.DeployDataOrBuilder.html#getTags(int))` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The tags at the given index.
		- #### getTagsBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getTagsBytes​(int index)
		```
		
		`repeated string tags = 12;`
		
		Specified by:
		`[getTagsBytes](WireFormats.DeployDataOrBuilder.html#getTagsBytes(int))` in interface `[WireFormats.DeployDataOrBuilder](WireFormats.DeployDataOrBuilder.html "interface in akka.remote")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the tags at the given index.
		- #### setTags
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") setTags​(int index,
		                                              java.lang.String value)
		```
		
		`repeated string tags = 12;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The tags to set.
		Returns:
		This builder for chaining.
		- #### addTags
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") addTags​(java.lang.String value)
		```
		
		`repeated string tags = 12;`
		
		Parameters:
		`value` \- The tags to add.
		Returns:
		This builder for chaining.
		- #### addAllTags
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") addAllTags​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string tags = 12;`
		
		Parameters:
		`values` \- The tags to add.
		Returns:
		This builder for chaining.
		- #### clearTags
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") clearTags()
		```
		
		`repeated string tags = 12;`
		
		Returns:
		This builder for chaining.
		- #### addTagsBytes
		
		
		
		```
		public [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") addTagsBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string tags = 12;`
		
		Parameters:
		`value` \- The bytes of the tags to add.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[WireFormats.DeployData.Builder](WireFormats.DeployData.Builder.html "class in akka.remote")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.DeployData.Builder.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.DeployData.html
- https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.DeployDataOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/remote/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.DeployData.Builder.html](https://doc.akka.io/japi/akka/current/akka/remote/WireFormats.DeployData.Builder.html)*