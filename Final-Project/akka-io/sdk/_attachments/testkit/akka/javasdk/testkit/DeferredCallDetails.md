---
description: 'declaration: package: akka.javasdk.testkit, interface: DeferredCallDetails'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:13Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/DeferredCallDetails.html
title: DeferredCallDetails
---

# DeferredCallDetails

> **Summary:** declaration: package: akka.javasdk.testkit, interface: DeferredCallDetails

## Content

Package [akka.javasdk.testkit](package-summary.html)
# Interface DeferredCallDetails\<I,O\>

---

public interface DeferredCallDetails\<I,O\>

- ## Method Summary

Modifier and Type
Method
Description
`[I](DeferredCallDetails.html "type parameter in DeferredCallDetails")`
`[getMessage](#getMessage())()`
 
`akka.javasdk.Metadata`
`[getMetadata](#getMetadata())()`
 
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[getMethodName](#getMethodName())()`
 
`[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")`
`[getServiceName](#getServiceName())()`

- ## Method Details

	- ### getMessage
	
	
	[I](DeferredCallDetails.html "type parameter in DeferredCallDetails") getMessage()
	
	Returns:
	The forwarded message
	- ### getMetadata
	
	
	akka.javasdk.Metadata getMetadata()
	
	Returns:
	Any metadata attached to the call
	- ### getServiceName
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") getServiceName()
	
	Returns:
	The name of the service being called
	- ### getMethodName
	
	
	[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") getMethodName()
	
	Returns:
	The method name being called

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/DeferredCallDetails.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/DeferredCallDetails.html](https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/DeferredCallDetails.html)*