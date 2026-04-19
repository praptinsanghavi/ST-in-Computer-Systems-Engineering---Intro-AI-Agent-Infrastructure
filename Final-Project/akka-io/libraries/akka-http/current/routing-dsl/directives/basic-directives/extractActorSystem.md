---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:21:48Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractActorSystem.html
title: extractActorSystem • Akka HTTP
---

# extractActorSystem • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractActorSystem

## Signature

```
def extractActorSystem: Directive1[ActorSystem] = extract { ctx
```

## Description

Extracts the [`ActorSystem`](https://doc.akka.io/api/akka/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem") from the [`RequestContext`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html "akka.http.javadsl.server.RequestContext")[`RequestContext`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html "akka.http.scaladsl.server.RequestContext"), which can be useful when the external API in your route needs one.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L896-L903 "Go to snippet source")val route = extractActorSystem { actorSystem =>
  complete(s"Actor System extracted, hash=${actorSystem.hashCode()}")
}

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual s"Actor System extracted, hash=${system.hashCode()}"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L256-L1116 "Go to snippet source")import static akka.http.javadsl.server.Directives.extractActorSystem;

final Route route = extractActorSystem(actorSystem ->
  complete("Actor System extracted, hash=" + actorSystem.hashCode())
);

// tests:
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("Actor System extracted, hash=" + system().hashCode());
```

## Code Examples

### Example 1: Signature

```scala
def extractActorSystem: Directive1[ActorSystem] = extract { ctx
```

### Example 2: Example

```scala
val route = extractActorSystem { actorSystem =>
  complete(s"Actor System extracted, hash=${actorSystem.hashCode()}")
}

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual s"Actor System extracted, hash=${system.hashCode()}"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.extractActorSystem;

final Route route = extractActorSystem(actorSystem ->
  complete("Actor System extracted, hash=" + actorSystem.hashCode())
);

// tests:
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("Actor System extracted, hash=" + system().hashCode());
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extract.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractDataBytes.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractActorSystem.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractActorSystem.html)*