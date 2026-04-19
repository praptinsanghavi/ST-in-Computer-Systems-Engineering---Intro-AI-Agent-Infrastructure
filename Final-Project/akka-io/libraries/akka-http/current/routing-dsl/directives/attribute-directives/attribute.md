---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:18Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/attribute-directives/attribute.html
title: attribute • Akka HTTP
---

# attribute • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# attribute

## Signature

```
def attribute[T](key: AttributeKey[T]): Directive1[T]
```

## Description

Extracts the value of the request [attribute](../../../common/http-model.html#attributes) with the given key.

If no attribute is found for the given key the request is rejected with a [`MissingAttributeRejection`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingAttributeRejection.html "akka.http.javadsl.server.MissingAttributeRejection")[`MissingAttributeRejection`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MissingAttributeRejection.html "akka.http.scaladsl.server.MissingAttributeRejection").

If the attribute is expected to be missing in some cases or to customize handling when the header is missing use the [optionalAttribute](optionalAttribute.html) directive instead.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/AttributeDirectivesExamplesSpec.scala#L17-L31 "Go to snippet source")val userId = AttributeKey[String]("user-id")

val route =
  attribute(userId) { userId =>
    complete(s"The user is $userId")
  }

// tests:
Get("/") ~> addAttribute(userId, "Joe42") ~> route ~> check {
  responseAs[String] shouldEqual "The user is Joe42"
}

Get("/") ~> Route.seal(route) ~> check {
  status shouldEqual InternalServerError
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/AttributeDirectivesExamplesTest.java#L19-L30 "Go to snippet source")AttributeKey<String> userId = AttributeKey.create("user-id", String.class);

final Route route = attribute(userId, id ->
  complete("The user is " + id)
);

// tests:
testRoute(route).run(HttpRequest.GET("/").addAttribute(userId, "Joe42"))
  .assertEntity("The user is Joe42");

testRoute(route).run(HttpRequest.GET("/"))
  .assertStatusCode(StatusCodes.INTERNAL_SERVER_ERROR);
```

## Code Examples

### Example 1: Signature

```scala
def attribute[T](key: AttributeKey[T]): Directive1[T]
```

### Example 2: Example

```scala
val userId = AttributeKey[String]("user-id")

val route =
  attribute(userId) { userId =>
    complete(s"The user is $userId")
  }

// tests:
Get("/") ~> addAttribute(userId, "Joe42") ~> route ~> check {
  responseAs[String] shouldEqual "The user is Joe42"
}

Get("/") ~> Route.seal(route) ~> check {
  status shouldEqual InternalServerError
}
```

### Example 3: Example

```java
AttributeKey<String> userId = AttributeKey.create("user-id", String.class);

final Route route = attribute(userId, id ->
  complete("The user is " + id)
);

// tests:
testRoute(route).run(HttpRequest.GET("/").addAttribute(userId, "Joe42"))
  .assertEntity("The user is Joe42");

testRoute(route).run(HttpRequest.GET("/"))
  .assertStatusCode(StatusCodes.INTERNAL_SERVER_ERROR);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/MissingAttributeRejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/MissingAttributeRejection.html
- https://doc.akka.io/libraries/akka-http/current/common/http-model.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/attribute-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/attribute-directives/optionalAttribute.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/attribute-directives/attribute.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/attribute-directives/attribute.html)*