---
description: 'declaration: package: akka.javasdk.view, class: TableUpdater, interface:
  Effect'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:33:10Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/TableUpdater.Effect.html
title: TableUpdater.Effect
---

# TableUpdater.Effect

> **Summary:** declaration: package: akka.javasdk.view, class: TableUpdater, interface: Effect

## Content

Package [akka.javasdk.view](package-summary.html)
# Interface TableUpdater.Effect\<S\>

Type Parameters:
`S` \- The type of the row for this table.

Enclosing class:
`[TableUpdater](TableUpdater.html "class in akka.javasdk.view")<[S](TableUpdater.html "type parameter in TableUpdater")>`

---

public static interface TableUpdater.Effect\<S\>
An UpdateEffect is a description of what the runtime needs to do after the command is handled.
 You can think of it as a set of instructions you are passing to the runtime, which will process
 the instructions on your behalf.

 Each component defines its own effects, which are a set of predefined operations that match
 the capabilities of that component.

 

A View UpdateEffect can either:

 

- update the view row
- delete the view row
- ignore the event or state change notification (and not update the view state)

Construct the effect that is returned by the command handler. The effect describes next
 processing actions, such as emitting events and sending a reply.

- ## Nested Class Summary

Nested Classes

Modifier and Type
Interface
Description
`static interface`
`[TableUpdater.Effect.Builder](TableUpdater.Effect.Builder.html "interface in akka.javasdk.view")<[S](TableUpdater.Effect.Builder.html "type parameter in TableUpdater.Effect.Builder")>`

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/TableUpdater.Effect.Builder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/TableUpdater.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/TableUpdater.Effect.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/TableUpdater.Effect.html)*