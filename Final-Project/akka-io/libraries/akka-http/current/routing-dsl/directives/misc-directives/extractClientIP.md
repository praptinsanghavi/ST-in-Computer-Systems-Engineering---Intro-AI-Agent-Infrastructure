---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:40Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/extractClientIP.html
title: extractClientIP • Akka HTTP
---

# extractClientIP • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# extractClientIP

## Signature

```
def extractClientIP: Directive1[RemoteAddress]
```

## Description

Provides the value of the `X-Forwarded-For` or `X-Real-IP` header. If neither of those is found it will fall back to the value of the synthetic `RemoteAddress` header (`akka.http.server.remote-address-header` setting is `on`) or the value of the [`AttributeKeys.remoteAddress`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/AttributeKeys.html "akka.http.javadsl.model.AttributeKeys")[`AttributeKeys.remoteAddress`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKeys$.html "akka.http.scaladsl.model.AttributeKeys") [attribute](../../../common/http-model.html#attributes) (if the `akka.http.server.remote-address-attribute` setting is `on`)

If no valid IP address is encountered, this extractor will return RemoteAddress.Unknown\`.

Warning
Clients can send any values in these headers. If the client is not a trusted upstream, the IP address can be malicious. For sensitive operations use the [`AttributeKeys.remoteAddress`](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/AttributeKeys.html "akka.http.javadsl.model.AttributeKeys")[`AttributeKeys.remoteAddress`](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKeys$.html "akka.http.scaladsl.model.AttributeKeys") [attribute](../../../common/http-model.html#attributes), or use the specific headers which are known to be set correctly by the infrastructure you do trust.

## Example

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/MiscDirectivesExamplesSpec.scala#L19-L26 "Go to snippet source")val route = extractClientIP { ip =>
  complete("Client's ip is " + ip.toOption.map(_.getHostAddress).getOrElse("unknown"))
}

// tests:
Get("/").withHeaders(`X-Forwarded-For`(RemoteAddress(InetAddress.getByName("192.168.3.12")))) ~> route ~> check {
  responseAs[String] shouldEqual "Client's ip is 192.168.3.12"
}
```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/MiscDirectivesExamplesTest.java#L143-L160 "Go to snippet source")final Route route = extractClientIP(remoteAddr ->
  complete("Client's IP is " + remoteAddr.getAddress().map(InetAddress::getHostAddress)
    .orElseGet(() -> "unknown"))
);

// tests:
final String ip = "192.168.1.2";
final akka.http.javadsl.model.RemoteAddress remoteAddress =
  akka.http.javadsl.model.RemoteAddress.create(InetAddress.getByName(ip));

final HttpRequest request = HttpRequest.GET("/")
  .addHeader(XForwardedFor.create(remoteAddress)); //

testRoute(route).run(request)
  .assertEntity("Client's IP is " + ip);

testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("Client's IP is unknown");
```

## Code Examples

### Example 1: Signature

```scala
def extractClientIP: Directive1[RemoteAddress]
```

### Example 2: Example

```scala
val route = extractClientIP { ip =>
  complete("Client's ip is " + ip.toOption.map(_.getHostAddress).getOrElse("unknown"))
}

// tests:
Get("/").withHeaders(`X-Forwarded-For`(RemoteAddress(InetAddress.getByName("192.168.3.12")))) ~> route ~> check {
  responseAs[String] shouldEqual "Client's ip is 192.168.3.12"
}
```

### Example 3: Example

```java
final Route route = extractClientIP(remoteAddr ->
  complete("Client's IP is " + remoteAddr.getAddress().map(InetAddress::getHostAddress)
    .orElseGet(() -> "unknown"))
);

// tests:
final String ip = "192.168.1.2";
final akka.http.javadsl.model.RemoteAddress remoteAddress =
  akka.http.javadsl.model.RemoteAddress.create(InetAddress.getByName(ip));

final HttpRequest request = HttpRequest.GET("/")
  .addHeader(XForwardedFor.create(remoteAddress)); //

testRoute(route).run(request)
  .assertEntity("Client's IP is " + ip);

testRoute(route).run(HttpRequest.GET("/"))
  .assertEntity("Client's IP is unknown");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/AttributeKeys$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/AttributeKeys.html
- https://doc.akka.io/libraries/akka-http/current/common/http-model.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/rejectEmptyResponse.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/extractClientIP.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/misc-directives/extractClientIP.html)*