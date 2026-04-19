---
description: 'declaration: package: akka.javasdk.workflow, interface: WorkflowContext'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:09Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/WorkflowContext.html
title: WorkflowContext
---

# WorkflowContext

> **Summary:** declaration: package: akka.javasdk.workflow, interface: WorkflowContext

## Content

Package [akka.javasdk.workflow](package-summary.html)
# Interface WorkflowContext

All Superinterfaces:
`[Context](../Context.html "interface in akka.javasdk")`

---

public interface WorkflowContext
extends [Context](../Context.html "interface in akka.javasdk")

- ## Method Summary

Modifier and Type
Method
Description
`[Tracing](../Tracing.html "interface in akka.javasdk")`
`[tracing](#tracing())()`

Access to tracing for custom app specific tracing.

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[workflowId](#workflowId())()`

The id of the workflow that this context is for.

### Methods inherited from interface akka.javasdk.[Context](../Context.html "interface in akka.javasdk")

`[selfRegion](../Context.html#selfRegion())`

- ## Method Details

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
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Tracing.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/WorkflowContext.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/WorkflowContext.html)*