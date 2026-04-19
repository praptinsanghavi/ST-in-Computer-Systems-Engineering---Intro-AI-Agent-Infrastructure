---
description: 'declaration: package: akka.javasdk.http'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:27Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/package-summary.html
title: akka.javasdk.http
---

# akka.javasdk.http

> **Summary:** declaration: package: akka.javasdk.http

## Content

# Package akka.javasdk.http

---

package akka.javasdk.http

HTTP Endpoint component and HTTP client.

- Related Packages

Package
Description
[akka.javasdk](../package-summary.html)

Root package of the Akka SDK.
- Class
Description
[AbstractHttpEndpoint](AbstractHttpEndpoint.html "class in akka.javasdk.http")

Optional base class for HTTP endpoints providing convenient access to request context.

[HttpClient](HttpClient.html "interface in akka.javasdk.http")

HTTP client for making outbound HTTP requests to other services.

[HttpClientProvider](HttpClientProvider.html "interface in akka.javasdk.http")

Provider for HTTP clients to interact with other services over HTTP.

[HttpException](HttpException.html "class in akka.javasdk.http")

Factory class for creating HTTP exceptions that result in specific HTTP error responses.

[HttpResponses](HttpResponses.html "class in akka.javasdk.http")

Factory class for creating common HTTP responses in endpoint methods.

[QueryParams](QueryParams.html "interface in akka.javasdk.http")

Interface for accessing HTTP query parameters with type\-safe getters.

[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<R\>

A builder for HTTP requests and handling of their responses

[RequestContext](RequestContext.html "interface in akka.javasdk.http")

Context information available during HTTP endpoint request processing.

[StrictResponse](StrictResponse.html "class in akka.javasdk.http")\<T\>

A strict response that contains both the HTTP response and the body.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/AbstractHttpEndpoint.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpClientProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpException.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpResponses.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/QueryParams.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/RequestBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/RequestContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/StrictResponse.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/package-summary.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/package-summary.html)*