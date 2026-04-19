---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:02:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html
title: ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder
---

# ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder

## Content

Package [akka.cluster.ddata.protobuf.msg](package-summary.html)
## Interface ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder

- All Superinterfaces:
`akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`

All Known Implementing Classes:
`[ReplicatedDataMessages.ORSetDeltaGroup.Entry](ReplicatedDataMessages.ORSetDeltaGroup.Entry.html "class in akka.cluster.ddata.protobuf.msg")`, `[ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder](ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html "class in akka.cluster.ddata.protobuf.msg")`

Enclosing class:
[ReplicatedDataMessages.ORSetDeltaGroup](ReplicatedDataMessages.ORSetDeltaGroup.html "class in akka.cluster.ddata.protobuf.msg")

---

```
public static interface ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder
extends akka.protobufv3.internal.MessageOrBuilder
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg")` | `[getOperation](#getOperation())()` | `required .akka.cluster.ddata.ORSetDeltaOp operation = 1;` |
	| `[ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg")` | `[getUnderlying](#getUnderlying())()` | `required .akka.cluster.ddata.ORSet underlying = 2;` |
	| `[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg")` | `[getUnderlyingOrBuilder](#getUnderlyingOrBuilder())()` | `required .akka.cluster.ddata.ORSet underlying = 2;` |
	| `boolean` | `[hasOperation](#hasOperation())()` | `required .akka.cluster.ddata.ORSetDeltaOp operation = 1;` |
	| `boolean` | `[hasUnderlying](#hasUnderlying())()` | `required .akka.cluster.ddata.ORSet underlying = 2;` |
	
	
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLiteOrBuilder
		
		
		`isInitialized`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDefaultInstanceForType, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Method Detail
	
	
	
		- #### hasOperation
		
		
		
		```
		boolean hasOperation()
		```
		
		`required .akka.cluster.ddata.ORSetDeltaOp operation = 1;`
		
		Returns:
		Whether the operation field is set.
		- #### getOperation
		
		
		
		```
		[ReplicatedDataMessages.ORSetDeltaOp](ReplicatedDataMessages.ORSetDeltaOp.html "enum in akka.cluster.ddata.protobuf.msg") getOperation()
		```
		
		`required .akka.cluster.ddata.ORSetDeltaOp operation = 1;`
		
		Returns:
		The operation.
		- #### hasUnderlying
		
		
		
		```
		boolean hasUnderlying()
		```
		
		`required .akka.cluster.ddata.ORSet underlying = 2;`
		
		Returns:
		Whether the underlying field is set.
		- #### getUnderlying
		
		
		
		```
		[ReplicatedDataMessages.ORSet](ReplicatedDataMessages.ORSet.html "class in akka.cluster.ddata.protobuf.msg") getUnderlying()
		```
		
		`required .akka.cluster.ddata.ORSet underlying = 2;`
		
		Returns:
		The underlying.
		- #### getUnderlyingOrBuilder
		
		
		
		```
		[ReplicatedDataMessages.ORSetOrBuilder](ReplicatedDataMessages.ORSetOrBuilder.html "interface in akka.cluster.ddata.protobuf.msg") getUnderlyingOrBuilder()
		```
		
		`required .akka.cluster.ddata.ORSet underlying = 2;`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaGroup.Entry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaGroup.Entry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaGroup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaOp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ddata/protobuf/msg/ReplicatedDataMessages.ORSetDeltaGroup.EntryOrBuilder.html)*