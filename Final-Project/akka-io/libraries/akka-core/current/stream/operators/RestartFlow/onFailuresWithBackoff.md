---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:47Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartFlow/onFailuresWithBackoff.html
title: RestartFlow.onFailuresWithBackoff • Akka core
---

# RestartFlow.onFailuresWithBackoff • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# RestartFlow.onFailuresWithBackoff

Wrap the given [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") with a [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") that will restart it when it fails using an exponential backoff. Notice that this [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") will not restart on completion of the wrapped flow.

[Error handling](../index.html#error-handling)

## Signature

[`RestartFlow.onFailuresWithBackoff`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RestartFlow.html#onFailuresWithBackoff(akka.stream.RestartSettings,akka.japi.function.Creator) "akka.stream.javadsl.RestartFlow")[`RestartFlow.onFailuresWithBackoff`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RestartFlow$.html#onFailuresWithBackoff[In,Out](settings:akka.stream.RestartSettings)(flowFactory:()=>akka.stream.scaladsl.Flow[In,Out,_]):akka.stream.scaladsl.Flow[In,Out,akka.NotUsed] "akka.stream.scaladsl.RestartFlow")

## Description

Wrap the given [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") with a [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") that will restart it when it fails using exponential backoff. The backoff resets back to `minBackoff` if there hasn’t been a restart within `maxRestartsWithin` (which defaults to `minBackoff` if max restarts).

This [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") will not emit any failure as long as maxRestarts is not reached. The failure of the wrapped [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") will be handled by restarting it. However, any termination signals sent to this [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") will terminate the wrapped [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow"), if it’s running, and then the [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") will be allowed to terminate without being restarted.

The restart process is inherently lossy, since there is no coordination between cancelling and the sending of messages. A termination signal from either end of the wrapped [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") will cause the other end to be terminated, and any in transit messages will be lost. During backoff, this [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") will backpressure.

This uses the same exponential backoff algorithm as [`BackoffOpts`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/BackoffOpts$.html "akka.pattern.BackoffOpts")[`BackoffOpts`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOpts.html "akka.pattern.BackoffOpts").

See also: 

- [RestartSource.withBackoff](../RestartSource/withBackoff.html)
- [RestartSource.onFailuresWithBackoff](../RestartSource/onFailuresWithBackoff.html)
- [RestartFlow.withBackoff](withBackoff.html)
- [RestartSink.withBackoff](../RestartSink/withBackoff.html)

## Reactive Streams semantics

**emits** when the wrapped flow emits

**backpressures** during backoff and when the wrapped flow backpressures

**completes** when the wrapped flow completes or `maxRestarts` are reached within the given time limit

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/BackoffOpts$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RestartFlow$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/BackoffOpts.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RestartFlow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartFlow/withBackoff.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartSink/withBackoff.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartSource/onFailuresWithBackoff.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartSource/withBackoff.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/orElse.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartFlow/onFailuresWithBackoff.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/RestartFlow/onFailuresWithBackoff.html)*