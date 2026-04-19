---
description: 'declaration: package: akka.javasdk.mcp, interface: McpRequestContext'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:48Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/mcp/McpRequestContext.html
title: McpRequestContext
---

# McpRequestContext

> **Summary:** declaration: package: akka.javasdk.mcp, interface: McpRequestContext

## Content

Package [akka.javasdk.mcp](package-summary.html)
# Interface McpRequestContext

---

@DoNotInherit
public interface McpRequestContext
Context information available during MCP endpoint request processing.

 Provides access to request metadata including headers, authentication information, and tracing
 capabilities for MCP endpoint methods. This context is available during the processing of MCP
 tool calls, resource requests, and prompt requests.

 

**Access Methods:**

- Extend [`AbstractMcpEndpoint`](AbstractMcpEndpoint.html "class in akka.javasdk.mcp") and use `requestContext()`
- Inject as constructor parameter into MCP endpoint classes

**Authentication invalid input: '\&' Authorization:** Use [`getPrincipals()`](#getPrincipals()) and [`getJwtClaims()`](#getJwtClaims()) to access authentication information for custom authorization logic. MCP
 endpoints support ACL annotations and JWT validation.

 

**Custom Headers:** Access request headers via [`requestHeader(String)`](#requestHeader(java.lang.String)) for
 custom authentication schemes or client\-specific metadata.

 

Not for user extension, implementation provided by the SDK.

- ## Method Summary

Modifier and Type
Method
Description
`[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<akka.http.javadsl.model.HttpHeader>`
`[allRequestHeaders](#allRequestHeaders())()`
 
`[JwtClaims](../JwtClaims.html "interface in akka.javasdk")`
`[getJwtClaims](#getJwtClaims())()`
 
`[Principals](../Principals.html "interface in akka.javasdk")`
`[getPrincipals](#getPrincipals())()`

Get the principals associated with this request.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<akka.http.javadsl.model.HttpHeader>`
`[requestHeader](#requestHeader(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") headerName)`
 
`[Tracing](../Tracing.html "interface in akka.javasdk")`
`[tracing](#tracing())()`

Access to tracing for custom app specific tracing.

- ## Method Details

	- ### getPrincipals
	
	
	[Principals](../Principals.html "interface in akka.javasdk") getPrincipals()
	Get the principals associated with this request.
	
	Returns:
	The principals associated with this request.
	- ### getJwtClaims
	
	
	[JwtClaims](../JwtClaims.html "interface in akka.javasdk") getJwtClaims()
	
	Returns:
	The JWT claims, if any, associated with this request.
	- ### tracing
	
	
	[Tracing](../Tracing.html "interface in akka.javasdk") tracing()
	Access to tracing for custom app specific tracing.
	- ### requestHeader
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<akka.http.javadsl.model.HttpHeader\> requestHeader([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") headerName)
	
	Returns:
	A header with the given name (case ignored) if present in the current request,
	 Optional.empty() if not.
	- ### allRequestHeaders
	
	
	[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<akka.http.javadsl.model.HttpHeader\> allRequestHeaders()
	
	Returns:
	A list with all the headers of the current request

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/JwtClaims.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Principals.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Tracing.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/mcp/AbstractMcpEndpoint.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/mcp/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/mcp/McpRequestContext.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/mcp/McpRequestContext.html)*