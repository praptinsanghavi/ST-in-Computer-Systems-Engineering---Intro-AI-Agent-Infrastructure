---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:53Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameterMap.html
title: parameterMap • Akka HTTP
---

# parameterMap • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# parameterMap

## Signature

```
def parameterMap: Directive1[Map[String, String]]
```

## Description

Extracts all parameters at once as a `Map[String, String]``Map<String, String>` mapping parameter names to parameter values.

If a query contains a parameter value several times, the map will contain the last one.

See also [When to use which parameter directive?](index.html#which-parameter-directive) to understand when to use which directive.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/ParameterDirectivesExamplesSpec.scala#L171-L183 "Go to snippet source")val route =
  parameterMap { params =>
    def paramString(param: (String, String)): String = s"""${param._1} = '${param._2}'"""
    complete(s"The parameters are ${params.map(paramString).mkString(", ")}")
  }

// tests:
Get("/?color=blue&count=42") ~> route ~> check {
  responseAs[String] shouldEqual "The parameters are color = 'blue', count = '42'"
}
Get("/?x=1&x=2") ~> route ~> check {
  responseAs[String] shouldEqual "The parameters are x = '2'"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/ParameterDirectivesExamplesTest.java#L45-L176 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.parameterMap;

final Function<Entry, String> paramString =
  entry -> entry.getKey() + " = '" + entry.getValue() + "'";

final Route route = parameterMap(params -> {
  final String pString = params.entrySet()
    .stream()
    .map(paramString::apply)
    .collect(Collectors.joining(", "));
  return complete("The parameters are " + pString);
});

// tests:
testRoute(route).run(HttpRequest.GET("/?color=blue&count=42"))
  .assertEntity("The parameters are color = 'blue', count = '42'");

testRoute(route).run(HttpRequest.GET("/?x=1&x=2"))
  .assertEntity("The parameters are x = '2'");
```

## Code Examples

### Example 1: Signature

```scala
def parameterMap: Directive1[Map[String, String]]
```

### Example 2: Example

```scala
val route =
  parameterMap { params =>
    def paramString(param: (String, String)): String = s"""${param._1} = '${param._2}'"""
    complete(s"The parameters are ${params.map(paramString).mkString(", ")}")
  }

// tests:
Get("/?color=blue&count=42") ~> route ~> check {
  responseAs[String] shouldEqual "The parameters are color = 'blue', count = '42'"
}
Get("/?x=1&x=2") ~> route ~> check {
  responseAs[String] shouldEqual "The parameters are x = '2'"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.parameterMap;

final Function<Entry, String> paramString =
  entry -> entry.getKey() + " = '" + entry.getValue() + "'";

final Route route = parameterMap(params -> {
  final String pString = params.entrySet()
    .stream()
    .map(paramString::apply)
    .collect(Collectors.joining(", "));
  return complete("The parameters are " + pString);
});

// tests:
testRoute(route).run(HttpRequest.GET("/?color=blue&count=42"))
  .assertEntity("The parameters are color = 'blue', count = '42'");

testRoute(route).run(HttpRequest.GET("/?x=1&x=2"))
  .assertEntity("The parameters are x = '2'");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameterMultiMap.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameters.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameterMap.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/parameter-directives/parameterMap.html)*