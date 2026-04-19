---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:26Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cors-directives/cors.html
title: cors • Akka HTTP
---

# cors • Akka HTTP

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# cors

## Signature

```
def cors(): Directive0
def cors(settings: CorsSettings): Directive0
```

## Description

CORS (Cross Origin Resource Sharing) is a mechanism to enable cross origin requests by informing browsers about origins other than the server itself that the browser can load resources from via HTTP headers.

For an overview on how CORS works, see the [MDN web docs page on CORS](https://developer.mozilla.org/en-US/docs/Web/HTTP/Guides/CORS)

The directive uses config defined under `akka.http.cors`, or an explicitly provided `CorsSettings` instance.

## Example

The `cors` directive will provide a pre\-flight `OPTIONS` handler and let other requests through to the inner route: 

Scala

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/scala/docs/http/scaladsl/server/directives/CorsDirectivesExamplesSpec.scala#L16-L42 "Go to snippet source")val route =
  cors() {
    complete(Ok)
  }

// tests:

// preflight
Options() ~> Origin(HttpOrigin("http://example.com")) ~> `Access-Control-Request-Method`(HttpMethods.GET) ~> route ~> check {
  status shouldBe StatusCodes.OK
  response.headers should contain theSameElementsAs Seq(
    `Access-Control-Allow-Origin`(HttpOrigin("http://example.com")),
    `Access-Control-Allow-Methods`(HttpMethods.GET, HttpMethods.POST, HttpMethods.HEAD, HttpMethods.OPTIONS),
    `Access-Control-Max-Age`(1800),
    `Access-Control-Allow-Credentials`(allow = true)
  )
}

// regular request
Get() ~> Origin(HttpOrigin("http://example.com")) ~> route ~> check {
  status shouldEqual OK
  response.headers should contain theSameElementsAs Seq(
    `Access-Control-Allow-Origin`(HttpOrigin("http://example.com")),
    `Access-Control-Allow-Credentials`(allow = true)
  )
}

```

Java

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/docs/src/test/java/docs/http/javadsl/server/directives/CorsDirectivesExamplesTest.java#L21-L42 "Go to snippet source")final Route route = cors(() ->
        complete(StatusCodes.OK)
);

// tests:
// preflight
HttpOrigin exampleOrigin = HttpOrigin.parse("http://example.com");
testRoute(route).run(HttpRequest.OPTIONS("/")
                .addHeader(Origin.create(exampleOrigin))
                .addHeader(AccessControlRequestMethod.create(HttpMethods.GET)))
        .assertStatusCode(StatusCodes.OK)
        .assertHeaderExists(AccessControlAllowOrigin.create(HttpOriginRange.create(exampleOrigin)))
        .assertHeaderExists(AccessControlAllowMethods.create(HttpMethods.GET, HttpMethods.POST, HttpMethods.HEAD, HttpMethods.OPTIONS))
        .assertHeaderExists(AccessControlMaxAge.create(1800))
        .assertHeaderExists(AccessControlAllowCredentials.create(true));

// regular call
runRouteUnSealed(route, HttpRequest.GET("/")
        .addHeader(Origin.create(exampleOrigin)))
        .assertStatusCode(StatusCodes.OK)
        .assertHeaderExists(AccessControlAllowOrigin.create(HttpOriginRange.create(exampleOrigin)))
        .assertHeaderExists(AccessControlAllowCredentials.create(true));
```

## Reference configuration

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/akka-http/src/main/resources/reference.conf#L68-L115 "Go to snippet source")cors {
  # Allow generic requests, that are outside the scope of the specification, for example lacking
  # an `Origin` header to pass through the directive.
  #
  # When false strict CORS filtering is applied and any invalid request will be rejected.
  allow-generic-http-requests = on

  # If enabled, the header `Access-Control-Allow-Credentials`
  # is included in the response, indicating that the actual request can include user credentials.
  # Examples of user credentials are: cookies, HTTP authentication or client-side certificates.
  allow-credentials = on

  #  List of origins that the CORS filter must allow.
  #
  # Can also be set to a single `*` to allow access to the resource from any origin.
  #
  # Controls the content of the `Access-Control-Allow-Origin` response header: if parameter is `*` and
  # credentials are not allowed, a `*` is returned in `Access-Control-Allow-Origin`. Otherwise, the origins given in the
  # `Origin` request header are echoed.
  #
  # Hostname starting with `*.` will match any sub-domain. The scheme and the port are always strictly matched.
  #
  # The actual or preflight request is rejected if any of the origins from the request is not allowed..
  allowed-origins = ["*"]

  # Set of request headers that are allowed when making an actual request.
  #
  # Controls the content of the `Access-Control-Allow-Headers` header in a preflight response: If set to a single `*`,
  # the headers from `Access-Control-Request-Headers` are echoed. Otherwise specified list of header names is returned
  # as part of the header.
  allowed-headers = ["*"]

  # List of methods allowed when making an actual request. The listed headers are returned as part of the
  # `Access-Control-Allow-Methods` preflight response header.
  #
  # The preflight request will be rejected if the `Access-Control-Request-Method` header's method is not part of the
  # list.
  allowed-methods = ["GET", "POST", "HEAD", "OPTIONS"]

  # Set of headers (other than simple response headers) that browsers are allowed to access. If not empty, the listed
  # headers are returned as part of the `Access-Control-Expose-Headers` header in responses.
  exposed-headers = []

  # The time the browser is allowed to cache the results of a preflight request. This value is
  # returned as part of the `Access-Control-Max-Age` preflight response header. If `scala.concurrent.duration.Duration.Zero`,
  # the header is not added to the preflight response.
  max-age = 1800 seconds
}
```

## Code Examples

### Example 1: Signature

```scala
def cors(): Directive0
def cors(settings: CorsSettings): Directive0
```

### Example 2: Example

```scala
val route =
  cors() {
    complete(Ok)
  }

// tests:

// preflight
Options() ~> Origin(HttpOrigin("http://example.com")) ~> `Access-Control-Request-Method`(HttpMethods.GET) ~> route ~> check {
  status shouldBe StatusCodes.OK
  response.headers should contain theSameElementsAs Seq(
    `Access-Control-Allow-Origin`(HttpOrigin("http://example.com")),
    `Access-Control-Allow-Methods`(HttpMethods.GET, HttpMethods.POST, HttpMethods.HEAD, HttpMethods.OPTIONS),
    `Access-Control-Max-Age`(1800),
    `Access-Control-Allow-Credentials`(allow = true)
  )
}

// regular request
Get() ~> Origin(HttpOrigin("http://example.com")) ~> route ~> check {
  status shouldEqual OK
  response.headers should contain theSameElementsAs Seq(
    `Access-Control-Allow-Origin`(HttpOrigin("http://example.com")),
    `Access-Control-Allow-Credentials`(allow = true)
  )
}
```

### Example 3: Example

```java
final Route route = cors(() ->
        complete(StatusCodes.OK)
);

// tests:
// preflight
HttpOrigin exampleOrigin = HttpOrigin.parse("http://example.com");
testRoute(route).run(HttpRequest.OPTIONS("/")
                .addHeader(Origin.create(exampleOrigin))
                .addHeader(AccessControlRequestMethod.create(HttpMethods.GET)))
        .assertStatusCode(StatusCodes.OK)
        .assertHeaderExists(AccessControlAllowOrigin.create(HttpOriginRange.create(exampleOrigin)))
        .assertHeaderExists(AccessControlAllowMethods.create(HttpMethods.GET, HttpMethods.POST, HttpMethods.HEAD, HttpMethods.OPTIONS))
        .assertHeaderExists(AccessControlMaxAge.create(1800))
        .assertHeaderExists(AccessControlAllowCredentials.create(true));

// regular call
runRouteUnSealed(route, HttpRequest.GET("/")
        .addHeader(Origin.create(exampleOrigin)))
        .assertStatusCode(StatusCodes.OK)
        .assertHeaderExists(AccessControlAllowOrigin.create(HttpOriginRange.create(exampleOrigin)))
        .assertHeaderExists(AccessControlAllowCredentials.create(true));
```

### Example 4: Reference configuration

```conf
cors {
  # Allow generic requests, that are outside the scope of the specification, for example lacking
  # an `Origin` header to pass through the directive.
  #
  # When false strict CORS filtering is applied and any invalid request will be rejected.
  allow-generic-http-requests = on

  # If enabled, the header `Access-Control-Allow-Credentials`
  # is included in the response, indicating that the actual request can include user credentials.
  # Examples of user credentials are: cookies, HTTP authentication or client-side certificates.
  allow-credentials = on

  #  List of origins that the CORS filter must allow.
  #
  # Can also be set to a single `*` to allow access to the resource from any origin.
  #
  # Controls the content of the `Access-Control-Allow-Origin` response header: if parameter is `*` and
  # credentials are not allowed, a `*` is returned in `Access-Control-Allow-Origin`. Otherwise, the origins given in the
  # `Origin` request header are echoed.
  #
  # Hostname starting with `*.` will match any sub-domain. The scheme and the port are always strictly matched.
  #
  # The actual or preflight request is rejected if any of the origins from the request is not allowed..
  allowed-origins = ["*"]

  # Set of request headers that are allowed when making an actual request.
  #
  # Controls the content of the `Access-Control-Allow-Headers` header in a preflight response: If set to a single `*`,
  # the headers from `Access-Control-Request-Headers` are echoed. Otherwise specified list of header names is returned
  # as part of the header.
  allowed-headers = ["*"]

  # List of methods allowed when making an actual request. The listed headers are returned as part of the
  # `Access-Control-Allow-Methods` preflight response header.
  #
  # The preflight request will be rejected if the `Access-Control-Request-Method` header's method is not part of the
  # list.
  allowed-methods = ["GET", "POST", "HEAD", "OPTIONS"]

  # Set of headers (other than simple response headers) that browsers are allowed to access. If not empty, the listed
  # headers are returned as part of the `Access-Control-Expose-Headers` header in responses.
  exposed-headers = []

  # The time the browser is allowed to cache the results of a preflight request. This value is
  # returned as part of the `Access-Control-Max-Age` preflight response header. If `scala.concurrent.duration.Duration.Zero`,
  # the header is not added to the preflight response.
  max-age = 1800 seconds
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cors-directives/index.html
- https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/debugging-directives/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cors-directives/cors.html](https://doc.akka.io/libraries/akka-http/current/routing-dsl/directives/cors-directives/cors.html)*