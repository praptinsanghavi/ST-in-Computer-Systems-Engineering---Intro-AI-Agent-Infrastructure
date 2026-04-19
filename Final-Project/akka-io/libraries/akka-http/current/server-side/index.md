---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:11:18Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/server-side/index.html
title: 4. Server API • Akka HTTP
---

# 4. Server API • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# 4\. Server API

Akka HTTP also provides an embedded, [Reactive\-Streams](https://www.reactive-streams.org/)\-based, fully asynchronous HTTP/1\.1 server implemented on top of [Streams](https://doc.akka.io/libraries/akka-core/2.10/stream/index.html).

It supports the following features:

- Full support for [HTTP persistent connections](https://en.wikipedia.org/wiki/HTTP_persistent_connection)
- Full support for asynchronous HTTP streaming including “chunked” transfer encoding accessible through an idiomatic API
- [WebSocket support](websocket-support.html)
- Optional [SSL/TLS encryption](server-https-support.html)
- Optional support for [HTTP pipelining](https://en.wikipedia.org/wiki/HTTP_pipelining)

The server\-side components of Akka HTTP are split into two layers:

[High\-level Server\-Side API](../routing-dsl/index.html)
Higher\-level functionality in the `akka-http` module which offers a very flexible “Routing DSL” for elegantly defining RESTful web services as well as functionality of typical web servers or frameworks, like deconstruction of URIs, content negotiation or static content serving.
[Core Server API](low-level-api.html)
The basic low\-level server implementation in the `akka-http-core` module.

Depending on your needs you can either use the low\-level API directly or rely on the high\-level [Routing DSL](../routing-dsl/index.html) which can make the definition of more complex service logic much easier. You can also interact with different API levels at the same time and, independently of which API level you choose Akka HTTP will happily serve many thousand concurrent connections to a single or many clients.

Note
It is recommended to read the [Implications of the streaming nature of Request/Response Entities](../implications-of-streaming-http-entity.html) section, as it explains the underlying full\-stack streaming concepts, which may be unexpected when coming from a background with non\-“streaming first” HTTP Servers.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/2.10/stream/index.html
- https://doc.akka.io/libraries/akka-http/current/common/caching.html
- https://doc.akka.io/libraries/akka-http/current/implications-of-streaming-http-entity.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/index.html
- https://doc.akka.io/libraries/akka-http/current/server-side/low-level-api.html
- https://doc.akka.io/libraries/akka-http/current/server-side/server-https-support.html
- https://doc.akka.io/libraries/akka-http/current/server-side/websocket-support.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/server-side/index.html](https://doc.akka.io/libraries/akka-http/current/server-side/index.html)*