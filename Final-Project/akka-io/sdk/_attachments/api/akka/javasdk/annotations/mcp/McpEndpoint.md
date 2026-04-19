---
description: 'declaration: package: akka.javasdk.annotations.mcp, annotation type:
  McpEndpoint'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:14Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/McpEndpoint.html
title: McpEndpoint
---

# McpEndpoint

> **Summary:** declaration: package: akka.javasdk.annotations.mcp, annotation type: McpEndpoint

## Content

Package [akka.javasdk.annotations.mcp](package-summary.html)
# Annotation Interface McpEndpoint

---

[@Target](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Target.html "class or interface in java.lang.annotation")([TYPE](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/ElementType.html#TYPE "class or interface in java.lang.annotation"))
[@Retention](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Retention.html "class or interface in java.lang.annotation")([RUNTIME](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/RetentionPolicy.html#RUNTIME "class or interface in java.lang.annotation"))
[@Documented](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/annotation/Documented.html "class or interface in java.lang.annotation")
public @interface McpEndpoint
Annotation to mark a class as an MCP (Model Context Protocol) server endpoint.

 MCP endpoints expose services to MCP clients such as LLM chat agent desktop applications and
 agents running on other services. They provide tools, resources, and prompts that AI models can
 use to extend their capabilities.

 

**Endpoint Capabilities:**

- **Tools:** Methods annotated with [`McpTool`](McpTool.html "annotation interface in akka.javasdk.annotations.mcp") that clients can call
- **Resources:** Methods annotated with [`McpResource`](McpResource.html "annotation interface in akka.javasdk.annotations.mcp") that provide data
- **Prompts:** Methods annotated with [`McpPrompt`](McpPrompt.html "annotation interface in akka.javasdk.annotations.mcp") that generate prompts

**Requirements:** The annotated class must be public and have a public
 constructor. It should also be annotated with appropriate [`Acl`](../Acl.html "annotation interface in akka.javasdk.annotations")
 annotations to control access.

 

**Constructor Injection:** Annotated classes can accept the following types in
 their constructor:

 

- [`ComponentClient`](../../client/ComponentClient.html "interface in akka.javasdk.client") \- for calling other components
- [`HttpClientProvider`](../../http/HttpClientProvider.html "interface in akka.javasdk.http") \- for HTTP service calls
- [`McpRequestContext`](../../mcp/McpRequestContext.html "interface in akka.javasdk.mcp") \- for request context access
- [`TimerScheduler`](../../timer/TimerScheduler.html "interface in akka.javasdk.timer")
- `Materializer`
- `Config`
- `Span`
- [`AgentRegistry`](../../agent/AgentRegistry.html "interface in akka.javasdk.agent") \- contains information about all agents
- [`Sanitizer`](../../Sanitizer.html "interface in akka.javasdk") \- allows for applying sanitization
- Custom types provided by a [`DependencyProvider`](../../DependencyProvider.html "interface in akka.javasdk")

**Request Context Access:** If the annotated class extends [`AbstractMcpEndpoint`](../../mcp/AbstractMcpEndpoint.html "class in akka.javasdk.mcp"), the request context is available via `requestContext()` without constructor injection.

 

**Transport:** MCP endpoints use a stateless streamable HTTP transport as defined
 by the MCP specification. The endpoint is served at the specified path (default: `/mcp`).

- ## Required Element Summary

Required Elements

Modifier and Type
Required Element
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[serverName](#serverName())`
- ## Optional Element Summary

Optional Elements

Modifier and Type
Optional Element
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[instructions](#instructions())`
 
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[path](#path())`
 
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[serverVersion](#serverVersion())`

- ## Element Details

	- ### path
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") path
	
	Returns:
	The path to publish the MCP endpoint at, defaults to "/mcp"
	
	
	Default:
	`"/mcp"`
	- ### serverName
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") serverName
	
	Returns:
	A server name to return to clients in the initialization response
	- ### serverVersion
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") serverVersion
	
	Returns:
	A server version to return to clients in the initialization response
	
	
	Default:
	`""`
	- ### instructions
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") instructions
	
	Returns:
	Optional instructions to return to the client in the initialization response
	
	
	Default:
	`""`

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/DependencyProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Sanitizer.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/AgentRegistry.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/Acl.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/McpPrompt.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/McpResource.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/McpTool.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpClientProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/mcp/AbstractMcpEndpoint.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/mcp/McpRequestContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timer/TimerScheduler.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/McpEndpoint.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/annotations/mcp/McpEndpoint.html)*