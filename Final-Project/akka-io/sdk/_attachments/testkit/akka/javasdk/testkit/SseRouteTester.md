---
description: 'declaration: package: akka.javasdk.testkit, interface: SseRouteTester'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:19Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/SseRouteTester.html
title: SseRouteTester
---

# SseRouteTester

> **Summary:** declaration: package: akka.javasdk.testkit, interface: SseRouteTester

## Content

Package [akka.javasdk.testkit](package-summary.html)
# Interface SseRouteTester

---

public interface SseRouteTester

- ## Method Summary

Modifier and Type
Method
Description
`[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<akka.http.javadsl.model.sse.ServerSentEvent>`
`[receiveFirstN](#receiveFirstN(java.lang.String,int,java.time.Duration))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") path,
 int count,
 [Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") timeout)`
 
`[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<akka.http.javadsl.model.sse.ServerSentEvent>`
`[receiveNFromOffset](#receiveNFromOffset(java.lang.String,int,java.lang.String,java.time.Duration))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") path,
 int count,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") startFromId,
 [Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") timeout)`

- ## Method Details

	- ### receiveFirstN
	
	
	[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<akka.http.javadsl.model.sse.ServerSentEvent\> receiveFirstN([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") path,
	 int count,
	 [Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") timeout)
	
	Parameters:
	`path` \- A path in the service that responds with SSE
	`count` \- A number of events to wait for
	Returns:
	`count` events that the endpoint emitted before the timeout hit
	Throws:
	`[TimeoutException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/TimeoutException.html "class or interface in java.util.concurrent")` \- if the service did not emit `count` events
	 before the timeout hit
	- ### receiveNFromOffset
	
	
	[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<akka.http.javadsl.model.sse.ServerSentEvent\> receiveNFromOffset([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") path,
	 int count,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") startFromId,
	 [Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") timeout)
	
	Parameters:
	`path` \- A path in the service that responds with SSE
	`count` \- A number of events to wait for
	`startFromId` \- An SSE id to pass to the endpoint as point to resume from
	Returns:
	`count` events that the endpoint emitted before the timeout hit
	Throws:
	`[TimeoutException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/TimeoutException.html "class or interface in java.util.concurrent")` \- if the service did not emit `count` events
	 before the timeout hit

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/SseRouteTester.html](https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/SseRouteTester.html)*