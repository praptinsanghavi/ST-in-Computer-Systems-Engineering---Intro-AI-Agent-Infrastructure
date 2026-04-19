---
description: 'declaration: package: akka.javasdk'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:23Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html
title: akka.javasdk
---

# akka.javasdk

> **Summary:** declaration: package: akka.javasdk

## Content

# Package akka.javasdk

---

package akka.javasdk

Root package of the Akka SDK.

 Components:

 

- [`EventSourcedEntity`](eventsourcedentity/EventSourcedEntity.html "class in akka.javasdk.eventsourcedentity")
- [`KeyValueEntity`](keyvalueentity/KeyValueEntity.html "class in akka.javasdk.keyvalueentity")
- [`HTTP Endpoints`](http/package-summary.html)
- [`View`](view/View.html "class in akka.javasdk.view")
- [`Workflow`](workflow/Workflow.html "class in akka.javasdk.workflow")
- [`TimedAction`](timedaction/TimedAction.html "class in akka.javasdk.timedaction")
- [`Consumer`](consumer/Consumer.html "class in akka.javasdk.consumer")

- Related Packages

Package
Description
[akka.javasdk.agent](agent/package-summary.html)
 
[akka.javasdk.annotations](annotations/package-summary.html)

Annotations

[akka.javasdk.client](client/package-summary.html)

[`ComponentClient`](client/ComponentClient.html "interface in akka.javasdk.client") is used for calls between components.

[akka.javasdk.consumer](consumer/package-summary.html)

[`Consumer`](consumer/Consumer.html "class in akka.javasdk.consumer") component.

[akka.javasdk.eventsourcedentity](eventsourcedentity/package-summary.html)

Event Sourced Entity components for building stateful services that persist changes as events in
 a journal.

[akka.javasdk.grpc](grpc/package-summary.html)
 
[akka.javasdk.http](http/package-summary.html)

HTTP Endpoint component and HTTP client.

[akka.javasdk.keyvalueentity](keyvalueentity/package-summary.html)

Key Value Entity components for building stateful services that persist complete state on every
 change.

[akka.javasdk.mcp](mcp/package-summary.html)
 
[akka.javasdk.timedaction](timedaction/package-summary.html)

[`TimedAction`](timedaction/TimedAction.html "class in akka.javasdk.timedaction") component.

[akka.javasdk.timer](timer/package-summary.html)
 
[akka.javasdk.view](view/package-summary.html)

[`View`](view/View.html "class in akka.javasdk.view") component.

[akka.javasdk.workflow](workflow/package-summary.html)

[`Workflow`](workflow/Workflow.html "class in akka.javasdk.workflow") component.
- Class
Description
[CloudEvent](CloudEvent.html "interface in akka.javasdk")

CloudEvent representation of Metadata.

[CommandException](CommandException.html "class in akka.javasdk")

An exception that can be thrown by user code to signal domain validation errors or business rule
 violations.

[Context](Context.html "interface in akka.javasdk")

Root class of all contexts.

[DeferredCall](DeferredCall.html "interface in akka.javasdk")\<I,O\>

Represents a call to another component that can be persisted and invoked later.

[DependencyProvider](DependencyProvider.html "interface in akka.javasdk")

A factory method to provide additional dependencies to the component implementations.

[EntityContext](EntityContext.html "interface in akka.javasdk")

Root context for all contexts that pertain to entities, that is, things that are addressable via
 an entity id.

[JsonMigration](JsonMigration.html "class in akka.javasdk")

Allows to specify dedicated strategy for JSON schema evolution.

[JsonSupport](JsonSupport.html "class in akka.javasdk")
 
[JwtClaims](JwtClaims.html "interface in akka.javasdk")

Representation of JWT claims that have been validated and extracted from the bearer token of a
 request.

[Metadata](Metadata.html "interface in akka.javasdk")

Transport specific metadata.

[Metadata.MetadataEntry](Metadata.MetadataEntry.html "interface in akka.javasdk")

A metadata entry.

[MetadataContext](MetadataContext.html "interface in akka.javasdk")

Context that provides access to metadata.

[NotificationPublisher](NotificationPublisher.html "interface in akka.javasdk")\<T\>

A publisher for sending notifications to external subscribers.

[NotificationPublisher.NotificationStream](NotificationPublisher.NotificationStream.html "interface in akka.javasdk")\<T\>

A helper interface allowing a type safe subscription to a notification stream.

[OriginAwareContext](OriginAwareContext.html "interface in akka.javasdk")
 
[Principal](Principal.html "interface in akka.javasdk")

A principal associated with a request.

[Principal.Basic](Principal.Basic.html "enum class in akka.javasdk")

Basic principals that have no additional configuration.

[Principal.LocalService](Principal.LocalService.html "class in akka.javasdk")

A local service principal.

[Principals](Principals.html "interface in akka.javasdk")

The principals associated with a request.

[Retries](Retries.html "interface in akka.javasdk")
 
[Sanitizer](Sanitizer.html "interface in akka.javasdk")

Sanitizer that applies all configured sanitization rules for the service.

[ServiceSetup](ServiceSetup.html "interface in akka.javasdk")

Implement this on a single class per deployable service annotated with {[`Setup`](annotations/Setup.html "annotation interface in akka.javasdk.annotations")} and
 override one or more of the default methods to provide objects for dependency injection or act on
 service lifecycle events.

[Tracing](Tracing.html "interface in akka.javasdk")

Factory for manually creating open telemetry spans in addition to those automatically provided by
 the runtime and SDK.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/CloudEvent.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/CommandException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Context.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/DeferredCall.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/DependencyProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/EntityContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/JsonMigration.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/JsonSupport.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/JwtClaims.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.MetadataEntry.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/MetadataContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/NotificationPublisher.NotificationStream.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/NotificationPublisher.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/OriginAwareContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Principal.Basic.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Principal.LocalService.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Principal.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Principals.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Retries.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Sanitizer.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/ServiceSetup.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Tracing.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Setup.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/Consumer.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntity.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/grpc/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/mcp/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/TimedAction.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timer/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/View.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html)*