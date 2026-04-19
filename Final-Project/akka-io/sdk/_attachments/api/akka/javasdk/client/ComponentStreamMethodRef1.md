---
description: 'declaration: package: akka.javasdk.client, interface: ComponentStreamMethodRef1'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:26Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentStreamMethodRef1.html
title: ComponentStreamMethodRef1
---

# ComponentStreamMethodRef1

> **Summary:** declaration: package: akka.javasdk.client, interface: ComponentStreamMethodRef1

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface ComponentStreamMethodRef1\<A1,R\>

Type Parameters:
`A1` \- the argument type of the call
`R` \- The type of value returned by executing the call

All Known Subinterfaces:
`[ViewStreamMethodRef1](ViewStreamMethodRef1.html "interface in akka.javasdk.client")<A1,R>`

---

public interface ComponentStreamMethodRef1\<A1,R\>
One argument component call representation, not executed until stream is materialized. Cannot be
 deferred.

 Not for user extension or instantiation, returned by the SDK component client

- ## Method Summary

Modifier and Type
Method
Description
`akka.stream.javadsl.Source<[R](ComponentStreamMethodRef1.html "type parameter in ComponentStreamMethodRef1"),akka.NotUsed>`
`[source](#source(A1))([A1](ComponentStreamMethodRef1.html "type parameter in ComponentStreamMethodRef1") arg)`

- ## Method Details

	- ### source
	
	
	akka.stream.javadsl.Source\<[R](ComponentStreamMethodRef1.html "type parameter in ComponentStreamMethodRef1"),akka.NotUsed\> source([A1](ComponentStreamMethodRef1.html "type parameter in ComponentStreamMethodRef1") arg)

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentStreamMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ViewStreamMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentStreamMethodRef1.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentStreamMethodRef1.html)*