---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:09:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder.html
title: ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder
---

# ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder

## Content

Package [akka.persistence.typed.serialization](package-summary.html)
## Interface ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder

- All Superinterfaces:
`akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`

All Known Implementing Classes:
`[ReplicatedEventSourcing.ORSetDeltaGroup.Entry](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.html "class in akka.persistence.typed.serialization")`, `[ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder](ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html "class in akka.persistence.typed.serialization")`

Enclosing class:
[ReplicatedEventSourcing.ORSetDeltaGroup](ReplicatedEventSourcing.ORSetDeltaGroup.html "class in akka.persistence.typed.serialization")

---

```
public static interface ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder
extends akka.protobufv3.internal.MessageOrBuilder
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization")` | `[getOperation](#getOperation())()` | `required .ORSetDeltaOp operation = 1;` |
	| `[ReplicatedEventSourcing.ORSet](ReplicatedEventSourcing.ORSet.html "class in akka.persistence.typed.serialization")` | `[getUnderlying](#getUnderlying())()` | `required .ORSet underlying = 2;` |
	| `[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization")` | `[getUnderlyingOrBuilder](#getUnderlyingOrBuilder())()` | `required .ORSet underlying = 2;` |
	| `boolean` | `[hasOperation](#hasOperation())()` | `required .ORSetDeltaOp operation = 1;` |
	| `boolean` | `[hasUnderlying](#hasUnderlying())()` | `required .ORSet underlying = 2;` |
	
	
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLiteOrBuilder
		
		
		`isInitialized`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDefaultInstanceForType, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Method Detail
	
	
	
		- #### hasOperation
		
		
		
		```
		boolean hasOperation()
		```
		
		`required .ORSetDeltaOp operation = 1;`
		
		Returns:
		Whether the operation field is set.
		- #### getOperation
		
		
		
		```
		[ReplicatedEventSourcing.ORSetDeltaOp](ReplicatedEventSourcing.ORSetDeltaOp.html "enum in akka.persistence.typed.serialization") getOperation()
		```
		
		`required .ORSetDeltaOp operation = 1;`
		
		Returns:
		The operation.
		- #### hasUnderlying
		
		
		
		```
		boolean hasUnderlying()
		```
		
		`required .ORSet underlying = 2;`
		
		Returns:
		Whether the underlying field is set.
		- #### getUnderlying
		
		
		
		```
		[ReplicatedEventSourcing.ORSet](ReplicatedEventSourcing.ORSet.html "class in akka.persistence.typed.serialization") getUnderlying()
		```
		
		`required .ORSet underlying = 2;`
		
		Returns:
		The underlying.
		- #### getUnderlyingOrBuilder
		
		
		
		```
		[ReplicatedEventSourcing.ORSetOrBuilder](ReplicatedEventSourcing.ORSetOrBuilder.html "interface in akka.persistence.typed.serialization") getUnderlyingOrBuilder()
		```
		
		`required .ORSet underlying = 2;`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSet.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetDeltaGroup.Entry.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetDeltaGroup.Entry.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetDeltaGroup.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetDeltaOp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/serialization/ReplicatedEventSourcing.ORSetDeltaGroup.EntryOrBuilder.html)*