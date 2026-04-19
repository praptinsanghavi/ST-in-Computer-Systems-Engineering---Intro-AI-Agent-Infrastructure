---
description: 'declaration: package: akka.javasdk.client, interface: ComponentMethodRef'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:24Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentMethodRef.html
title: ComponentMethodRef
---

# ComponentMethodRef

> **Summary:** declaration: package: akka.javasdk.client, interface: ComponentMethodRef

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface ComponentMethodRef\<R\>

Type Parameters:
`R` \- The type of value returned by executing the call

All Superinterfaces:
`[ComponentDeferredMethodRef](ComponentDeferredMethodRef.html "interface in akka.javasdk.client")<R>`

---

@DoNotInherit
public interface ComponentMethodRef\<R\>
extends [ComponentDeferredMethodRef](ComponentDeferredMethodRef.html "interface in akka.javasdk.client")\<R\>
Zero argument component call representation, not executed until invoked or by some mechanism
 using the deferred call (like a timer executing it later for example)

 Not for user extension or instantiation, returned by the SDK component client

- ## Method Summary

Modifier and Type
Method
Description
`[R](ComponentMethodRef.html "type parameter in ComponentMethodRef")`
`[invoke](#invoke())()`
 
`[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<[R](ComponentMethodRef.html "type parameter in ComponentMethodRef")>`
`[invokeAsync](#invokeAsync())()`
 
`[ComponentMethodRef](ComponentMethodRef.html "interface in akka.javasdk.client")<[R](ComponentMethodRef.html "type parameter in ComponentMethodRef")>`
`[withMetadata](#withMetadata(akka.javasdk.Metadata))([Metadata](../Metadata.html "interface in akka.javasdk") metadata)`
 
`[ComponentInvokeOnlyMethodRef](ComponentInvokeOnlyMethodRef.html "interface in akka.javasdk.client")<[R](ComponentMethodRef.html "type parameter in ComponentMethodRef")>`
`[withRetry](#withRetry(int))(int maxRetries)`

Set the retry settings for this call.

`[ComponentInvokeOnlyMethodRef](ComponentInvokeOnlyMethodRef.html "interface in akka.javasdk.client")<[R](ComponentMethodRef.html "type parameter in ComponentMethodRef")>`
`[withRetry](#withRetry(akka.pattern.RetrySettings))(akka.pattern.RetrySettings retrySettings)`

Set the retry settings for this call.

### Methods inherited from interface akka.javasdk.client.[ComponentDeferredMethodRef](ComponentDeferredMethodRef.html "interface in akka.javasdk.client")

`[deferred](ComponentDeferredMethodRef.html#deferred())`

- ## Method Details

	- ### withMetadata
	
	
	[ComponentMethodRef](ComponentMethodRef.html "interface in akka.javasdk.client")\<[R](ComponentMethodRef.html "type parameter in ComponentMethodRef")\> withMetadata([Metadata](../Metadata.html "interface in akka.javasdk") metadata)
	
	Specified by:
	`[withMetadata](ComponentDeferredMethodRef.html#withMetadata(akka.javasdk.Metadata))` in interface `[ComponentDeferredMethodRef](ComponentDeferredMethodRef.html "interface in akka.javasdk.client")<[R](ComponentMethodRef.html "type parameter in ComponentMethodRef")>`
	- ### withRetry
	
	
	[ComponentInvokeOnlyMethodRef](ComponentInvokeOnlyMethodRef.html "interface in akka.javasdk.client")\<[R](ComponentMethodRef.html "type parameter in ComponentMethodRef")\> withRetry(akka.pattern.RetrySettings retrySettings)
	Set the retry settings for this call.
	
	Parameters:
	`retrySettings` \- The retry settings
	Returns:
	A new call with the retry settings set
	- ### withRetry
	
	
	[ComponentInvokeOnlyMethodRef](ComponentInvokeOnlyMethodRef.html "interface in akka.javasdk.client")\<[R](ComponentMethodRef.html "type parameter in ComponentMethodRef")\> withRetry(int maxRetries)
	Set the retry settings for this call. A predefined backoff strategy will be calculated based on
	 the number of maxRetries.
	
	Parameters:
	`maxRetries` \- The number of retries to make
	Returns:
	A new call with the retry settings set
	- ### invokeAsync
	
	
	[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<[R](ComponentMethodRef.html "type parameter in ComponentMethodRef")\> invokeAsync()
	- ### invoke
	
	
	[R](ComponentMethodRef.html "type parameter in ComponentMethodRef") invoke()

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentDeferredMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentInvokeOnlyMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentMethodRef.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentMethodRef.html)*