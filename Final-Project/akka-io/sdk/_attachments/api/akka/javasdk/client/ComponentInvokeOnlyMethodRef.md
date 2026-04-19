---
description: 'declaration: package: akka.javasdk.client, interface: ComponentInvokeOnlyMethodRef'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:24Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentInvokeOnlyMethodRef.html
title: ComponentInvokeOnlyMethodRef
---

# ComponentInvokeOnlyMethodRef

> **Summary:** declaration: package: akka.javasdk.client, interface: ComponentInvokeOnlyMethodRef

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface ComponentInvokeOnlyMethodRef\<R\>

Type Parameters:
`R` \- The type of value returned by executing the call

---

@DoNotInherit
public interface ComponentInvokeOnlyMethodRef\<R\>
Zero argument component call representation, not executed until invoked. Used for component
 methods that cannot be deferred.

 Not for user extension or instantiation, returned by the SDK component client

- ## Method Summary

Modifier and Type
Method
Description
`[R](ComponentInvokeOnlyMethodRef.html "type parameter in ComponentInvokeOnlyMethodRef")`
`[invoke](#invoke())()`
 
`[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<[R](ComponentInvokeOnlyMethodRef.html "type parameter in ComponentInvokeOnlyMethodRef")>`
`[invokeAsync](#invokeAsync())()`
 
`[ComponentMethodRef](ComponentMethodRef.html "interface in akka.javasdk.client")<[R](ComponentInvokeOnlyMethodRef.html "type parameter in ComponentInvokeOnlyMethodRef")>`
`[withMetadata](#withMetadata(akka.javasdk.Metadata))([Metadata](../Metadata.html "interface in akka.javasdk") metadata)`

- ## Method Details

	- ### withMetadata
	
	
	[ComponentMethodRef](ComponentMethodRef.html "interface in akka.javasdk.client")\<[R](ComponentInvokeOnlyMethodRef.html "type parameter in ComponentInvokeOnlyMethodRef")\> withMetadata([Metadata](../Metadata.html "interface in akka.javasdk") metadata)
	- ### invokeAsync
	
	
	[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<[R](ComponentInvokeOnlyMethodRef.html "type parameter in ComponentInvokeOnlyMethodRef")\> invokeAsync()
	- ### invoke
	
	
	[R](ComponentInvokeOnlyMethodRef.html "type parameter in ComponentInvokeOnlyMethodRef") invoke()

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentInvokeOnlyMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentInvokeOnlyMethodRef.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentInvokeOnlyMethodRef.html)*