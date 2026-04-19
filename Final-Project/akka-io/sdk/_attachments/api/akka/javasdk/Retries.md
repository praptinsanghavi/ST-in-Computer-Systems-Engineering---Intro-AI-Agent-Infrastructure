---
description: 'declaration: package: akka.javasdk, interface: Retries'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:53Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Retries.html
title: Retries
---

# Retries

> **Summary:** declaration: package: akka.javasdk, interface: Retries

## Content

Package [akka.javasdk](package-summary.html)
# Interface Retries

---

public interface Retries

- ## Method Summary

Modifier and Type
Method
Description
`<T> T`
`[retry](#retry(java.util.concurrent.Callable,int))([Callable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/Callable.html "class or interface in java.util.concurrent")<T> call,
 int maxRetries)`

Retry a given call with a maximum number of retries.

`<T> T`
`[retry](#retry(java.util.concurrent.Callable,akka.pattern.RetrySettings))([Callable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/Callable.html "class or interface in java.util.concurrent")<T> call,
 akka.pattern.RetrySettings retrySettings)`

Retry a given call.

`<T> [CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<T>`
`[retryAsync](#retryAsync(java.util.concurrent.Callable,int))([Callable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/Callable.html "class or interface in java.util.concurrent")<[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<T>> call,
 int maxRetries)`

Retry a given call with a maximum number of retries.

`<T> [CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<T>`
`[retryAsync](#retryAsync(java.util.concurrent.Callable,akka.pattern.RetrySettings))([Callable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/Callable.html "class or interface in java.util.concurrent")<[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<T>> call,
 akka.pattern.RetrySettings retrySettings)`

Retry a given call.

- ## Method Details

	- ### retryAsync
	
	
	\<T\> [CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<T\> retryAsync([Callable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/Callable.html "class or interface in java.util.concurrent")\<[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<T\>\> call,
	 int maxRetries)
	Retry a given call with a maximum number of retries. A predefined backoff strategy will be
	 calculated based on the number of maxRetries.
	
	Parameters:
	`call` \- The call to retry
	`maxRetries` \- The number of retries to make
	- ### retryAsync
	
	
	\<T\> [CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<T\> retryAsync([Callable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/Callable.html "class or interface in java.util.concurrent")\<[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<T\>\> call,
	 akka.pattern.RetrySettings retrySettings)
	Retry a given call.
	
	Parameters:
	`call` \- The call to retry
	`retrySettings` \- The retry settings
	- ### retry
	
	
	\<T\> T retry([Callable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/Callable.html "class or interface in java.util.concurrent")\<T\> call,
	 int maxRetries)
	Retry a given call with a maximum number of retries. A predefined backoff strategy will be
	 calculated based on the number of maxRetries.
	
	Parameters:
	`call` \- The call to retry
	`maxRetries` \- The number of retries to make
	- ### retry
	
	
	\<T\> T retry([Callable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/Callable.html "class or interface in java.util.concurrent")\<T\> call,
	 akka.pattern.RetrySettings retrySettings)
	Retry a given call.
	
	Parameters:
	`call` \- The call to retry
	`retrySettings` \- The retry settings

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Retries.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Retries.html)*