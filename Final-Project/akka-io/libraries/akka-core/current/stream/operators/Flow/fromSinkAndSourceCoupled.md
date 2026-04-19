---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:33Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/fromSinkAndSourceCoupled.html
title: Flow.fromSinkAndSourceCoupled • Akka core
---

# Flow.fromSinkAndSourceCoupled • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Flow.fromSinkAndSourceCoupled

Allows coupling termination (cancellation, completion, erroring) of Sinks and Sources while creating a Flow between them.

[Flow operators composed of Sinks and Sources](../index.html#flow-operators-composed-of-sinks-and-sources)

## Signature

[`Flow.fromSinkAndSourceCoupled`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#fromSinkAndSourceCoupled(akka.stream.Graph,akka.stream.Graph) "akka.stream.javadsl.Flow")[`Flow.fromSinkAndSourceCoupled`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow$.html#fromSinkAndSourceCoupled[I,O](sink:akka.stream.Graph[akka.stream.SinkShape[I],_],source:akka.stream.Graph[akka.stream.SourceShape[O],_]):akka.stream.scaladsl.Flow[I,O,akka.NotUsed] "akka.stream.scaladsl.Flow")

## Description

See [Flow.fromSinkAndSource](fromSinkAndSource.html) for docs on the general workings and examples.

This operator only adds coupled termination to what `fromSinkAndSource` does: If the emitted `Flow` gets a cancellation, the `Source` is cancelled, however the Sink will also be completed. The table below illustrates the effects in detail:

| Returned Flow | Sink (in) | Source (out) |
| --- | --- | --- |
| cause: upstream (sink\-side) receives completion | effect: receives completion | effect: receives cancel |
| cause: upstream (sink\-side) receives error | effect: receives error | effect: receives cancel |
| cause: downstream (source\-side) receives cancel | effect: completes | effect: receives cancel |
| effect: cancels upstream, completes downstream | effect: completes | cause: signals complete |
| effect: cancels upstream, errors downstream | effect: receives error | cause: signals error or throws |
| effect: cancels upstream, completes downstream | cause: cancels | effect: receives cancel |

The order in which the *in* and *out* sides receive their respective completion signals is not defined, do not rely on its ordering.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/fromSinkAndSource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromSourceCompletionStage.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/fromSinkAndSourceCoupled.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/fromSinkAndSourceCoupled.html)*