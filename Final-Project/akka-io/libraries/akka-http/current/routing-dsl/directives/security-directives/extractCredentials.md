---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:40Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/security-directives/extractCredentials.html
title: extractCredentials • Akka HTTP
---

# extractCredentials • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractCredentials

## Signature

```
def extractCredentials: Directive1[Option[HttpCredentials]]
```

## Description

Extracts the potentially present [`HttpCredentials`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCredentials.html "akka.http.javadsl.model.headers.HttpCredentials")[`HttpCredentials`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCredentials.html "akka.http.scaladsl.model.headers.HttpCredentials") provided with the request’s [`Authorization`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Authorization.html "akka.http.javadsl.model.headers.Authorization")[`Authorization`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Authorization.html "akka.http.scaladsl.model.headers.Authorization") header, which can be then used to implement some custom authentication or authorization logic.

See [Credentials and password timing attacks](index.html#credentials-and-timing-attacks) for details about verifying the secret.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/SecurityDirectivesExamplesSpec.scala#L322-L341 "Go to snippet source")val route =
  extractCredentials { creds =>
    complete {
      creds match {
        case Some(c) => "Credentials: " + c
        case _       => "No credentials"
      }
    }
  }

// tests:
val johnsCred = BasicHttpCredentials("John", "p4ssw0rd")
Get("/") ~> addCredentials(johnsCred) ~> // adds Authorization header
  route ~> check {
    responseAs[String] shouldEqual "Credentials: Basic Sm9objpwNHNzdzByZA=="
  }

Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "No credentials"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/SecurityDirectivesExamplesTest.java#L84-L424 "Go to snippet source")import akka.http.javadsl.model.headers.HttpCredentials;

import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractCredentials;

final Route route = extractCredentials(optCreds -> {
  if (optCreds.isPresent()) {
    return complete("Credentials: " + optCreds.get());
  } else {
    return complete("No credentials");
  }
});

// tests:
final HttpCredentials johnsCred =
  BasicHttpCredentials.createBasicHttpCredentials("John", "p4ssw0rd");
testRoute(route).run(HttpRequest.GET("/").addCredentials(johnsCred))
  .assertEntity("Credentials: Basic Sm9objpwNHNzdzByZA==");

testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("No credentials");
```

## Code Examples

### Example 1: Signature

```scala
def extractCredentials: Directive1[Option[HttpCredentials]]
```

### Example 2: Example

```scala
val route =
  extractCredentials { creds =>
    complete {
      creds match {
        case Some(c) => "Credentials: " + c
        case _       => "No credentials"
      }
    }
  }

// tests:
val johnsCred = BasicHttpCredentials("John", "p4ssw0rd")
Get("/") ~> addCredentials(johnsCred) ~> // adds Authorization header
  route ~> check {
    responseAs[String] shouldEqual "Credentials: Basic Sm9objpwNHNzdzByZA=="
  }

Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "No credentials"
}
```

### Example 3: Example

```java
import akka.http.javadsl.model.headers.HttpCredentials;

import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.extractCredentials;

final Route route = extractCredentials(optCreds -> {
  if (optCreds.isPresent()) {
    return complete("Credentials: " + optCreds.get());
  } else {
    return complete("No credentials");
  }
});

// tests:
final HttpCredentials johnsCred =
  BasicHttpCredentials.createBasicHttpCredentials("John", "p4ssw0rd");
testRoute(route).run(HttpRequest.GET("/").addCredentials(johnsCred))
  .assertEntity("Credentials: Basic Sm9objpwNHNzdzByZA==");

testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("No credentials");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Authorization.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCredentials.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/Authorization.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCredentials.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/security-directives/authorizeAsync.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/security-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/websocket-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/security-directives/extractCredentials.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/security-directives/extractCredentials.html)*