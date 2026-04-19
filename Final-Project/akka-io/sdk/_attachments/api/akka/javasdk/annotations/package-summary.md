---
description: 'declaration: package: akka.javasdk.annotations'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:24Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/package-summary.html
title: akka.javasdk.annotations
---

# akka.javasdk.annotations

> **Summary:** declaration: package: akka.javasdk.annotations

## Content

# Package akka.javasdk.annotations

---

package akka.javasdk.annotations

Annotations

- Related Packages

Package
Description
[akka.javasdk](../package-summary.html)

Root package of the Akka SDK.

[akka.javasdk.annotations.http](http/package-summary.html)

Annotations for [`HttpEndpoint`](http/HttpEndpoint.html "annotation interface in akka.javasdk.annotations.http")

[akka.javasdk.annotations.mcp](mcp/package-summary.html)
- Class
Description
[Acl](Acl.html "annotation interface in akka.javasdk.annotations")

Defines ACL configuration for a resource.

[Acl.Matcher](Acl.Matcher.html "annotation interface in akka.javasdk.annotations")

A principal matcher that can be used in an ACL.

[Acl.Principal](Acl.Principal.html "enum class in akka.javasdk.annotations")

This enum contains principal matchers that don't have any configuration, such as a name,
 associated with them, for ease of reference in annotations.

[AgentDescription](AgentDescription.html "annotation interface in akka.javasdk.annotations")
Deprecated.
Use [`Component`](Component.html "annotation interface in akka.javasdk.annotations") for specifying the agent's name and description.

[AgentRole](AgentRole.html "annotation interface in akka.javasdk.annotations")

Defines the role of an agent.

[Component](Component.html "annotation interface in akka.javasdk.annotations")

Assign metadata to a component (required for all component types aside from Endpoints).

[ComponentId](ComponentId.html "annotation interface in akka.javasdk.annotations")
Deprecated.
Use [`Component`](Component.html "annotation interface in akka.javasdk.annotations") instead.

[Consume](Consume.html "annotation interface in akka.javasdk.annotations")

Annotation for providing ways to consume a stream of messages from Entities, other services, or
 message broker topics.

[Consume.FromEventSourcedEntity](Consume.FromEventSourcedEntity.html "annotation interface in akka.javasdk.annotations")

Annotation for consuming events from an [`EventSourcedEntity`](../eventsourcedentity/EventSourcedEntity.html "class in akka.javasdk.eventsourcedentity").

[Consume.FromKeyValueEntity](Consume.FromKeyValueEntity.html "annotation interface in akka.javasdk.annotations")

Annotation for consuming state updates from a [`KeyValueEntity`](../keyvalueentity/KeyValueEntity.html "class in akka.javasdk.keyvalueentity").

[Consume.FromServiceStream](Consume.FromServiceStream.html "annotation interface in akka.javasdk.annotations")

Annotation for consuming messages from another service.

[Consume.FromTopic](Consume.FromTopic.html "annotation interface in akka.javasdk.annotations")

Annotation for consuming messages from a topic (i.e PubSub or Kafka topic).

[Consume.FromWorkflow](Consume.FromWorkflow.html "annotation interface in akka.javasdk.annotations")

Annotation for consuming state updates from a [`Workflow`](../workflow/Workflow.html "class in akka.javasdk.workflow").

[DeleteHandler](DeleteHandler.html "annotation interface in akka.javasdk.annotations")
 
[Description](Description.html "annotation interface in akka.javasdk.annotations")

Used to define a human language description for fields and method parameters, such as MCP tool
 parameters or tool methods.

[EnableReplicationFilter](EnableReplicationFilter.html "annotation interface in akka.javasdk.annotations")

Enables the replication filter feature for an Event Sourced Entity, allowing runtime control of
 which regions participate in event replication.

[FunctionTool](FunctionTool.html "annotation interface in akka.javasdk.annotations")

Annotation to expose methods as function tools that can be invoked by AI agents.

[GrpcEndpoint](GrpcEndpoint.html "annotation interface in akka.javasdk.annotations")

Mark a class to be made available as a gRPC endpoint.

[JWT](JWT.html "annotation interface in akka.javasdk.annotations")
 
[JWT.JwtMethodMode](JWT.JwtMethodMode.html "enum class in akka.javasdk.annotations")
 
[JWT.StaticClaim](JWT.StaticClaim.html "annotation interface in akka.javasdk.annotations")

A static claim is a claim that is required to be present on the token, and have a particular
 value.

[Migration](Migration.html "annotation interface in akka.javasdk.annotations")

Annotation to assign a @[`JsonMigration`](../JsonMigration.html "class in akka.javasdk") implementation for a given class.

[Produce](Produce.html "annotation interface in akka.javasdk.annotations")

Annotation for ways of producing outgoing information.

[Produce.ServiceStream](Produce.ServiceStream.html "annotation interface in akka.javasdk.annotations")

Annotation to configure the component to produce an event stream that can be consumed by other
 services.

[Produce.ToTopic](Produce.ToTopic.html "annotation interface in akka.javasdk.annotations")

Annotation for marking a method as producing information to be published on a PubSub or Kafka
 topic.

[ProtoEventTypes](ProtoEventTypes.html "annotation interface in akka.javasdk.annotations")

Declares the concrete protobuf message classes used as events.

[Query](Query.html "annotation interface in akka.javasdk.annotations")

Annotation used in the scope of a view for providing the query that will be used to explore data
 from that view.

[Setup](Setup.html "annotation interface in akka.javasdk.annotations")

Mark a class as a central configuration point for an entire service.

[SnapshotHandler](SnapshotHandler.html "annotation interface in akka.javasdk.annotations")

A [`Consumer`](../consumer/Consumer.html "class in akka.javasdk.consumer") or [`View`](../view/View.html "class in akka.javasdk.view") can use this
 annotation on a method to define that it accepts snapshots from the [`EventSourcedEntity`](../eventsourcedentity/EventSourcedEntity.html "class in akka.javasdk.eventsourcedentity") source.

[StepName](StepName.html "annotation interface in akka.javasdk.annotations")

Annotation for providing a workflow step name

[Table](Table.html "annotation interface in akka.javasdk.annotations")

Annotation for providing a table name for View components.

[TypeName](TypeName.html "annotation interface in akka.javasdk.annotations")

Annotation to assign a logical type name to events.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/JsonMigration.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Acl.Matcher.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Acl.Principal.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Acl.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/AgentDescription.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/AgentRole.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Component.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/ComponentId.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Consume.FromEventSourcedEntity.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Consume.FromKeyValueEntity.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Consume.FromServiceStream.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Consume.FromTopic.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Consume.FromWorkflow.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Consume.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/DeleteHandler.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Description.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/EnableReplicationFilter.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/FunctionTool.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/GrpcEndpoint.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/JWT.JwtMethodMode.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/JWT.StaticClaim.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/JWT.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Migration.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Produce.ServiceStream.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Produce.ToTopic.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Produce.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/ProtoEventTypes.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Query.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Setup.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/SnapshotHandler.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/StepName.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Table.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/TypeName.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/HttpEndpoint.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/http/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/Consumer.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntity.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/View.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/package-summary.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/package-summary.html)*