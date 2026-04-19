---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:09:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html
title: ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder
---

# ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder

## Content

Package [akka.persistence.typed.serialization](package-summary.html)
## Interface ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder

- All Superinterfaces:
`akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`

All Known Implementing Classes:
`[ReplicatedEventSourcing.ReplicatedSnapshotMetadata](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html "class in akka.persistence.typed.serialization")`, `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html "class in akka.persistence.typed.serialization")`

Enclosing class:
[ReplicatedEventSourcing](ReplicatedEventSourcing.html "class in akka.persistence.typed.serialization")

---

```
public static interface ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder
extends akka.protobufv3.internal.MessageOrBuilder
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization")` | `[getSeenPerReplica](#getSeenPerReplica(int))​(int index)` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `int` | `[getSeenPerReplicaCount](#getSeenPerReplicaCount())()` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `java.util.List<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization")>` | `[getSeenPerReplicaList](#getSeenPerReplicaList())()` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html "interface in akka.persistence.typed.serialization")` | `[getSeenPerReplicaOrBuilder](#getSeenPerReplicaOrBuilder(int))​(int index)` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `java.util.List<? extends [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html "interface in akka.persistence.typed.serialization")>` | `[getSeenPerReplicaOrBuilderList](#getSeenPerReplicaOrBuilderList())()` | `repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;` |
	| `[ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization")` | `[getVersion](#getVersion())()` | `required .VersionVector version = 1;` |
	| `[ReplicatedEventSourcing.VersionVectorOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html "interface in akka.persistence.typed.serialization")` | `[getVersionOrBuilder](#getVersionOrBuilder())()` | `required .VersionVector version = 1;` |
	| `boolean` | `[hasVersion](#hasVersion())()` | `required .VersionVector version = 1;` |
	
	
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLiteOrBuilder
		
		
		`isInitialized`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDefaultInstanceForType, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Method Detail
	
	
	
		- #### hasVersion
		
		
		
		```
		boolean hasVersion()
		```
		
		`required .VersionVector version = 1;`
		
		Returns:
		Whether the version field is set.
		- #### getVersion
		
		
		
		```
		[ReplicatedEventSourcing.VersionVector](ReplicatedEventSourcing.VersionVector.html "class in akka.persistence.typed.serialization") getVersion()
		```
		
		`required .VersionVector version = 1;`
		
		Returns:
		The version.
		- #### getVersionOrBuilder
		
		
		
		```
		[ReplicatedEventSourcing.VersionVectorOrBuilder](ReplicatedEventSourcing.VersionVectorOrBuilder.html "interface in akka.persistence.typed.serialization") getVersionOrBuilder()
		```
		
		`required .VersionVector version = 1;`
		- #### getSeenPerReplicaList
		
		
		
		```
		java.util.List<[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization")> getSeenPerReplicaList()
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		- #### getSeenPerReplica
		
		
		
		```
		[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html "class in akka.persistence.typed.serialization") getSeenPerReplica​(int index)
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		- #### getSeenPerReplicaCount
		
		
		
		```
		int getSeenPerReplicaCount()
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		- #### getSeenPerReplicaOrBuilderList
		
		
		
		```
		java.util.List<? extends [ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html "interface in akka.persistence.typed.serialization")> getSeenPerReplicaOrBuilderList()
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`
		- #### getSeenPerReplicaOrBuilder
		
		
		
		```
		[ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder](ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html "interface in akka.persistence.typed.serialization") getSeenPerReplicaOrBuilder​(int index)
		```
		
		`repeated .ReplicatedSnapshotMetadata.Seen seenPerReplica = 2;`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.Seen.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.SeenOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadata.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.VersionVectorOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ReplicatedSnapshotMetadataOrBuilder.html)*