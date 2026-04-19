---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:45:11Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/troubleshooting/unsupported-http-method-pri.html
title: 'Unsupported HTTP method: PRI • Akka HTTP'
---

# Unsupported HTTP method: PRI • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Unsupported HTTP method: PRI

```
Illegal request, responding with status '501 Not Implemented': Unsupported HTTP method: PRI

```

This indicates that an HTTP/2 request was received, but the server was not correctly set up to handle those. You may have to:

- Make sure the [`akka.http.server.enable-http2` option](../server-side/http2.html#enable-http-2-support) is enabled
- Make sure you are running [at least JDK version 8u252](../server-side/http2.html)
- Make sure you are not using [`Http().bindAndHandle()`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/Http.html "akka.http.javadsl.Http")[`Http().bindAndHandle()`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$.html "akka.http.scaladsl.Http") or [`Http().newServerAt().bindFlow()`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ServerBuilder.html "akka.http.javadsl.ServerBuilder")[`Http().newServerAt().bindFlow()`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ServerBuilder.html "akka.http.scaladsl.ServerBuilder"), but [`Http().newServerAt().bind()`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ServerBuilder.html "akka.http.javadsl.ServerBuilder")[`Http().newServerAt().bind()`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ServerBuilder.html "akka.http.scaladsl.ServerBuilder").

## Code Examples

### Example 1: Unsupported HTTP method: PRI

```text
Illegal request, responding with status '501 Not Implemented': Unsupported HTTP method: PRI
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ServerBuilder.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/Http.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ServerBuilder.html
- https://doc.akka.io/libraries/akka-http/current/handling-blocking-operations-in-akka-http-routes.html
- https://doc.akka.io/libraries/akka-http/current/server-side/http2.html
- https://doc.akka.io/libraries/akka-http/current/troubleshooting/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/troubleshooting/unsupported-http-method-pri.html](https://doc.akka.io/libraries/akka-http/current/troubleshooting/unsupported-http-method-pri.html)*