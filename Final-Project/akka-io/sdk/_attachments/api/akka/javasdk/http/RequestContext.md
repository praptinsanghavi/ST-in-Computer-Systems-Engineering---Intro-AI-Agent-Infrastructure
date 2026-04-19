---
description: 'declaration: package: akka.javasdk.http, interface: RequestContext'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:21:21Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/RequestContext.html
title: RequestContext
---

# RequestContext

> **Summary:** declaration: package: akka.javasdk.http, interface: RequestContext

## Content

Package [akka.javasdk.http](package-summary.html)
# Interface RequestContext

All Superinterfaces:
`[Context](../Context.html "interface in akka.javasdk")`

---

@DoNotInherit
public interface RequestContext
extends [Context](../Context.html "interface in akka.javasdk")
Context information available during HTTP endpoint request processing.

 Provides access to request metadata including headers, query parameters, authentication
 information, and tracing capabilities for HTTP endpoint methods. This context is available during
 the processing of HTTP requests and provides essential information for request handling.

 

**Access Methods:**

- Extend [`AbstractHttpEndpoint`](AbstractHttpEndpoint.html "class in akka.javasdk.http") and use `requestContext()`
- Inject as constructor parameter into HTTP endpoint classes

**Request Headers:** Access HTTP headers via [`requestHeader(String)`](#requestHeader(java.lang.String)) for
 specific headers or [`allRequestHeaders()`](#allRequestHeaders()) for all headers. Header names are
 case\-insensitive.

 

**Query Parameters:** Use [`queryParams()`](#queryParams()) to access URL query parameters
 with type\-safe getters for common types like strings, integers, and booleans.

 

**Authentication invalid input: '\&' Authorization:** Use [`getPrincipals()`](#getPrincipals()) and [`getJwtClaims()`](#getJwtClaims()) to access authentication information for custom authorization logic. HTTP
 endpoints support ACL annotations and JWT validation.

 

**Tracing:** Access custom tracing capabilities via [`tracing()`](#tracing()) for
 observability and debugging.

 

Not for user extension, implementation provided by the SDK.

- ## Method Summary

Modifier and Type
Method
Description
`[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<akka.http.javadsl.model.HttpHeader>`
`[allRequestHeaders](#allRequestHeaders())()`
 
`[JwtClaims](../JwtClaims.html "interface in akka.javasdk")`
`[getJwtClaims](#getJwtClaims())()`
 
`[Principals](../Principals.html "interface in akka.javasdk")`
`[getPrincipals](#getPrincipals())()`

Get the principals associated with this request.

`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")>`
`[lastSeenSseEventId](#lastSeenSseEventId())()`
 
`[QueryParams](QueryParams.html "interface in akka.javasdk.http")`
`[queryParams](#queryParams())()`
 
`[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")<akka.http.javadsl.model.HttpHeader>`
`[requestHeader](#requestHeader(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") headerName)`
 
`[Tracing](../Tracing.html "interface in akka.javasdk")`
`[tracing](#tracing())()`

Access to tracing for custom app specific tracing.

### Methods inherited from interface akka.javasdk.[Context](../Context.html "interface in akka.javasdk")

`[selfRegion](../Context.html#selfRegion())`

- ## Method Details

	- ### getPrincipals
	
	
	[Principals](../Principals.html "interface in akka.javasdk") getPrincipals()
	Get the principals associated with this request.
	
	Returns:
	The principals associated with this request.
	- ### getJwtClaims
	
	
	[JwtClaims](../JwtClaims.html "interface in akka.javasdk") getJwtClaims()
	
	Returns:
	The JWT claims, if any, associated with this request.
	- ### requestHeader
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<akka.http.javadsl.model.HttpHeader\> requestHeader([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") headerName)
	
	Returns:
	A header with the given name (case ignored) if present in the current request,
	 Optional.empty() if not.
	- ### allRequestHeaders
	
	
	[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<akka.http.javadsl.model.HttpHeader\> allRequestHeaders()
	
	Returns:
	A list with all the headers of the current request
	- ### tracing
	
	
	[Tracing](../Tracing.html "interface in akka.javasdk") tracing()
	Access to tracing for custom app specific tracing.
	- ### queryParams
	
	
	[QueryParams](QueryParams.html "interface in akka.javasdk.http") queryParams()
	
	Returns:
	The query parameters of the current request.
	- ### lastSeenSseEventId
	
	
	[Optional](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Optional.html "class or interface in java.util")\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> lastSeenSseEventId()
	
	Returns:
	The last seen SSE id sent by the client on reconnects. If that is not sent by the
	 client Optional.empty is returned.

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Context.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/JwtClaims.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Principals.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/Tracing.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/AbstractHttpEndpoint.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/QueryParams.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/RequestContext.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/RequestContext.html)*