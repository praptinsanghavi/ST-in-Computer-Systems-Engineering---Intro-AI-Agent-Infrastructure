---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:22Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/formField.html
title: formField • Akka HTTP
---

# formField • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# formField

## Description

Allows extracting a single Form field sent in the request. Data posted from [HTML Forms](https://www.w3.org/TR/html401/interact/forms.html#h-17.13.4) is either of type `application/x-www-form-urlencoded` or of type `multipart/form-data`.

See [formFields](formFields.html) for an in\-depth description.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/FormFieldDirectivesExamplesSpec.scala#L33-L51 "Go to snippet source")val route =
  concat(
    formField("color") { color =>
      complete(s"The color is '$color'")
    },
    formField("id".as[Int]) { id =>
      complete(s"The id is '$id'")
    }
  )

// tests:
Post("/", FormData("color" -> "blue")) ~> route ~> check {
  responseAs[String] shouldEqual "The color is 'blue'"
}

Get("/") ~> Route.seal(route) ~> check {
  status shouldEqual StatusCodes.BadRequest
  responseAs[String] shouldEqual "Request is missing required form field 'color'"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/FormFieldDirectivesExamplesTest.java#L23-L67 "Go to snippet source")import akka.http.javadsl.server.Directives;

import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.formField;

final Route route = Directives.concat(
  formField("color", color ->
    complete("The color is '" + color + "'")
  ),
  formField(StringUnmarshallers.INTEGER, "id", id ->
    complete("The id is '" + id + "'")
  )
);

// tests:
final FormData formData = FormData.create(Pair.create("color", "blue"));
testRoute(route).run(HttpRequest.POST("/").withEntity(formData.toEntity()))
  .assertEntity("The color is 'blue'");

testRoute(route).run(HttpRequest.GET("/"))
  .assertStatusCode(StatusCodes.BAD_REQUEST)
  .assertEntity("Request is missing required form field 'color'");
```

## Code Examples

### Example 1: Example

```scala
val route =
  concat(
    formField("color") { color =>
      complete(s"The color is '$color'")
    },
    formField("id".as[Int]) { id =>
      complete(s"The id is '$id'")
    }
  )

// tests:
Post("/", FormData("color" -> "blue")) ~> route ~> check {
  responseAs[String] shouldEqual "The color is 'blue'"
}

Get("/") ~> Route.seal(route) ~> check {
  status shouldEqual StatusCodes.BadRequest
  responseAs[String] shouldEqual "Request is missing required form field 'color'"
}
```

### Example 2: Example

```java
import akka.http.javadsl.server.Directives;

import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.formField;

final Route route = Directives.concat(
  formField("color", color ->
    complete("The color is '" + color + "'")
  ),
  formField(StringUnmarshallers.INTEGER, "id", id ->
    complete("The id is '" + id + "'")
  )
);

// tests:
final FormData formData = FormData.create(Pair.create("color", "blue"));
testRoute(route).run(HttpRequest.POST("/").withEntity(formData.toEntity()))
  .assertEntity("The color is 'blue'");

testRoute(route).run(HttpRequest.GET("/"))
  .assertStatusCode(StatusCodes.BAD_REQUEST)
  .assertEntity("Request is missing required form field 'color'");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/formFields.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/formField.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/formField.html)*