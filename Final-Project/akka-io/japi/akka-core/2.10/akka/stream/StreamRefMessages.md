---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:11:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamRefMessages.SinkRefOrBuilder.html
title: StreamRefMessages.SinkRefOrBuilder
---

# StreamRefMessages.SinkRefOrBuilder

## Content

Package [akka.stream](package-summary.html)
## Interface StreamRefMessages.SinkRefOrBuilder

- All Superinterfaces:
`akka.protobufv3.internal.MessageLiteOrBuilder`, `akka.protobufv3.internal.MessageOrBuilder`

All Known Implementing Classes:
`[StreamRefMessages.SinkRef](StreamRefMessages.SinkRef.html "class in akka.stream")`, `[StreamRefMessages.SinkRef.Builder](StreamRefMessages.SinkRef.Builder.html "class in akka.stream")`

Enclosing class:
[StreamRefMessages](StreamRefMessages.html "class in akka.stream")

---

```
public static interface StreamRefMessages.SinkRefOrBuilder
extends akka.protobufv3.internal.MessageOrBuilder
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream")` | `[getTargetRef](#getTargetRef())()` | `required .ActorRef targetRef = 1;` |
	| `[StreamRefMessages.ActorRefOrBuilder](StreamRefMessages.ActorRefOrBuilder.html "interface in akka.stream")` | `[getTargetRefOrBuilder](#getTargetRefOrBuilder())()` | `required .ActorRef targetRef = 1;` |
	| `boolean` | `[hasTargetRef](#hasTargetRef())()` | `required .ActorRef targetRef = 1;` |
	
	
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageLiteOrBuilder
		
		
		`isInitialized`
		- ### Methods inherited from interface akka.protobufv3\.internal.MessageOrBuilder
		
		
		`findInitializationErrors, getAllFields, getDefaultInstanceForType, getDescriptorForType, getField, getInitializationErrorString, getOneofFieldDescriptor, getRepeatedField, getRepeatedFieldCount, getUnknownFields, hasField, hasOneof`

- - ### Method Detail
	
	
	
		- #### hasTargetRef
		
		
		
		```
		boolean hasTargetRef()
		```
		
		`required .ActorRef targetRef = 1;`
		
		Returns:
		Whether the targetRef field is set.
		- #### getTargetRef
		
		
		
		```
		[StreamRefMessages.ActorRef](StreamRefMessages.ActorRef.html "class in akka.stream") getTargetRef()
		```
		
		`required .ActorRef targetRef = 1;`
		
		Returns:
		The targetRef.
		- #### getTargetRefOrBuilder
		
		
		
		```
		[StreamRefMessages.ActorRefOrBuilder](StreamRefMessages.ActorRefOrBuilder.html "interface in akka.stream") getTargetRefOrBuilder()
		```
		
		`required .ActorRef targetRef = 1;`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamRefMessages.ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamRefMessages.ActorRefOrBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamRefMessages.SinkRef.Builder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamRefMessages.SinkRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamRefMessages.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamRefMessages.SinkRefOrBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/StreamRefMessages.SinkRefOrBuilder.html)*