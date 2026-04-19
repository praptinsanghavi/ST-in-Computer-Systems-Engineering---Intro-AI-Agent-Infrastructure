---
description: 'declaration: package: akka.javasdk.client, interface: ViewStreamMethodRef'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:29Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ViewStreamMethodRef.html
title: ViewStreamMethodRef
---

# ViewStreamMethodRef

> **Summary:** declaration: package: akka.javasdk.client, interface: ViewStreamMethodRef

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface ViewStreamMethodRef\<R\>

Type Parameters:
`R` \- The type of entries in the view

All Superinterfaces:
`[ComponentStreamMethodRef](ComponentStreamMethodRef.html "interface in akka.javasdk.client")<R>`

---

@DoNotInherit
public interface ViewStreamMethodRef\<R\>
extends [ComponentStreamMethodRef](ComponentStreamMethodRef.html "interface in akka.javasdk.client")\<R\>
Zero argument component call representation, query is not executed until stream is materialized.
 Cannot be deferred.

 Not for user extension

- ## Method Summary

Modifier and Type
Method
Description
`akka.stream.javadsl.Source<[EntryWithMetadata](../view/EntryWithMetadata.html "class in akka.javasdk.view")<[R](ViewStreamMethodRef.html "type parameter in ViewStreamMethodRef")>,akka.NotUsed>`
`[entriesSource](#entriesSource())()`
 
`akka.stream.javadsl.Source<[EntryWithMetadata](../view/EntryWithMetadata.html "class in akka.javasdk.view")<[R](ViewStreamMethodRef.html "type parameter in ViewStreamMethodRef")>,akka.NotUsed>`
`[entriesSource](#entriesSource(java.util.Optional))([Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time")> updatedAfter)`
 
`akka.stream.javadsl.Source<[R](ViewStreamMethodRef.html "type parameter in ViewStreamMethodRef"),akka.NotUsed>`
`[source](#source())()`

- ## Method Details

	- ### source
	
	
	akka.stream.javadsl.Source\<[R](ViewStreamMethodRef.html "type parameter in ViewStreamMethodRef"),akka.NotUsed\> source()
	
	Specified by:
	`[source](ComponentStreamMethodRef.html#source())` in interface `[ComponentStreamMethodRef](ComponentStreamMethodRef.html "interface in akka.javasdk.client")<[R](ViewStreamMethodRef.html "type parameter in ViewStreamMethodRef")>`
	Returns:
	A stream of view entries.
	- ### entriesSource
	
	
	akka.stream.javadsl.Source\<[EntryWithMetadata](../view/EntryWithMetadata.html "class in akka.javasdk.view")\<[R](ViewStreamMethodRef.html "type parameter in ViewStreamMethodRef")\>,akka.NotUsed\> entriesSource()
	
	Returns:
	A stream of view entries, including metadata.
	- ### entriesSource
	
	
	akka.stream.javadsl.Source\<[EntryWithMetadata](../view/EntryWithMetadata.html "class in akka.javasdk.view")\<[R](ViewStreamMethodRef.html "type parameter in ViewStreamMethodRef")\>,akka.NotUsed\> entriesSource([Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time")\> updatedAfter)
	
	Parameters:
	`updatedAfter` \- If not empty, only return rows updated later than this time.
	Returns:
	A stream of view entries, including metadata.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentStreamMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ViewStreamMethodRef.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/EntryWithMetadata.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ViewStreamMethodRef.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ViewStreamMethodRef.html)*