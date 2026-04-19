---
description: 'declaration: package: akka.javasdk.testkit, interface: EventingTestKit,
  interface: Message'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:15Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventingTestKit.Message.html
title: EventingTestKit.Message
---

# EventingTestKit.Message

> **Summary:** declaration: package: akka.javasdk.testkit, interface: EventingTestKit, interface: Message

## Content

Package [akka.javasdk.testkit](package-summary.html)
# Interface EventingTestKit.Message\<P\>

Enclosing interface:
`[EventingTestKit](EventingTestKit.html "interface in akka.javasdk.testkit")`

---

public static interface EventingTestKit.Message\<P\>

- ## Method Summary

Modifier and Type
Method
Description
`<T> T`
`[expectType](#expectType(java.lang.Class))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<T> clazz)`

Expects message payload to conform to type passed in and returns the typed object if so.

`akka.javasdk.Metadata`
`[getMetadata](#getMetadata())()`
 
`[P](EventingTestKit.Message.html "type parameter in EventingTestKit.Message")`
`[getPayload](#getPayload())()`

- ## Method Details

	- ### getPayload
	
	
	[P](EventingTestKit.Message.html "type parameter in EventingTestKit.Message") getPayload()
	- ### getMetadata
	
	
	akka.javasdk.Metadata getMetadata()
	- ### expectType
	
	
	\<T\> T expectType([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<T\> clazz)
	Expects message payload to conform to type passed in and returns the typed object if so.
	 Otherwise, throws an exception.
	
	Type Parameters:
	`T` \- the type of the payload
	Parameters:
	`clazz` \- expected class type for the payload of the message
	Returns:
	a typed object from the payload

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventingTestKit.Message.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventingTestKit.html
- https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventingTestKit.Message.html](https://doc.akka.io/sdk/_attachments/testkit/akka/javasdk/testkit/EventingTestKit.Message.html)*