---
description: 'declaration: package: akka.javasdk.view, class: TableUpdater, interface:
  Effect, interface: Builder'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:10Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/TableUpdater.Effect.Builder.html
title: TableUpdater.Effect.Builder
---

# TableUpdater.Effect.Builder

> **Summary:** declaration: package: akka.javasdk.view, class: TableUpdater, interface: Effect, interface: Builder

## Content

Package [akka.javasdk.view](package-summary.html)
# Interface TableUpdater.Effect.Builder\<S\>

Enclosing interface:
`[TableUpdater.Effect](TableUpdater.Effect.html "interface in akka.javasdk.view")<[S](TableUpdater.Effect.html "type parameter in TableUpdater.Effect")>`

---

public static interface TableUpdater.Effect.Builder\<S\>

- ## Method Summary

Modifier and Type
Method
Description
`[TableUpdater.Effect](TableUpdater.Effect.html "interface in akka.javasdk.view")<[S](TableUpdater.Effect.Builder.html "type parameter in TableUpdater.Effect.Builder")>`
`[deleteRow](#deleteRow())()`

Deletes the view row.

`[TableUpdater.Effect](TableUpdater.Effect.html "interface in akka.javasdk.view")<[S](TableUpdater.Effect.Builder.html "type parameter in TableUpdater.Effect.Builder")>`
`[ignore](#ignore())()`

Ignore this event (and continue to process the next).

`[TableUpdater.Effect](TableUpdater.Effect.html "interface in akka.javasdk.view")<[S](TableUpdater.Effect.Builder.html "type parameter in TableUpdater.Effect.Builder")>`
`[updateRow](#updateRow(S))([S](TableUpdater.Effect.Builder.html "type parameter in TableUpdater.Effect.Builder") newRow)`

Updates the state of view row.

- ## Method Details

	- ### updateRow
	
	
	[TableUpdater.Effect](TableUpdater.Effect.html "interface in akka.javasdk.view")\<[S](TableUpdater.Effect.Builder.html "type parameter in TableUpdater.Effect.Builder")\> updateRow([S](TableUpdater.Effect.Builder.html "type parameter in TableUpdater.Effect.Builder") newRow)
	Updates the state of view row.
	- ### deleteRow
	
	
	[TableUpdater.Effect](TableUpdater.Effect.html "interface in akka.javasdk.view")\<[S](TableUpdater.Effect.Builder.html "type parameter in TableUpdater.Effect.Builder")\> deleteRow()
	Deletes the view row.
	- ### ignore
	
	
	[TableUpdater.Effect](TableUpdater.Effect.html "interface in akka.javasdk.view")\<[S](TableUpdater.Effect.Builder.html "type parameter in TableUpdater.Effect.Builder")\> ignore()
	Ignore this event (and continue to process the next).

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/TableUpdater.Effect.Builder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/TableUpdater.Effect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/TableUpdater.Effect.Builder.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/TableUpdater.Effect.Builder.html)*