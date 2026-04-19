---
description: 'declaration: package: akka.javasdk, interface: Context'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:44Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Context.html
title: Context
---

# Context

> **Summary:** declaration: package: akka.javasdk, interface: Context

## Content

Package [akka.javasdk](package-summary.html)
# Interface Context

All Known Subinterfaces:
`[AgentContext](agent/AgentContext.html "interface in akka.javasdk.agent")`, `[CommandContext](eventsourcedentity/CommandContext.html "interface in akka.javasdk.eventsourcedentity")`, `[CommandContext](keyvalueentity/CommandContext.html "interface in akka.javasdk.keyvalueentity")`, `[CommandContext](timedaction/CommandContext.html "interface in akka.javasdk.timedaction")`, `[CommandContext](workflow/CommandContext.html "interface in akka.javasdk.workflow")`, `[EntityContext](EntityContext.html "interface in akka.javasdk")`, `[EventContext](eventsourcedentity/EventContext.html "interface in akka.javasdk.eventsourcedentity")`, `[EventSourcedEntityContext](eventsourcedentity/EventSourcedEntityContext.html "interface in akka.javasdk.eventsourcedentity")`, `[GrpcRequestContext](grpc/GrpcRequestContext.html "interface in akka.javasdk.grpc")`, `[KeyValueEntityContext](keyvalueentity/KeyValueEntityContext.html "interface in akka.javasdk.keyvalueentity")`, `[MessageContext](consumer/MessageContext.html "interface in akka.javasdk.consumer")`, `[MetadataContext](MetadataContext.html "interface in akka.javasdk")`, `[OriginAwareContext](OriginAwareContext.html "interface in akka.javasdk")`, `[RequestContext](http/RequestContext.html "interface in akka.javasdk.http")`, `[UpdateContext](view/UpdateContext.html "interface in akka.javasdk.view")`, `[WorkflowContext](workflow/WorkflowContext.html "interface in akka.javasdk.workflow")`

---

public interface Context
Root class of all contexts.

- ## Method Summary

Modifier and Type
Method
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[selfRegion](#selfRegion())()`

Returns the region where this instance is running.

- ## Method Details

	- ### selfRegion
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") selfRegion()
	Returns the region where this instance is running.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/EntityContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/MetadataContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/OriginAwareContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/AgentContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/MessageContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/CommandContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntityContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/grpc/GrpcRequestContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/RequestContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/CommandContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntityContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/CommandContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/UpdateContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/CommandContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/WorkflowContext.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Context.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Context.html)*