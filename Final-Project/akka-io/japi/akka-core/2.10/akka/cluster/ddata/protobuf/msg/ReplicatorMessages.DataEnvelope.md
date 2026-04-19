---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:02:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html
title: ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder
---

# ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Interface ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder

- All Superinterfaces:
`akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`

All Known Implementing Classes:
`[ReplicatorMessages.DataEnvelope.PruningEntry](ReplicatorMessages.DataEnvelope.PruningEntry.html "class in akka.cluster.ddata.protobuf.msg")`, `[ReplicatorMessages.DataEnvelope.PruningEntry.Builder](ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html "class in akka.cluster.ddata.protobuf.msg")`

Enclosing class:
[ReplicatorMessages.DataEnvelope](ReplicatorMessages.DataEnvelope.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static interface ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder
extends akka.protobufv3.internal.MessageOrBuilder
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `long` | `[getObsoleteTime](#getObsoleteTime())()` | `optional sint64 obsoleteTime = 5;` |
	| `[ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg")` | `[getOwnerAddress](#getOwnerAddress())()` | `required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;` |
	| `[ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getOwnerAddressOrBuilder](#getOwnerAddressOrBuilder())()` | `required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;` |
	| `boolean` | `[getPerformed](#getPerformed())()` | `required bool performed = 3;` |
	| `[ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg")` | `[getRemovedAddress](#getRemovedAddress())()` | `required .akka.cluster.ddata.UniqueAddress removedAddress = 1;` |
	| `[ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getRemovedAddressOrBuilder](#getRemovedAddressOrBuilder())()` | `required .akka.cluster.ddata.UniqueAddress removedAddress = 1;` |
	| `[ReplicatorMessages.Address](ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg")` | `[getSeen](#getSeen(int))​(int index)` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `int` | `[getSeenCount](#getSeenCount())()` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `java.util.List<[ReplicatorMessages.Address](ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg")>` | `[getSeenList](#getSeenList())()` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `[ReplicatorMessages.AddressOrBuilder](ReplicatorMessages.AddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getSeenOrBuilder](#getSeenOrBuilder(int))​(int index)` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `java.util.List<? extends [ReplicatorMessages.AddressOrBuilder](ReplicatorMessages.AddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")>` | `[getSeenOrBuilderList](#getSeenOrBuilderList())()` | `repeated .akka.cluster.ddata.Address seen = 4;` |
	| `boolean` | `[hasObsoleteTime](#hasObsoleteTime())()` | `optional sint64 obsoleteTime = 5;` |
	| `boolean` | `[hasOwnerAddress](#hasOwnerAddress())()` | `required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;` |
	| `boolean` | `[hasPerformed](#hasPerformed())()` | `required bool performed = 3;` |
	| `boolean` | `[hasRemovedAddress](#hasRemovedAddress())()` | `required .akka.cluster.ddata.UniqueAddress removedAddress = 1;` |
	
	
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLiteOrBuilder
		
		
		`isInitialized`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDefaultInstanceForType, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Method Detail
	
	
	
		- #### hasRemovedAddress
		
		
		
		```
		boolean hasRemovedAddress()
		```
		
		`required .akka.cluster.ddata.UniqueAddress removedAddress = 1;`
		
		Returns:
		Whether the removedAddress field is set.
		- #### getRemovedAddress
		
		
		
		```
		[ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") getRemovedAddress()
		```
		
		`required .akka.cluster.ddata.UniqueAddress removedAddress = 1;`
		
		Returns:
		The removedAddress.
		- #### getRemovedAddressOrBuilder
		
		
		
		```
		[ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getRemovedAddressOrBuilder()
		```
		
		`required .akka.cluster.ddata.UniqueAddress removedAddress = 1;`
		- #### hasOwnerAddress
		
		
		
		```
		boolean hasOwnerAddress()
		```
		
		`required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;`
		
		Returns:
		Whether the ownerAddress field is set.
		- #### getOwnerAddress
		
		
		
		```
		[ReplicatorMessages.UniqueAddress](ReplicatorMessages.UniqueAddress.html "class in akka.cluster.ddata.protobuf.msg") getOwnerAddress()
		```
		
		`required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;`
		
		Returns:
		The ownerAddress.
		- #### getOwnerAddressOrBuilder
		
		
		
		```
		[ReplicatorMessages.UniqueAddressOrBuilder](ReplicatorMessages.UniqueAddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getOwnerAddressOrBuilder()
		```
		
		`required .akka.cluster.ddata.UniqueAddress ownerAddress = 2;`
		- #### hasPerformed
		
		
		
		```
		boolean hasPerformed()
		```
		
		`required bool performed = 3;`
		
		Returns:
		Whether the performed field is set.
		- #### getPerformed
		
		
		
		```
		boolean getPerformed()
		```
		
		`required bool performed = 3;`
		
		Returns:
		The performed.
		- #### getSeenList
		
		
		
		```
		java.util.List<[ReplicatorMessages.Address](ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg")> getSeenList()
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		- #### getSeen
		
		
		
		```
		[ReplicatorMessages.Address](ReplicatorMessages.Address.html "class in akka.cluster.ddata.protobuf.msg") getSeen​(int index)
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		- #### getSeenCount
		
		
		
		```
		int getSeenCount()
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		- #### getSeenOrBuilderList
		
		
		
		```
		java.util.List<? extends [ReplicatorMessages.AddressOrBuilder](ReplicatorMessages.AddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")> getSeenOrBuilderList()
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		- #### getSeenOrBuilder
		
		
		
		```
		[ReplicatorMessages.AddressOrBuilder](ReplicatorMessages.AddressOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getSeenOrBuilder​(int index)
		```
		
		`repeated .akka.cluster.ddata.Address seen = 4;`
		- #### hasObsoleteTime
		
		
		
		```
		boolean hasObsoleteTime()
		```
		
		`optional sint64 obsoleteTime = 5;`
		
		Returns:
		Whether the obsoleteTime field is set.
		- #### getObsoleteTime
		
		
		
		```
		long getObsoleteTime()
		```
		
		`optional sint64 obsoleteTime = 5;`
		
		Returns:
		The obsoleteTime.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.AddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.UniqueAddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatorMessages.DataEnvelope.PruningEntryOrBuilder.html)*