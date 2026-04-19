---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:32Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/host-directives/host.html
title: host • Akka HTTP
---

# host • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# host

Filter requests matching conditions against the hostname part of the Host header value in the request.

## Signature

```
def host(hostNames: String*): Directive0
def host(predicate: String => Boolean): Directive0
def host(regex: Regex): Directive1[String]
```

## Description

The `def host(hostNames: String*)` overload rejects all requests with a hostname different from the given ones.

The `def host(predicate: String => Boolean)` overload rejects all requests for which the hostname does not satisfy the given predicate.

There are a few variants:

- reject all requests with a hostname different from the given ones
- reject all requests for which the hostname does not satisfy the given predicate
- reject all requests for which the hostname does not satisfy the given regular expression

The `def host(regex: Regex)` overloadregular expression matching works a little bit different: it rejects all requests with a hostname that doesn’t have a prefix matching the given regular expression and also extracts a `String` to its inner route following this rules:

> - For all matching requests the prefix string matching the regex is extracted and passed to the inner route.
> - If the regex contains a capturing group only the string matched by this group is extracted.
> - If the regex contains more than one capturing group an `IllegalArgumentException` is thrown.

## Example

Matching a list of hosts:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/HostDirectivesExamplesSpec.scala#L32-L45 "Go to snippet source")val route =
  host("api.company.com", "rest.company.com") {
    complete("Ok")
  }

// tests:
Get() ~> Host("rest.company.com") ~> route ~> check {
  status shouldEqual OK
  responseAs[String] shouldEqual "Ok"
}

Get() ~> Host("notallowed.company.com") ~> route ~> check {
  handled shouldBe false
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/HostDirectivesExamplesTest.java#L19-L50 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.host;

final Route matchListOfHosts = host(
    Arrays.asList("api.company.com", "rest.company.com"),
    () -> complete(StatusCodes.OK));

testRoute(matchListOfHosts).run(HttpRequest.GET("/").addHeader(Host.create("api.company.com")))
    .assertStatusCode(StatusCodes.OK);
```

Making sure the host satisfies the given predicate

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/HostDirectivesExamplesSpec.scala#L51-L66 "Go to snippet source")val shortOnly: String => Boolean = (hostname) => hostname.length < 10

val route =
  host(shortOnly) {
    complete("Ok")
  }

// tests:
Get() ~> Host("short.com") ~> route ~> check {
  status shouldEqual OK
  responseAs[String] shouldEqual "Ok"
}

Get() ~> Host("verylonghostname.com") ~> route ~> check {
  handled shouldBe false
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/HostDirectivesExamplesTest.java#L24-L64 "Go to snippet source")import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.host;

final Route shortOnly = host(hostname -> hostname.length() < 10,
    () -> complete(StatusCodes.OK));

testRoute(shortOnly).run(HttpRequest.GET("/").addHeader(Host.create("short.com")))
    .assertStatusCode(StatusCodes.OK);

testRoute(shortOnly).run(HttpRequest.GET("/").addHeader(Host.create("verylonghostname.com")))
    .assertStatusCode(StatusCodes.NOT_FOUND);
```

Using a regular expressions:

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/HostDirectivesExamplesSpec.scala#L72-L91 "Go to snippet source")val route =
  concat(
    host("api|rest".r) { prefix =>
      complete(s"Extracted prefix: $prefix")
    },
    host("public.(my|your)company.com".r) { captured =>
      complete(s"You came through $captured company")
    }
  )

// tests:
Get() ~> Host("api.company.com") ~> route ~> check {
  status shouldEqual OK
  responseAs[String] shouldEqual "Extracted prefix: api"
}

Get() ~> Host("public.mycompany.com") ~> route ~> check {
  status shouldEqual OK
  responseAs[String] shouldEqual "You came through my company"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/HostDirectivesExamplesTest.java#L34-L98 "Go to snippet source")import akka.http.javadsl.server.Directives;

import static akka.http.javadsl.server.Directives.host;

final Route hostPrefixRoute = host(Pattern.compile("api|rest"), prefix -> 
    complete("Extracted prefix: " + prefix));

final Route hostPartRoute = host(Pattern.compile("public.(my|your)company.com"), captured ->
    complete("You came through " + captured
        + " company"));

final Route route = Directives.concat(hostPrefixRoute, hostPartRoute);

testRoute(route).run(HttpRequest.GET("/").addHeader(Host.create("api.company.com")))
    .assertStatusCode(StatusCodes.OK).assertEntity("Extracted prefix: api");

testRoute(route).run(HttpRequest.GET("/").addHeader(Host.create("public.mycompany.com")))
    .assertStatusCode(StatusCodes.OK)
    .assertEntity("You came through my company");
```

Beware that in the case of introducing multiple capturing groups in the regex such as in the case bellow, the directive will fail at runtime, at the moment the route tree is evaluated for the first time. This might cause your http handler actor to enter in a fail/restart loop depending on your supervision strategy.

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/HostDirectivesExamplesSpec.scala#L97-L101 "Go to snippet source")an[IllegalArgumentException] should be thrownBy {
  host("server-([0-9]).company.(com|net|org)".r) { target =>
    complete("Will never complete :'(")
  }
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/HostDirectivesExamplesTest.java#L106-L110 "Go to snippet source")// this will throw IllegalArgumentException
final Route hostRegex = host(Pattern.compile("server-([0-9]).company.(com|net|org)"), s ->
    // will not reach here
    complete(s)
);
```

## Code Examples

### Example 1: Signature

```scala
def host(hostNames: String*): Directive0
def host(predicate: String => Boolean): Directive0
def host(regex: Regex): Directive1[String]
```

### Example 2: Example

```scala
val route =
  host("api.company.com", "rest.company.com") {
    complete("Ok")
  }

// tests:
Get() ~> Host("rest.company.com") ~> route ~> check {
  status shouldEqual OK
  responseAs[String] shouldEqual "Ok"
}

Get() ~> Host("notallowed.company.com") ~> route ~> check {
  handled shouldBe false
}
```

### Example 3: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.host;

final Route matchListOfHosts = host(
    Arrays.asList("api.company.com", "rest.company.com"),
    () -> complete(StatusCodes.OK));

testRoute(matchListOfHosts).run(HttpRequest.GET("/").addHeader(Host.create("api.company.com")))
    .assertStatusCode(StatusCodes.OK);
```

### Example 4: Example

```scala
val shortOnly: String => Boolean = (hostname) => hostname.length < 10

val route =
  host(shortOnly) {
    complete("Ok")
  }

// tests:
Get() ~> Host("short.com") ~> route ~> check {
  status shouldEqual OK
  responseAs[String] shouldEqual "Ok"
}

Get() ~> Host("verylonghostname.com") ~> route ~> check {
  handled shouldBe false
}
```

### Example 5: Example

```java
import static akka.http.javadsl.server.Directives.complete;
import static akka.http.javadsl.server.Directives.host;

final Route shortOnly = host(hostname -> hostname.length() < 10,
    () -> complete(StatusCodes.OK));

testRoute(shortOnly).run(HttpRequest.GET("/").addHeader(Host.create("short.com")))
    .assertStatusCode(StatusCodes.OK);

testRoute(shortOnly).run(HttpRequest.GET("/").addHeader(Host.create("verylonghostname.com")))
    .assertStatusCode(StatusCodes.NOT_FOUND);
```

### Example 6: Example

```scala
val route =
  concat(
    host("api|rest".r) { prefix =>
      complete(s"Extracted prefix: $prefix")
    },
    host("public.(my|your)company.com".r) { captured =>
      complete(s"You came through $captured company")
    }
  )

// tests:
Get() ~> Host("api.company.com") ~> route ~> check {
  status shouldEqual OK
  responseAs[String] shouldEqual "Extracted prefix: api"
}

Get() ~> Host("public.mycompany.com") ~> route ~> check {
  status shouldEqual OK
  responseAs[String] shouldEqual "You came through my company"
}
```

### Example 7: Example

```java
import akka.http.javadsl.server.Directives;

import static akka.http.javadsl.server.Directives.host;


final Route hostPrefixRoute = host(Pattern.compile("api|rest"), prefix -> 
    complete("Extracted prefix: " + prefix));

final Route hostPartRoute = host(Pattern.compile("public.(my|your)company.com"), captured ->
    complete("You came through " + captured
        + " company"));

final Route route = Directives.concat(hostPrefixRoute, hostPartRoute);

testRoute(route).run(HttpRequest.GET("/").addHeader(Host.create("api.company.com")))
    .assertStatusCode(StatusCodes.OK).assertEntity("Extracted prefix: api");

testRoute(route).run(HttpRequest.GET("/").addHeader(Host.create("public.mycompany.com")))
    .assertStatusCode(StatusCodes.OK)
    .assertEntity("You came through my company");
```

### Example 8: Example

```scala
an[IllegalArgumentException] should be thrownBy {
  host("server-([0-9]).company.(com|net|org)".r) { target =>
    complete("Will never complete :'(")
  }
}
```

### Example 9: Example

```java
// this will throw IllegalArgumentException
final Route hostRegex = host(Pattern.compile("server-([0-9]).company.(com|net|org)"), s ->
    // will not reach here
    complete(s)
);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/host-directives/extractHost.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/host-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/host-directives/host.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/host-directives/host.html)*