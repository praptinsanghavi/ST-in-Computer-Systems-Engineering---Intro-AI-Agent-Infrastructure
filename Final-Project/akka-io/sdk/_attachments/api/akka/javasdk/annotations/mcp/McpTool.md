---
description: 'declaration: package: akka.javasdk.annotations.mcp, annotation type:
  McpTool'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:16Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/McpTool.html
title: McpTool
---

# McpTool

> **Summary:** declaration: package: akka.javasdk.annotations.mcp, annotation type: McpTool

## Content

Package [akka.javasdk.annotations.mcp](package-summary.html)
# Annotation Interface McpTool

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([METHOD](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#METHOD "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public @interface McpTool
Annotation to expose a method as an MCP tool that can be called by MCP clients.

 MCP tools are functions that AI models can invoke to perform specific tasks or retrieve
 information. The LLM determines which tools to call based on the tool descriptions and the user's
 request.

 

**Method Requirements:**

- Must be public
- Must return a `String`
- Can accept 0 or more parameters
- Must be in a class annotated with [`McpEndpoint`](McpEndpoint.html "annotation interface in akka.javasdk.annotations.mcp")

**Parameter Types:** Only simple parameter types are supported. Fields must be
 primitive types, boxed Java primitives, or strings. All parameters are required by default; use
 `Optional<T>` for optional parameters.

 

**Schema Generation:** The input schema is automatically generated from method
 parameters unless a manual schema is provided via [`inputSchema()`](#inputSchema()). Use [`Description`](../Description.html "annotation interface in akka.javasdk.annotations") annotations on parameters to help the LLM understand their
 purpose.

 

**Best Practices:**

- Provide clear, descriptive tool descriptions
- Use [`Description`](../Description.html "annotation interface in akka.javasdk.annotations") on all parameters
- Keep tools focused on single, well\-defined tasks
- Validate input parameters for security
- Use [`ToolAnnotation`](ToolAnnotation.html "enum class in akka.javasdk.annotations.mcp") to describe tool behavior characteristics

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
`[ToolAnnotation](ToolAnnotation.html "enum class in akka.javasdk.annotations.mcp")[]`
`[annotations](#annotations())`

Optional annotations describing what the tool does to the client.

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[inputSchema](#inputSchema())`

Normally, the schema is inferred from the input parameters of the tool method.

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[name](#name())`

- ## Element Details

	- ### name
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") name
	
	Returns:
	The name of the tool. Must be unique in the same MCP endpoint if specified, if not
	 specified, the method name is used.
	
	
	Default:
	`""`
	- ### description
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") description
	
	Returns:
	A clear description of what the tools, used by the client LLM to determine what the
	 tool can be used for
	- ### inputSchema
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") inputSchema
	Normally, the schema is inferred from the input parameters of the tool method.
	
	Returns:
	A manually specified schema instead of the automatic must match the input parameters
	 and how they are parsed by Jackson.
	
	
	Default:
	`""`
	- ### annotations
	
	
	[ToolAnnotation](ToolAnnotation.html "enum class in akka.javasdk.annotations.mcp")\[] annotations
	Optional annotations describing what the tool does to the client.
	
	Default:
	`{}`

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Description.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/McpEndpoint.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/ToolAnnotation.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/McpTool.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/McpTool.html)*