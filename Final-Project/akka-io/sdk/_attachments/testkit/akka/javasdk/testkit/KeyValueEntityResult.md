---
description: 'declaration: package: akka.javasdk.testkit, interface: KeyValueEntityResult'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:17Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/KeyValueEntityResult.html
title: KeyValueEntityResult
---

# KeyValueEntityResult

> **Summary:** declaration: package: akka.javasdk.testkit, interface: KeyValueEntityResult

## Content

Package [akka.javasdk.testkit](package-summary.html)
# Interface KeyValueEntityResult\<R\>

Type Parameters:
`R` \- The type of reply that is expected from invoking a command handler

---

public interface KeyValueEntityResult\<R\>
Represents the result of a KeyValueEntity handling a command when run in through the testkit.

 Not for user extension, returned by the testkit.

- ## Method Summary

Modifier and Type
Method
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[getError](#getError())()`

The error description.

`[R](KeyValueEntityResult.html "type parameter in KeyValueEntityResult")`
`[getReply](#getReply())()`
 
`[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")`
`[getUpdatedState](#getUpdatedState())()`
 
`boolean`
`[isError](#isError())()`
 
`boolean`
`[isReply](#isReply())()`
 
`boolean`
`[stateWasDeleted](#stateWasDeleted())()`
 
`boolean`
`[stateWasUpdated](#stateWasUpdated())()`

- ## Method Details

	- ### isReply
	
	
	boolean isReply()
	
	Returns:
	true if the call had an effect with a reply, false if not
	- ### getReply
	
	
	[R](KeyValueEntityResult.html "type parameter in KeyValueEntityResult") getReply()
	
	Returns:
	The reply object from the handler if there was one. If the call had an effect without
	 any reply an exception is thrown.
	- ### isError
	
	
	boolean isError()
	
	Returns:
	true if the call was an error, false if not
	- ### getError
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") getError()
	The error description. If the result was not an error an exception is thrown
	- ### stateWasUpdated
	
	
	boolean stateWasUpdated()
	
	Returns:
	true if the call updated the entity state
	- ### getUpdatedState
	
	
	[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") getUpdatedState()
	
	Returns:
	The updated state. If the state was not updated an exception is thrown
	- ### stateWasDeleted
	
	
	boolean stateWasDeleted()
	
	Returns:
	true if the call deleted the entity

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/KeyValueEntityResult.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/KeyValueEntityResult.html](https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/KeyValueEntityResult.html)*