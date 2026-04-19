---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:22Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/formFieldMap.html
title: formFieldMap • Akka HTTP
---

# formFieldMap • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# formFieldMap

## Signature

```
def formFieldMap: Directive1[Map[String, String]]
```

## Description

Extracts all HTTP form fields at once as a `Map[String, String]``Map<String, String>` mapping form field names to form field values. Data posted from [HTML Forms](https://www.w3.org/TR/html401/interact/forms.html#h-17.13.4) is either of type `application/x-www-form-urlencoded` or of type `multipart/form-data`.

If form data contain a field value several times, the map will contain the last one.

See [formFields](formFields.html) for an in\-depth description.

## Warning

Use of this directive can result in performance degradation or even in `OutOfMemoryError` s. See [formFieldSeq](formFieldSeq.html)[formFieldList](formFieldSeq.html) for details.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/FormFieldDirectivesExamplesSpec.scala#L56-L69 "Go to snippet source")val route =
  formFieldMap { fields =>
    def formFieldString(formField: (String, String)): String =
      s"""${formField._1} = '${formField._2}'"""
    complete(s"The form fields are ${fields.map(formFieldString).mkString(", ")}")
  }

// tests:
Post("/", FormData("color" -> "blue", "count" -> "42")) ~> route ~> check {
  responseAs[String] shouldEqual "The form fields are color = 'blue', count = '42'"
}
Post("/", FormData("x" -> "1", "x" -> "5")) ~> route ~> check {
  responseAs[String] shouldEqual "The form fields are x = '5'"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/FormFieldDirectivesExamplesTest.java#L31-L98 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.formFieldMap;

final Function<Map<String, String>, String> mapToString = map ->
  map.entrySet()
    .stream()
    .map(e -> e.getKey() + " = '" + e.getValue() +"'")
    .collect(Collectors.joining(", "));

final Route route = formFieldMap(fields ->
  complete("The form fields are " + mapToString.apply(fields))
);

// tests:
final FormData formDataDiffKey =
  FormData.create(
    Pair.create("color", "blue"),
    Pair.create("count", "42"));
testRoute(route).run(HttpRequest.POST("/").withEntity(formDataDiffKey.toEntity()))
  .assertEntity("The form fields are color = 'blue', count = '42'");

final FormData formDataSameKey =
  FormData.create(
    Pair.create("x", "1"),
    Pair.create("x", "5"));
testRoute(route).run(HttpRequest.POST("/").withEntity(formDataSameKey.toEntity()))
  .assertEntity( "The form fields are x = '5'");
```

## Code Examples

### Example 1: Signature

```scala
def formFieldMap: Directive1[Map[String, String]]
```

### Example 2: Example

```scala
val route =
  formFieldMap { fields =>
    def formFieldString(formField: (String, String)): String =
      s"""${formField._1} = '${formField._2}'"""
    complete(s"The form fields are ${fields.map(formFieldString).mkString(", ")}")
  }

// tests:
Post("/", FormData("color" -> "blue", "count" -> "42")) ~> route ~> check {
  responseAs[String] shouldEqual "The form fields are color = 'blue', count = '42'"
}
Post("/", FormData("x" -> "1", "x" -> "5")) ~> route ~> check {
  responseAs[String] shouldEqual "The form fields are x = '5'"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.formFieldMap;

final Function<Map<String, String>, String> mapToString = map ->
  map.entrySet()
    .stream()
    .map(e -> e.getKey() + " = '" + e.getValue() +"'")
    .collect(Collectors.joining(", "));


final Route route = formFieldMap(fields ->
  complete("The form fields are " + mapToString.apply(fields))
);

// tests:
final FormData formDataDiffKey =
  FormData.create(
    Pair.create("color", "blue"),
    Pair.create("count", "42"));
testRoute(route).run(HttpRequest.POST("/").withEntity(formDataDiffKey.toEntity()))
  .assertEntity("The form fields are color = 'blue', count = '42'");

final FormData formDataSameKey =
  FormData.create(
    Pair.create("x", "1"),
    Pair.create("x", "5"));
testRoute(route).run(HttpRequest.POST("/").withEntity(formDataSameKey.toEntity()))
  .assertEntity( "The form fields are x = '5'");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/formFieldMultiMap.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/formFieldSeq.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/formFields.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/formFieldMap.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/formFieldMap.html)*