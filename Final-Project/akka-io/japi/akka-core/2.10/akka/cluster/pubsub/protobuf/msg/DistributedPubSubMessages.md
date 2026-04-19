---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:05:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.StatusOrBuilder.html
title: DistributedPubSubMessages.StatusOrBuilder
---

# DistributedPubSubMessages.StatusOrBuilder

## Content

Package [akka.cluster.pubsub.protobuf.msg](package-summary.html)
## Interface DistributedPubSubMessages.StatusOrBuilder

- All Superinterfaces:
`akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`

All Known Implementing Classes:
`[DistributedPubSubMessages.Status](DistributedPubSubMessages.Status.html "class in akka.cluster.pubsub.protobuf.msg")`, `[DistributedPubSubMessages.Status.Builder](DistributedPubSubMessages.Status.Builder.html "class in akka.cluster.pubsub.protobuf.msg")`

Enclosing class:
[DistributedPubSubMessages](DistributedPubSubMessages.html "class in akka.cluster.pubsub.protobuf.msg")

---

```
public static interface DistributedPubSubMessages.StatusOrBuilder
extends akka.protobufv3.internal.MessageOrBuilder
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[getReplyToStatus](#getReplyToStatus())()` | `optional bool replyToStatus = 2;` |
	| `[DistributedPubSubMessages.Status.Version](DistributedPubSubMessages.Status.Version.html "class in akka.cluster.pubsub.protobuf.msg")` | `[getVersions](#getVersions(int))​(int index)` | `repeated .Status.Version versions = 1;` |
	| `int` | `[getVersionsCount](#getVersionsCount())()` | `repeated .Status.Version versions = 1;` |
	| `java.util.List<[DistributedPubSubMessages.Status.Version](DistributedPubSubMessages.Status.Version.html "class in akka.cluster.pubsub.protobuf.msg")>` | `[getVersionsList](#getVersionsList())()` | `repeated .Status.Version versions = 1;` |
	| `[DistributedPubSubMessages.Status.VersionOrBuilder](DistributedPubSubMessages.Status.VersionOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")` | `[getVersionsOrBuilder](#getVersionsOrBuilder(int))​(int index)` | `repeated .Status.Version versions = 1;` |
	| `java.util.List<? extends [DistributedPubSubMessages.Status.VersionOrBuilder](DistributedPubSubMessages.Status.VersionOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")>` | `[getVersionsOrBuilderList](#getVersionsOrBuilderList())()` | `repeated .Status.Version versions = 1;` |
	| `boolean` | `[hasReplyToStatus](#hasReplyToStatus())()` | `optional bool replyToStatus = 2;` |
	
	
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLiteOrBuilder
		
		
		`isInitialized`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDefaultInstanceForType, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Method Detail
	
	
	
		- #### getVersionsList
		
		
		
		```
		java.util.List<[DistributedPubSubMessages.Status.Version](DistributedPubSubMessages.Status.Version.html "class in akka.cluster.pubsub.protobuf.msg")> getVersionsList()
		```
		
		`repeated .Status.Version versions = 1;`
		- #### getVersions
		
		
		
		```
		[DistributedPubSubMessages.Status.Version](DistributedPubSubMessages.Status.Version.html "class in akka.cluster.pubsub.protobuf.msg") getVersions​(int index)
		```
		
		`repeated .Status.Version versions = 1;`
		- #### getVersionsCount
		
		
		
		```
		int getVersionsCount()
		```
		
		`repeated .Status.Version versions = 1;`
		- #### getVersionsOrBuilderList
		
		
		
		```
		java.util.List<? extends [DistributedPubSubMessages.Status.VersionOrBuilder](DistributedPubSubMessages.Status.VersionOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg")> getVersionsOrBuilderList()
		```
		
		`repeated .Status.Version versions = 1;`
		- #### getVersionsOrBuilder
		
		
		
		```
		[DistributedPubSubMessages.Status.VersionOrBuilder](DistributedPubSubMessages.Status.VersionOrBuilder.html "interface in akka.cluster.pubsub.protobuf.msg") getVersionsOrBuilder​(int index)
		```
		
		`repeated .Status.Version versions = 1;`
		- #### hasReplyToStatus
		
		
		
		```
		boolean hasReplyToStatus()
		```
		
		`optional bool replyToStatus = 2;`
		
		Returns:
		Whether the replyToStatus field is set.
		- #### getReplyToStatus
		
		
		
		```
		boolean getReplyToStatus()
		```
		
		`optional bool replyToStatus = 2;`
		
		Returns:
		The replyToStatus.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.Version.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.VersionOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.Status.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.StatusOrBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/pubsub/protobuf/msg/DistributedPubSubMessages.StatusOrBuilder.html)*