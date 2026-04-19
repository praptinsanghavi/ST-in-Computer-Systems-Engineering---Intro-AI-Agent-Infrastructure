---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:49Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartSource/withBackoff.html
title: RestartSource.withBackoff • Akka core
---

# RestartSource.withBackoff • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# RestartSource.withBackoff

Wrap the given [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") with a [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") that will restart it when it fails or completes using an exponential backoff.

[Error handling](../index.html#error-handling)

## Signature

[`RestartSource.withBackoff`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RestartSource.html#withBackoff(akka.stream.RestartSettings,akka.japi.function.Creator) "akka.stream.javadsl.RestartSource")[`RestartSource.withBackoff`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RestartSource$.html#withBackoff[T](settings:akka.stream.RestartSettings)(sourceFactory:()=>akka.stream.scaladsl.Source[T,_]):akka.stream.scaladsl.Source[T,akka.NotUsed] "akka.stream.scaladsl.RestartSource")

## Description

Wrap the given [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") with a [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") that will restart it when it completes or fails using exponential backoff. The backoff resets back to `minBackoff` if there hasn’t been a restart within `maxRestartsWithin` (which defaults to `minBackoff`).

This [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") will not emit a complete or fail as long as maxRestarts is not reached, since the completion or failure of the wrapped [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") is handled by restarting it. The wrapped [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") can however be cancelled by cancelling this [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source"). When that happens, the wrapped [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source"), if currently running, will be cancelled, and it will not be restarted. This can be triggered simply by the downstream cancelling, or externally by introducing a [KillSwitch](../../stream-dynamic.html#controlling-stream-completion-with-killswitch) right after this [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") in the graph.

This uses the same exponential backoff algorithm as [`BackoffOpts`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/BackoffOpts$.html "akka.pattern.BackoffOpts")[`BackoffOpts`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOpts.html "akka.pattern.BackoffOpts").

See also: 

- [RestartSource.onFailuresWithBackoff](onFailuresWithBackoff.html)
- [RestartFlow.onFailuresWithBackoff](../RestartFlow/onFailuresWithBackoff.html)
- [RestartFlow.withBackoff](../RestartFlow/withBackoff.html)
- [RestartSink.withBackoff](../RestartSink/withBackoff.html)

## Reactive Streams semantics

**emits** when the wrapped source emits

**backpressures** during backoff and when downstream backpressures

**completes** when `maxRestarts` are reached within the given time limit

**cancels** when downstream cancels

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/BackoffOpts$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RestartSource$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOpts.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RestartSource.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartFlow/onFailuresWithBackoff.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartFlow/withBackoff.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartSink/withBackoff.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartSource/onFailuresWithBackoff.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/wireTap.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-dynamic.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartSource/withBackoff.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartSource/withBackoff.html)*