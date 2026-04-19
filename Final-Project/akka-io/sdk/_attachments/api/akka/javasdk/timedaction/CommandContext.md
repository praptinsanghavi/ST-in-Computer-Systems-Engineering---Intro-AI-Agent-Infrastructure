---
description: 'declaration: package: akka.javasdk.timedaction, interface: CommandContext'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:42Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/CommandContext.html
title: CommandContext
---

# CommandContext

> **Summary:** declaration: package: akka.javasdk.timedaction, interface: CommandContext

## Content

Package [akka.javasdk.timedaction](package-summary.html)
# Interface CommandContext

All Superinterfaces:
`[Context](../Context.html "interface in akka.javasdk")`, `[MetadataContext](../MetadataContext.html "interface in akka.javasdk")`

---

public interface CommandContext
extends [MetadataContext](../MetadataContext.html "interface in akka.javasdk")
Context for action calls.

- ## Method Summary

Modifier and Type
Method
Description
`[Tracing](../Tracing.html "interface in akka.javasdk")`
`[tracing](#tracing())()`

Access to tracing for custom app specific tracing.

### Methods inherited from interface akka.javasdk.[Context](../Context.html "interface in akka.javasdk")

`[selfRegion](../Context.html#selfRegion())`

### Methods inherited from interface akka.javasdk.[MetadataContext](../MetadataContext.html "interface in akka.javasdk")

`[metadata](../MetadataContext.html#metadata())`

- ## Method Details

	- ### tracing
	
	
	[Tracing](../Tracing.html "interface in akka.javasdk") tracing()
	Access to tracing for custom app specific tracing.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Context.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/MetadataContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Tracing.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/CommandContext.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/CommandContext.html)*