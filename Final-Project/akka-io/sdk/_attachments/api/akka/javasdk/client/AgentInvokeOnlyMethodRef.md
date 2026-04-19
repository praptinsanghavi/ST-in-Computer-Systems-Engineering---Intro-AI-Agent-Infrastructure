---
description: 'declaration: package: akka.javasdk.client, interface: AgentInvokeOnlyMethodRef'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:20Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentInvokeOnlyMethodRef.html
title: AgentInvokeOnlyMethodRef
---

# AgentInvokeOnlyMethodRef

> **Summary:** declaration: package: akka.javasdk.client, interface: AgentInvokeOnlyMethodRef

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface AgentInvokeOnlyMethodRef\<R\>

Type Parameters:
`R` \- The type of value returned by executing the call

---

@DoNotInherit
public interface AgentInvokeOnlyMethodRef\<R\>
Zero argument agent component call representation, returning a detailed reply including token
 usage, not executed until invoked.

 Not for user extension or instantiation, returned by the SDK component client

- ## Method Summary

Modifier and Type
Method
Description
`[R](AgentInvokeOnlyMethodRef.html "type parameter in AgentInvokeOnlyMethodRef")`
`[invoke](#invoke())()`

Execute the call and block until the response is available.

`[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<[R](AgentInvokeOnlyMethodRef.html "type parameter in AgentInvokeOnlyMethodRef")>`
`[invokeAsync](#invokeAsync())()`

Execute the call asynchronously.

`[AgentReplyInvokeOnlyMethodRef](AgentReplyInvokeOnlyMethodRef.html "interface in akka.javasdk.client")<[R](AgentInvokeOnlyMethodRef.html "type parameter in AgentInvokeOnlyMethodRef")>`
`[withDetailedReply](#withDetailedReply())()`

Switch to a detailed reply mode that includes e.g.

- ## Method Details

	- ### invoke
	
	
	[R](AgentInvokeOnlyMethodRef.html "type parameter in AgentInvokeOnlyMethodRef") invoke()
	Execute the call and block until the response is available.
	
	Returns:
	The agent reply including the result value
	- ### invokeAsync
	
	
	[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<[R](AgentInvokeOnlyMethodRef.html "type parameter in AgentInvokeOnlyMethodRef")\> invokeAsync()
	Execute the call asynchronously.
	
	Returns:
	A CompletionStage that completes with the agent reply including the result value
	- ### withDetailedReply
	
	
	[AgentReplyInvokeOnlyMethodRef](AgentReplyInvokeOnlyMethodRef.html "interface in akka.javasdk.client")\<[R](AgentInvokeOnlyMethodRef.html "type parameter in AgentInvokeOnlyMethodRef")\> withDetailedReply()
	Switch to a detailed reply mode that includes e.g. token usage information.
	
	Returns:
	A call representation that returns [`Agent.AgentReply`](../agent/Agent.AgentReply.html "class in akka.javasdk.agent")

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.AgentReply.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentInvokeOnlyMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentReplyInvokeOnlyMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentInvokeOnlyMethodRef.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentInvokeOnlyMethodRef.html)*