---
description: 'declaration: package: akka.javasdk.client, interface: ComponentDeferredMethodRef1'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:22Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentDeferredMethodRef1.html
title: ComponentDeferredMethodRef1
---

# ComponentDeferredMethodRef1

> **Summary:** declaration: package: akka.javasdk.client, interface: ComponentDeferredMethodRef1

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface ComponentDeferredMethodRef1\<A1,R\>

Type Parameters:
`A1` \- the argument type of the call
`R` \- The type of value returned by executing the call

All Known Subinterfaces:
`[AgentMethodRef1](AgentMethodRef1.html "interface in akka.javasdk.client")<A1,R>`, `[ComponentMethodRef1](ComponentMethodRef1.html "interface in akka.javasdk.client")<A1,R>`

---

@DoNotInherit
public interface ComponentDeferredMethodRef1\<A1,R\>
One argument component deferred call representation, not executed until invoked by some mechanism
 using the deferred call (like a timer executing it later for example)

 Not for user extension or instantiation, returned by the SDK component client

- ## Method Summary

Modifier and Type
Method
Description
`[DeferredCall](../DeferredCall.html "interface in akka.javasdk")<[A1](ComponentDeferredMethodRef1.html "type parameter in ComponentDeferredMethodRef1"),[R](ComponentDeferredMethodRef1.html "type parameter in ComponentDeferredMethodRef1")>`
`[deferred](#deferred(A1))([A1](ComponentDeferredMethodRef1.html "type parameter in ComponentDeferredMethodRef1") arg)`
 
`[ComponentDeferredMethodRef1](ComponentDeferredMethodRef1.html "interface in akka.javasdk.client")<[A1](ComponentDeferredMethodRef1.html "type parameter in ComponentDeferredMethodRef1"),[R](ComponentDeferredMethodRef1.html "type parameter in ComponentDeferredMethodRef1")>`
`[withMetadata](#withMetadata(akka.javasdk.Metadata))([Metadata](../Metadata.html "interface in akka.javasdk") metadata)`

- ## Method Details

	- ### withMetadata
	
	
	[ComponentDeferredMethodRef1](ComponentDeferredMethodRef1.html "interface in akka.javasdk.client")\<[A1](ComponentDeferredMethodRef1.html "type parameter in ComponentDeferredMethodRef1"),[R](ComponentDeferredMethodRef1.html "type parameter in ComponentDeferredMethodRef1")\> withMetadata([Metadata](../Metadata.html "interface in akka.javasdk") metadata)
	- ### deferred
	
	
	[DeferredCall](../DeferredCall.html "interface in akka.javasdk")\<[A1](ComponentDeferredMethodRef1.html "type parameter in ComponentDeferredMethodRef1"),[R](ComponentDeferredMethodRef1.html "type parameter in ComponentDeferredMethodRef1")\> deferred([A1](ComponentDeferredMethodRef1.html "type parameter in ComponentDeferredMethodRef1") arg)

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/DeferredCall.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/AgentMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentDeferredMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentDeferredMethodRef1.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentDeferredMethodRef1.html)*