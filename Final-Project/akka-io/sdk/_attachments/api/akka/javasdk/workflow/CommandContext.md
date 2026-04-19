---
description: 'declaration: package: akka.javasdk.workflow, interface: CommandContext'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:48Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/CommandContext.html
title: CommandContext
---

# CommandContext

> **Summary:** declaration: package: akka.javasdk.workflow, interface: CommandContext

## Content

Package [akka.javasdk.workflow](package-summary.html)
# Interface CommandContext

All Superinterfaces:
`[Context](../Context.html "interface in akka.javasdk")`, `[MetadataContext](../MetadataContext.html "interface in akka.javasdk")`

---

public interface CommandContext
extends [MetadataContext](../MetadataContext.html "interface in akka.javasdk")
A value based workflow command context.

- ## Method Summary

Modifier and Type
Method
Description
`long`
`[commandId](#commandId())()`

Deprecated.
not used anymore

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[commandName](#commandName())()`

The name of the command being executed.

`[Tracing](../Tracing.html "interface in akka.javasdk")`
`[tracing](#tracing())()`

Access to tracing for custom app specific tracing.

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[workflowId](#workflowId())()`

The id of the workflow that this context is for.

### Methods inherited from interface akka.javasdk.[Context](../Context.html "interface in akka.javasdk")

`[selfRegion](../Context.html#selfRegion())`

### Methods inherited from interface akka.javasdk.[MetadataContext](../MetadataContext.html "interface in akka.javasdk")

`[metadata](../MetadataContext.html#metadata())`

- ## Method Details

	- ### commandName
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") commandName()
	The name of the command being executed.
	
	Returns:
	The name of the command.
	- ### commandId
	
	
	[@Deprecated](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Deprecated.html "class or interface in java.lang")
	long commandId()
	Deprecated.
	not used anymore
	
	The id of the command being executed.
	- ### workflowId
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") workflowId()
	The id of the workflow that this context is for.
	
	Returns:
	The workflow id.
	- ### tracing
	
	
	[Tracing](../Tracing.html "interface in akka.javasdk") tracing()
	Access to tracing for custom app specific tracing.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Context.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/MetadataContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Tracing.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/CommandContext.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/CommandContext.html)*