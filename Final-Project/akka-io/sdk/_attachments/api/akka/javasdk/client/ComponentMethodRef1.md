---
description: 'declaration: package: akka.javasdk.client, interface: ComponentMethodRef1'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:24Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentMethodRef1.html
title: ComponentMethodRef1
---

# ComponentMethodRef1

> **Summary:** declaration: package: akka.javasdk.client, interface: ComponentMethodRef1

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface ComponentMethodRef1\<A1,R\>

Type Parameters:
`A1` \- the argument type of the call
`R` \- The type of value returned by executing the call

All Superinterfaces:
`[ComponentDeferredMethodRef1](ComponentDeferredMethodRef1.html "interface in akka.javasdk.client")<A1,R>`

---

@DoNotInherit
public interface ComponentMethodRef1\<A1,R\>
extends [ComponentDeferredMethodRef1](ComponentDeferredMethodRef1.html "interface in akka.javasdk.client")\<A1,R\>
One argument component call representation, not executed until invoked or by some mechanism using
 the deferred call (like a timer executing it later for example)

 Not for user extension or instantiation, returned by the SDK component client

- ## Method Summary

Modifier and Type
Method
Description
`[R](ComponentMethodRef1.html "type parameter in ComponentMethodRef1")`
`[invoke](#invoke(A1))([A1](ComponentMethodRef1.html "type parameter in ComponentMethodRef1") arg)`
 
`[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<[R](ComponentMethodRef1.html "type parameter in ComponentMethodRef1")>`
`[invokeAsync](#invokeAsync(A1))([A1](ComponentMethodRef1.html "type parameter in ComponentMethodRef1") arg)`
 
`[ComponentMethodRef1](ComponentMethodRef1.html "interface in akka.javasdk.client")<[A1](ComponentMethodRef1.html "type parameter in ComponentMethodRef1"),[R](ComponentMethodRef1.html "type parameter in ComponentMethodRef1")>`
`[withMetadata](#withMetadata(akka.javasdk.Metadata))([Metadata](../Metadata.html "interface in akka.javasdk") metadata)`
 
`[ComponentInvokeOnlyMethodRef1](ComponentInvokeOnlyMethodRef1.html "interface in akka.javasdk.client")<[A1](ComponentMethodRef1.html "type parameter in ComponentMethodRef1"),[R](ComponentMethodRef1.html "type parameter in ComponentMethodRef1")>`
`[withRetry](#withRetry(int))(int maxRetries)`

Set the retry settings for this call.

`[ComponentInvokeOnlyMethodRef1](ComponentInvokeOnlyMethodRef1.html "interface in akka.javasdk.client")<[A1](ComponentMethodRef1.html "type parameter in ComponentMethodRef1"),[R](ComponentMethodRef1.html "type parameter in ComponentMethodRef1")>`
`[withRetry](#withRetry(akka.pattern.RetrySettings))(akka.pattern.RetrySettings retrySettings)`

Set the retry settings for this call.

### Methods inherited from interface akka.javasdk.client.[ComponentDeferredMethodRef1](ComponentDeferredMethodRef1.html "interface in akka.javasdk.client")

`[deferred](ComponentDeferredMethodRef1.html#deferred(A1))`

- ## Method Details

	- ### withMetadata
	
	
	[ComponentMethodRef1](ComponentMethodRef1.html "interface in akka.javasdk.client")\<[A1](ComponentMethodRef1.html "type parameter in ComponentMethodRef1"),[R](ComponentMethodRef1.html "type parameter in ComponentMethodRef1")\> withMetadata([Metadata](../Metadata.html "interface in akka.javasdk") metadata)
	
	Specified by:
	`[withMetadata](ComponentDeferredMethodRef1.html#withMetadata(akka.javasdk.Metadata))` in interface `[ComponentDeferredMethodRef1](ComponentDeferredMethodRef1.html "interface in akka.javasdk.client")<[A1](ComponentMethodRef1.html "type parameter in ComponentMethodRef1"),[R](ComponentMethodRef1.html "type parameter in ComponentMethodRef1")>`
	- ### withRetry
	
	
	[ComponentInvokeOnlyMethodRef1](ComponentInvokeOnlyMethodRef1.html "interface in akka.javasdk.client")\<[A1](ComponentMethodRef1.html "type parameter in ComponentMethodRef1"),[R](ComponentMethodRef1.html "type parameter in ComponentMethodRef1")\> withRetry(akka.pattern.RetrySettings retrySettings)
	Set the retry settings for this call.
	
	Parameters:
	`retrySettings` \- The retry settings
	Returns:
	A new call with the retry settings set
	- ### withRetry
	
	
	[ComponentInvokeOnlyMethodRef1](ComponentInvokeOnlyMethodRef1.html "interface in akka.javasdk.client")\<[A1](ComponentMethodRef1.html "type parameter in ComponentMethodRef1"),[R](ComponentMethodRef1.html "type parameter in ComponentMethodRef1")\> withRetry(int maxRetries)
	Set the retry settings for this call. A predefined backoff strategy will be calculated based on
	 the number of maxRetries.
	
	Parameters:
	`maxRetries` \- The number of retries to make
	Returns:
	A new call with the retry settings set
	- ### invokeAsync
	
	
	[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<[R](ComponentMethodRef1.html "type parameter in ComponentMethodRef1")\> invokeAsync([A1](ComponentMethodRef1.html "type parameter in ComponentMethodRef1") arg)
	- ### invoke
	
	
	[R](ComponentMethodRef1.html "type parameter in ComponentMethodRef1") invoke([A1](ComponentMethodRef1.html "type parameter in ComponentMethodRef1") arg)

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentDeferredMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentInvokeOnlyMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentMethodRef1.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentMethodRef1.html)*