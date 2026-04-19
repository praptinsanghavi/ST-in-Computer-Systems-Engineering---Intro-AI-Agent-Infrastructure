---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:58:47Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/index.html
title: FileAndResourceDirectives • Akka HTTP
---

# FileAndResourceDirectives • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# FileAndResourceDirectives

Like the [RouteDirectives](../route-directives/index.html) the [`FileAndResourceDirectives`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/FileAndResourceDirectives.html "akka.http.javadsl.server.directives.FileAndResourceDirectives")[`FileAndResourceDirectives`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives.html "akka.http.scaladsl.server.directives.FileAndResourceDirectives") are somewhat special in akka\-http’s routing DSL. Most other directives wrap an inner route and are therefore used as inner nodes of the route tree. These directives, instead, are indeed instance of [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route"), i.e. **leaves** of the route tree that handle a request themselves without passing it on to an inner route.

So in most cases the inner\-most element of a route structure branch is one of the [RouteDirectives](../route-directives/index.html) or [`FileAndResourceDirectives`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/FileAndResourceDirectives.html "akka.http.javadsl.server.directives.FileAndResourceDirectives")[`FileAndResourceDirectives`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives.html "akka.http.scaladsl.server.directives.FileAndResourceDirectives").

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/FileAndResourceDirectives.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/execution-directives/handleRejections.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/getFromBrowseableDirectories.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/index.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/index.html)*