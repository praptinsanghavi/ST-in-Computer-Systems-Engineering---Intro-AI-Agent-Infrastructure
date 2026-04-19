---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:04:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Gossip.Builder.html
title: ClusterMessages.Gossip.Builder
---

# ClusterMessages.Gossip.Builder

## Content

Package [akka.cluster.protobuf.msg](package-summary.html)
## Class ClusterMessages.Gossip.Builder

- java.lang.Object
- - akka.protobufv3\.internal.AbstractMessageLite.Builder
	- - akka.protobufv3\.internal.AbstractMessage.Builder\<BuilderT\>
		- - akka.protobufv3\.internal.GeneratedMessageV3\.Builder\<[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")\>
			- - akka.cluster.protobuf.msg.ClusterMessages.Gossip.Builder

- All Implemented Interfaces:
`[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`, `akka.protobufv3.internal.Message.Builder`, `akka.protobufv3.internal.MessageLite.Builder`, `akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`, `java.lang.Cloneable`

Enclosing class:
[ClusterMessages.Gossip](ClusterMessages.Gossip.html "class in akka.cluster.protobuf.msg")

---

```
public static final class ClusterMessages.Gossip.Builder
extends akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")>
implements [ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")
```

```

 Gossip
 
```

 Protobuf type `Gossip`

- - ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllAddresses](#addAllAddresses(int,akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress))​(int index,  [ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)` | `repeated .UniqueAddress allAddresses = 1;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllAddresses](#addAllAddresses(int,akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress.Builder))​(int index,  [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `repeated .UniqueAddress allAddresses = 1;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllAddresses](#addAllAddresses(akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress))​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)` | `repeated .UniqueAddress allAddresses = 1;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllAddresses](#addAllAddresses(akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress.Builder))​([ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `repeated .UniqueAddress allAddresses = 1;` |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllAddressesBuilder](#addAllAddressesBuilder())()` | `repeated .UniqueAddress allAddresses = 1;` |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllAddressesBuilder](#addAllAddressesBuilder(int))​(int index)` | `repeated .UniqueAddress allAddresses = 1;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllAllAddresses](#addAllAllAddresses(java.lang.Iterable))​(java.lang.Iterable<? extends [ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg")> values)` | `repeated .UniqueAddress allAddresses = 1;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllAllAppVersions](#addAllAllAppVersions(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string allAppVersions = 8;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllAllHashes](#addAllAllHashes(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string allHashes = 3;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllAllRoles](#addAllAllRoles(java.lang.Iterable))​(java.lang.Iterable<java.lang.String> values)` | `repeated string allRoles = 2;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllAppVersions](#addAllAppVersions(java.lang.String))​(java.lang.String value)` | `repeated string allAppVersions = 8;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllAppVersionsBytes](#addAllAppVersionsBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string allAppVersions = 8;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllHashes](#addAllHashes(java.lang.String))​(java.lang.String value)` | `repeated string allHashes = 3;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllHashesBytes](#addAllHashesBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string allHashes = 3;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllMembers](#addAllMembers(java.lang.Iterable))​(java.lang.Iterable<? extends [ClusterMessages.Member](ClusterMessages.Member.html "class in akka.cluster.protobuf.msg")> values)` | `repeated .Member members = 4;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllRoles](#addAllRoles(java.lang.String))​(java.lang.String value)` | `repeated string allRoles = 2;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllRolesBytes](#addAllRolesBytes(akka.protobufv3.internal.ByteString))​(akka.protobufv3.internal.ByteString value)` | `repeated string allRoles = 2;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addAllTombstones](#addAllTombstones(java.lang.Iterable))​(java.lang.Iterable<? extends [ClusterMessages.Tombstone](ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg")> values)` | `repeated .Tombstone tombstones = 7;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addMembers](#addMembers(int,akka.cluster.protobuf.msg.ClusterMessages.Member))​(int index,  [ClusterMessages.Member](ClusterMessages.Member.html "class in akka.cluster.protobuf.msg") value)` | `repeated .Member members = 4;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addMembers](#addMembers(int,akka.cluster.protobuf.msg.ClusterMessages.Member.Builder))​(int index,  [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `repeated .Member members = 4;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addMembers](#addMembers(akka.cluster.protobuf.msg.ClusterMessages.Member))​([ClusterMessages.Member](ClusterMessages.Member.html "class in akka.cluster.protobuf.msg") value)` | `repeated .Member members = 4;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addMembers](#addMembers(akka.cluster.protobuf.msg.ClusterMessages.Member.Builder))​([ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `repeated .Member members = 4;` |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[addMembersBuilder](#addMembersBuilder())()` | `repeated .Member members = 4;` |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[addMembersBuilder](#addMembersBuilder(int))​(int index)` | `repeated .Member members = 4;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addRepeatedField](#addRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addTombstones](#addTombstones(int,akka.cluster.protobuf.msg.ClusterMessages.Tombstone))​(int index,  [ClusterMessages.Tombstone](ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg") value)` | `repeated .Tombstone tombstones = 7;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addTombstones](#addTombstones(int,akka.cluster.protobuf.msg.ClusterMessages.Tombstone.Builder))​(int index,  [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `repeated .Tombstone tombstones = 7;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addTombstones](#addTombstones(akka.cluster.protobuf.msg.ClusterMessages.Tombstone))​([ClusterMessages.Tombstone](ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg") value)` | `repeated .Tombstone tombstones = 7;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[addTombstones](#addTombstones(akka.cluster.protobuf.msg.ClusterMessages.Tombstone.Builder))​([ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `repeated .Tombstone tombstones = 7;` |
	| `[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")` | `[addTombstonesBuilder](#addTombstonesBuilder())()` | `repeated .Tombstone tombstones = 7;` |
	| `[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")` | `[addTombstonesBuilder](#addTombstonesBuilder(int))​(int index)` | `repeated .Tombstone tombstones = 7;` |
	| `[ClusterMessages.Gossip](ClusterMessages.Gossip.html "class in akka.cluster.protobuf.msg")` | `[build](#build())()` |  |
	| `[ClusterMessages.Gossip](ClusterMessages.Gossip.html "class in akka.cluster.protobuf.msg")` | `[buildPartial](#buildPartial())()` |  |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[clear](#clear())()` |  |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearAllAddresses](#clearAllAddresses())()` | `repeated .UniqueAddress allAddresses = 1;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearAllAppVersions](#clearAllAppVersions())()` | `repeated string allAppVersions = 8;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearAllHashes](#clearAllHashes())()` | `repeated string allHashes = 3;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearAllRoles](#clearAllRoles())()` | `repeated string allRoles = 2;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearField](#clearField(akka.protobufv3.internal.Descriptors.FieldDescriptor))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)` |  |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearMembers](#clearMembers())()` | `repeated .Member members = 4;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearOneof](#clearOneof(akka.protobufv3.internal.Descriptors.OneofDescriptor))​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)` |  |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearOverview](#clearOverview())()` | `required .GossipOverview overview = 5;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearTombstones](#clearTombstones())()` | `repeated .Tombstone tombstones = 7;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[clearVersion](#clearVersion())()` | `required .VectorClock version = 6;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[clone](#clone())()` |  |
	| `[ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg")` | `[getAllAddresses](#getAllAddresses(int))​(int index)` | `repeated .UniqueAddress allAddresses = 1;` |
	| `[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")` | `[getAllAddressesBuilder](#getAllAddressesBuilder(int))​(int index)` | `repeated .UniqueAddress allAddresses = 1;` |
	| `java.util.List<[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")>` | `[getAllAddressesBuilderList](#getAllAddressesBuilderList())()` | `repeated .UniqueAddress allAddresses = 1;` |
	| `int` | `[getAllAddressesCount](#getAllAddressesCount())()` | `repeated .UniqueAddress allAddresses = 1;` |
	| `java.util.List<[ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg")>` | `[getAllAddressesList](#getAllAddressesList())()` | `repeated .UniqueAddress allAddresses = 1;` |
	| `[ClusterMessages.UniqueAddressOrBuilder](ClusterMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.protobuf.msg")` | `[getAllAddressesOrBuilder](#getAllAddressesOrBuilder(int))​(int index)` | `repeated .UniqueAddress allAddresses = 1;` |
	| `java.util.List<? extends [ClusterMessages.UniqueAddressOrBuilder](ClusterMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.protobuf.msg")>` | `[getAllAddressesOrBuilderList](#getAllAddressesOrBuilderList())()` | `repeated .UniqueAddress allAddresses = 1;` |
	| `java.lang.String` | `[getAllAppVersions](#getAllAppVersions(int))​(int index)` | `repeated string allAppVersions = 8;` |
	| `akka.protobufv3.internal.ByteString` | `[getAllAppVersionsBytes](#getAllAppVersionsBytes(int))​(int index)` | `repeated string allAppVersions = 8;` |
	| `int` | `[getAllAppVersionsCount](#getAllAppVersionsCount())()` | `repeated string allAppVersions = 8;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getAllAppVersionsList](#getAllAppVersionsList())()` | `repeated string allAppVersions = 8;` |
	| `java.lang.String` | `[getAllHashes](#getAllHashes(int))​(int index)` | `repeated string allHashes = 3;` |
	| `akka.protobufv3.internal.ByteString` | `[getAllHashesBytes](#getAllHashesBytes(int))​(int index)` | `repeated string allHashes = 3;` |
	| `int` | `[getAllHashesCount](#getAllHashesCount())()` | `repeated string allHashes = 3;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getAllHashesList](#getAllHashesList())()` | `repeated string allHashes = 3;` |
	| `java.lang.String` | `[getAllRoles](#getAllRoles(int))​(int index)` | `repeated string allRoles = 2;` |
	| `akka.protobufv3.internal.ByteString` | `[getAllRolesBytes](#getAllRolesBytes(int))​(int index)` | `repeated string allRoles = 2;` |
	| `int` | `[getAllRolesCount](#getAllRolesCount())()` | `repeated string allRoles = 2;` |
	| `akka.protobufv3.internal.ProtocolStringList` | `[getAllRolesList](#getAllRolesList())()` | `repeated string allRoles = 2;` |
	| `[ClusterMessages.Gossip](ClusterMessages.Gossip.html "class in akka.cluster.protobuf.msg")` | `[getDefaultInstanceForType](#getDefaultInstanceForType())()` |  |
	| `static akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptor](#getDescriptor())()` |  |
	| `akka.protobufv3.internal.Descriptors.Descriptor` | `[getDescriptorForType](#getDescriptorForType())()` |  |
	| `[ClusterMessages.Member](ClusterMessages.Member.html "class in akka.cluster.protobuf.msg")` | `[getMembers](#getMembers(int))​(int index)` | `repeated .Member members = 4;` |
	| `[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")` | `[getMembersBuilder](#getMembersBuilder(int))​(int index)` | `repeated .Member members = 4;` |
	| `java.util.List<[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")>` | `[getMembersBuilderList](#getMembersBuilderList())()` | `repeated .Member members = 4;` |
	| `int` | `[getMembersCount](#getMembersCount())()` | `repeated .Member members = 4;` |
	| `java.util.List<[ClusterMessages.Member](ClusterMessages.Member.html "class in akka.cluster.protobuf.msg")>` | `[getMembersList](#getMembersList())()` | `repeated .Member members = 4;` |
	| `[ClusterMessages.MemberOrBuilder](ClusterMessages.MemberOrBuilder.html "interface in akka.cluster.protobuf.msg")` | `[getMembersOrBuilder](#getMembersOrBuilder(int))​(int index)` | `repeated .Member members = 4;` |
	| `java.util.List<? extends [ClusterMessages.MemberOrBuilder](ClusterMessages.MemberOrBuilder.html "interface in akka.cluster.protobuf.msg")>` | `[getMembersOrBuilderList](#getMembersOrBuilderList())()` | `repeated .Member members = 4;` |
	| `[ClusterMessages.GossipOverview](ClusterMessages.GossipOverview.html "class in akka.cluster.protobuf.msg")` | `[getOverview](#getOverview())()` | `required .GossipOverview overview = 5;` |
	| `[ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg")` | `[getOverviewBuilder](#getOverviewBuilder())()` | `required .GossipOverview overview = 5;` |
	| `[ClusterMessages.GossipOverviewOrBuilder](ClusterMessages.GossipOverviewOrBuilder.html "interface in akka.cluster.protobuf.msg")` | `[getOverviewOrBuilder](#getOverviewOrBuilder())()` | `required .GossipOverview overview = 5;` |
	| `[ClusterMessages.Tombstone](ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg")` | `[getTombstones](#getTombstones(int))​(int index)` | `repeated .Tombstone tombstones = 7;` |
	| `[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")` | `[getTombstonesBuilder](#getTombstonesBuilder(int))​(int index)` | `repeated .Tombstone tombstones = 7;` |
	| `java.util.List<[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")>` | `[getTombstonesBuilderList](#getTombstonesBuilderList())()` | `repeated .Tombstone tombstones = 7;` |
	| `int` | `[getTombstonesCount](#getTombstonesCount())()` | `repeated .Tombstone tombstones = 7;` |
	| `java.util.List<[ClusterMessages.Tombstone](ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg")>` | `[getTombstonesList](#getTombstonesList())()` | `repeated .Tombstone tombstones = 7;` |
	| `[ClusterMessages.TombstoneOrBuilder](ClusterMessages.TombstoneOrBuilder.html "interface in akka.cluster.protobuf.msg")` | `[getTombstonesOrBuilder](#getTombstonesOrBuilder(int))​(int index)` | `repeated .Tombstone tombstones = 7;` |
	| `java.util.List<? extends [ClusterMessages.TombstoneOrBuilder](ClusterMessages.TombstoneOrBuilder.html "interface in akka.cluster.protobuf.msg")>` | `[getTombstonesOrBuilderList](#getTombstonesOrBuilderList())()` | `repeated .Tombstone tombstones = 7;` |
	| `[ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg")` | `[getVersion](#getVersion())()` | `required .VectorClock version = 6;` |
	| `[ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg")` | `[getVersionBuilder](#getVersionBuilder())()` | `required .VectorClock version = 6;` |
	| `[ClusterMessages.VectorClockOrBuilder](ClusterMessages.VectorClockOrBuilder.html "interface in akka.cluster.protobuf.msg")` | `[getVersionOrBuilder](#getVersionOrBuilder())()` | `required .VectorClock version = 6;` |
	| `boolean` | `[hasOverview](#hasOverview())()` | `required .GossipOverview overview = 5;` |
	| `boolean` | `[hasVersion](#hasVersion())()` | `required .VectorClock version = 6;` |
	| `protected akka.protobufv3.internal.GeneratedMessageV3.FieldAccessorTable` | `[internalGetFieldAccessorTable](#internalGetFieldAccessorTable())()` |  |
	| `boolean` | `[isInitialized](#isInitialized())()` |  |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.cluster.protobuf.msg.ClusterMessages.Gossip))​([ClusterMessages.Gossip](ClusterMessages.Gossip.html "class in akka.cluster.protobuf.msg") other)` |  |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.CodedInputStream,akka.protobufv3.internal.ExtensionRegistryLite))​(akka.protobufv3.internal.CodedInputStream input,  akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)` |  |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeFrom](#mergeFrom(akka.protobufv3.internal.Message))​(akka.protobufv3.internal.Message other)` |  |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeOverview](#mergeOverview(akka.cluster.protobuf.msg.ClusterMessages.GossipOverview))​([ClusterMessages.GossipOverview](ClusterMessages.GossipOverview.html "class in akka.cluster.protobuf.msg") value)` | `required .GossipOverview overview = 5;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeUnknownFields](#mergeUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[mergeVersion](#mergeVersion(akka.cluster.protobuf.msg.ClusterMessages.VectorClock))​([ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg") value)` | `required .VectorClock version = 6;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[removeAllAddresses](#removeAllAddresses(int))​(int index)` | `repeated .UniqueAddress allAddresses = 1;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[removeMembers](#removeMembers(int))​(int index)` | `repeated .Member members = 4;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[removeTombstones](#removeTombstones(int))​(int index)` | `repeated .Tombstone tombstones = 7;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[setAllAddresses](#setAllAddresses(int,akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress))​(int index,  [ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)` | `repeated .UniqueAddress allAddresses = 1;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[setAllAddresses](#setAllAddresses(int,akka.cluster.protobuf.msg.ClusterMessages.UniqueAddress.Builder))​(int index,  [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `repeated .UniqueAddress allAddresses = 1;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[setAllAppVersions](#setAllAppVersions(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string allAppVersions = 8;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[setAllHashes](#setAllHashes(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string allHashes = 3;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[setAllRoles](#setAllRoles(int,java.lang.String))​(int index,  java.lang.String value)` | `repeated string allRoles = 2;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[setField](#setField(akka.protobufv3.internal.Descriptors.FieldDescriptor,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  java.lang.Object value)` |  |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[setMembers](#setMembers(int,akka.cluster.protobuf.msg.ClusterMessages.Member))​(int index,  [ClusterMessages.Member](ClusterMessages.Member.html "class in akka.cluster.protobuf.msg") value)` | `repeated .Member members = 4;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[setMembers](#setMembers(int,akka.cluster.protobuf.msg.ClusterMessages.Member.Builder))​(int index,  [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `repeated .Member members = 4;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[setOverview](#setOverview(akka.cluster.protobuf.msg.ClusterMessages.GossipOverview))​([ClusterMessages.GossipOverview](ClusterMessages.GossipOverview.html "class in akka.cluster.protobuf.msg") value)` | `required .GossipOverview overview = 5;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[setOverview](#setOverview(akka.cluster.protobuf.msg.ClusterMessages.GossipOverview.Builder))​([ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `required .GossipOverview overview = 5;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[setRepeatedField](#setRepeatedField(akka.protobufv3.internal.Descriptors.FieldDescriptor,int,java.lang.Object))​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,  int index,  java.lang.Object value)` |  |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[setTombstones](#setTombstones(int,akka.cluster.protobuf.msg.ClusterMessages.Tombstone))​(int index,  [ClusterMessages.Tombstone](ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg") value)` | `repeated .Tombstone tombstones = 7;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[setTombstones](#setTombstones(int,akka.cluster.protobuf.msg.ClusterMessages.Tombstone.Builder))​(int index,  [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `repeated .Tombstone tombstones = 7;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[setUnknownFields](#setUnknownFields(akka.protobufv3.internal.UnknownFieldSet))​(akka.protobufv3.internal.UnknownFieldSet unknownFields)` |  |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[setVersion](#setVersion(akka.cluster.protobuf.msg.ClusterMessages.VectorClock))​([ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg") value)` | `required .VectorClock version = 6;` |
	| `[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")` | `[setVersion](#setVersion(akka.cluster.protobuf.msg.ClusterMessages.VectorClock.Builder))​([ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)` | `required .VectorClock version = 6;` |
	
	
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
		`internalGetFieldAccessorTable` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clear
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") clear()
		```
		
		
		Specified by:
		`clear` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clear` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clear` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDescriptorForType
		
		
		
		```
		public akka.protobufv3.internal.Descriptors.Descriptor getDescriptorForType()
		```
		
		
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`getDescriptorForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		Overrides:
		`getDescriptorForType` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### getDefaultInstanceForType
		
		
		
		```
		public [ClusterMessages.Gossip](ClusterMessages.Gossip.html "class in akka.cluster.protobuf.msg") getDefaultInstanceForType()
		```
		
		
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Specified by:
		`getDefaultInstanceForType` in interface `akka.protobufv3.internal.MessageOrBuilder`
		- #### build
		
		
		
		```
		public [ClusterMessages.Gossip](ClusterMessages.Gossip.html "class in akka.cluster.protobuf.msg") build()
		```
		
		
		Specified by:
		`build` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`build` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### buildPartial
		
		
		
		```
		public [ClusterMessages.Gossip](ClusterMessages.Gossip.html "class in akka.cluster.protobuf.msg") buildPartial()
		```
		
		
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`buildPartial` in interface `akka.protobufv3.internal.MessageLite.Builder`
		- #### clone
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") clone()
		```
		
		
		Specified by:
		`clone` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`clone` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`clone` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setField
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") setField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                               java.lang.Object value)
		```
		
		
		Specified by:
		`setField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearField
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") clearField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field)
		```
		
		
		Specified by:
		`clearField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### clearOneof
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") clearOneof​(akka.protobufv3.internal.Descriptors.OneofDescriptor oneof)
		```
		
		
		Specified by:
		`clearOneof` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`clearOneof` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### setRepeatedField
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") setRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                       int index,
		                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`setRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### addRepeatedField
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addRepeatedField​(akka.protobufv3.internal.Descriptors.FieldDescriptor field,
		                                                       java.lang.Object value)
		```
		
		
		Specified by:
		`addRepeatedField` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`addRepeatedField` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.Message other)
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​([ClusterMessages.Gossip](ClusterMessages.Gossip.html "class in akka.cluster.protobuf.msg") other)
		```
		- #### isInitialized
		
		
		
		```
		public final boolean isInitialized()
		```
		
		
		Specified by:
		`isInitialized` in interface `akka.protobufv3.internal.MessageLiteOrBuilder`
		Overrides:
		`isInitialized` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeFrom
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") mergeFrom​(akka.protobufv3.internal.CodedInputStream input,
		                                                akka.protobufv3.internal.ExtensionRegistryLite extensionRegistry)
		                                         throws java.io.IOException
		```
		
		
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.Message.Builder`
		Specified by:
		`mergeFrom` in interface `akka.protobufv3.internal.MessageLite.Builder`
		Overrides:
		`mergeFrom` in class `akka.protobufv3.internal.AbstractMessage.Builder<[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")>`
		Throws:
		`java.io.IOException`
		- #### getAllAddressesList
		
		
		
		```
		public java.util.List<[ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg")> getAllAddressesList()
		```
		
		`repeated .UniqueAddress allAddresses = 1;`
		
		Specified by:
		`[getAllAddressesList](ClusterMessages.GossipOrBuilder.html#getAllAddressesList())` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### getAllAddressesCount
		
		
		
		```
		public int getAllAddressesCount()
		```
		
		`repeated .UniqueAddress allAddresses = 1;`
		
		Specified by:
		`[getAllAddressesCount](ClusterMessages.GossipOrBuilder.html#getAllAddressesCount())` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### getAllAddresses
		
		
		
		```
		public [ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") getAllAddresses​(int index)
		```
		
		`repeated .UniqueAddress allAddresses = 1;`
		
		Specified by:
		`[getAllAddresses](ClusterMessages.GossipOrBuilder.html#getAllAddresses(int))` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### setAllAddresses
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") setAllAddresses​(int index,
		                                                      [ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`repeated .UniqueAddress allAddresses = 1;`
		- #### setAllAddresses
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") setAllAddresses​(int index,
		                                                      [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`repeated .UniqueAddress allAddresses = 1;`
		- #### addAllAddresses
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addAllAddresses​([ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`repeated .UniqueAddress allAddresses = 1;`
		- #### addAllAddresses
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addAllAddresses​(int index,
		                                                      [ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`repeated .UniqueAddress allAddresses = 1;`
		- #### addAllAddresses
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addAllAddresses​([ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`repeated .UniqueAddress allAddresses = 1;`
		- #### addAllAddresses
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addAllAddresses​(int index,
		                                                      [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`repeated .UniqueAddress allAddresses = 1;`
		- #### addAllAllAddresses
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addAllAllAddresses​(java.lang.Iterable<? extends [ClusterMessages.UniqueAddress](ClusterMessages.UniqueAddress.html "class in akka.cluster.protobuf.msg")> values)
		```
		
		`repeated .UniqueAddress allAddresses = 1;`
		- #### clearAllAddresses
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") clearAllAddresses()
		```
		
		`repeated .UniqueAddress allAddresses = 1;`
		- #### removeAllAddresses
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") removeAllAddresses​(int index)
		```
		
		`repeated .UniqueAddress allAddresses = 1;`
		- #### getAllAddressesBuilder
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") getAllAddressesBuilder​(int index)
		```
		
		`repeated .UniqueAddress allAddresses = 1;`
		- #### getAllAddressesOrBuilder
		
		
		
		```
		public [ClusterMessages.UniqueAddressOrBuilder](ClusterMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.protobuf.msg") getAllAddressesOrBuilder​(int index)
		```
		
		`repeated .UniqueAddress allAddresses = 1;`
		
		Specified by:
		`[getAllAddressesOrBuilder](ClusterMessages.GossipOrBuilder.html#getAllAddressesOrBuilder(int))` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### getAllAddressesOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ClusterMessages.UniqueAddressOrBuilder](ClusterMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.protobuf.msg")> getAllAddressesOrBuilderList()
		```
		
		`repeated .UniqueAddress allAddresses = 1;`
		
		Specified by:
		`[getAllAddressesOrBuilderList](ClusterMessages.GossipOrBuilder.html#getAllAddressesOrBuilderList())` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### addAllAddressesBuilder
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") addAllAddressesBuilder()
		```
		
		`repeated .UniqueAddress allAddresses = 1;`
		- #### addAllAddressesBuilder
		
		
		
		```
		public [ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg") addAllAddressesBuilder​(int index)
		```
		
		`repeated .UniqueAddress allAddresses = 1;`
		- #### getAllAddressesBuilderList
		
		
		
		```
		public java.util.List<[ClusterMessages.UniqueAddress.Builder](ClusterMessages.UniqueAddress.Builder.html "class in akka.cluster.protobuf.msg")> getAllAddressesBuilderList()
		```
		
		`repeated .UniqueAddress allAddresses = 1;`
		- #### getAllRolesList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getAllRolesList()
		```
		
		`repeated string allRoles = 2;`
		
		Specified by:
		`[getAllRolesList](ClusterMessages.GossipOrBuilder.html#getAllRolesList())` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		A list containing the allRoles.
		- #### getAllRolesCount
		
		
		
		```
		public int getAllRolesCount()
		```
		
		`repeated string allRoles = 2;`
		
		Specified by:
		`[getAllRolesCount](ClusterMessages.GossipOrBuilder.html#getAllRolesCount())` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The count of allRoles.
		- #### getAllRoles
		
		
		
		```
		public java.lang.String getAllRoles​(int index)
		```
		
		`repeated string allRoles = 2;`
		
		Specified by:
		`[getAllRoles](ClusterMessages.GossipOrBuilder.html#getAllRoles(int))` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The allRoles at the given index.
		- #### getAllRolesBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getAllRolesBytes​(int index)
		```
		
		`repeated string allRoles = 2;`
		
		Specified by:
		`[getAllRolesBytes](ClusterMessages.GossipOrBuilder.html#getAllRolesBytes(int))` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the allRoles at the given index.
		- #### setAllRoles
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") setAllRoles​(int index,
		                                                  java.lang.String value)
		```
		
		`repeated string allRoles = 2;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The allRoles to set.
		Returns:
		This builder for chaining.
		- #### addAllRoles
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addAllRoles​(java.lang.String value)
		```
		
		`repeated string allRoles = 2;`
		
		Parameters:
		`value` \- The allRoles to add.
		Returns:
		This builder for chaining.
		- #### addAllAllRoles
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addAllAllRoles​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string allRoles = 2;`
		
		Parameters:
		`values` \- The allRoles to add.
		Returns:
		This builder for chaining.
		- #### clearAllRoles
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") clearAllRoles()
		```
		
		`repeated string allRoles = 2;`
		
		Returns:
		This builder for chaining.
		- #### addAllRolesBytes
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addAllRolesBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string allRoles = 2;`
		
		Parameters:
		`value` \- The bytes of the allRoles to add.
		Returns:
		This builder for chaining.
		- #### getAllHashesList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getAllHashesList()
		```
		
		`repeated string allHashes = 3;`
		
		Specified by:
		`[getAllHashesList](ClusterMessages.GossipOrBuilder.html#getAllHashesList())` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		A list containing the allHashes.
		- #### getAllHashesCount
		
		
		
		```
		public int getAllHashesCount()
		```
		
		`repeated string allHashes = 3;`
		
		Specified by:
		`[getAllHashesCount](ClusterMessages.GossipOrBuilder.html#getAllHashesCount())` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The count of allHashes.
		- #### getAllHashes
		
		
		
		```
		public java.lang.String getAllHashes​(int index)
		```
		
		`repeated string allHashes = 3;`
		
		Specified by:
		`[getAllHashes](ClusterMessages.GossipOrBuilder.html#getAllHashes(int))` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The allHashes at the given index.
		- #### getAllHashesBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getAllHashesBytes​(int index)
		```
		
		`repeated string allHashes = 3;`
		
		Specified by:
		`[getAllHashesBytes](ClusterMessages.GossipOrBuilder.html#getAllHashesBytes(int))` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the allHashes at the given index.
		- #### setAllHashes
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") setAllHashes​(int index,
		                                                   java.lang.String value)
		```
		
		`repeated string allHashes = 3;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The allHashes to set.
		Returns:
		This builder for chaining.
		- #### addAllHashes
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addAllHashes​(java.lang.String value)
		```
		
		`repeated string allHashes = 3;`
		
		Parameters:
		`value` \- The allHashes to add.
		Returns:
		This builder for chaining.
		- #### addAllAllHashes
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addAllAllHashes​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string allHashes = 3;`
		
		Parameters:
		`values` \- The allHashes to add.
		Returns:
		This builder for chaining.
		- #### clearAllHashes
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") clearAllHashes()
		```
		
		`repeated string allHashes = 3;`
		
		Returns:
		This builder for chaining.
		- #### addAllHashesBytes
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addAllHashesBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string allHashes = 3;`
		
		Parameters:
		`value` \- The bytes of the allHashes to add.
		Returns:
		This builder for chaining.
		- #### getMembersList
		
		
		
		```
		public java.util.List<[ClusterMessages.Member](ClusterMessages.Member.html "class in akka.cluster.protobuf.msg")> getMembersList()
		```
		
		`repeated .Member members = 4;`
		
		Specified by:
		`[getMembersList](ClusterMessages.GossipOrBuilder.html#getMembersList())` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### getMembersCount
		
		
		
		```
		public int getMembersCount()
		```
		
		`repeated .Member members = 4;`
		
		Specified by:
		`[getMembersCount](ClusterMessages.GossipOrBuilder.html#getMembersCount())` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### getMembers
		
		
		
		```
		public [ClusterMessages.Member](ClusterMessages.Member.html "class in akka.cluster.protobuf.msg") getMembers​(int index)
		```
		
		`repeated .Member members = 4;`
		
		Specified by:
		`[getMembers](ClusterMessages.GossipOrBuilder.html#getMembers(int))` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### setMembers
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") setMembers​(int index,
		                                                 [ClusterMessages.Member](ClusterMessages.Member.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`repeated .Member members = 4;`
		- #### setMembers
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") setMembers​(int index,
		                                                 [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`repeated .Member members = 4;`
		- #### addMembers
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addMembers​([ClusterMessages.Member](ClusterMessages.Member.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`repeated .Member members = 4;`
		- #### addMembers
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addMembers​(int index,
		                                                 [ClusterMessages.Member](ClusterMessages.Member.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`repeated .Member members = 4;`
		- #### addMembers
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addMembers​([ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`repeated .Member members = 4;`
		- #### addMembers
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addMembers​(int index,
		                                                 [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`repeated .Member members = 4;`
		- #### addAllMembers
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addAllMembers​(java.lang.Iterable<? extends [ClusterMessages.Member](ClusterMessages.Member.html "class in akka.cluster.protobuf.msg")> values)
		```
		
		`repeated .Member members = 4;`
		- #### clearMembers
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") clearMembers()
		```
		
		`repeated .Member members = 4;`
		- #### removeMembers
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") removeMembers​(int index)
		```
		
		`repeated .Member members = 4;`
		- #### getMembersBuilder
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") getMembersBuilder​(int index)
		```
		
		`repeated .Member members = 4;`
		- #### getMembersOrBuilder
		
		
		
		```
		public [ClusterMessages.MemberOrBuilder](ClusterMessages.MemberOrBuilder.html "interface in akka.cluster.protobuf.msg") getMembersOrBuilder​(int index)
		```
		
		`repeated .Member members = 4;`
		
		Specified by:
		`[getMembersOrBuilder](ClusterMessages.GossipOrBuilder.html#getMembersOrBuilder(int))` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### getMembersOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ClusterMessages.MemberOrBuilder](ClusterMessages.MemberOrBuilder.html "interface in akka.cluster.protobuf.msg")> getMembersOrBuilderList()
		```
		
		`repeated .Member members = 4;`
		
		Specified by:
		`[getMembersOrBuilderList](ClusterMessages.GossipOrBuilder.html#getMembersOrBuilderList())` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### addMembersBuilder
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") addMembersBuilder()
		```
		
		`repeated .Member members = 4;`
		- #### addMembersBuilder
		
		
		
		```
		public [ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg") addMembersBuilder​(int index)
		```
		
		`repeated .Member members = 4;`
		- #### getMembersBuilderList
		
		
		
		```
		public java.util.List<[ClusterMessages.Member.Builder](ClusterMessages.Member.Builder.html "class in akka.cluster.protobuf.msg")> getMembersBuilderList()
		```
		
		`repeated .Member members = 4;`
		- #### hasOverview
		
		
		
		```
		public boolean hasOverview()
		```
		
		`required .GossipOverview overview = 5;`
		
		Specified by:
		`[hasOverview](ClusterMessages.GossipOrBuilder.html#hasOverview())` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the overview field is set.
		- #### getOverview
		
		
		
		```
		public [ClusterMessages.GossipOverview](ClusterMessages.GossipOverview.html "class in akka.cluster.protobuf.msg") getOverview()
		```
		
		`required .GossipOverview overview = 5;`
		
		Specified by:
		`[getOverview](ClusterMessages.GossipOrBuilder.html#getOverview())` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The overview.
		- #### setOverview
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") setOverview​([ClusterMessages.GossipOverview](ClusterMessages.GossipOverview.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .GossipOverview overview = 5;`
		- #### setOverview
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") setOverview​([ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`required .GossipOverview overview = 5;`
		- #### mergeOverview
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") mergeOverview​([ClusterMessages.GossipOverview](ClusterMessages.GossipOverview.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .GossipOverview overview = 5;`
		- #### clearOverview
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") clearOverview()
		```
		
		`required .GossipOverview overview = 5;`
		- #### getOverviewBuilder
		
		
		
		```
		public [ClusterMessages.GossipOverview.Builder](ClusterMessages.GossipOverview.Builder.html "class in akka.cluster.protobuf.msg") getOverviewBuilder()
		```
		
		`required .GossipOverview overview = 5;`
		- #### getOverviewOrBuilder
		
		
		
		```
		public [ClusterMessages.GossipOverviewOrBuilder](ClusterMessages.GossipOverviewOrBuilder.html "interface in akka.cluster.protobuf.msg") getOverviewOrBuilder()
		```
		
		`required .GossipOverview overview = 5;`
		
		Specified by:
		`[getOverviewOrBuilder](ClusterMessages.GossipOrBuilder.html#getOverviewOrBuilder())` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### hasVersion
		
		
		
		```
		public boolean hasVersion()
		```
		
		`required .VectorClock version = 6;`
		
		Specified by:
		`[hasVersion](ClusterMessages.GossipOrBuilder.html#hasVersion())` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		Whether the version field is set.
		- #### getVersion
		
		
		
		```
		public [ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg") getVersion()
		```
		
		`required .VectorClock version = 6;`
		
		Specified by:
		`[getVersion](ClusterMessages.GossipOrBuilder.html#getVersion())` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The version.
		- #### setVersion
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") setVersion​([ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .VectorClock version = 6;`
		- #### setVersion
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") setVersion​([ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`required .VectorClock version = 6;`
		- #### mergeVersion
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") mergeVersion​([ClusterMessages.VectorClock](ClusterMessages.VectorClock.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`required .VectorClock version = 6;`
		- #### clearVersion
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") clearVersion()
		```
		
		`required .VectorClock version = 6;`
		- #### getVersionBuilder
		
		
		
		```
		public [ClusterMessages.VectorClock.Builder](ClusterMessages.VectorClock.Builder.html "class in akka.cluster.protobuf.msg") getVersionBuilder()
		```
		
		`required .VectorClock version = 6;`
		- #### getVersionOrBuilder
		
		
		
		```
		public [ClusterMessages.VectorClockOrBuilder](ClusterMessages.VectorClockOrBuilder.html "interface in akka.cluster.protobuf.msg") getVersionOrBuilder()
		```
		
		`required .VectorClock version = 6;`
		
		Specified by:
		`[getVersionOrBuilder](ClusterMessages.GossipOrBuilder.html#getVersionOrBuilder())` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### getTombstonesList
		
		
		
		```
		public java.util.List<[ClusterMessages.Tombstone](ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg")> getTombstonesList()
		```
		
		`repeated .Tombstone tombstones = 7;`
		
		Specified by:
		`[getTombstonesList](ClusterMessages.GossipOrBuilder.html#getTombstonesList())` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### getTombstonesCount
		
		
		
		```
		public int getTombstonesCount()
		```
		
		`repeated .Tombstone tombstones = 7;`
		
		Specified by:
		`[getTombstonesCount](ClusterMessages.GossipOrBuilder.html#getTombstonesCount())` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### getTombstones
		
		
		
		```
		public [ClusterMessages.Tombstone](ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg") getTombstones​(int index)
		```
		
		`repeated .Tombstone tombstones = 7;`
		
		Specified by:
		`[getTombstones](ClusterMessages.GossipOrBuilder.html#getTombstones(int))` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### setTombstones
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") setTombstones​(int index,
		                                                    [ClusterMessages.Tombstone](ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`repeated .Tombstone tombstones = 7;`
		- #### setTombstones
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") setTombstones​(int index,
		                                                    [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`repeated .Tombstone tombstones = 7;`
		- #### addTombstones
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addTombstones​([ClusterMessages.Tombstone](ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`repeated .Tombstone tombstones = 7;`
		- #### addTombstones
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addTombstones​(int index,
		                                                    [ClusterMessages.Tombstone](ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg") value)
		```
		
		`repeated .Tombstone tombstones = 7;`
		- #### addTombstones
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addTombstones​([ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`repeated .Tombstone tombstones = 7;`
		- #### addTombstones
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addTombstones​(int index,
		                                                    [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") builderForValue)
		```
		
		`repeated .Tombstone tombstones = 7;`
		- #### addAllTombstones
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addAllTombstones​(java.lang.Iterable<? extends [ClusterMessages.Tombstone](ClusterMessages.Tombstone.html "class in akka.cluster.protobuf.msg")> values)
		```
		
		`repeated .Tombstone tombstones = 7;`
		- #### clearTombstones
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") clearTombstones()
		```
		
		`repeated .Tombstone tombstones = 7;`
		- #### removeTombstones
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") removeTombstones​(int index)
		```
		
		`repeated .Tombstone tombstones = 7;`
		- #### getTombstonesBuilder
		
		
		
		```
		public [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") getTombstonesBuilder​(int index)
		```
		
		`repeated .Tombstone tombstones = 7;`
		- #### getTombstonesOrBuilder
		
		
		
		```
		public [ClusterMessages.TombstoneOrBuilder](ClusterMessages.TombstoneOrBuilder.html "interface in akka.cluster.protobuf.msg") getTombstonesOrBuilder​(int index)
		```
		
		`repeated .Tombstone tombstones = 7;`
		
		Specified by:
		`[getTombstonesOrBuilder](ClusterMessages.GossipOrBuilder.html#getTombstonesOrBuilder(int))` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### getTombstonesOrBuilderList
		
		
		
		```
		public java.util.List<? extends [ClusterMessages.TombstoneOrBuilder](ClusterMessages.TombstoneOrBuilder.html "interface in akka.cluster.protobuf.msg")> getTombstonesOrBuilderList()
		```
		
		`repeated .Tombstone tombstones = 7;`
		
		Specified by:
		`[getTombstonesOrBuilderList](ClusterMessages.GossipOrBuilder.html#getTombstonesOrBuilderList())` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		- #### addTombstonesBuilder
		
		
		
		```
		public [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") addTombstonesBuilder()
		```
		
		`repeated .Tombstone tombstones = 7;`
		- #### addTombstonesBuilder
		
		
		
		```
		public [ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg") addTombstonesBuilder​(int index)
		```
		
		`repeated .Tombstone tombstones = 7;`
		- #### getTombstonesBuilderList
		
		
		
		```
		public java.util.List<[ClusterMessages.Tombstone.Builder](ClusterMessages.Tombstone.Builder.html "class in akka.cluster.protobuf.msg")> getTombstonesBuilderList()
		```
		
		`repeated .Tombstone tombstones = 7;`
		- #### getAllAppVersionsList
		
		
		
		```
		public akka.protobufv3.internal.ProtocolStringList getAllAppVersionsList()
		```
		
		`repeated string allAppVersions = 8;`
		
		Specified by:
		`[getAllAppVersionsList](ClusterMessages.GossipOrBuilder.html#getAllAppVersionsList())` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		A list containing the allAppVersions.
		- #### getAllAppVersionsCount
		
		
		
		```
		public int getAllAppVersionsCount()
		```
		
		`repeated string allAppVersions = 8;`
		
		Specified by:
		`[getAllAppVersionsCount](ClusterMessages.GossipOrBuilder.html#getAllAppVersionsCount())` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Returns:
		The count of allAppVersions.
		- #### getAllAppVersions
		
		
		
		```
		public java.lang.String getAllAppVersions​(int index)
		```
		
		`repeated string allAppVersions = 8;`
		
		Specified by:
		`[getAllAppVersions](ClusterMessages.GossipOrBuilder.html#getAllAppVersions(int))` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Parameters:
		`index` \- The index of the element to return.
		Returns:
		The allAppVersions at the given index.
		- #### getAllAppVersionsBytes
		
		
		
		```
		public akka.protobufv3.internal.ByteString getAllAppVersionsBytes​(int index)
		```
		
		`repeated string allAppVersions = 8;`
		
		Specified by:
		`[getAllAppVersionsBytes](ClusterMessages.GossipOrBuilder.html#getAllAppVersionsBytes(int))` in interface `[ClusterMessages.GossipOrBuilder](ClusterMessages.GossipOrBuilder.html "interface in akka.cluster.protobuf.msg")`
		Parameters:
		`index` \- The index of the value to return.
		Returns:
		The bytes of the allAppVersions at the given index.
		- #### setAllAppVersions
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") setAllAppVersions​(int index,
		                                                        java.lang.String value)
		```
		
		`repeated string allAppVersions = 8;`
		
		Parameters:
		`index` \- The index to set the value at.
		`value` \- The allAppVersions to set.
		Returns:
		This builder for chaining.
		- #### addAllAppVersions
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addAllAppVersions​(java.lang.String value)
		```
		
		`repeated string allAppVersions = 8;`
		
		Parameters:
		`value` \- The allAppVersions to add.
		Returns:
		This builder for chaining.
		- #### addAllAllAppVersions
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addAllAllAppVersions​(java.lang.Iterable<java.lang.String> values)
		```
		
		`repeated string allAppVersions = 8;`
		
		Parameters:
		`values` \- The allAppVersions to add.
		Returns:
		This builder for chaining.
		- #### clearAllAppVersions
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") clearAllAppVersions()
		```
		
		`repeated string allAppVersions = 8;`
		
		Returns:
		This builder for chaining.
		- #### addAllAppVersionsBytes
		
		
		
		```
		public [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") addAllAppVersionsBytes​(akka.protobufv3.internal.ByteString value)
		```
		
		`repeated string allAppVersions = 8;`
		
		Parameters:
		`value` \- The bytes of the allAppVersions to add.
		Returns:
		This builder for chaining.
		- #### setUnknownFields
		
		
		
		```
		public final [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") setUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`setUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`setUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")>`
		- #### mergeUnknownFields
		
		
		
		```
		public final [ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg") mergeUnknownFields​(akka.protobufv3.internal.UnknownFieldSet unknownFields)
		```
		
		
		Specified by:
		`mergeUnknownFields` in interface `akka.protobufv3.internal.Message.Builder`
		Overrides:
		`mergeUnknownFields` in class `akka.protobufv3.internal.GeneratedMessageV3.Builder<[ClusterMessages.Gossip.Builder](ClusterMessages.Gossip.Builder.html "class in akka.cluster.protobuf.msg")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Gossip.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Gossip.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.GossipOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.GossipOverview.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.GossipOverview.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.GossipOverviewOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Member.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Member.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.MemberOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Tombstone.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Tombstone.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.TombstoneOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.VectorClock.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.VectorClockOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Gossip.Builder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/protobuf/msg/ClusterMessages.Gossip.Builder.html)*