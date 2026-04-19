---
description: 'declaration: package: akka.javasdk.keyvalueentity'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:29Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/package-summary.html
title: akka.javasdk.keyvalueentity
---

# akka.javasdk.keyvalueentity

> **Summary:** declaration: package: akka.javasdk.keyvalueentity

## Content

# Package akka.javasdk.keyvalueentity

---

package akka.javasdk.keyvalueentity

Key Value Entity components for building stateful services that persist complete state on every
 change.

 Key Value Entities are stateful components that store their entire state with each update,
 unlike Event Sourced Entities which store a sequence of events. This makes them suitable for use
 cases where you need simple state management without event history.

 

The main classes in this package are:

 

- [`KeyValueEntity`](KeyValueEntity.html "class in akka.javasdk.keyvalueentity") \- The base class for implementing Key
 Value Entities
- [`CommandContext`](CommandContext.html "interface in akka.javasdk.keyvalueentity") \- Context available during command
 processing
- [`KeyValueEntityContext`](KeyValueEntityContext.html "interface in akka.javasdk.keyvalueentity") \- Context available during entity
 construction

See Also:

- [`KeyValueEntity`](KeyValueEntity.html "class in akka.javasdk.keyvalueentity")

- Related Packages

Package
Description
[akka.javasdk](../package-summary.html)

Root package of the Akka SDK.
- Class
Description
[CommandContext](CommandContext.html "interface in akka.javasdk.keyvalueentity")

Context information available to Key Value Entity command handlers during command processing.

[KeyValueEntity](KeyValueEntity.html "class in akka.javasdk.keyvalueentity")\<S\>

Key Value Entities are stateful components that persist their complete state on every change.

[KeyValueEntity.Effect](KeyValueEntity.Effect.html "interface in akka.javasdk.keyvalueentity")\<T\>

An Effect describes the actions that the Akka runtime should perform after a command handler
 completes.

[KeyValueEntity.Effect.Builder](KeyValueEntity.Effect.Builder.html "interface in akka.javasdk.keyvalueentity")\<S\>

Builder for constructing effects that describe the actions to be performed after command
 processing.

[KeyValueEntity.Effect.OnSuccessBuilder](KeyValueEntity.Effect.OnSuccessBuilder.html "interface in akka.javasdk.keyvalueentity")\<S\>

Builder for chaining a reply after a successful state operation like `updateState` or
 `deleteEntity`.

[KeyValueEntity.ReadOnlyEffect](KeyValueEntity.ReadOnlyEffect.html "interface in akka.javasdk.keyvalueentity")\<T\>

A read\-only effect that does not modify the entity state.

[KeyValueEntityContext](KeyValueEntityContext.html "interface in akka.javasdk.keyvalueentity")

Context information available during Key Value Entity construction and initialization.

[ReplicationFilter](ReplicationFilter.html "interface in akka.javasdk.keyvalueentity")

Replication filter for controlling which regions participate in replication for a Key Value
 Entity.

[ReplicationFilter.Builder](ReplicationFilter.Builder.html "interface in akka.javasdk.keyvalueentity")

Create the `Builder` with `ReplicationFilter.includeRegion` or the other factory
 methods in [ReplicationFilter](ReplicationFilter.html "interface in akka.javasdk.keyvalueentity").

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/CommandContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.Effect.Builder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.Effect.OnSuccessBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.Effect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.ReadOnlyEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntityContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/ReplicationFilter.Builder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/ReplicationFilter.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/package-summary.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/package-summary.html)*