---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:53Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameterMultiMap.html
title: parameterMultiMap • Akka HTTP
---

# parameterMultiMap • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# parameterMultiMap

## Signature

```
def parameterMultiMap: Directive1[Map[String, List[String]]]
```

## Description

Extracts all parameters at once as a multi\-map of type `Map[String, List[String]]``Map<String, List<String>>` mapping a parameter name to a list of all its values.

This directive can be used if parameters can occur several times.

The order of values is *not* specified.

See [When to use which parameter directive?](index.html#which-parameter-directive) to understand when to use which directive.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/ParameterDirectivesExamplesSpec.scala#L188-L199 "Go to snippet source")val route =
  parameterMultiMap { params =>
    complete(s"There are parameters ${params.map(x => x._1 + " -> " + x._2.size).mkString(", ")}")
  }

// tests:
Get("/?color=blue&count=42") ~> route ~> check {
  responseAs[String] shouldEqual "There are parameters color -> 1, count -> 1"
}
Get("/?x=23&x=42") ~> route ~> check {
  responseAs[String] shouldEqual "There are parameters x -> 2"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/ParameterDirectivesExamplesTest.java#L50-L196 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.parameterMultiMap;

final Route route = parameterMultiMap(params -> {
  final String pString = params.entrySet()
    .stream()
    .map(e -> e.getKey() + " -> " + e.getValue().size())
    .collect(Collectors.joining(", "));
  return complete("There are parameters " + pString);
});

// tests:
testRoute(route).run(HttpRequest.GET("/?color=blue&count=42"))
  .assertEntity("There are parameters color -> 1, count -> 1");

testRoute(route).run(HttpRequest.GET("/?x=23&x=42"))
  .assertEntity("There are parameters x -> 2");
```

## Code Examples

### Example 1: Signature

```scala
def parameterMultiMap: Directive1[Map[String, List[String]]]
```

### Example 2: Example

```scala
val route =
  parameterMultiMap { params =>
    complete(s"There are parameters ${params.map(x => x._1 + " -> " + x._2.size).mkString(", ")}")
  }

// tests:
Get("/?color=blue&count=42") ~> route ~> check {
  responseAs[String] shouldEqual "There are parameters color -> 1, count -> 1"
}
Get("/?x=23&x=42") ~> route ~> check {
  responseAs[String] shouldEqual "There are parameters x -> 2"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.parameterMultiMap;

final Route route = parameterMultiMap(params -> {
  final String pString = params.entrySet()
    .stream()
    .map(e -> e.getKey() + " -> " + e.getValue().size())
    .collect(Collectors.joining(", "));
  return complete("There are parameters " + pString);
});

// tests:
testRoute(route).run(HttpRequest.GET("/?color=blue&count=42"))
  .assertEntity("There are parameters color -> 1, count -> 1");

testRoute(route).run(HttpRequest.GET("/?x=23&x=42"))
  .assertEntity("There are parameters x -> 2");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameterMap.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameterSeq.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameterMultiMap.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameterMultiMap.html)*