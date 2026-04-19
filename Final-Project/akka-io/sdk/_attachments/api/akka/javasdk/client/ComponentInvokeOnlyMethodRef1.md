---
description: 'declaration: package: akka.javasdk.client, interface: ComponentInvokeOnlyMethodRef1'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:24Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentInvokeOnlyMethodRef1.html
title: ComponentInvokeOnlyMethodRef1
---

# ComponentInvokeOnlyMethodRef1

> **Summary:** declaration: package: akka.javasdk.client, interface: ComponentInvokeOnlyMethodRef1

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface ComponentInvokeOnlyMethodRef1\<A1,R\>

Type Parameters:
`A1` \- the argument type of the call
`R` \- The type of value returned by executing the call

---

@DoNotInherit
public interface ComponentInvokeOnlyMethodRef1\<A1,R\>
One argument component call representation, not executed until invoked. Used for component
 methods that cannot be deferred.

 Not for user extension or instantiation, returned by the SDK component client

- ## Method Summary

Modifier and Type
Method
Description
`[R](ComponentInvokeOnlyMethodRef1.html "type parameter in ComponentInvokeOnlyMethodRef1")`
`[invoke](#invoke(A1))([A1](ComponentInvokeOnlyMethodRef1.html "type parameter in ComponentInvokeOnlyMethodRef1") arg)`
 
`[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<[R](ComponentInvokeOnlyMethodRef1.html "type parameter in ComponentInvokeOnlyMethodRef1")>`
`[invokeAsync](#invokeAsync(A1))([A1](ComponentInvokeOnlyMethodRef1.html "type parameter in ComponentInvokeOnlyMethodRef1") arg)`
 
`[ComponentMethodRef1](ComponentMethodRef1.html "interface in akka.javasdk.client")<[A1](ComponentInvokeOnlyMethodRef1.html "type parameter in ComponentInvokeOnlyMethodRef1"),[R](ComponentInvokeOnlyMethodRef1.html "type parameter in ComponentInvokeOnlyMethodRef1")>`
`[withMetadata](#withMetadata(akka.javasdk.Metadata))([Metadata](../Metadata.html "interface in akka.javasdk") metadata)`

- ## Method Details

	- ### withMetadata
	
	
	[ComponentMethodRef1](ComponentMethodRef1.html "interface in akka.javasdk.client")\<[A1](ComponentInvokeOnlyMethodRef1.html "type parameter in ComponentInvokeOnlyMethodRef1"),[R](ComponentInvokeOnlyMethodRef1.html "type parameter in ComponentInvokeOnlyMethodRef1")\> withMetadata([Metadata](../Metadata.html "interface in akka.javasdk") metadata)
	- ### invokeAsync
	
	
	[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<[R](ComponentInvokeOnlyMethodRef1.html "type parameter in ComponentInvokeOnlyMethodRef1")\> invokeAsync([A1](ComponentInvokeOnlyMethodRef1.html "type parameter in ComponentInvokeOnlyMethodRef1") arg)
	- ### invoke
	
	
	[R](ComponentInvokeOnlyMethodRef1.html "type parameter in ComponentInvokeOnlyMethodRef1") invoke([A1](ComponentInvokeOnlyMethodRef1.html "type parameter in ComponentInvokeOnlyMethodRef1") arg)

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Metadata.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentInvokeOnlyMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentInvokeOnlyMethodRef1.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentInvokeOnlyMethodRef1.html)*