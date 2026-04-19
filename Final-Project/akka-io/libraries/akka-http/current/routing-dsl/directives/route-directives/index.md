---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:58:41Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/index.html
title: RouteDirectives • Akka HTTP
---

# RouteDirectives • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# RouteDirectives

The [`RouteDirectives`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/RouteDirectives.html "akka.http.javadsl.server.directives.RouteDirectives")[`RouteDirectives`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/RouteDirectives.html "akka.http.scaladsl.server.directives.RouteDirectives") have a special role in akka\-http’s routing DSL. Contrary to all other directives (except most [FileAndResourceDirectives](../file-and-resource-directives/index.html)) they do not produce instances of type `Directive[L <: HList]` but rather “plain” routes of type [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route"). The reason is that the [`RouteDirectives`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/RouteDirectives.html "akka.http.javadsl.server.directives.RouteDirectives")[`RouteDirectives`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/RouteDirectives.html "akka.http.scaladsl.server.directives.RouteDirectives") are not meant for wrapping an inner route (like most other directives, as intermediate\-level elements of a route structure, do) but rather form the leaves of the actual route structure **leaves**.

So in most cases the inner\-most element of a route structure branch is one of the [`RouteDirectives`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/RouteDirectives.html "akka.http.javadsl.server.directives.RouteDirectives")[`RouteDirectives`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/RouteDirectives.html "akka.http.scaladsl.server.directives.RouteDirectives") (or [FileAndResourceDirectives](../file-and-resource-directives/index.html)):

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/directives/RouteDirectives.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/directives/RouteDirectives.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/file-and-resource-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/respond-with-directives/respondWithHeaders.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/complete.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/index.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/route-directives/index.html)*