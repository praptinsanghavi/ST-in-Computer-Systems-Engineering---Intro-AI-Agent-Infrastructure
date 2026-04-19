---
description: 'declaration: package: akka.javasdk.client, interface: AgentMethodRef1'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:20Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentMethodRef1.html
title: AgentMethodRef1
---

# AgentMethodRef1

> **Summary:** declaration: package: akka.javasdk.client, interface: AgentMethodRef1

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface AgentMethodRef1\<A1,R\>

Type Parameters:
`A1` \- The argument type of the call
`R` \- The type of value returned by executing the call

All Superinterfaces:
`[ComponentDeferredMethodRef1](ComponentDeferredMethodRef1.html "interface in akka.javasdk.client")<A1,R>`

---

@DoNotInherit
public interface AgentMethodRef1\<A1,R\>
extends [ComponentDeferredMethodRef1](ComponentDeferredMethodRef1.html "interface in akka.javasdk.client")\<A1,R\>
One argument agent component call representation.

 Extends [`ComponentMethodRef1`](ComponentMethodRef1.html "interface in akka.javasdk.client") with the ability to get a detailed reply including token
 usage through [`withDetailedReply()`](#withDetailedReply()).

 

Not for user extension or instantiation, returned by the SDK component client

- ## Method Summary

Modifier and Type
Method
Description
`[R](AgentMethodRef1.html "type parameter in AgentMethodRef1")`
`[invoke](#invoke(A1))([A1](AgentMethodRef1.html "type parameter in AgentMethodRef1") arg)`
 
`[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<[R](AgentMethodRef1.html "type parameter in AgentMethodRef1")>`
`[invokeAsync](#invokeAsync(A1))([A1](AgentMethodRef1.html "type parameter in AgentMethodRef1") arg)`
 
`[AgentReplyInvokeOnlyMethodRef1](AgentReplyInvokeOnlyMethodRef1.html "interface in akka.javasdk.client")<[A1](AgentMethodRef1.html "type parameter in AgentMethodRef1"),[R](AgentMethodRef1.html "type parameter in AgentMethodRef1")>`
`[withDetailedReply](#withDetailedReply())()`

Switch to a detailed reply mode that includes e.g.

`[AgentMethodRef1](AgentMethodRef1.html "interface in akka.javasdk.client")<[A1](AgentMethodRef1.html "type parameter in AgentMethodRef1"),[R](AgentMethodRef1.html "type parameter in AgentMethodRef1")>`
`[withMetadata](#withMetadata(akka.javasdk.Metadata))([Metadata](../Metadata.html "interface in akka.javasdk") metadata)`
 
`[AgentInvokeOnlyMethodRef1](AgentInvokeOnlyMethodRef1.html "interface in akka.javasdk.client")<[A1](AgentMethodRef1.html "type parameter in AgentMethodRef1"),[R](AgentMethodRef1.html "type parameter in AgentMethodRef1")>`
`[withRetry](#withRetry(int))(int maxRetries)`

Set the retry settings for this call.

`[AgentInvokeOnlyMethodRef1](AgentInvokeOnlyMethodRef1.html "interface in akka.javasdk.client")<[A1](AgentMethodRef1.html "type parameter in AgentMethodRef1"),[R](AgentMethodRef1.html "type parameter in AgentMethodRef1")>`
`[withRetry](#withRetry(akka.pattern.RetrySettings))(akka.pattern.RetrySettings retrySettings)`

Set the retry settings for this call.

### Methods inherited from interface akka.javasdk.client.[ComponentDeferredMethodRef1](ComponentDeferredMethodRef1.html "interface in akka.javasdk.client")

`[deferred](ComponentDeferredMethodRef1.html#deferred(A1))`

- ## Method Details

	- ### withMetadata
	
	
	[AgentMethodRef1](AgentMethodRef1.html "interface in akka.javasdk.client")\<[A1](AgentMethodRef1.html "type parameter in AgentMethodRef1"),[R](AgentMethodRef1.html "type parameter in AgentMethodRef1")\> withMetadata([Metadata](../Metadata.html "interface in akka.javasdk") metadata)
	
	Specified by:
	`[withMetadata](ComponentDeferredMethodRef1.html#withMetadata(akka.javasdk.Metadata))` in interface `[ComponentDeferredMethodRef1](ComponentDeferredMethodRef1.html "interface in akka.javasdk.client")<[A1](AgentMethodRef1.html "type parameter in AgentMethodRef1"),[R](AgentMethodRef1.html "type parameter in AgentMethodRef1")>`
	- ### withRetry
	
	
	[AgentInvokeOnlyMethodRef1](AgentInvokeOnlyMethodRef1.html "interface in akka.javasdk.client")\<[A1](AgentMethodRef1.html "type parameter in AgentMethodRef1"),[R](AgentMethodRef1.html "type parameter in AgentMethodRef1")\> withRetry(akka.pattern.RetrySettings retrySettings)
	Set the retry settings for this call.
	
	Parameters:
	`retrySettings` \- The retry settings
	Returns:
	A new call with the retry settings set
	- ### withRetry
	
	
	[AgentInvokeOnlyMethodRef1](AgentInvokeOnlyMethodRef1.html "interface in akka.javasdk.client")\<[A1](AgentMethodRef1.html "type parameter in AgentMethodRef1"),[R](AgentMethodRef1.html "type parameter in AgentMethodRef1")\> withRetry(int maxRetries)
	Set the retry settings for this call. A predefined backoff strategy will be calculated based on
	 the number of maxRetries.
	
	Parameters:
	`maxRetries` \- The number of retries to make
	Returns:
	A new call with the retry settings set
	- ### withDetailedReply
	
	
	[AgentReplyInvokeOnlyMethodRef1](AgentReplyInvokeOnlyMethodRef1.html "interface in akka.javasdk.client")\<[A1](AgentMethodRef1.html "type parameter in AgentMethodRef1"),[R](AgentMethodRef1.html "type parameter in AgentMethodRef1")\> withDetailedReply()
	Switch to a detailed reply mode that includes e.g. token usage information.
	
	Returns:
	A call representation that returns [`Agent.AgentReply`](../agent/Agent.AgentReply.html "class in akka.javasdk.agent")
	- ### invokeAsync
	
	
	[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<[R](AgentMethodRef1.html "type parameter in AgentMethodRef1")\> invokeAsync([A1](AgentMethodRef1.html "type parameter in AgentMethodRef1") arg)
	- ### invoke
	
	
	[R](AgentMethodRef1.html "type parameter in AgentMethodRef1") invoke([A1](AgentMethodRef1.html "type parameter in AgentMethodRef1") arg)

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/agent/Agent.AgentReply.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentInvokeOnlyMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentReplyInvokeOnlyMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentDeferredMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentMethodRef1.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentMethodRef1.html)*