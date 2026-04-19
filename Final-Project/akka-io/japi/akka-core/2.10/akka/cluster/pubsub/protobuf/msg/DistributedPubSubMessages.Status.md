---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:05:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.VersionOrBuilder.html
title: DistributedPubSubMessages.Status.VersionOrBuilder
---

# DistributedPubSubMessages.Status.VersionOrBuilder

## Content

Package [akka.cluster.pubsub.protobuf.msg](package-summary.html)
## Interface DistributedPubSubMessages.Status.VersionOrBuilder

- All Superinterfaces:
`akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`

All Known Implementing Classes:
`[DistributedPubSubMessages.Status.Version](DistributedPubSubMessages.Status.Version.html "class in akka.cluster.pubsub.protobuf.msg")`, `[DistributedPubSubMessages.Status.Version.Builder](DistributedPubSubMessages.Status.Version.Builder.html "class in akka.cluster.pubsub.protobuf.msg")`

Enclosing class:
[DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg")

---

```
public static interface DistributedPubSubMessages.Status.VersionOrBuilder
extends akka.protobufv3.internal.MessageOrBuilder
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getAddress](#getAddress())()` | `required .Address address = 1;` |
	| `[DistributedPubSubMessages.AddressOrBuilder](DistributedPubSubMessages.AddressOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")` | `[getAddressOrBuilder](#getAddressOrBuilder())()` | `required .Address address = 1;` |
	| `long` | `[getTimestamp](#getTimestamp())()` | `required int64 timestamp = 2;` |
	| `boolean` | `[hasAddress](#hasAddress())()` | `required .Address address = 1;` |
	| `boolean` | `[hasTimestamp](#hasTimestamp())()` | `required int64 timestamp = 2;` |
	
	
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLiteOrBuilder
		
		
		`isInitialized`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDefaultInstanceForType, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Method Detail
	
	
	
		- #### hasAddress
		
		
		
		```
		boolean hasAddress()
		```
		
		`required .Address address = 1;`
		
		Returns:
		Whether the address field is set.
		- #### getAddress
		
		
		
		```
		[DistributedPubSubMessages.Address](DistributedPubSubMessages.Address.html "class in akka.cluster.pubsub.protobuf.msg") getAddress()
		```
		
		`required .Address address = 1;`
		
		Returns:
		The address.
		- #### getAddressOrBuilder
		
		
		
		```
		[DistributedPubSubMessages.AddressOrBuilder](DistributedPubSubMessages.AddressOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg") getAddressOrBuilder()
		```
		
		`required .Address address = 1;`
		- #### hasTimestamp
		
		
		
		```
		boolean hasTimestamp()
		```
		
		`required int64 timestamp = 2;`
		
		Returns:
		Whether the timestamp field is set.
		- #### getTimestamp
		
		
		
		```
		long getTimestamp()
		```
		
		`required int64 timestamp = 2;`
		
		Returns:
		The timestamp.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.AddressOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.Version.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.Version.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.VersionOrBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.VersionOrBuilder.html)*