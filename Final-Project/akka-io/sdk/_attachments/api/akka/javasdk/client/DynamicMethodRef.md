---
description: 'declaration: package: akka.javasdk.client, interface: DynamicMethodRef'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:26Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/DynamicMethodRef.html
title: DynamicMethodRef
---

# DynamicMethodRef

> **Summary:** declaration: package: akka.javasdk.client, interface: DynamicMethodRef

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface DynamicMethodRef\<A1,R\>

Type Parameters:
`A1` \- the argument type of the call
`R` \- The type of value returned by executing the call

---

@DoNotInherit
public interface DynamicMethodRef\<A1,R\>
Zero or one argument component call representation, not executed until invoked.

 Not for user extension or instantiation, returned by the SDK component client

- ## Method Summary

Modifier and Type
Method
Description
`[R](DynamicMethodRef.html "type parameter in DynamicMethodRef")`
`[invoke](#invoke())()`
 
`[R](DynamicMethodRef.html "type parameter in DynamicMethodRef")`
`[invoke](#invoke(A1))([A1](DynamicMethodRef.html "type parameter in DynamicMethodRef") arg)`
 
`[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<[R](DynamicMethodRef.html "type parameter in DynamicMethodRef")>`
`[invokeAsync](#invokeAsync())()`
 
`[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<[R](DynamicMethodRef.html "type parameter in DynamicMethodRef")>`
`[invokeAsync](#invokeAsync(A1))([A1](DynamicMethodRef.html "type parameter in DynamicMethodRef") arg)`
 
`[DynamicMethodRef](DynamicMethodRef.html "interface in akka.javasdk.client")<[A1](DynamicMethodRef.html "type parameter in DynamicMethodRef"),[R](DynamicMethodRef.html "type parameter in DynamicMethodRef")>`
`[withMetadata](#withMetadata(akka.javasdk.Metadata))([Metadata](../Metadata.html "interface in akka.javasdk") metadata)`
 
`[DynamicMethodRef](DynamicMethodRef.html "interface in akka.javasdk.client")<[A1](DynamicMethodRef.html "type parameter in DynamicMethodRef"),[R](DynamicMethodRef.html "type parameter in DynamicMethodRef")>`
`[withRetry](#withRetry(int))(int maxRetries)`

Set the retry settings for this call.

`[DynamicMethodRef](DynamicMethodRef.html "interface in akka.javasdk.client")<[A1](DynamicMethodRef.html "type parameter in DynamicMethodRef"),[R](DynamicMethodRef.html "type parameter in DynamicMethodRef")>`
`[withRetry](#withRetry(akka.pattern.RetrySettings))(akka.pattern.RetrySettings retrySettings)`

Set the retry settings for this call.

- ## Method Details

	- ### withMetadata
	
	
	[DynamicMethodRef](DynamicMethodRef.html "interface in akka.javasdk.client")\<[A1](DynamicMethodRef.html "type parameter in DynamicMethodRef"),[R](DynamicMethodRef.html "type parameter in DynamicMethodRef")\> withMetadata([Metadata](../Metadata.html "interface in akka.javasdk") metadata)
	- ### withRetry
	
	
	[DynamicMethodRef](DynamicMethodRef.html "interface in akka.javasdk.client")\<[A1](DynamicMethodRef.html "type parameter in DynamicMethodRef"),[R](DynamicMethodRef.html "type parameter in DynamicMethodRef")\> withRetry(akka.pattern.RetrySettings retrySettings)
	Set the retry settings for this call.
	
	Parameters:
	`retrySettings` \- The retry settings
	Returns:
	A new call with the retry settings set
	- ### withRetry
	
	
	[DynamicMethodRef](DynamicMethodRef.html "interface in akka.javasdk.client")\<[A1](DynamicMethodRef.html "type parameter in DynamicMethodRef"),[R](DynamicMethodRef.html "type parameter in DynamicMethodRef")\> withRetry(int maxRetries)
	Set the retry settings for this call. A predefined backoff strategy will be calculated based on
	 the number of maxRetries.
	
	Parameters:
	`maxRetries` \- The number of retries to make
	Returns:
	A new call with the retry settings set
	- ### invokeAsync
	
	
	[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<[R](DynamicMethodRef.html "type parameter in DynamicMethodRef")\> invokeAsync([A1](DynamicMethodRef.html "type parameter in DynamicMethodRef") arg)
	- ### invoke
	
	
	[R](DynamicMethodRef.html "type parameter in DynamicMethodRef") invoke([A1](DynamicMethodRef.html "type parameter in DynamicMethodRef") arg)
	- ### invokeAsync
	
	
	[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<[R](DynamicMethodRef.html "type parameter in DynamicMethodRef")\> invokeAsync()
	- ### invoke
	
	
	[R](DynamicMethodRef.html "type parameter in DynamicMethodRef") invoke()

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/DynamicMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/DynamicMethodRef.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/DynamicMethodRef.html)*