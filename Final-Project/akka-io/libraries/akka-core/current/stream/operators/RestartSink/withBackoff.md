---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:50Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartSink/withBackoff.html
title: RestartSink.withBackoff • Akka core
---

# RestartSink.withBackoff • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# RestartSink.withBackoff

Wrap the given [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") with a [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") that will restart it when it fails or complete using an exponential backoff.

[Error handling](../index.html#error-handling)

## Signature

[`RestartSink.withBackoff`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RestartSink.html#withBackoff(akka.stream.RestartSettings,akka.japi.function.Creator) "akka.stream.javadsl.RestartSink")[`RestartSink.withBackoff`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RestartSink$.html#withBackoff[T](settings:akka.stream.RestartSettings)(sinkFactory:()=>akka.stream.scaladsl.Sink[T,_]):akka.stream.scaladsl.Sink[T,akka.NotUsed] "akka.stream.scaladsl.RestartSink")

## Description

Wrap the given [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") with a [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") that will restart it when it completes or fails using exponential backoff. The backoff resets back to `minBackoff` if there hasn’t been a restart within `maxRestartsWithin` (which defaults to `minBackoff`).

This [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") will not cancel as long as maxRestarts is not reached, since cancellation by the wrapped [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") is handled by restarting it. The wrapped [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") can however be completed by feeding a completion or error into this [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink"). When that happens, the [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink"), if currently running, will terminate and will not be restarted. This can be triggered simply by the upstream completing, or externally by introducing a [KillSwitch](../../stream-dynamic.html#controlling-stream-completion-with-killswitch) right before this [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") in the graph.

The restart process is inherently lossy, since there is no coordination between cancelling and the sending of messages. When the wrapped [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") does cancel, this [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") will backpressure, however any elements already sent may have been lost.

This uses the same exponential backoff algorithm as [`BackoffOpts`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/BackoffOpts$.html "akka.pattern.BackoffOpts")[`BackoffOpts`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOpts.html "akka.pattern.BackoffOpts").

See also: 

- [RestartSource.withBackoff](../RestartSource/withBackoff.html)
- [RestartSource.onFailuresWithBackoff](../RestartSource/onFailuresWithBackoff.html)
- [RestartFlow.onFailuresWithBackoff](../RestartFlow/onFailuresWithBackoff.html)
- [RestartFlow.withBackoff](../RestartFlow/withBackoff.html)

## Reactive Streams semantics

**backpressures** during backoff and when the wrapped sink backpressures

**completes** when upstream completes or when `maxRestarts` are reached within the given time limit

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/BackoffOpts$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RestartSink$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOpts.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RestartSink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartFlow/onFailuresWithBackoff.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartFlow/withBackoff.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartSource/onFailuresWithBackoff.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartSource/withBackoff.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/RetryFlow/withBackoff.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-dynamic.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartSink/withBackoff.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartSink/withBackoff.html)*