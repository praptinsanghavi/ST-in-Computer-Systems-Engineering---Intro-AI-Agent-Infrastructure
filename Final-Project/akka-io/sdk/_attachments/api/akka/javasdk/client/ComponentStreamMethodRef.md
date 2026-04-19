---
description: 'declaration: package: akka.javasdk.client, interface: ComponentStreamMethodRef'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:26Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentStreamMethodRef.html
title: ComponentStreamMethodRef
---

# ComponentStreamMethodRef

> **Summary:** declaration: package: akka.javasdk.client, interface: ComponentStreamMethodRef

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface ComponentStreamMethodRef\<R\>

Type Parameters:
`R` \- The type of value returned by executing the call

All Known Subinterfaces:
`[ViewStreamMethodRef](ViewStreamMethodRef.html "interface in akka.javasdk.client")<R>`

---

@DoNotInherit
public interface ComponentStreamMethodRef\<R\>
Zero argument component call representation, not executed until stream is materialized. Cannot be
 deferred.

 Not for user extension or instantiation, returned by the SDK component client

- ## Method Summary

Modifier and Type
Method
Description
`akka.stream.javadsl.Source<[R](ComponentStreamMethodRef.html "type parameter in ComponentStreamMethodRef"),akka.NotUsed>`
`[source](#source())()`

- ## Method Details

	- ### source
	
	
	akka.stream.javadsl.Source\<[R](ComponentStreamMethodRef.html "type parameter in ComponentStreamMethodRef"),akka.NotUsed\> source()

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentStreamMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ViewStreamMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentStreamMethodRef.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentStreamMethodRef.html)*