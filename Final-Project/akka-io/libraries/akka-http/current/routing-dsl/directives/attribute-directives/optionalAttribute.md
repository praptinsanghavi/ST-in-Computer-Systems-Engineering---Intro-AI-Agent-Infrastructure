---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:47Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/attribute-directives/optionalAttribute.html
title: optionalAttribute • Akka HTTP
---

# optionalAttribute • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# optionalAttribute

## Signature

```
def optionalAttribute[T](key: AttributeKey[T]): Directive1[Option[T]]
```

## Description

Optionally extracts the value of the request [attribute](../../../common/http-model.html#attributes) with the given key.

The `optionalAttribute` directive is similar to the [attribute](attribute.html) directive but always extracts an `Option``Optional` value instead of rejecting the request if no matching attribute could be found.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/AttributeDirectivesExamplesSpec.scala#L36-L58 "Go to snippet source")val userId = AttributeKey[String]("user-id")

val route =
  optionalAttribute(userId) {
    case Some(userId) => complete(s"The user is $userId")
    case None         => complete(s"No user was provided")
  } ~ // can also be written as:
    optionalAttribute(userId) { userId =>
      complete {
        userId match {
          case Some(u) => s"The user is $u"
          case _       => "No user was provided"
        }
      }
    }

// tests:
Get("/") ~> addAttribute(userId, "Joe42") ~> route ~> check {
  responseAs[String] shouldEqual "The user is Joe42"
}
Get("/") ~> Route.seal(route) ~> check {
  responseAs[String] shouldEqual "No user was provided"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/AttributeDirectivesExamplesTest.java#L37-L51 "Go to snippet source")AttributeKey<String> userId = AttributeKey.create("user-id", String.class);

final Route route = optionalAttribute(userId, id -> {
  if (id.isPresent()) {
    return complete("The user is " + id.get());
  } else {
    return complete("No user was provided");
  }
});

// tests:
testRoute(route).run(HttpRequest.GET("/").addAttribute(userId, "Joe42"))
  .assertEntity("The user is Joe42");

testRoute(route).run(HttpRequest.GET("/")).assertEntity("No user was provided");
```

## Code Examples

### Example 1: Signature

```scala
def optionalAttribute[T](key: AttributeKey[T]): Directive1[Option[T]]
```

### Example 2: Example

```scala
val userId = AttributeKey[String]("user-id")

val route =
  optionalAttribute(userId) {
    case Some(userId) => complete(s"The user is $userId")
    case None         => complete(s"No user was provided")
  } ~ // can also be written as:
    optionalAttribute(userId) { userId =>
      complete {
        userId match {
          case Some(u) => s"The user is $u"
          case _       => "No user was provided"
        }
      }
    }

// tests:
Get("/") ~> addAttribute(userId, "Joe42") ~> route ~> check {
  responseAs[String] shouldEqual "The user is Joe42"
}
Get("/") ~> Route.seal(route) ~> check {
  responseAs[String] shouldEqual "No user was provided"
}
```

### Example 3: Example

```java
AttributeKey<String> userId = AttributeKey.create("user-id", String.class);

final Route route = optionalAttribute(userId, id -> {
  if (id.isPresent()) {
    return complete("The user is " + id.get());
  } else {
    return complete("No user was provided");
  }
});

// tests:
testRoute(route).run(HttpRequest.GET("/").addAttribute(userId, "Joe42"))
  .assertEntity("The user is Joe42");

testRoute(route).run(HttpRequest.GET("/")).assertEntity("No user was provided");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/common/http-model.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/attribute-directives/attribute.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/attribute-directives/optionalAttribute.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/attribute-directives/optionalAttribute.html)*