---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:02:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.VersionVector.EntryOrBuilder.html
title: ReplicatorMessages.VersionVector.EntryOrBuilder
---

# ReplicatorMessages.VersionVector.EntryOrBuilder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Interface ReplicatorMessages.VersionVector.EntryOrBuilder

- All Superinterfaces:
`akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`

All Known Implementing Classes:
`[ReplicatorMessages.VersionVector.Entry](ReplicatorMessages.VersionVector.Entry.html "class in akka.cluster.ddata.protobuf.msg")`, `[ReplicatorMessages.VersionVector.Entry.Builder](ReplicatorMessages.VersionVector.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")`

Enclosing class:
[ReplicatorMessages.VersionVector](ReplicatorMessages.VersionVector.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static interface ReplicatorMessages.VersionVector.EntryOrBuilder
extends akka.protobufv3.internal.MessageOrBuilder
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg")` | `[getNode](#getNode())()` | `required .akka.cluster.ddata.UniqueAddress node = 1;` |
	| `[ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getNodeOrBuilder](#getNodeOrBuilder())()` | `required .akka.cluster.ddata.UniqueAddress node = 1;` |
	| `long` | `[getVersion](#getVersion())()` | `required int64 version = 2;` |
	| `boolean` | `[hasNode](#hasNode())()` | `required .akka.cluster.ddata.UniqueAddress node = 1;` |
	| `boolean` | `[hasVersion](#hasVersion())()` | `required int64 version = 2;` |
	
	
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLiteOrBuilder
		
		
		`isInitialized`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDefaultInstanceForType, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Method Detail
	
	
	
		- #### hasNode
		
		
		
		```
		boolean hasNode()
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 1;`
		
		Returns:
		Whether the node field is set.
		- #### getNode
		
		
		
		```
		[ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") getNode()
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 1;`
		
		Returns:
		The node.
		- #### getNodeOrBuilder
		
		
		
		```
		[ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getNodeOrBuilder()
		```
		
		`required .akka.cluster.ddata.UniqueAddress node = 1;`
		- #### hasVersion
		
		
		
		```
		boolean hasVersion()
		```
		
		`required int64 version = 2;`
		
		Returns:
		Whether the version field is set.
		- #### getVersion
		
		
		
		```
		long getVersion()
		```
		
		`required int64 version = 2;`
		
		Returns:
		The version.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.VersionVector.Entry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.VersionVector.Entry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.VersionVector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.VersionVector.EntryOrBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.VersionVector.EntryOrBuilder.html)*