---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:04Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractParserSettings.html
title: extractParserSettings • Akka HTTP
---

# extractParserSettings • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractParserSettings

## Signature

```
def extractParserSettings: Directive1[ParserSettings]
```

## Description

Extracts the request’s underlying [`ParserSettings`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings.html "akka.http.javadsl.settings.ParserSettings")[`ParserSettings`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.html "akka.http.scaladsl.settings.ParserSettings"), which can be useful when you want to access custom status codes and media types.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala#L752-L760 "Go to snippet source")val route =
  extractParserSettings { parserSettings =>
    complete(s"URI parsing mode is ${parserSettings.uriParsingMode}")
  }

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "URI parsing mode is Strict"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java#L148-L937 "Go to snippet source")import static akka.http.javadsl.server.Directives.extractParserSettings;

final Route route = extractParserSettings(parserSettings ->
  complete("URI parsing mode is " + parserSettings.getUriParsingMode())
);

// tests:
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("URI parsing mode is Strict");
```

## Code Examples

### Example 1: Signature

```scala
def extractParserSettings: Directive1[ParserSettings]
```

### Example 2: Example

```scala
val route =
  extractParserSettings { parserSettings =>
    complete(s"URI parsing mode is ${parserSettings.uriParsingMode}")
  }

// tests:
Get("/") ~> route ~> check {
  responseAs[String] shouldEqual "URI parsing mode is Strict"
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.extractParserSettings;

final Route route = extractParserSettings(parserSettings ->
  complete("URI parsing mode is " + parserSettings.getUriParsingMode())
);

// tests:
testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("URI parsing mode is Strict");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractMaterializer.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractRequest.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractParserSettings.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/basic-directives/extractParserSettings.html)*