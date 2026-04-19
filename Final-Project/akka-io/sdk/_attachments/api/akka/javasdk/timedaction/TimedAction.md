---
description: 'declaration: package: akka.javasdk.timedaction, class: TimedAction,
  interface: Effect'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:43Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/TimedAction.Effect.html
title: TimedAction.Effect
---

# TimedAction.Effect

> **Summary:** declaration: package: akka.javasdk.timedaction, class: TimedAction, interface: Effect

## Content

Package [akka.javasdk.timedaction](package-summary.html)
# Interface TimedAction.Effect

Enclosing class:
`[TimedAction](TimedAction.html "class in akka.javasdk.timedaction")`

---

public static interface TimedAction.Effect
An Effect is a description of what the runtime needs to do after the command is handled. You
 can think of it as a set of instructions you are passing to the runtime, which will process the
 instructions on your behalf.

 Each component defines its own effects, which are a set of predefined operations that match
 the capabilities of that component.

 

An TimedAction Effect can either:

 

- return Done to confirm that the command was processed successfully
- return an error message

- ## Nested Class Summary

Nested Classes

Modifier and Type
Interface
Description
`static interface`
`[TimedAction.Effect.Builder](TimedAction.Effect.Builder.html "interface in akka.javasdk.timedaction")`

Construct the effect that is returned by the command handler.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/TimedAction.Effect.Builder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/TimedAction.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/TimedAction.Effect.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/TimedAction.Effect.html)*