---
description: 'declaration: package: akka.javasdk.consumer, interface: MessageEnvelope'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:32Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/MessageEnvelope.html
title: MessageEnvelope
---

# MessageEnvelope

> **Summary:** declaration: package: akka.javasdk.consumer, interface: MessageEnvelope

## Content

Package [akka.javasdk.consumer](package-summary.html)
# Interface MessageEnvelope\<T\>

---

public interface MessageEnvelope\<T\>
A message envelope.

- ## Method Summary

Modifier and Type
Method
Description
`[Metadata](../Metadata.html "interface in akka.javasdk")`
`[metadata](#metadata())()`

The metadata associated with the message.

`static <T> [MessageEnvelope](MessageEnvelope.html "interface in akka.javasdk.consumer")<T>`
`[of](#of(T))(T payload)`

Create a message.

`static <T> [MessageEnvelope](MessageEnvelope.html "interface in akka.javasdk.consumer")<T>`
`[of](#of(T,akka.javasdk.Metadata))(T payload,
 [Metadata](../Metadata.html "interface in akka.javasdk") metadata)`

Create a message.

`[T](MessageEnvelope.html "type parameter in MessageEnvelope")`
`[payload](#payload())()`

The payload of the message.

- ## Method Details

	- ### metadata
	
	
	[Metadata](../Metadata.html "interface in akka.javasdk") metadata()
	The metadata associated with the message.
	
	Returns:
	The metadata.
	- ### payload
	
	
	[T](MessageEnvelope.html "type parameter in MessageEnvelope") payload()
	The payload of the message.
	
	Returns:
	The payload.
	- ### of
	
	
	static \<T\> [MessageEnvelope](MessageEnvelope.html "interface in akka.javasdk.consumer")\<T\> of(T payload)
	Create a message.
	
	Parameters:
	`payload` \- The payload of the message.
	Returns:
	The message.
	- ### of
	
	
	static \<T\> [MessageEnvelope](MessageEnvelope.html "interface in akka.javasdk.consumer")\<T\> of(T payload,
	 [Metadata](../Metadata.html "interface in akka.javasdk") metadata)
	Create a message.
	
	Parameters:
	`payload` \- The payload of the message.
	`metadata` \- The metadata associated with the message.
	Returns:
	The message.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/MessageEnvelope.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/MessageEnvelope.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/MessageEnvelope.html)*