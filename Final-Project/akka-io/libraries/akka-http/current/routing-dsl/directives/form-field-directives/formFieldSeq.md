---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:23Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/formFieldSeq.html
title: formFieldSeqformFieldList • Akka HTTP
---

# formFieldSeqformFieldList • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# formFieldSeqformFieldList

## Signature

```
def formFieldSeq: Directive1[immutable.Seq[(String, String)]]
```

## Description

Extracts all HTTP form fields at once in the original order as (name, value) tuples of type `(String, String)``Map.Entry<String, String>`. Data posted from [HTML Forms](https://www.w3.org/TR/html401/interact/forms.html#h-17.13.4) is either of type `application/x-www-form-urlencoded` or of type `multipart/form-data`.

This directive can be used if the exact order of form fields is important or if parameters can occur several times.

See [formFields](formFields.html) for an in\-depth description.

## Warning

The directive reads all incoming HTTP form fields without any configured upper bound. It means, that requests with form fields holding significant amount of data (ie. during a file upload) can cause performance issues or even an `OutOfMemoryError` s.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/FormFieldDirectivesExamplesSpec.scala#L91-L104 "Go to snippet source")val route =
  formFieldSeq { fields =>
    def formFieldString(formField: (String, String)): String =
      s"""${formField._1} = '${formField._2}'"""
    complete(s"The form fields are ${fields.map(formFieldString).mkString(", ")}")
  }

// tests:
Post("/", FormData("color" -> "blue", "count" -> "42")) ~> route ~> check {
  responseAs[String] shouldEqual "The form fields are color = 'blue', count = '42'"
}
Post("/", FormData("x" -> "23", "x" -> "4", "x" -> "89")) ~> route ~> check {
  responseAs[String] shouldEqual "The form fields are x = '23', x = '4', x = '89'"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/FormFieldDirectivesExamplesTest.java#L36-L159 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.formFieldList;

final Function<List<Entry<String, String>>, String> listToString = list ->
  list.stream()
    .map(e -> e.getKey() + " = '" + e.getValue() +"'")
    .collect(Collectors.joining(", "));

final Route route = formFieldList(fields ->
  complete("The form fields are " + listToString.apply(fields))
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
    Pair.create("x", "23"),
    Pair.create("x", "4"),
    Pair.create("x", "89"));
testRoute(route).run(HttpRequest.POST("/").withEntity(formDataSameKey.toEntity()))
  .assertEntity("The form fields are x = '23', x = '4', x = '89'");
```

## Code Examples

### Example 1: Signature

```scala
def formFieldSeq: Directive1[immutable.Seq[(String, String)]]
```

### Example 2: Example

```scala
val route =
  formFieldSeq { fields =>
    def formFieldString(formField: (String, String)): String =
      s"""${formField._1} = '${formField._2}'"""
    complete(s"The form fields are ${fields.map(formFieldString).mkString(", ")}")
  }

// tests:
Post("/", FormData("color" -> "blue", "count" -> "42")) ~> route ~> check {
  responseAs[String] shouldEqual "The form fields are color = 'blue', count = '42'"
}
Post("/", FormData("x" -> "23", "x" -> "4", "x" -> "89")) ~> route ~> check {
  responseAs[String] shouldEqual "The form fields are x = '23', x = '4', x = '89'"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.formFieldList;

final Function<List<Entry<String, String>>, String> listToString = list ->
  list.stream()
    .map(e -> e.getKey() + " = '" + e.getValue() +"'")
    .collect(Collectors.joining(", "));

final Route route = formFieldList(fields ->
  complete("The form fields are " + listToString.apply(fields))
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
    Pair.create("x", "23"),
    Pair.create("x", "4"),
    Pair.create("x", "89"));
testRoute(route).run(HttpRequest.POST("/").withEntity(formDataSameKey.toEntity()))
  .assertEntity("The form fields are x = '23', x = '4', x = '89'");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/formFieldMap.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/formFields.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/formFieldSeq.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/form-field-directives/formFieldSeq.html)*