---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:23:43Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/client-side/index.html
title: 5. Client API • Akka HTTP
---

# 5. Client API • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# 5\. Client API

All client\-side functionality of Akka HTTP, for consuming HTTP\-based services offered by other endpoints, is currently provided by the `akka-http-core` module.

It is recommended to first read the [Implications of the streaming nature of Request/Response Entities](../implications-of-streaming-http-entity.html) section, as it explains the underlying full\-stack streaming concepts, which may be unexpected when coming from a background with non\-“streaming first” HTTP Clients.

All of the APIs deal with [`HttpRequest` and `HttpResponse`](request-and-response.html) objects.

Depending on your application’s specific needs you can choose from three different API levels:

[Request\-Level Client\-Side API](request-level.html)
for letting Akka HTTP perform all connection management. Recommended for most usages.
[Host\-Level Client\-Side API](host-level.html)
for letting Akka HTTP manage a connection\-pool to *one specific* host/port endpoint. Recommended when the user can supply a [`Source<HttpRequest, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source[HttpRequest, _]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") with requests to run against a single host over multiple pooled connections.
[Connection\-Level Client\-Side API](connection-level.html)
for full control over when HTTP connections are opened/closed and how requests are scheduled across them. Only recommended for particular use cases.

You can interact with different API levels at the same time and, independently of which API level you choose, Akka HTTP will happily handle many thousand concurrent connections to a single or many different hosts.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-http/current/client-side/configuration.html
- https://doc.akka.io/libraries/akka-http/current/client-side/connection-level.html
- https://doc.akka.io/libraries/akka-http/current/client-side/host-level.html
- https://doc.akka.io/libraries/akka-http/current/client-side/request-and-response.html
- https://doc.akka.io/libraries/akka-http/current/client-side/request-level.html
- https://doc.akka.io/libraries/akka-http/current/implications-of-streaming-http-entity.html
- https://doc.akka.io/libraries/akka-http/current/server-side/http2.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/client-side/index.html](https://doc.akka.io/libraries/akka-http/current/client-side/index.html)*