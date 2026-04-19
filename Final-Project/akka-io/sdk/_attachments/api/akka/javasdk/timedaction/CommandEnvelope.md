---
description: 'declaration: package: akka.javasdk.timedaction, interface: CommandEnvelope'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:42Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/CommandEnvelope.html
title: CommandEnvelope
---

# CommandEnvelope

> **Summary:** declaration: package: akka.javasdk.timedaction, interface: CommandEnvelope

## Content

Package [akka.javasdk.timedaction](package-summary.html)
# Interface CommandEnvelope\<T\>

---

public interface CommandEnvelope\<T\>
A command envelope.

- ## Method Summary

Modifier and Type
Method
Description
`[Metadata](../Metadata.html "interface in akka.javasdk")`
`[metadata](#metadata())()`

The metadata associated with the command.

`static <T> [CommandEnvelope](CommandEnvelope.html "interface in akka.javasdk.timedaction")<T>`
`[of](#of(T))(T payload)`

Create a command envelope.

`static <T> [CommandEnvelope](CommandEnvelope.html "interface in akka.javasdk.timedaction")<T>`
`[of](#of(T,akka.javasdk.Metadata))(T payload,
 [Metadata](../Metadata.html "interface in akka.javasdk") metadata)`

Create a command envelope.

`[T](CommandEnvelope.html "type parameter in CommandEnvelope")`
`[payload](#payload())()`

The payload of the command.

- ## Method Details

	- ### metadata
	
	
	[Metadata](../Metadata.html "interface in akka.javasdk") metadata()
	The metadata associated with the command.
	
	Returns:
	The metadata.
	- ### payload
	
	
	[T](CommandEnvelope.html "type parameter in CommandEnvelope") payload()
	The payload of the command.
	
	Returns:
	The payload.
	- ### of
	
	
	static \<T\> [CommandEnvelope](CommandEnvelope.html "interface in akka.javasdk.timedaction")\<T\> of(T payload)
	Create a command envelope.
	
	Parameters:
	`payload` \- The payload of the command.
	Returns:
	The command envelope.
	- ### of
	
	
	static \<T\> [CommandEnvelope](CommandEnvelope.html "interface in akka.javasdk.timedaction")\<T\> of(T payload,
	 [Metadata](../Metadata.html "interface in akka.javasdk") metadata)
	Create a command envelope.
	
	Parameters:
	`payload` \- The payload of the command.
	`metadata` \- The metadata associated with the command.
	Returns:
	The command envelope.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/CommandEnvelope.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/CommandEnvelope.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/CommandEnvelope.html)*