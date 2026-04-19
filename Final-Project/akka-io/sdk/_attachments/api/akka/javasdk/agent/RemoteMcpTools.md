---
description: 'declaration: package: akka.javasdk.agent, interface: RemoteMcpTools,
  interface: ToolInterceptor'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:24Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/RemoteMcpTools.ToolInterceptor.html
title: RemoteMcpTools.ToolInterceptor
---

# RemoteMcpTools.ToolInterceptor

> **Summary:** declaration: package: akka.javasdk.agent, interface: RemoteMcpTools, interface: ToolInterceptor

## Content

Package [akka.javasdk.agent](package-summary.html)
# Interface RemoteMcpTools.ToolInterceptor

Enclosing interface:
`[RemoteMcpTools](RemoteMcpTools.html "interface in akka.javasdk.agent")`

---

public static interface RemoteMcpTools.ToolInterceptor

- ## Method Summary

Modifier and Type
Method
Description
`default [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[interceptRequest](#interceptRequest(akka.javasdk.agent.RemoteMcpTools.ToolInterceptorContext,java.lang.String))([RemoteMcpTools.ToolInterceptorContext](RemoteMcpTools.ToolInterceptorContext.html "interface in akka.javasdk.agent") context,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") requestPayloadJson)`

Intercept calls to tools before they are executed, disallowing the call based on the payload
 can be done by throwing an exception, modifying the payload is also possible.

`default [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[interceptResponse](#interceptResponse(akka.javasdk.agent.RemoteMcpTools.ToolInterceptorContext,java.lang.String,java.lang.String))([RemoteMcpTools.ToolInterceptorContext](RemoteMcpTools.ToolInterceptorContext.html "interface in akka.javasdk.agent") context,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") requestPayloadJson,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") responsePayload)`

Intercept responses from MCP tools, disallowing the call based on the result can be done by
 throwing an exception, modifying the result is also possible.

- ## Method Details

	- ### interceptRequest
	
	
	default [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") interceptRequest([RemoteMcpTools.ToolInterceptorContext](RemoteMcpTools.ToolInterceptorContext.html "interface in akka.javasdk.agent") context,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") requestPayloadJson)
	Intercept calls to tools before they are executed, disallowing the call based on the payload
	 can be done by throwing an exception, modifying the payload is also possible. When modifying
	 the payload, you need to make sure the payload still fulfills the schema of the tool with
	 required fields and correct field types.
	
	Parameters:
	`context` \- Details about the intercepted tool call
	`requestPayloadJson` \- The tool request payload in a Json string.
	- ### interceptResponse
	
	
	default [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") interceptResponse([RemoteMcpTools.ToolInterceptorContext](RemoteMcpTools.ToolInterceptorContext.html "interface in akka.javasdk.agent") context,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") requestPayloadJson,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") responsePayload)
	Intercept responses from MCP tools, disallowing the call based on the result can be done by
	 throwing an exception, modifying the result is also possible. When modifying the result, you
	 need to make sure the payload still is something the model will understand.
	
	Parameters:
	`context` \- Details about the intercepted tool call
	`requestPayloadJson` \- The request payload as passed to the MCP tool (possibly modified by
	 [`interceptRequest(ToolInterceptorContext, String)`](#interceptRequest(akka.javasdk.agent.RemoteMcpTools.ToolInterceptorContext,java.lang.String)))

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/RemoteMcpTools.ToolInterceptorContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/RemoteMcpTools.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/RemoteMcpTools.ToolInterceptor.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/RemoteMcpTools.ToolInterceptor.html)*