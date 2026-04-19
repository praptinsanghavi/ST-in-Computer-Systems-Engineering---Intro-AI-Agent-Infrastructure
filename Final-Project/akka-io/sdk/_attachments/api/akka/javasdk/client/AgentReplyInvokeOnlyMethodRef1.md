---
description: 'declaration: package: akka.javasdk.client, interface: AgentReplyInvokeOnlyMethodRef1'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:22Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentReplyInvokeOnlyMethodRef1.html
title: AgentReplyInvokeOnlyMethodRef1
---

# AgentReplyInvokeOnlyMethodRef1

> **Summary:** declaration: package: akka.javasdk.client, interface: AgentReplyInvokeOnlyMethodRef1

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface AgentReplyInvokeOnlyMethodRef1\<A1,R\>

Type Parameters:
`A1` \- The argument type of the call
`R` \- The type of value returned by executing the call

---

@DoNotInherit
public interface AgentReplyInvokeOnlyMethodRef1\<A1,R\>
One argument agent component call representation, returning a detailed reply including token
 usage, not executed until invoked.

 Not for user extension or instantiation, returned by the SDK component client

- ## Method Summary

Modifier and Type
Method
Description
`[Agent.AgentReply](../agent/Agent.AgentReply.html "class in akka.javasdk.agent")<[R](AgentReplyInvokeOnlyMethodRef1.html "type parameter in AgentReplyInvokeOnlyMethodRef1")>`
`[invoke](#invoke(A1))([A1](AgentReplyInvokeOnlyMethodRef1.html "type parameter in AgentReplyInvokeOnlyMethodRef1") arg)`

Execute the call and block until the response is available.

`[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<[Agent.AgentReply](../agent/Agent.AgentReply.html "class in akka.javasdk.agent")<[R](AgentReplyInvokeOnlyMethodRef1.html "type parameter in AgentReplyInvokeOnlyMethodRef1")>>`
`[invokeAsync](#invokeAsync(A1))([A1](AgentReplyInvokeOnlyMethodRef1.html "type parameter in AgentReplyInvokeOnlyMethodRef1") arg)`

Execute the call asynchronously.

- ## Method Details

	- ### invoke
	
	
	[Agent.AgentReply](../agent/Agent.AgentReply.html "class in akka.javasdk.agent")\<[R](AgentReplyInvokeOnlyMethodRef1.html "type parameter in AgentReplyInvokeOnlyMethodRef1")\> invoke([A1](AgentReplyInvokeOnlyMethodRef1.html "type parameter in AgentReplyInvokeOnlyMethodRef1") arg)
	Execute the call and block until the response is available.
	
	Parameters:
	`arg` \- The method argument
	Returns:
	The agent reply including the result value
	- ### invokeAsync
	
	
	[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<[Agent.AgentReply](../agent/Agent.AgentReply.html "class in akka.javasdk.agent")\<[R](AgentReplyInvokeOnlyMethodRef1.html "type parameter in AgentReplyInvokeOnlyMethodRef1")\>\> invokeAsync([A1](AgentReplyInvokeOnlyMethodRef1.html "type parameter in AgentReplyInvokeOnlyMethodRef1") arg)
	Execute the call asynchronously.
	
	Parameters:
	`arg` \- The method argument
	Returns:
	A CompletionStage that completes with the agent reply including the result value

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.AgentReply.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentReplyInvokeOnlyMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentReplyInvokeOnlyMethodRef1.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentReplyInvokeOnlyMethodRef1.html)*