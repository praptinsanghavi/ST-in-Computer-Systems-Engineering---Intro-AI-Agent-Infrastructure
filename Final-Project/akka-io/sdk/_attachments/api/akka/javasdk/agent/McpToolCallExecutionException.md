---
description: 'declaration: package: akka.javasdk.agent, class: McpToolCallExecutionException'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:08Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/McpToolCallExecutionException.html
title: McpToolCallExecutionException
---

# McpToolCallExecutionException

> **Summary:** declaration: package: akka.javasdk.agent, class: McpToolCallExecutionException

## Content

Package [akka.javasdk.agent](package-summary.html)
# Class McpToolCallExecutionException

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
[Throwable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html "class or interface in java.lang")
[Exception](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Exception.html "class or interface in java.lang")
[RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang")
akka.javasdk.agent.McpToolCallExecutionException

All Implemented Interfaces:
`[Serializable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/Serializable.html "class or interface in java.io")`

---

public final class McpToolCallExecutionException
extends [RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang")
Exception thrown when an MCP (Model Context Protocol) tool call fails during execution.

 This exception is thrown by agents when they attempt to call MCP tools from remote servers and
 the tool execution fails. It provides detailed information about which tool and endpoint failed
 to help with debugging and error handling.

 

**Context Information:** The exception includes the tool name and endpoint URL to
 help identify the source of the failure. This is particularly useful when agents are using
 multiple MCP servers or when debugging tool integration issues.

 

**Error Handling:** Agents can catch this exception in their `onFailure`
 handlers to provide fallback behavior or alternative responses when MCP tools are unavailable.

See Also:

- [Serialized Form](../../../serialized-form.html#akka.javasdk.agent.McpToolCallExecutionException)

- ## Constructor Summary

Constructors

Constructor
Description
`[McpToolCallExecutionException](#%3Cinit%3E(java.lang.String,java.lang.String,java.lang.String,java.lang.Throwable))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") message,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") toolName,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") endpoint,
 [Throwable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html "class or interface in java.lang") cause)`
- ## Method Summary

Modifier and Type
Method
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[getEndpoint](#getEndpoint())()`

Returns the MCP endpoint where the failure occurred.

`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[getToolName](#getToolName())()`

Returns the name of the MCP tool that failed to execute.

### Methods inherited from class java.lang.[Throwable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html "class or interface in java.lang")

`[addSuppressed](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#addSuppressed(java.lang.Throwable) "class or interface in java.lang"), [fillInStackTrace](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#fillInStackTrace() "class or interface in java.lang"), [getCause](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#getCause() "class or interface in java.lang"), [getLocalizedMessage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#getLocalizedMessage() "class or interface in java.lang"), [getMessage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#getMessage() "class or interface in java.lang"), [getStackTrace](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#getStackTrace() "class or interface in java.lang"), [getSuppressed](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#getSuppressed() "class or interface in java.lang"), [initCause](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#initCause(java.lang.Throwable) "class or interface in java.lang"), [printStackTrace](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#printStackTrace() "class or interface in java.lang"), [printStackTrace](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#printStackTrace(java.io.PrintStream) "class or interface in java.lang"), [printStackTrace](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#printStackTrace(java.io.PrintWriter) "class or interface in java.lang"), [setStackTrace](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#setStackTrace(java.lang.StackTraceElement%5B%5D) "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html#toString() "class or interface in java.lang")`

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#hashCode() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### McpToolCallExecutionException
	
	
	public McpToolCallExecutionException([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") message,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") toolName,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") endpoint,
	 [Throwable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Throwable.html "class or interface in java.lang") cause)
- ## Method Details

	- ### getToolName
	
	
	public [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") getToolName()
	Returns the name of the MCP tool that failed to execute.
	
	Returns:
	the tool name
	- ### getEndpoint
	
	
	public [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") getEndpoint()
	Returns the MCP endpoint where the failure occurred.
	
	Returns:
	the endpoint

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/serialized-form.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/McpToolCallExecutionException.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/McpToolCallExecutionException.html)*