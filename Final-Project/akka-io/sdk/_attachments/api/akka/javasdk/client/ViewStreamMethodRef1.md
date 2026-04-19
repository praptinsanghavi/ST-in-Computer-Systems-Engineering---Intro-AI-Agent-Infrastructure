---
description: 'declaration: package: akka.javasdk.client, interface: ViewStreamMethodRef1'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:30Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ViewStreamMethodRef1.html
title: ViewStreamMethodRef1
---

# ViewStreamMethodRef1

> **Summary:** declaration: package: akka.javasdk.client, interface: ViewStreamMethodRef1

## Content

Package [akka.javasdk.client](package-summary.html)
# Interface ViewStreamMethodRef1\<A1,R\>

Type Parameters:
`A1` \- The type of the view input
`R` \- The type of entries in the view

All Superinterfaces:
`[ComponentStreamMethodRef1](ComponentStreamMethodRef1.html "interface in akka.javasdk.client")<A1,R>`

---

@DoNotInherit
public interface ViewStreamMethodRef1\<A1,R\>
extends [ComponentStreamMethodRef1](ComponentStreamMethodRef1.html "interface in akka.javasdk.client")\<A1,R\>
One argument streaming view query representation, the query is not executed until stream is
 materialized. Cannot be deferred.

 Not for user extension

- ## Method Summary

Modifier and Type
Method
Description
`akka.stream.javadsl.Source<[EntryWithMetadata](../view/EntryWithMetadata.html "class in akka.javasdk.view")<[R](ViewStreamMethodRef1.html "type parameter in ViewStreamMethodRef1")>,akka.NotUsed>`
`[entriesSource](#entriesSource(A1))([A1](ViewStreamMethodRef1.html "type parameter in ViewStreamMethodRef1") arg)`
 
`akka.stream.javadsl.Source<[EntryWithMetadata](../view/EntryWithMetadata.html "class in akka.javasdk.view")<[R](ViewStreamMethodRef1.html "type parameter in ViewStreamMethodRef1")>,akka.NotUsed>`
`[entriesSource](#entriesSource(A1,java.util.Optional))([A1](ViewStreamMethodRef1.html "type parameter in ViewStreamMethodRef1") arg,
 [Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time")> updatedAfter)`
 
`akka.stream.javadsl.Source<[R](ViewStreamMethodRef1.html "type parameter in ViewStreamMethodRef1"),akka.NotUsed>`
`[source](#source(A1))([A1](ViewStreamMethodRef1.html "type parameter in ViewStreamMethodRef1") arg)`

- ## Method Details

	- ### source
	
	
	akka.stream.javadsl.Source\<[R](ViewStreamMethodRef1.html "type parameter in ViewStreamMethodRef1"),akka.NotUsed\> source([A1](ViewStreamMethodRef1.html "type parameter in ViewStreamMethodRef1") arg)
	
	Specified by:
	`[source](ComponentStreamMethodRef1.html#source(A1))` in interface `[ComponentStreamMethodRef1](ComponentStreamMethodRef1.html "interface in akka.javasdk.client")<[A1](ViewStreamMethodRef1.html "type parameter in ViewStreamMethodRef1"),[R](ViewStreamMethodRef1.html "type parameter in ViewStreamMethodRef1")>`
	Returns:
	A stream of view entries.
	- ### entriesSource
	
	
	akka.stream.javadsl.Source\<[EntryWithMetadata](../view/EntryWithMetadata.html "class in akka.javasdk.view")\<[R](ViewStreamMethodRef1.html "type parameter in ViewStreamMethodRef1")\>,akka.NotUsed\> entriesSource([A1](ViewStreamMethodRef1.html "type parameter in ViewStreamMethodRef1") arg)
	
	Returns:
	A stream of view entries, including metadata.
	- ### entriesSource
	
	
	akka.stream.javadsl.Source\<[EntryWithMetadata](../view/EntryWithMetadata.html "class in akka.javasdk.view")\<[R](ViewStreamMethodRef1.html "type parameter in ViewStreamMethodRef1")\>,akka.NotUsed\> entriesSource([A1](ViewStreamMethodRef1.html "type parameter in ViewStreamMethodRef1") arg,
	 [Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[Instant](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Instant.html "class or interface in java.time")\> updatedAfter)
	
	Parameters:
	`arg` \- Query parameters
	`updatedAfter` \- If not empty, only return rows updated later than this time.
	Returns:
	A stream of view entries, including metadata.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ComponentStreamMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ViewStreamMethodRef1.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/EntryWithMetadata.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ViewStreamMethodRef1.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/client/ViewStreamMethodRef1.html)*