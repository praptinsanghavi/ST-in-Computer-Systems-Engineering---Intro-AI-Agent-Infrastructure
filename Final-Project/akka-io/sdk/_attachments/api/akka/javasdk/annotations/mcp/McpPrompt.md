---
description: 'declaration: package: akka.javasdk.annotations.mcp, annotation type:
  McpPrompt'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:15Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/McpPrompt.html
title: McpPrompt
---

# McpPrompt

> **Summary:** declaration: package: akka.javasdk.annotations.mcp, annotation type: McpPrompt

## Content

Package [akka.javasdk.annotations.mcp](package-summary.html)
# Annotation Interface McpPrompt

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([METHOD](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#METHOD "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public @interface McpPrompt
Annotation to expose a method as an MCP prompt that clients can fetch and use.

 MCP prompts provide template prompts that can be customized with input parameters. They help
 standardize common prompting patterns and make them reusable across different AI interactions.

 

**Method Requirements:**

- Must be public
- Must return a `String`
- Can have zero or more parameters
- Must be in a class annotated with [`McpEndpoint`](McpEndpoint.html "annotation interface in akka.javasdk.annotations.mcp")

**Parameter Types:** All parameters must be either `String` for required
 parameters or `Optional<String>` for optional parameters. Use [`Description`](../Description.html "annotation interface in akka.javasdk.annotations") annotations to describe the purpose of each parameter.

 

**Prompt Roles:** Prompts can be designated as "user" prompts (default) or
 "assistant" prompts using the [`role()`](#role()) attribute. This helps clients understand how to use
 the prompt in their conversation flow.

 

**Use Cases:**

- Code review templates
- Analysis frameworks
- Structured questioning patterns
- Domain\-specific prompt templates

- ## Optional Element Summary

Optional Elements

Modifier and Type
Optional Element
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[description](#description())`
 
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[name](#name())`
 
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[role](#role())`

- ## Element Details

	- ### name
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name
	
	Returns:
	The name of the prompt or prompt template. If it is undefined, the annotated method
	 name is used.
	
	
	Default:
	`""`
	- ### description
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") description
	
	Returns:
	An optional description of what this prompt provides
	
	
	Default:
	`""`
	- ### role
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") role
	
	Returns:
	Either "user" for user prompts or "assistant". Default if undefined is "user".
	
	
	Default:
	`"user"`

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Description.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/McpEndpoint.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/McpPrompt.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/McpPrompt.html)*