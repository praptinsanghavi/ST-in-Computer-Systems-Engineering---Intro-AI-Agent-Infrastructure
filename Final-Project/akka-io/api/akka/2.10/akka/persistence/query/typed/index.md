---
description: Akka 2.10.17 - akka.persistence.query.typed
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:12:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/typed/index.html
title: Akka 2.10.17 - akka.persistence.query.typed
---

# Akka 2.10.17 - akka.persistence.query.typed

> **Summary:** Akka 2.10.17 - akka.persistence.query.typed

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/query/index.html "Permalink")  package [query](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/query/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[query](../index.html)
- [**](../../../../akka/persistence/query/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[query](../index.html)
- [**](../../../../akka/persistence/query/journal/index.html "Permalink")  package [journal](../journal/index.html)Definition Classes[query](../index.html)
- [**](../../../../akka/persistence/query/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[query](../index.html)
- [**](../../../../akka/persistence/query/typed/index.html "Permalink")  package typedDefinition Classes[query](../index.html)
- [**](../../../../akka/persistence/query/typed/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
- [**](../../../../akka/persistence/query/typed/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
- [EventEnvelope](EventEnvelope.html "Event wrapper adding meta data for the events in the result stream of akka.persistence.query.typed.scaladsl.EventsBySliceQuery query, or similar queries.")
- [EventsBySliceFirehoseReadJournalProvider](EventsBySliceFirehoseReadJournalProvider.html)
p[akka](../../../index.html).[persistence](../../index.html).[query](../index.html)

# typed[**](../../../../akka/persistence/query/typed/index.html "Permalink")

#### package typed

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../../../akka/persistence/query/typed/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
2. [**](../../../../akka/persistence/query/typed/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
### Type Members

1. [**](../../../../akka/persistence/query/typed/EventEnvelope.html "Permalink") final  class [EventEnvelope](EventEnvelope.html "Event wrapper adding meta data for the events in the result stream of akka.persistence.query.typed.scaladsl.EventsBySliceQuery query, or similar queries.")\[Event] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Event wrapper adding meta data for the events in the result stream of
[akka.persistence.query.typed.scaladsl.EventsBySliceQuery](scaladsl/EventsBySliceQuery.html) query, or similar queries.

Event wrapper adding meta data for the events in the result stream of
[akka.persistence.query.typed.scaladsl.EventsBySliceQuery](scaladsl/EventsBySliceQuery.html) query, or similar queries.

If the `event` is not defined it has not been loaded yet. It can be loaded with
[akka.persistence.query.typed.scaladsl.LoadEventQuery](scaladsl/LoadEventQuery.html).

The `timestamp` is the time the event was stored, in milliseconds since midnight, January 1, 1970 UTC (same as
`System.currentTimeMillis`).

It is an improved `EventEnvelope` compared to [akka.persistence.query.EventEnvelope](../EventEnvelope.html).
2. [**](../../../../akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html "Permalink") final  class [EventsBySliceFirehoseReadJournalProvider](EventsBySliceFirehoseReadJournalProvider.html) extends [ReadJournalProvider](../ReadJournalProvider.html)
### Value Members

1. [**](../../../../akka/persistence/query/typed/EventEnvelope$.html "Permalink")  object [EventEnvelope](EventEnvelope$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/ReadJournalProvider.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/index.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/internal/index.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/javadsl/index.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/journal/index.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/scaladsl/index.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/typed/EventEnvelope$.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/typed/EventsBySliceFirehoseReadJournalProvider.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/typed/index.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/typed/javadsl/index.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/typed/scaladsl/LoadEventQuery.html
- https://doc.akka.io/api/akka/2.10/akka/persistence/query/typed/scaladsl/index.html
- https://doc.akka.io/api/akka/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/persistence/query/typed/index.html](https://doc.akka.io/api/akka/2.10/akka/persistence/query/typed/index.html)*