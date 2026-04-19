---
description: 'declaration: package: akka.javasdk.testkit, class: AsyncCallsSupport'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:12Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/AsyncCallsSupport.html
title: AsyncCallsSupport
---

# AsyncCallsSupport

> **Summary:** declaration: package: akka.javasdk.testkit, class: AsyncCallsSupport

## Content

Package [akka.javasdk.testkit](package-summary.html)
# Class AsyncCallsSupport

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
akka.javasdk.testkit.AsyncCallsSupport

Direct Known Subclasses:
`[TestKitSupport](TestKitSupport.html "class in akka.javasdk.testkit")`

---

public abstract class AsyncCallsSupport
extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

- ## Constructor Summary

Constructors

Constructor
Description
`[AsyncCallsSupport](#%3Cinit%3E())()`
- ## Method Summary

Modifier and Type
Method
Description
`<I,
O> O`
`[await](#await(java.util.concurrent.CompletionStage))([CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<O> stage)`
 
`<I,
O> O`
`[await](#await(java.util.concurrent.CompletionStage,java.time.Duration))([CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<O> stage,
 [Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") timeout)`
 
`<O> [Exception](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Exception.html "class or interface in java.lang")`
`[failed](#failed(java.util.concurrent.CompletionStage))([CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<O> stage)`

If completed with an exception, returns the exception.

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#hashCode() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#toString() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Constructor Details

	- ### AsyncCallsSupport
	
	
	public AsyncCallsSupport()
- ## Method Details

	- ### await
	
	
	public \<I,
	O\> O await([CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<O\> stage)
	- ### await
	
	
	public \<I,
	O\> O await([CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<O\> stage,
	 [Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") timeout)
	- ### failed
	
	
	public \<O\> [Exception](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Exception.html "class or interface in java.lang") failed([CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<O\> stage)
	If completed with an exception, returns the exception. If completed successfully, fail with
	 runtime exception.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TestKitSupport.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/AsyncCallsSupport.html](https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/AsyncCallsSupport.html)*