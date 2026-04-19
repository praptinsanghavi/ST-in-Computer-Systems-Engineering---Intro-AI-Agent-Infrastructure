---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.sse
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:06:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/sse/index.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.sse
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.sse

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.marshalling.sse

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/marshalling/index.html "Permalink")  package [marshalling](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/marshalling/sse/index.html "Permalink")  package sseDefinition Classes[marshalling](../index.html)
- [EventStreamMarshalling](EventStreamMarshalling.html "Mixing in this trait lets a source of ServerSentEvents be marshalled to a HttpEntity and hence as a HttpResponse.")
p[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[marshalling](../index.html)

# sse[**](../../../../../akka/http/scaladsl/marshalling/sse/index.html "Permalink")

#### package sse

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html "Permalink")  trait [EventStreamMarshalling](EventStreamMarshalling.html "Mixing in this trait lets a source of ServerSentEvents be marshalled to a HttpEntity and hence as a HttpResponse.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Mixing in this trait lets a source of ServerSentEvents be marshalled to a `HttpEntity` and hence as a
`HttpResponse`.

Mixing in this trait lets a source of ServerSentEvents be marshalled to a `HttpEntity` and hence as a
`HttpResponse`.

Annotations@ApiMayChange()
### Value Members

1. [**](../../../../../akka/http/scaladsl/marshalling/sse/EventStreamMarshalling$.html "Permalink")  object [EventStreamMarshalling](EventStreamMarshalling$.html "Importing EventStreamMarshalling.toEventStream lets a source of ServerSentEvents be marshalled to a HttpEntity and hence as a HttpResponse.") extends [EventStreamMarshalling](EventStreamMarshalling.html)Importing [EventStreamMarshalling.toEventStream](EventStreamMarshalling$.html#toEventStream:akka.http.scaladsl.marshalling.ToEntityMarshaller[akka.stream.scaladsl.Source[akka.http.scaladsl.model.sse.ServerSentEvent,Any]]) lets a source of ServerSentEvents be marshalled to a
`HttpEntity` and hence as a `HttpResponse`.

Importing [EventStreamMarshalling.toEventStream](EventStreamMarshalling$.html#toEventStream:akka.http.scaladsl.marshalling.ToEntityMarshaller[akka.stream.scaladsl.Source[akka.http.scaladsl.model.sse.ServerSentEvent,Any]]) lets a source of ServerSentEvents be marshalled to a
`HttpEntity` and hence as a `HttpResponse`.

Annotations@ApiMayChange()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/sse/EventStreamMarshalling$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/sse/EventStreamMarshalling.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/sse/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/sse/index.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/sse/index.html)*