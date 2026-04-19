---
description: 'declaration: package: akka.javasdk, interface: MetadataContext'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:50Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/MetadataContext.html
title: MetadataContext
---

# MetadataContext

> **Summary:** declaration: package: akka.javasdk, interface: MetadataContext

## Content

Package [akka.javasdk](package-summary.html)
# Interface MetadataContext

All Superinterfaces:
`[Context](Context.html "interface in akka.javasdk")`

All Known Subinterfaces:
`[AgentContext](agent/AgentContext.html "interface in akka.javasdk.agent")`, `[CommandContext](eventsourcedentity/CommandContext.html "interface in akka.javasdk.eventsourcedentity")`, `[CommandContext](keyvalueentity/CommandContext.html "interface in akka.javasdk.keyvalueentity")`, `[CommandContext](timedaction/CommandContext.html "interface in akka.javasdk.timedaction")`, `[CommandContext](workflow/CommandContext.html "interface in akka.javasdk.workflow")`, `[EventContext](eventsourcedentity/EventContext.html "interface in akka.javasdk.eventsourcedentity")`, `[MessageContext](consumer/MessageContext.html "interface in akka.javasdk.consumer")`, `[UpdateContext](view/UpdateContext.html "interface in akka.javasdk.view")`

---

public interface MetadataContext
extends [Context](Context.html "interface in akka.javasdk")
Context that provides access to metadata.

- ## Method Summary

Modifier and Type
Method
Description
`[Metadata](Metadata.html "interface in akka.javasdk")`
`[metadata](#metadata())()`

Get the metadata associated with this context.

### Methods inherited from interface akka.javasdk.[Context](Context.html "interface in akka.javasdk")

`[selfRegion](Context.html#selfRegion())`

- ## Method Details

	- ### metadata
	
	
	[Metadata](Metadata.html "interface in akka.javasdk") metadata()
	Get the metadata associated with this context.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Context.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/AgentContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/MessageContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/CommandContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/CommandContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/CommandContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/UpdateContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/CommandContext.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/MetadataContext.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/MetadataContext.html)*