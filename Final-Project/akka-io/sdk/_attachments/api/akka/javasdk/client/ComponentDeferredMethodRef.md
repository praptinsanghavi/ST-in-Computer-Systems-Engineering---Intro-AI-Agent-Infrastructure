---
description: 'declaration: package: akka.javasdk.client, interface: ComponentDeferredMethodRef'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:22Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentDeferredMethodRef.html
title: ComponentDeferredMethodRef
---

# ComponentDeferredMethodRef

> **Summary:** declaration: package: akka.javasdk.client, interface: ComponentDeferredMethodRef

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface ComponentDeferredMethodRef\<R\>

Type Parameters:
`R` \- The type of value returned by executing the call

All Known Subinterfaces:
`[AgentMethodRef](AgentMethodRef.html "interface in akka.javasdk.client")<R>`, `[ComponentMethodRef](ComponentMethodRef.html "interface in akka.javasdk.client")<R>`

---

@DoNotInherit
public interface ComponentDeferredMethodRef\<R\>
Zero argument component deferred call representation, not executed until invoked by some
 mechanism using the deferred call (like a timer executing it later for example)

 Not for user extension or instantiation, returned by the SDK component client

- ## Method Summary

Modifier and Type
Method
Description
`[DeferredCall](../DeferredCall.html "interface in akka.javasdk")<akka.NotUsed,[R](ComponentDeferredMethodRef.html "type parameter in ComponentDeferredMethodRef")>`
`[deferred](#deferred())()`
 
`[ComponentDeferredMethodRef](ComponentDeferredMethodRef.html "interface in akka.javasdk.client")<[R](ComponentDeferredMethodRef.html "type parameter in ComponentDeferredMethodRef")>`
`[withMetadata](#withMetadata(akka.javasdk.Metadata))([Metadata](../Metadata.html "interface in akka.javasdk") metadata)`

- ## Method Details

	- ### withMetadata
	
	
	[ComponentDeferredMethodRef](ComponentDeferredMethodRef.html "interface in akka.javasdk.client")\<[R](ComponentDeferredMethodRef.html "type parameter in ComponentDeferredMethodRef")\> withMetadata([Metadata](../Metadata.html "interface in akka.javasdk") metadata)
	- ### deferred
	
	
	[DeferredCall](../DeferredCall.html "interface in akka.javasdk")\<akka.NotUsed,[R](ComponentDeferredMethodRef.html "type parameter in ComponentDeferredMethodRef")\> deferred()

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/DeferredCall.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentDeferredMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentDeferredMethodRef.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentDeferredMethodRef.html)*