---
description: 'declaration: package: akka.javasdk.consumer, class: Consumer, interface:
  Effect'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:30Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/Consumer.Effect.html
title: Consumer.Effect
---

# Consumer.Effect

> **Summary:** declaration: package: akka.javasdk.consumer, class: Consumer, interface: Effect

## Content

Package [akka.javasdk.consumer](package-summary.html)
# Interface Consumer.Effect

Enclosing class:
`[Consumer](Consumer.html "class in akka.javasdk.consumer")`

---

public static interface Consumer.Effect
An Effect is a description of what the runtime needs to do after a message is handled. You can
 think of it as a set of instructions you are passing to the runtime, which will process the
 instructions on your behalf.

 Each component defines its own effects, which are a set of predefined operations that match
 the capabilities of that component.

 

A Consumer Effect can either:

 

- return a message to be published to a Topic (when the Consumer is also a producer)
- return Done to indicate that the message was processed successfully
- ignore the message and continue processing the next message

For more details, refer to the Declarative Effects documentation.

- ## Nested Class Summary

Nested Classes

Modifier and Type
Interface
Description
`static interface`
`[Consumer.Effect.Builder](Consumer.Effect.Builder.html "interface in akka.javasdk.consumer")`

Builder for constructing Consumer effects that describe what the runtime should do after
 message processing.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/Consumer.Effect.Builder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/Consumer.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/Consumer.Effect.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/consumer/Consumer.Effect.html)*