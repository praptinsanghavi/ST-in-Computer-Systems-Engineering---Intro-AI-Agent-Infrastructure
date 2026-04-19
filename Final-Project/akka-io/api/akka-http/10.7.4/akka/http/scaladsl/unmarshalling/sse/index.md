---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.sse
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:08:06Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/sse/index.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.sse
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.sse

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.unmarshalling.sse

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")  package [unmarshalling](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/unmarshalling/sse/index.html "Permalink")  package sseDefinition Classes[unmarshalling](../index.html)
- [EventStreamParser](EventStreamParser$.html "Flow that converts raw byte string input into ServerSentEvents.")
- [EventStreamUnmarshalling](EventStreamUnmarshalling.html "Mixing in this trait lets a HttpEntity with a text/event-stream media type be unmarshalled to a source of ServerSentEvents.")
p[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[unmarshalling](../index.html)

# sse[**](../../../../../akka/http/scaladsl/unmarshalling/sse/index.html "Permalink")

#### package sse

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html "Permalink")  trait [EventStreamUnmarshalling](EventStreamUnmarshalling.html "Mixing in this trait lets a HttpEntity with a text/event-stream media type be unmarshalled to a source of ServerSentEvents.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Mixing in this trait lets a `HttpEntity` with a `text/event-stream` media type be unmarshalled to a source of
ServerSentEvents.

Mixing in this trait lets a `HttpEntity` with a `text/event-stream` media type be unmarshalled to a source of
ServerSentEvents.

The maximum size for parsing server\-sent events is 8KiB by default and can be customized by configuring
`akka.http.sse.max-event-size`. The maximum size for parsing lines of a server\-sent event is 4KiB by
default and can be customized by configuring `akka.http.sse.max-line-size`.

Annotations@ApiMayChange()
### Value Members

1. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamParser$.html "Permalink")  object [EventStreamParser](EventStreamParser$.html "Flow that converts raw byte string input into ServerSentEvents.")Flow that converts raw byte string input into ServerSentEvents.

Flow that converts raw byte string input into ServerSentEvents.

This API is made for use in non\-akka\-http clients, like Play's WSClient.

Annotations@ApiMayChange()
2. [**](../../../../../akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling$.html "Permalink")  object [EventStreamUnmarshalling](EventStreamUnmarshalling$.html "Importing EventStreamUnmarshalling.fromEventsStream lets an HttpEntity with a text/event-stream media type be unmarshalled to a source of ServerSentEvents.") extends [EventStreamUnmarshalling](EventStreamUnmarshalling.html)Importing [EventStreamUnmarshalling.fromEventsStream](EventStreamUnmarshalling$.html#fromEventsStream(settings:akka.http.scaladsl.settings.ServerSentEventSettings):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.stream.scaladsl.Source[akka.http.scaladsl.model.sse.ServerSentEvent,akka.NotUsed]]) lets an `HttpEntity` with a `text/event-stream` media type be
unmarshalled to a source of ServerSentEvents.

Importing [EventStreamUnmarshalling.fromEventsStream](EventStreamUnmarshalling$.html#fromEventsStream(settings:akka.http.scaladsl.settings.ServerSentEventSettings):akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller[akka.stream.scaladsl.Source[akka.http.scaladsl.model.sse.ServerSentEvent,akka.NotUsed]]) lets an `HttpEntity` with a `text/event-stream` media type be
unmarshalled to a source of ServerSentEvents.

The maximum size for parsing server\-sent events is 8KiB. The maximum size for parsing lines of a server\-sent event
is 4KiB. If you need to customize any of these, set the `akka.http.sse.max-event-size` and
`akka.http.sse.max-line-size` properties respectively.

Annotations@ApiMayChange()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/sse/EventStreamParser$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/sse/EventStreamUnmarshalling.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/sse/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/sse/index.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/sse/index.html)*