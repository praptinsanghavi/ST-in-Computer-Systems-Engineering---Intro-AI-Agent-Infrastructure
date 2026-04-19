---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:57Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/host-directives/extractHost.html
title: extractHost • Akka HTTP
---

# extractHost • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractHost

Extract the hostname part of the `Host` request header and expose it as a `String` extraction to its inner route.

## Signature

```
def extractHost: Directive1[String]
```

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/HostDirectivesExamplesSpec.scala#L17-L26 "Go to snippet source")val route =
  extractHost { hn =>
    complete(s"Hostname: $hn")
  }

// tests:
Get() ~> Host("company.com", 9090) ~> route ~> check {
  status shouldEqual OK
  responseAs[String] shouldEqual "Hostname: company.com"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/HostDirectivesExamplesTest.java#L29-L76 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractHost;

final Route route = extractHost(hn -> 
    complete("Hostname: " + hn));

testRoute(route).run(HttpRequest.GET("/").addHeader(Host.create("company.com", 9090)))
    .assertEntity("Hostname: company.com");
```

## Code Examples

### Example 1: Signature

```scala
def extractHost: Directive1[String]
```

### Example 2: Example

```scala
val route =
  extractHost { hn =>
    complete(s"Hostname: $hn")
  }

// tests:
Get() ~> Host("company.com", 9090) ~> route ~> check {
  status shouldEqual OK
  responseAs[String] shouldEqual "Hostname: company.com"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractHost;


final Route route = extractHost(hn -> 
    complete("Hostname: " + hn));

testRoute(route).run(HttpRequest.GET("/").addHeader(Host.create("company.com", 9090)))
    .assertEntity("Hostname: company.com");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/host-directives/host.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/jwt-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/host-directives/extractHost.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/host-directives/extractHost.html)*