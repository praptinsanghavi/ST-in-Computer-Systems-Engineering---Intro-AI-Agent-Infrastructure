---
description: 'declaration: package: akka.javasdk.testkit, interface: TimedActionResult'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:29Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TimedActionResult.html
title: TimedActionResult
---

# TimedActionResult

> **Summary:** declaration: package: akka.javasdk.testkit, interface: TimedActionResult

## Content

Package [akka.javasdk.testkit](package-summary.html)
# Interface TimedActionResult

---

public interface TimedActionResult
Represents the result of an Action handling a command when run in through the testkit.

 Not for user extension, returned by the testkit.

- ## Method Summary

Modifier and Type
Method
Description
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[getError](#getError())()`
 
`boolean`
`[isAsync](#isAsync())()`
 
`boolean`
`[isDone](#isDone())()`
 
`boolean`
`[isError](#isError())()`

- ## Method Details

	- ### isDone
	
	
	boolean isDone()
	
	Returns:
	true if the call had an effect with a reply, false if not
	- ### isAsync
	
	
	boolean isAsync()
	
	Returns:
	true if the call was async, false if not
	- ### isError
	
	
	boolean isError()
	
	Returns:
	true if the call was an error, false if not
	- ### getError
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") getError()
	
	Returns:
	The error description returned or throws if the effect returned by the action was not
	 an error

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TimedActionResult.html](https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/TimedActionResult.html)*