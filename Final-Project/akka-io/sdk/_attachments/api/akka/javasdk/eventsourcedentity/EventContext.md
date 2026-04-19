---
description: 'declaration: package: akka.javasdk.eventsourcedentity, interface: EventContext'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:33Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventContext.html
title: EventContext
---

# EventContext

> **Summary:** declaration: package: akka.javasdk.eventsourcedentity, interface: EventContext

## Content

Package [akka.javasdk.eventsourcedentity](package-summary.html)
# Interface EventContext

All Superinterfaces:
`[Context](../Context.html "interface in akka.javasdk")`, `[EntityContext](../EntityContext.html "interface in akka.javasdk")`, `[EventSourcedEntityContext](EventSourcedEntityContext.html "interface in akka.javasdk.eventsourcedentity")`, `[MetadataContext](../MetadataContext.html "interface in akka.javasdk")`

---

public interface EventContext
extends [EventSourcedEntityContext](EventSourcedEntityContext.html "interface in akka.javasdk.eventsourcedentity"), [MetadataContext](../MetadataContext.html "interface in akka.javasdk")
Context information available when processing events in the [`EventSourcedEntity.applyEvent(E)`](EventSourcedEntity.html#applyEvent(E))
 method. Provides access to event metadata and sequence information.

 This context is automatically provided by the Akka runtime and can be accessed within the
 [`EventSourcedEntity.applyEvent(E)`](EventSourcedEntity.html#applyEvent(E)) method using [`EventSourcedEntity.eventContext()`](EventSourcedEntity.html#eventContext()).

- ## Method Summary

Modifier and Type
Method
Description
`long`
`[sequenceNumber](#sequenceNumber())()`

Returns the sequence number of the current event being processed.

### Methods inherited from interface akka.javasdk.[Context](../Context.html "interface in akka.javasdk")

`[selfRegion](../Context.html#selfRegion())`

### Methods inherited from interface akka.javasdk.[EntityContext](../EntityContext.html "interface in akka.javasdk")

`[entityId](../EntityContext.html#entityId())`

### Methods inherited from interface akka.javasdk.[MetadataContext](../MetadataContext.html "interface in akka.javasdk")

`[metadata](../MetadataContext.html#metadata())`

- ## Method Details

	- ### sequenceNumber
	
	
	long sequenceNumber()
	Returns the sequence number of the current event being processed. This represents the position
	 of this event in the entity's event journal.
	
	Returns:
	the sequence number of the current event

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Context.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/EntityContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/MetadataContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntity.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntityContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventContext.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventContext.html)*