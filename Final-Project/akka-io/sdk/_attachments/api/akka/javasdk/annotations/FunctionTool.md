---
description: 'declaration: package: akka.javasdk.annotations, annotation type: FunctionTool'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:07Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/FunctionTool.html
title: FunctionTool
---

# FunctionTool

> **Summary:** declaration: package: akka.javasdk.annotations, annotation type: FunctionTool

## Content

Package [akka.javasdk.annotations](package-summary.html)
# Annotation Interface FunctionTool

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([METHOD](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#METHOD "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public @interface FunctionTool
Annotation to expose methods as function tools that can be invoked by AI agents.

 Methods annotated with `@FunctionTool` become available as tools that the AI model can
 choose to invoke based on the task requirements. The LLM determines which tools to call and with
 which parameters based on the tool descriptions and the user's request.

 

**Tool Discovery:** Function tools can be defined in three ways:

 

- **Agent\-defined:** Methods within the agent class itself (can be private)
- **External tools:** Methods in separate classes registered via `effects().tools()`
- **Components as tools:** Methods in Workflows, Event Sourced Entities, Key
 Value Entities, and Views classes registered via `effects().tools()`

**Components as tools rules:**

- Only Workflows, Event Sourced Entities, Key Value Entities, and Views can be used as tools
- For Workflows, only public methods returning [`Workflow.Effect`](../workflow/Workflow.Effect.html "interface in akka.javasdk.workflow") or [`Workflow.ReadOnlyEffect`](../workflow/Workflow.ReadOnlyEffect.html "interface in akka.javasdk.workflow") can be annotated with FunctionTool. Methods returning [`Workflow.StepEffect`](../workflow/Workflow.StepEffect.html "interface in akka.javasdk.workflow") are not allowed.
- For Event Sourced Entities, only public methods returning [`EventSourcedEntity.Effect`](../eventsourcedentity/EventSourcedEntity.Effect.html "interface in akka.javasdk.eventsourcedentity")
 or [`EventSourcedEntity.ReadOnlyEffect`](../eventsourcedentity/EventSourcedEntity.ReadOnlyEffect.html "interface in akka.javasdk.eventsourcedentity") can be annotated with FunctionTool.
- For Key Value Entities, only public methods returning [`KeyValueEntity.Effect`](../keyvalueentity/KeyValueEntity.Effect.html "interface in akka.javasdk.keyvalueentity") or
 [`KeyValueEntity.ReadOnlyEffect`](../keyvalueentity/KeyValueEntity.ReadOnlyEffect.html "interface in akka.javasdk.keyvalueentity") can be annotated with FunctionTool.
- For Views, only public methods returning [`View.QueryEffect`](../view/View.QueryEffect.html "interface in akka.javasdk.view") can be annotated with
 FunctionTool. Methods returning [`View.QueryStreamEffect`](../view/View.QueryStreamEffect.html "interface in akka.javasdk.view") are not allowed.

**Best Practices:**

- Provide clear, descriptive tool descriptions
- Use [`Description`](Description.html "annotation interface in akka.javasdk.annotations") annotations on parameters to help the LLM understand usage
- Use `Optional` parameters for non\-required arguments
- Keep tool functions focused on a single, well\-defined task

**Tool Execution:** The agent automatically handles the tool execution loop: the
 LLM requests tool calls, the agent executes them, incorporates results into the session context,
 and continues until the LLM no longer needs to invoke tools.

- ## Required Element Summary

Required Elements

Modifier and Type
Required Element
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[description](#description())`
- ## Optional Element Summary

Optional Elements

Modifier and Type
Optional Element
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[name](#name())`

- ## Element Details

	- ### name
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name
	
	Default:
	`""`
	- ### description
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") description

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Description.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntity.Effect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/eventsourcedentity/EventSourcedEntity.ReadOnlyEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.Effect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/keyvalueentity/KeyValueEntity.ReadOnlyEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/View.QueryEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/View.QueryStreamEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.Effect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.ReadOnlyEffect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/workflow/Workflow.StepEffect.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/FunctionTool.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/FunctionTool.html)*