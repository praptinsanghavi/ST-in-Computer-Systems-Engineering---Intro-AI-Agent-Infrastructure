---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.model.sse
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:50:48Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/sse/index.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.model.sse
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.model.sse

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.model.sse

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/http/index.html "Permalink")  package [http](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](../../index.html)Definition Classes[http](../../../index.html)
- [**](../../../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](../index.html)Definition Classes[scaladsl](../../index.html)
- [**](../../../../../akka/http/scaladsl/model/headers/index.html "Permalink")  package [headers](../headers/index.html)Definition Classes[model](../index.html)
- [**](../../../../../akka/http/scaladsl/model/http2/index.html "Permalink")  package [http2](../http2/index.html)Definition Classes[model](../index.html)
- [**](../../../../../akka/http/scaladsl/model/sse/index.html "Permalink")  package sseDefinition Classes[model](../index.html)
- [ServerSentEvent](ServerSentEvent.html "Representation of a server-sent event.")
- [**](../../../../../akka/http/scaladsl/model/ws/index.html "Permalink")  package [ws](../ws/index.html)Definition Classes[model](../index.html)
p[akka](../../../../index.html).[http](../../../index.html).[scaladsl](../../index.html).[model](../index.html)

# sse[**](../../../../../akka/http/scaladsl/model/sse/index.html "Permalink")

#### package sse

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent.html "Permalink") final  case class [ServerSentEvent](ServerSentEvent.html "Representation of a server-sent event.")(data: String, eventType: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String] \= None, id: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String] \= None, retry: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)] \= None) extends [javadsl.model.sse.ServerSentEvent](../../../javadsl/model/sse/ServerSentEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRepresentation of a server\-sent event.

Representation of a server\-sent event. By default akka\-http uses events with an empty data field as a heartbeat that is
ignored on reception. Set `akka.http.sse.emit-empty-events` can be used to change that default behavior.

datadata, may span multiple lines

eventTypeoptional type, must not contain \\n or \\r

idoptional id, must not contain \\n or \\r

retryoptional reconnection delay in milliseconds
### Value Members

1. [**](../../../../../akka/http/scaladsl/model/sse/ServerSentEvent$.html "Permalink")  object [ServerSentEvent](ServerSentEvent$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/sse/ServerSentEvent.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/http2/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/sse/ServerSentEvent$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/sse/ServerSentEvent.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/sse/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/ws/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/sse/index.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/sse/index.html)*