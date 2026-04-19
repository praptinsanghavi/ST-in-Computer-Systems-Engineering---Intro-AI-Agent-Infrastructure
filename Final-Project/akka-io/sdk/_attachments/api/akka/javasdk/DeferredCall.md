---
description: 'declaration: package: akka.javasdk, interface: DeferredCall'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:31:45Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/DeferredCall.html
title: DeferredCall
---

# DeferredCall

> **Summary:** declaration: package: akka.javasdk, interface: DeferredCall

## Content

Package [akka.javasdk](package-summary.html)
# Interface DeferredCall\<I,O\>

Type Parameters:
`I` \- The type of message the call accepts
`O` \- The type of message the call returns

---

public interface DeferredCall\<I,O\>
Represents a call to another component that can be persisted and invoked later.

 Not for user extension.

- ## Method Summary

Modifier and Type
Method
Description
`[I](DeferredCall.html "type parameter in DeferredCall")`
`[message](#message())()`

The message to pass to the call when the call is invoked.

`[Metadata](Metadata.html "interface in akka.javasdk")`
`[metadata](#metadata())()`
 
`[DeferredCall](DeferredCall.html "interface in akka.javasdk")<[I](DeferredCall.html "type parameter in DeferredCall"),[O](DeferredCall.html "type parameter in DeferredCall")>`
`[withMetadata](#withMetadata(akka.javasdk.Metadata))([Metadata](Metadata.html "interface in akka.javasdk") metadata)`

- ## Method Details

	- ### message
	
	
	[I](DeferredCall.html "type parameter in DeferredCall") message()
	The message to pass to the call when the call is invoked.
	- ### metadata
	
	
	[Metadata](Metadata.html "interface in akka.javasdk") metadata()
	
	Returns:
	The metadata to pass with the message when the call is invoked.
	- ### withMetadata
	
	
	[DeferredCall](DeferredCall.html "interface in akka.javasdk")\<[I](DeferredCall.html "type parameter in DeferredCall"),[O](DeferredCall.html "type parameter in DeferredCall")\> withMetadata([Metadata](Metadata.html "interface in akka.javasdk") metadata)
	
	Returns:
	DeferredCall with updated metadata

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/DeferredCall.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/DeferredCall.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/DeferredCall.html)*