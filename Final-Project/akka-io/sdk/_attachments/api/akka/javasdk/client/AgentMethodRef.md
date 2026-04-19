---
description: 'declaration: package: akka.javasdk.client, interface: AgentMethodRef'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:20Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentMethodRef.html
title: AgentMethodRef
---

# AgentMethodRef

> **Summary:** declaration: package: akka.javasdk.client, interface: AgentMethodRef

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface AgentMethodRef\<R\>

Type Parameters:
`R` \- The type of value returned by executing the call

All Superinterfaces:
`[ComponentDeferredMethodRef](ComponentDeferredMethodRef.html "interface in akka.javasdk.client")<R>`

---

@DoNotInherit
public interface AgentMethodRef\<R\>
extends [ComponentDeferredMethodRef](ComponentDeferredMethodRef.html "interface in akka.javasdk.client")\<R\>
Zero argument agent component call representation.

 Extends [`ComponentMethodRef`](ComponentMethodRef.html "interface in akka.javasdk.client") with the ability to get a detailed reply including token
 usage through [`withDetailedReply()`](#withDetailedReply()).

 

Not for user extension or instantiation, returned by the SDK component client

- ## Method Summary

Modifier and Type
Method
Description
`[R](AgentMethodRef.html "type parameter in AgentMethodRef")`
`[invoke](#invoke())()`
 
`[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<[R](AgentMethodRef.html "type parameter in AgentMethodRef")>`
`[invokeAsync](#invokeAsync())()`
 
`[AgentReplyInvokeOnlyMethodRef](AgentReplyInvokeOnlyMethodRef.html "interface in akka.javasdk.client")<[R](AgentMethodRef.html "type parameter in AgentMethodRef")>`
`[withDetailedReply](#withDetailedReply())()`

Switch to a detailed reply mode that includes e.g.

`[AgentMethodRef](AgentMethodRef.html "interface in akka.javasdk.client")<[R](AgentMethodRef.html "type parameter in AgentMethodRef")>`
`[withMetadata](#withMetadata(akka.javasdk.Metadata))([Metadata](../Metadata.html "interface in akka.javasdk") metadata)`
 
`[AgentInvokeOnlyMethodRef](AgentInvokeOnlyMethodRef.html "interface in akka.javasdk.client")<[R](AgentMethodRef.html "type parameter in AgentMethodRef")>`
`[withRetry](#withRetry(int))(int maxRetries)`

Set the retry settings for this call.

`[AgentInvokeOnlyMethodRef](AgentInvokeOnlyMethodRef.html "interface in akka.javasdk.client")<[R](AgentMethodRef.html "type parameter in AgentMethodRef")>`
`[withRetry](#withRetry(akka.pattern.RetrySettings))(akka.pattern.RetrySettings retrySettings)`

Set the retry settings for this call.

### Methods inherited from interface akka.javasdk.client.[ComponentDeferredMethodRef](ComponentDeferredMethodRef.html "interface in akka.javasdk.client")

`[deferred](ComponentDeferredMethodRef.html#deferred())`

- ## Method Details

	- ### withMetadata
	
	
	[AgentMethodRef](AgentMethodRef.html "interface in akka.javasdk.client")\<[R](AgentMethodRef.html "type parameter in AgentMethodRef")\> withMetadata([Metadata](../Metadata.html "interface in akka.javasdk") metadata)
	
	Specified by:
	`[withMetadata](ComponentDeferredMethodRef.html#withMetadata(akka.javasdk.Metadata))` in interface `[ComponentDeferredMethodRef](ComponentDeferredMethodRef.html "interface in akka.javasdk.client")<[R](AgentMethodRef.html "type parameter in AgentMethodRef")>`
	- ### withRetry
	
	
	[AgentInvokeOnlyMethodRef](AgentInvokeOnlyMethodRef.html "interface in akka.javasdk.client")\<[R](AgentMethodRef.html "type parameter in AgentMethodRef")\> withRetry(akka.pattern.RetrySettings retrySettings)
	Set the retry settings for this call.
	
	Parameters:
	`retrySettings` \- The retry settings
	Returns:
	A new call with the retry settings set
	- ### withRetry
	
	
	[AgentInvokeOnlyMethodRef](AgentInvokeOnlyMethodRef.html "interface in akka.javasdk.client")\<[R](AgentMethodRef.html "type parameter in AgentMethodRef")\> withRetry(int maxRetries)
	Set the retry settings for this call. A predefined backoff strategy will be calculated based on
	 the number of maxRetries.
	
	Parameters:
	`maxRetries` \- The number of retries to make
	Returns:
	A new call with the retry settings set
	- ### withDetailedReply
	
	
	[AgentReplyInvokeOnlyMethodRef](AgentReplyInvokeOnlyMethodRef.html "interface in akka.javasdk.client")\<[R](AgentMethodRef.html "type parameter in AgentMethodRef")\> withDetailedReply()
	Switch to a detailed reply mode that includes e.g. token usage information.
	
	Returns:
	A call representation that returns [`Agent.AgentReply`](../agent/Agent.AgentReply.html "class in akka.javasdk.agent")
	- ### invokeAsync
	
	
	[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<[R](AgentMethodRef.html "type parameter in AgentMethodRef")\> invokeAsync()
	- ### invoke
	
	
	[R](AgentMethodRef.html "type parameter in AgentMethodRef") invoke()

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.AgentReply.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentInvokeOnlyMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentReplyInvokeOnlyMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentDeferredMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentMethodRef.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentMethodRef.html)*