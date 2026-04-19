---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:07:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.StateOrBuilder.html
title: ReliableDelivery.StateOrBuilder
---

# ReliableDelivery.StateOrBuilder

## Content

Package [akka.cluster.typed.internal.protobuf](package-summary.html)
## Interface ReliableDelivery.StateOrBuilder

- All Superinterfaces:
`akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`

All Known Implementing Classes:
`[ReliableDelivery.State](ReliableDelivery.State.html "class in akka.cluster.typed.internal.protobuf")`, `[ReliableDelivery.State.Builder](ReliableDelivery.State.Builder.html "class in akka.cluster.typed.internal.protobuf")`

Enclosing class:
[ReliableDelivery](ReliableDelivery.html "class in akka.cluster.typed.internal.protobuf")

---

```
public static interface ReliableDelivery.StateOrBuilder
extends akka.protobufv3.internal.MessageOrBuilder
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf")` | `[getConfirmed](#getConfirmed(int))​(int index)` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `int` | `[getConfirmedCount](#getConfirmedCount())()` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `java.util.List<[ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf")>` | `[getConfirmedList](#getConfirmedList())()` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `[ReliableDelivery.ConfirmedOrBuilder](ReliableDelivery.ConfirmedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")` | `[getConfirmedOrBuilder](#getConfirmedOrBuilder(int))​(int index)` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `java.util.List<? extends [ReliableDelivery.ConfirmedOrBuilder](ReliableDelivery.ConfirmedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")>` | `[getConfirmedOrBuilderList](#getConfirmedOrBuilderList())()` | `repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;` |
	| `long` | `[getCurrentSeqNr](#getCurrentSeqNr())()` | `required int64 currentSeqNr = 1;` |
	| `long` | `[getHighestConfirmedSeqNr](#getHighestConfirmedSeqNr())()` | `required int64 highestConfirmedSeqNr = 2;` |
	| `[ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf")` | `[getUnconfirmed](#getUnconfirmed(int))​(int index)` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `int` | `[getUnconfirmedCount](#getUnconfirmedCount())()` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `java.util.List<[ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf")>` | `[getUnconfirmedList](#getUnconfirmedList())()` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `[ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")` | `[getUnconfirmedOrBuilder](#getUnconfirmedOrBuilder(int))​(int index)` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `java.util.List<? extends [ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")>` | `[getUnconfirmedOrBuilderList](#getUnconfirmedOrBuilderList())()` | `repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;` |
	| `boolean` | `[hasCurrentSeqNr](#hasCurrentSeqNr())()` | `required int64 currentSeqNr = 1;` |
	| `boolean` | `[hasHighestConfirmedSeqNr](#hasHighestConfirmedSeqNr())()` | `required int64 highestConfirmedSeqNr = 2;` |
	
	
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLiteOrBuilder
		
		
		`isInitialized`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDefaultInstanceForType, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Method Detail
	
	
	
		- #### hasCurrentSeqNr
		
		
		
		```
		boolean hasCurrentSeqNr()
		```
		
		`required int64 currentSeqNr = 1;`
		
		Returns:
		Whether the currentSeqNr field is set.
		- #### getCurrentSeqNr
		
		
		
		```
		long getCurrentSeqNr()
		```
		
		`required int64 currentSeqNr = 1;`
		
		Returns:
		The currentSeqNr.
		- #### hasHighestConfirmedSeqNr
		
		
		
		```
		boolean hasHighestConfirmedSeqNr()
		```
		
		`required int64 highestConfirmedSeqNr = 2;`
		
		Returns:
		Whether the highestConfirmedSeqNr field is set.
		- #### getHighestConfirmedSeqNr
		
		
		
		```
		long getHighestConfirmedSeqNr()
		```
		
		`required int64 highestConfirmedSeqNr = 2;`
		
		Returns:
		The highestConfirmedSeqNr.
		- #### getConfirmedList
		
		
		
		```
		java.util.List<[ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf")> getConfirmedList()
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		- #### getConfirmed
		
		
		
		```
		[ReliableDelivery.Confirmed](ReliableDelivery.Confirmed.html "class in akka.cluster.typed.internal.protobuf") getConfirmed​(int index)
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		- #### getConfirmedCount
		
		
		
		```
		int getConfirmedCount()
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		- #### getConfirmedOrBuilderList
		
		
		
		```
		java.util.List<? extends [ReliableDelivery.ConfirmedOrBuilder](ReliableDelivery.ConfirmedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")> getConfirmedOrBuilderList()
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		- #### getConfirmedOrBuilder
		
		
		
		```
		[ReliableDelivery.ConfirmedOrBuilder](ReliableDelivery.ConfirmedOrBuilder.html "interface in akka.cluster.typed.internal.protobuf") getConfirmedOrBuilder​(int index)
		```
		
		`repeated .akka.cluster.typed.delivery.Confirmed confirmed = 3;`
		- #### getUnconfirmedList
		
		
		
		```
		java.util.List<[ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf")> getUnconfirmedList()
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		- #### getUnconfirmed
		
		
		
		```
		[ReliableDelivery.MessageSent](ReliableDelivery.MessageSent.html "class in akka.cluster.typed.internal.protobuf") getUnconfirmed​(int index)
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		- #### getUnconfirmedCount
		
		
		
		```
		int getUnconfirmedCount()
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		- #### getUnconfirmedOrBuilderList
		
		
		
		```
		java.util.List<? extends [ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf")> getUnconfirmedOrBuilderList()
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`
		- #### getUnconfirmedOrBuilder
		
		
		
		```
		[ReliableDelivery.MessageSentOrBuilder](ReliableDelivery.MessageSentOrBuilder.html "interface in akka.cluster.typed.internal.protobuf") getUnconfirmedOrBuilder​(int index)
		```
		
		`repeated .akka.cluster.typed.delivery.MessageSent unconfirmed = 4;`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.Confirmed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.ConfirmedOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.MessageSent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.MessageSentOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.State.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.State.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.StateOrBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/internal/protobuf/ReliableDelivery.StateOrBuilder.html)*