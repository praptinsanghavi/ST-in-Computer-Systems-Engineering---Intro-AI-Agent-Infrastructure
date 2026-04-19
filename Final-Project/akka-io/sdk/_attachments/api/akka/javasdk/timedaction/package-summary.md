---
description: 'declaration: package: akka.javasdk.timedaction'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:29Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/package-summary.html
title: akka.javasdk.timedaction
---

# akka.javasdk.timedaction

> **Summary:** declaration: package: akka.javasdk.timedaction

## Content

# Package akka.javasdk.timedaction

---

package akka.javasdk.timedaction

[`TimedAction`](TimedAction.html "class in akka.javasdk.timedaction") component.

- Related Packages

Package
Description
[akka.javasdk](../package-summary.html)

Root package of the Akka SDK.
- Class
Description
[CommandContext](CommandContext.html "interface in akka.javasdk.timedaction")

Context for action calls.

[CommandEnvelope](CommandEnvelope.html "interface in akka.javasdk.timedaction")\<T\>

A command envelope.

[TimedAction](TimedAction.html "class in akka.javasdk.timedaction")

TimedAction is stateless component that can be used together with a [`TimerScheduler`](../timer/TimerScheduler.html "interface in akka.javasdk.timer") to
 schedule an action.

[TimedAction.Effect](TimedAction.Effect.html "interface in akka.javasdk.timedaction")

An Effect is a description of what the runtime needs to do after the command is handled.

[TimedAction.Effect.Builder](TimedAction.Effect.Builder.html "interface in akka.javasdk.timedaction")

Construct the effect that is returned by the command handler.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/CommandContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/CommandEnvelope.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/TimedAction.Effect.Builder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/TimedAction.Effect.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/TimedAction.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timer/TimerScheduler.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/package-summary.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/timedaction/package-summary.html)*