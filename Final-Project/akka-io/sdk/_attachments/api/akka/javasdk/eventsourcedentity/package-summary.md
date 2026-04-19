---
description: 'declaration: package: akka.javasdk.eventsourcedentity'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:27Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/package-summary.html
title: akka.javasdk.eventsourcedentity
---

# akka.javasdk.eventsourcedentity

> **Summary:** declaration: package: akka.javasdk.eventsourcedentity

## Content

# Package akka.javasdk.eventsourcedentity

---

package akka.javasdk.eventsourcedentity

Event Sourced Entity components for building stateful services that persist changes as events in
 a journal.

 Event Sourced Entities store a sequence of events rather than the current state directly. The
 current state is derived by replaying all events from the journal. This approach provides a
 complete audit trail, enables reliable state replication, and allows for sophisticated
 event\-driven architectures.

 

The main classes in this package are:

 

- [`EventSourcedEntity`](EventSourcedEntity.html "class in akka.javasdk.eventsourcedentity") \- The base class for
 implementing Event Sourced Entities
- [`CommandContext`](CommandContext.html "interface in akka.javasdk.eventsourcedentity") \- Context available during command
 processing
- [`EventContext`](EventContext.html "interface in akka.javasdk.eventsourcedentity") \- Context available during event
 processing
- [`EventSourcedEntityContext`](EventSourcedEntityContext.html "interface in akka.javasdk.eventsourcedentity") \- Context available
 during entity construction

See Also:

- [`EventSourcedEntity`](EventSourcedEntity.html "class in akka.javasdk.eventsourcedentity")

- Related Packages

Package
Description
[akka.javasdk](../package-summary.html)

Root package of the Akka SDK.
- Class
Description
[CommandContext](CommandContext.html "interface in akka.javasdk.eventsourcedentity")

Context information available to Event Sourced Entity command handlers during command processing.

[EventContext](EventContext.html "interface in akka.javasdk.eventsourcedentity")

Context information available when processing events in the [`EventSourcedEntity.applyEvent(E)`](EventSourcedEntity.html#applyEvent(E))
 method.

[EventSourcedEntity](EventSourcedEntity.html "class in akka.javasdk.eventsourcedentity")\<S,E\>

Event Sourced Entities are stateful components that persist changes as events in a journal rather
 than storing the current state directly.

[EventSourcedEntity.Effect](EventSourcedEntity.Effect.html "interface in akka.javasdk.eventsourcedentity")\<T\>

An Effect describes the actions that the Akka runtime should perform after a command handler
 completes.

[EventSourcedEntity.Effect.Builder](EventSourcedEntity.Effect.Builder.html "interface in akka.javasdk.eventsourcedentity")\<S,E\>

Construct the effect that is returned by the command handler.

[EventSourcedEntity.Effect.OnSuccessBuilder](EventSourcedEntity.Effect.OnSuccessBuilder.html "interface in akka.javasdk.eventsourcedentity")\<S\>
 
[EventSourcedEntity.ReadOnlyEffect](EventSourcedEntity.ReadOnlyEffect.html "interface in akka.javasdk.eventsourcedentity")\<T\>

An effect that is known to be read only and does not update the state of the entity.

[EventSourcedEntityContext](EventSourcedEntityContext.html "interface in akka.javasdk.eventsourcedentity")

Context information available during Event Sourced Entity construction and initialization.

[EventWithMetadata](EventWithMetadata.html "class in akka.javasdk.eventsourcedentity")\<E\>
 
[ReplicationFilter](ReplicationFilter.html "interface in akka.javasdk.eventsourcedentity")

Replication filter for controlling which regions participate in event replication for an Event
 Sourced Entity.

[ReplicationFilter.Builder](ReplicationFilter.Builder.html "interface in akka.javasdk.eventsourcedentity")

Create the `Builder` with `ReplicationFilter.includeRegion` or the other factory
 methods in [ReplicationFilter](ReplicationFilter.html "interface in akka.javasdk.eventsourcedentity").

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/CommandContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntity.Effect.Builder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntity.Effect.OnSuccessBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntity.Effect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntity.ReadOnlyEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntity.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntityContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventWithMetadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/ReplicationFilter.Builder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/ReplicationFilter.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/package-summary.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/package-summary.html)*