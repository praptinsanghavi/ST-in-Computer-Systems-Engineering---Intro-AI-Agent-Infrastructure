---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:37Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/migration-guide/migration-from-old-http-javadsl.html
title: Migration Guide from old HTTP JavaDSL • Akka HTTP
---

# Migration Guide from old HTTP JavaDSL • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Migration Guide from “old” HTTP JavaDSL

The so\-called “old” JavaDSL for Akka HTTP was initially developed during the project’s experimental phase, and thanks to multiple user comments and contributions we were able to come up with a more Java 8 “feel”, which at the same time is also closer to the existing ScalaDSL.

The previous DSL has been entirely removed and replaced with the the so\-called “new” one. Upgrading to the new DSL is **highly encouraged** since the old one not only was rather hard to work with, it actually was not possible to express many typical use\-cases using it.

The most major changes include:

## HttpApp is gone

We removed [`HttpApp`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/HttpApp.html "akka.http.javadsl.server.HttpApp")[`HttpApp`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/HttpApp.html "akka.http.scaladsl.server.HttpApp"), which was a helper class containing a `main()` implementation, as we would like to encourage understanding how the various elements of the API fit together.

Instead developers should start applications “manually”, by converting a [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route") to a [`Flow<HttpRequest, HttpResponse, ?>`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow[HttpRequest, HttpResponse, ?]`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") using the `Route.flow` method. For examples of full apps refer to [Route Testkit](../routing-dsl/testkit.html).

## `RequestVal` is gone

The old API heavily relied on the concept of “request values” which could be used to extract a value from a request context.

Based on community feedback and our own experience we found them too hard to work with in more complex settings. The concept of a request value has been completely removed, and replaced with proper “directives”, exactly like in the ScalaDSL.

**Previously**:

```
RequestVal<Host> host = Headers.byClass(Host.class).instance();

final Route route =
  route(
    handleWith1(host, (ctx, h) ->
      ctx.complete(String.format("Host header was: %s", h.host()))
    )
  );

```

**Now**:

```
final Route route =
  headerValueByType(Host.class, host -> complete("Host was: " + host));

```

## All of ScalaDSL routing has corresponding JavaDSL

Both [`Route`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html#Route=akka.http.scaladsl.server.RequestContext=%3Escala.concurrent.Future[akka.http.scaladsl.server.RouteResult] "akka.http.scaladsl.server")[`Route`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html "akka.http.javadsl.server.Route"), [`RouteResult`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResult.html "akka.http.javadsl.server.RouteResult")[`RouteResult`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html "akka.http.scaladsl.server.RouteResult") and other important core concepts such as `Rejections` are now modeled 1:1 with Scala, making is much simpler to understand one API based on the other one – tremendously useful when learning about some nice pattern from blogs which used Scala, yet need to apply it in Java and the other way around.

It is now possible to implement marshallers using Java. Refer to [Marshalling](../common/marshalling.html) \& [Unmarshalling](../common/unmarshalling.html) for details.

## Some complete\* overloads changed to completeOK\*

In JavaDSL when complete is called with only an entity, the `OK` response code is *assumed*, to make this more explicit these methods contain the word `OK` in them.

This has been made more consistent than previously, across all overloads and Future\-versions of these APIs.

## Migration help

For Lightbend subscription owners it is possible to reach out to the core team for help in the migration by asking specific questions via the [Akka customer portal](https://portal.akka.io/account/login).

## Code Examples

### Example 1: RequestValis gone

```java
RequestVal<Host> host = Headers.byClass(Host.class).instance();

final Route route =
  route(
    handleWith1(host, (ctx, h) ->
      ctx.complete(String.format("Host header was: %s", h.host()))
    )
  );
```

### Example 2: RequestValis gone

```java
final Route route =
  headerValueByType(Host.class, host -> complete("Host was: " + host));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResult.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-http/current/common/marshalling.html
- https://doc.akka.io/libraries/akka-http/current/common/unmarshalling.html
- https://doc.akka.io/libraries/akka-http/current/compatibility-guidelines.html
- https://doc.akka.io/libraries/akka-http/current/migration-guide/migration-from-spray.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/testkit.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/migration-guide/migration-from-old-http-javadsl.html](https://doc.akka.io/libraries/akka-http/current/migration-guide/migration-from-old-http-javadsl.html)*