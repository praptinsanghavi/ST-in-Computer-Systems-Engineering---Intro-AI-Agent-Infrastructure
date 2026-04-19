---
description: 'declaration: package: akka.javasdk.eventsourcedentity, interface: EventSourcedEntityContext'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:33Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntityContext.html
title: EventSourcedEntityContext
---

# EventSourcedEntityContext

> **Summary:** declaration: package: akka.javasdk.eventsourcedentity, interface: EventSourcedEntityContext

## Content

Package [akka.javasdk.eventsourcedentity](package-summary.html)
# Interface EventSourcedEntityContext

All Superinterfaces:
`[Context](../Context.html "interface in akka.javasdk")`, `[EntityContext](../EntityContext.html "interface in akka.javasdk")`

All Known Subinterfaces:
`[EventContext](EventContext.html "interface in akka.javasdk.eventsourcedentity")`

---

public interface EventSourcedEntityContext
extends [EntityContext](../EntityContext.html "interface in akka.javasdk")
Context information available during Event Sourced Entity construction and initialization. This
 context provides access to entity metadata and configuration that is available throughout the
 entity's lifecycle.

 The EventSourcedEntityContext is typically injected into the entity constructor and can be
 used to access the entity id and other contextual information needed during entity setup.

 

Unlike [`CommandContext`](CommandContext.html "interface in akka.javasdk.eventsourcedentity") and [`EventContext`](EventContext.html "interface in akka.javasdk.eventsourcedentity"), this context is available during
 entity construction and is not limited to command or event processing.

- ## Method Summary

### Methods inherited from interface akka.javasdk.[Context](../Context.html "interface in akka.javasdk")

`[selfRegion](../Context.html#selfRegion())`

### Methods inherited from interface akka.javasdk.[EntityContext](../EntityContext.html "interface in akka.javasdk")

`[entityId](../EntityContext.html#entityId())`

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Context.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/EntityContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/CommandContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntityContext.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntityContext.html)*