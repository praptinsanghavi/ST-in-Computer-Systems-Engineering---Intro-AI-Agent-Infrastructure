---
description: 'declaration: package: akka.javasdk.http, interface: HttpClient'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:38Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpClient.html
title: HttpClient
---

# HttpClient

> **Summary:** declaration: package: akka.javasdk.http, interface: HttpClient

## Content

Package [akka.javasdk.http](package-summary.html)
# Interface HttpClient

---

@DoNotInherit
public interface HttpClient
HTTP client for making outbound HTTP requests to other services.

 HttpClient provides a fluent API for building and executing HTTP requests with various HTTP
 methods. It supports request customization including headers, authentication, request bodies,
 timeouts, and retries.

 

**Basic Usage:** Use the HTTP method factories ([`GET(java.lang.String)`](#GET(java.lang.String)), [`POST(java.lang.String)`](#POST(java.lang.String)),
 etc.) to start building requests, then chain configuration methods and finally call `invoke()` to execute.

 

**Request Building:** The returned [`RequestBuilder`](RequestBuilder.html "interface in akka.javasdk.http") allows configuring
 headers, request bodies, authentication, timeouts, retries, and response parsing before
 execution.

 

**Response Handling:** By default, responses are returned as `ByteString`.
 Use `responseBodyAs(Class)` to automatically deserialize JSON responses to Java objects.

 

**Error Handling:** HTTP error status codes (4xx, 5xx) are included in the
 response. Use the response's status code to determine success or failure and handle errors
 appropriately.

 

Not for user extension, instances provided by [`HttpClientProvider`](HttpClientProvider.html "interface in akka.javasdk.http") and the testkit.

- ## Method Summary

Modifier and Type
Method
Description
`[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")<akka.util.ByteString>`
`[DELETE](#DELETE(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") uri)`
 
`[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")<akka.util.ByteString>`
`[GET](#GET(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") uri)`
 
`[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")<akka.util.ByteString>`
`[PATCH](#PATCH(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") uri)`
 
`[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")<akka.util.ByteString>`
`[POST](#POST(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") uri)`
 
`[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")<akka.util.ByteString>`
`[PUT](#PUT(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") uri)`

- ## Method Details

	- ### GET
	
	
	[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<akka.util.ByteString\> GET([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") uri)
	- ### POST
	
	
	[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<akka.util.ByteString\> POST([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") uri)
	- ### PUT
	
	
	[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<akka.util.ByteString\> PUT([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") uri)
	- ### PATCH
	
	
	[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<akka.util.ByteString\> PATCH([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") uri)
	- ### DELETE
	
	
	[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<akka.util.ByteString\> DELETE([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") uri)

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpClientProvider.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/RequestBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpClient.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpClient.html)*