---
description: 'declaration: package: akka.javasdk.mcp, class: AbstractMcpEndpoint'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:46Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/mcp/AbstractMcpEndpoint.html
title: AbstractMcpEndpoint
---

# AbstractMcpEndpoint

> **Summary:** declaration: package: akka.javasdk.mcp, class: AbstractMcpEndpoint

## Content

Package [akka.javasdk.mcp](package-summary.html)
# Class AbstractMcpEndpoint

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
akka.javasdk.mcp.AbstractMcpEndpoint

---

public abstract class AbstractMcpEndpoint
extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
Optional base class for MCP (Model Context Protocol) endpoints providing convenient access to
 request context.

 MCP endpoints expose services to MCP clients such as LLM chat agent desktop applications and
 agents running on other services. They can provide tools, resources, and prompts that AI models
 can use to extend their capabilities.

 

**MCP Capabilities:**

- **Tools:** Functions/logic that MCP clients can call on behalf of the LLM
- **Resources:** Static resources or dynamic resource templates that clients can
 fetch
- **Prompts:** Template prompts created from input parameters

**Basic Usage:**

```

 @Acl(allow = @Acl.Matcher(principal = Acl.Principal.ALL))
 @McpEndpoint(
     serverName = "my-service-mcp",
     serverVersion = "1.0.0")
 public class MyMcpEndpoint extends AbstractMcpEndpoint {

   @McpTool(description = "Adds two numbers")
   public String add(@Description("First number") int a, @Description("Second number") int b) {
     return String.valueOf(a + b);
   }
 }
 
```

**Request Context:** Extending this class provides access to [`McpRequestContext`](McpRequestContext.html "interface in akka.javasdk.mcp") via [`requestContext()`](#requestContext()) without requiring constructor injection. The
 context provides access to request headers, JWT claims, principals, and tracing information.

 

**Alternative Approach:** Instead of extending this class, you can inject [`McpRequestContext`](McpRequestContext.html "interface in akka.javasdk.mcp") directly into your endpoint constructor or use dependency injection for other
 services like [`ComponentClient`](../client/ComponentClient.html "interface in akka.javasdk.client").

 

MCP endpoints are made available using a stateless streamable HTTP transport as defined by the
 MCP specification. By default, endpoints are served at the `/mcp` path.

- ## Constructor Summary

Constructors

Constructor
Description
`[AbstractMcpEndpoint](#%3Cinit%3E())()`
- ## Method Summary

Modifier and Type
Method
Description
`protected final [McpRequestContext](McpRequestContext.html "interface in akka.javasdk.mcp")`
`[requestContext](#requestContext())()`

Always available from request handling methods, not available from the constructor.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#hashCode() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#toString() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### AbstractMcpEndpoint
	
	
	public AbstractMcpEndpoint()
- ## Method Details

	- ### requestContext
	
	
	protected final [McpRequestContext](McpRequestContext.html "interface in akka.javasdk.mcp") requestContext()
	Always available from request handling methods, not available from the constructor.

## Code Examples

### Example 1: Class AbstractMcpEndpoint

```text
@Acl(allow = @Acl.Matcher(principal = Acl.Principal.ALL))
 @McpEndpoint(
     serverName = "my-service-mcp",
     serverVersion = "1.0.0")
 public class MyMcpEndpoint extends AbstractMcpEndpoint {

   @McpTool(description = "Adds two numbers")
   public String add(@Description("First number") int a, @Description("Second number") int b) {
     return String.valueOf(a + b);
   }
 }
```

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/mcp/McpRequestContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/mcp/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/mcp/AbstractMcpEndpoint.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/mcp/AbstractMcpEndpoint.html)*