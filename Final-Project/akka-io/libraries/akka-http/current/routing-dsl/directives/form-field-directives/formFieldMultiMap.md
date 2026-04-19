---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:22Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/formFieldMultiMap.html
title: formFieldMultiMap • Akka HTTP
---

# formFieldMultiMap • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# formFieldMultiMap

## Signature

```
def formFieldMultiMap: Directive1[Map[String, List[String]]]
```

## Description

Extracts all HTTP form fields at once as a multi\-map of type `Map[String, List[String]]``Map<String, List<String>>` mapping a form name to a list of all its values. Data posted from [HTML Forms](https://www.w3.org/TR/html401/interact/forms.html#h-17.13.4) is either of type `application/x-www-form-urlencoded` or of type `multipart/form-data`.

This directive can be used if form fields can occur several times.

The order of values is *not* specified.

See [formFields](formFields.html) for an in\-depth description.

## Warning

Use of this directive can result in performance degradation or even in `OutOfMemoryError` s. See [formFieldSeq](formFieldSeq.html)[formFieldList](formFieldSeq.html) for details.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/FormFieldDirectivesExamplesSpec.scala#L74-L86 "Go to snippet source")val route =
  formFieldMultiMap { fields =>
    complete("There are " +
      s"form fields ${fields.map(x => x._1 + " -> " + x._2.size).mkString(", ")}")
  }

// tests:
Post("/", FormData("color" -> "blue", "count" -> "42")) ~> route ~> check {
  responseAs[String] shouldEqual "There are form fields color -> 1, count -> 1"
}
Post("/", FormData("x" -> "23", "x" -> "4", "x" -> "89")) ~> route ~> check {
  responseAs[String] shouldEqual "There are form fields x -> 3"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/FormFieldDirectivesExamplesTest.java#L41-L129 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.formFieldMultiMap;

final Function<Map<String, List<String>>, String> mapToString = map ->
  map.entrySet()
    .stream()
    .map(e -> e.getKey() + " -> " + e.getValue().size())
    .collect(Collectors.joining(", "));

final Route route = formFieldMultiMap(fields ->
  complete("There are form fields " + mapToString.apply(fields))
);

// test:
final FormData formDataDiffKey =
  FormData.create(
    Pair.create("color", "blue"),
    Pair.create("count", "42"));
testRoute(route).run(HttpRequest.POST("/").withEntity(formDataDiffKey.toEntity()))
  .assertEntity("There are form fields color -> 1, count -> 1");

final FormData formDataSameKey =
  FormData.create(
    Pair.create("x", "23"),
    Pair.create("x", "4"),
    Pair.create("x", "89"));
testRoute(route).run(HttpRequest.POST("/").withEntity(formDataSameKey.toEntity()))
  .assertEntity("There are form fields x -> 3");
```

## Code Examples

### Example 1: Signature

```scala
def formFieldMultiMap: Directive1[Map[String, List[String]]]
```

### Example 2: Example

```scala
val route =
  formFieldMultiMap { fields =>
    complete("There are " +
      s"form fields ${fields.map(x => x._1 + " -> " + x._2.size).mkString(", ")}")
  }

// tests:
Post("/", FormData("color" -> "blue", "count" -> "42")) ~> route ~> check {
  responseAs[String] shouldEqual "There are form fields color -> 1, count -> 1"
}
Post("/", FormData("x" -> "23", "x" -> "4", "x" -> "89")) ~> route ~> check {
  responseAs[String] shouldEqual "There are form fields x -> 3"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.formFieldMultiMap;

final Function<Map<String, List<String>>, String> mapToString = map ->
  map.entrySet()
    .stream()
    .map(e -> e.getKey() + " -> " + e.getValue().size())
    .collect(Collectors.joining(", "));

final Route route = formFieldMultiMap(fields ->
  complete("There are form fields " + mapToString.apply(fields))
);

// test:
final FormData formDataDiffKey =
  FormData.create(
    Pair.create("color", "blue"),
    Pair.create("count", "42"));
testRoute(route).run(HttpRequest.POST("/").withEntity(formDataDiffKey.toEntity()))
  .assertEntity("There are form fields color -> 1, count -> 1");

final FormData formDataSameKey =
  FormData.create(
    Pair.create("x", "23"),
    Pair.create("x", "4"),
    Pair.create("x", "89"));
testRoute(route).run(HttpRequest.POST("/").withEntity(formDataSameKey.toEntity()))
  .assertEntity("There are form fields x -> 3");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/formFieldMap.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/formFieldSeq.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/formFields.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/future-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/formFieldMultiMap.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/formFieldMultiMap.html)*