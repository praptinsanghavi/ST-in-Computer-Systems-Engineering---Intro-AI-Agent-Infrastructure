---
description: 'declaration: package: akka.javasdk, interface: OriginAwareContext'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:51Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/OriginAwareContext.html
title: OriginAwareContext
---

# OriginAwareContext

> **Summary:** declaration: package: akka.javasdk, interface: OriginAwareContext

## Content

Package [akka.javasdk](package-summary.html)
# Interface OriginAwareContext

All Superinterfaces:
`[Context](Context.html "interface in akka.javasdk")`

All Known Subinterfaces:
`[MessageContext](consumer/MessageContext.html "interface in akka.javasdk.consumer")`, `[UpdateContext](view/UpdateContext.html "interface in akka.javasdk.view")`

---

public interface OriginAwareContext
extends [Context](Context.html "interface in akka.javasdk")

- ## Method Summary

Modifier and Type
Method
Description
`default boolean`
`[hasLocalOrigin](#hasLocalOrigin())()`

Returns `true` if this message originated in the same region where it is currently being
 processed.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[originRegion](#originRegion())()`

When available, this method returns the region where a message was first created.

### Methods inherited from interface akka.javasdk.[Context](Context.html "interface in akka.javasdk")

`[selfRegion](Context.html#selfRegion())`

- ## Method Details

	- ### originRegion
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> originRegion()
	When available, this method returns the region where a message was first created.
	
	 
		- It returns a non\-empty Optional when consuming events from an [`EventSourcedEntity`](eventsourcedentity/EventSourcedEntity.html "class in akka.javasdk.eventsourcedentity")
		 or a change updates from a [`KeyValueEntity`](keyvalueentity/KeyValueEntity.html "class in akka.javasdk.keyvalueentity")
		- It returns an empty Optional when consuming messages from a topic (see [`Consume.FromTopic`](annotations/Consume.FromTopic.html "annotation interface in akka.javasdk.annotations")) or from another service (see [`Consume.FromServiceStream`](annotations/Consume.FromServiceStream.html "annotation interface in akka.javasdk.annotations"))
	
	Returns:
	the region where a message was first created. When not applicable, it returns an empty
	 Optional.
	- ### hasLocalOrigin
	
	
	default boolean hasLocalOrigin()
	Returns `true` if this message originated in the same region where it is currently being
	 processed. A message is considered to have originated in a region if it was created in that
	 region. In all other regions, the same message is treated as a replication.
	
	 For messages coming from Akka entities:
	
	 
	
	
		- If the message is an event from an [`EventSourcedEntity`](eventsourcedentity/EventSourcedEntity.html "class in akka.javasdk.eventsourcedentity") or a change update from a
		 [`KeyValueEntity`](keyvalueentity/KeyValueEntity.html "class in akka.javasdk.keyvalueentity"), it returns `true` if it was originated in the region where
		 this consumer is running. Otherwise, it returns `false`.
		- This method will always return `false` when consuming messages from another service
		 (see [`Consume.FromServiceStream`](annotations/Consume.FromServiceStream.html "annotation interface in akka.javasdk.annotations")) or from a topic (see [`Consume.FromTopic`](annotations/Consume.FromTopic.html "annotation interface in akka.javasdk.annotations")).
	
	Returns:
	`true` if the message originated in the current processing region, `false`
	 otherwise

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Context.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Consume.FromServiceStream.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Consume.FromTopic.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/MessageContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntity.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/UpdateContext.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/OriginAwareContext.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/OriginAwareContext.html)*