---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:58:11Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/selectPreferredLanguage.html
title: selectPreferredLanguage • Akka HTTP
---

# selectPreferredLanguage • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# selectPreferredLanguage

## Signature

```
def selectPreferredLanguage(first: Language, more: Language*): Directive1[Language]
```

## Description

Inspects the request’s `Accept-Language` header and determines, which of a given set of language alternatives is preferred by the client according to content negotiation rules defined by [RFC 7231 in section 5\.3\.5](https://datatracker.ietf.org/doc/html/rfc7231#section-5.3.5).

If there are several best language alternatives that the client has equal preference for (even if this preference is zero!) the order of the arguments is used as a tie breaker (first one wins).

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MiscDirectivesExamplesSpec.scala#L77-L93 "Go to snippet source")val request = Get() ~> `Accept-Language`(
  Language("en-US"),
  Language("en") withQValue 0.7f,
  LanguageRange.`*` withQValue 0.1f,
  Language("de") withQValue 0.5f)

request ~> {
  selectPreferredLanguage("en", "en-US") { lang =>
    complete(lang.toString)
  }
} ~> check { responseAs[String] shouldEqual "en-US" }

request ~> {
  selectPreferredLanguage("de-DE", "hu") { lang =>
    complete(lang.toString)
  }
} ~> check { responseAs[String] shouldEqual "de-DE" }
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/MiscDirectivesExamplesTest.java#L51-L203 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.selectPreferredLanguage;

final Route enRoute = selectPreferredLanguage(
  Arrays.asList(Language.create("en"), Language.create("en-US")), lang ->
    complete(lang.toString())
);
final Route deHuRoute = selectPreferredLanguage(
  Arrays.asList(Language.create("de-DE"), Language.create("hu")), lang ->
    complete(lang.toString())
);

// tests:
final HttpRequest request = HttpRequest.GET("/").addHeader(AcceptLanguage.create(
  Language.create("en-US").withQValue(1f),
  Language.create("en").withQValue(0.7f),
  LanguageRanges.ALL.withQValue(0.1f),
  Language.create("de-DE").withQValue(0.5f)
));

testRoute(enRoute).run(request).assertEntity("en-US");
testRoute(deHuRoute).run(request).assertEntity("de-DE");
```

## Code Examples

### Example 1: Signature

```scala
def selectPreferredLanguage(first: Language, more: Language*): Directive1[Language]
```

### Example 2: Example

```scala
val request = Get() ~> `Accept-Language`(
  Language("en-US"),
  Language("en") withQValue 0.7f,
  LanguageRange.`*` withQValue 0.1f,
  Language("de") withQValue 0.5f)

request ~> {
  selectPreferredLanguage("en", "en-US") { lang =>
    complete(lang.toString)
  }
} ~> check { responseAs[String] shouldEqual "en-US" }

request ~> {
  selectPreferredLanguage("de-DE", "hu") { lang =>
    complete(lang.toString)
  }
} ~> check { responseAs[String] shouldEqual "de-DE" }
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.selectPreferredLanguage;

final Route enRoute = selectPreferredLanguage(
  Arrays.asList(Language.create("en"), Language.create("en-US")), lang ->
    complete(lang.toString())
);
final Route deHuRoute = selectPreferredLanguage(
  Arrays.asList(Language.create("de-DE"), Language.create("hu")), lang ->
    complete(lang.toString())
);


// tests:
final HttpRequest request = HttpRequest.GET("/").addHeader(AcceptLanguage.create(
  Language.create("en-US").withQValue(1f),
  Language.create("en").withQValue(0.7f),
  LanguageRanges.ALL.withQValue(0.1f),
  Language.create("de-DE").withQValue(0.5f)
));

testRoute(enRoute).run(request).assertEntity("en-US");
testRoute(deHuRoute).run(request).assertEntity("de-DE");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/requestEntityPresent.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/validate.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/selectPreferredLanguage.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/selectPreferredLanguage.html)*