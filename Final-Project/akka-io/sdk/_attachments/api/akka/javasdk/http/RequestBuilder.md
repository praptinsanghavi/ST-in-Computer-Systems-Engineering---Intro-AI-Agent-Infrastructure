---
description: 'declaration: package: akka.javasdk.http, interface: RequestBuilder'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:32:41Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/RequestBuilder.html
title: RequestBuilder
---

# RequestBuilder

> **Summary:** declaration: package: akka.javasdk.http, interface: RequestBuilder

## Content

Package [akka.javasdk.http](package-summary.html)
# Interface RequestBuilder\<R\>

Type Parameters:
`R` \- The type the response body will be parsed into

---

@DoNotInherit
public interface RequestBuilder\<R\>
A builder for HTTP requests and handling of their responses

 Not for user extension, use [`HttpClient`](HttpClient.html "interface in akka.javasdk.http") to get an instance

- ## Method Summary

Modifier and Type
Method
Description
`[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")<[R](RequestBuilder.html "type parameter in RequestBuilder")>`
`[addCredentials](#addCredentials(akka.http.javadsl.model.headers.HttpCredentials))(akka.http.javadsl.model.headers.HttpCredentials credentials)`
 
`[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")<[R](RequestBuilder.html "type parameter in RequestBuilder")>`
`[addHeader](#addHeader(akka.http.javadsl.model.HttpHeader))(akka.http.javadsl.model.HttpHeader header)`
 
`[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")<[R](RequestBuilder.html "type parameter in RequestBuilder")>`
`[addHeader](#addHeader(java.lang.String,java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") header,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") value)`
 
`[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")<[R](RequestBuilder.html "type parameter in RequestBuilder")>`
`[addQueryParameter](#addQueryParameter(java.lang.String,java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") key,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") value)`
 
`[StrictResponse](StrictResponse.html "class in akka.javasdk.http")<[R](RequestBuilder.html "type parameter in RequestBuilder")>`
`[invoke](#invoke())()`
 
`[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")<[StrictResponse](StrictResponse.html "class in akka.javasdk.http")<[R](RequestBuilder.html "type parameter in RequestBuilder")>>`
`[invokeAsync](#invokeAsync())()`
 
`[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")<[R](RequestBuilder.html "type parameter in RequestBuilder")>`
`[modifyRequest](#modifyRequest(java.util.function.Function))([Function](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html "class or interface in java.util.function")<akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpRequest> adapter)`

Transform the request before sending it.

`<T> [RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")<T>`
`[parseResponseBody](#parseResponseBody(java.util.function.Function))([Function](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html "class or interface in java.util.function")<byte[],T> parse)`

Converts the response body to the specified type using the provided parser function.

`<T> [RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")<T>`
`[responseBodyAs](#responseBodyAs(java.lang.Class))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<T> type)`

Converts the response body to the specified type.

`<T> [RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")<[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")<T>>`
`[responseBodyAsListOf](#responseBodyAsListOf(java.lang.Class))([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")<T> elementType)`

Converts the response body as a list of the specified type.

`[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")<[R](RequestBuilder.html "type parameter in RequestBuilder")>`
`[withHeaders](#withHeaders(java.lang.Iterable))([Iterable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Iterable.html "class or interface in java.lang")<akka.http.javadsl.model.HttpHeader> headers)`
 
`[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")<[R](RequestBuilder.html "type parameter in RequestBuilder")>`
`[withRequest](#withRequest(akka.http.javadsl.model.HttpRequest))(akka.http.javadsl.model.HttpRequest request)`
 
`[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")<[R](RequestBuilder.html "type parameter in RequestBuilder")>`
`[withRequestBody](#withRequestBody(byte%5B%5D))(byte[] bytes)`

Prepare for sending an HTTP request with an application/octet\-stream body.

`[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")<[R](RequestBuilder.html "type parameter in RequestBuilder")>`
`[withRequestBody](#withRequestBody(akka.http.javadsl.model.ContentType,byte%5B%5D))(akka.http.javadsl.model.ContentType type,
 byte[] bytes)`

Prepare for sending an HTTP request with an arbitrary payload encoded as described by the
 content type

`[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")<[R](RequestBuilder.html "type parameter in RequestBuilder")>`
`[withRequestBody](#withRequestBody(java.lang.Object))([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") object)`

Prepare for sending an HTTP request with an application/json body.

`[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")<[R](RequestBuilder.html "type parameter in RequestBuilder")>`
`[withRequestBody](#withRequestBody(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)`

Prepare for sending an HTTP request with a text/plain body.

`[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")<[R](RequestBuilder.html "type parameter in RequestBuilder")>`
`[withRetry](#withRetry(int))(int maxRetries)`

Set the retry settings for this call.

`[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")<[R](RequestBuilder.html "type parameter in RequestBuilder")>`
`[withRetry](#withRetry(akka.pattern.RetrySettings))(akka.pattern.RetrySettings retrySettings)`

Set the retry settings for this call.

`[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")<[R](RequestBuilder.html "type parameter in RequestBuilder")>`
`[withTimeout](#withTimeout(java.time.Duration))([Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") timeout)`

- ## Method Details

	- ### withRequest
	
	
	[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<[R](RequestBuilder.html "type parameter in RequestBuilder")\> withRequest(akka.http.javadsl.model.HttpRequest request)
	- ### addHeader
	
	
	[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<[R](RequestBuilder.html "type parameter in RequestBuilder")\> addHeader([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") header,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") value)
	- ### addHeader
	
	
	[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<[R](RequestBuilder.html "type parameter in RequestBuilder")\> addHeader(akka.http.javadsl.model.HttpHeader header)
	- ### withHeaders
	
	
	[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<[R](RequestBuilder.html "type parameter in RequestBuilder")\> withHeaders([Iterable](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Iterable.html "class or interface in java.lang")\<akka.http.javadsl.model.HttpHeader\> headers)
	- ### addCredentials
	
	
	[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<[R](RequestBuilder.html "type parameter in RequestBuilder")\> addCredentials(akka.http.javadsl.model.headers.HttpCredentials credentials)
	- ### withTimeout
	
	
	[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<[R](RequestBuilder.html "type parameter in RequestBuilder")\> withTimeout([Duration](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/time/Duration.html "class or interface in java.time") timeout)
	- ### addQueryParameter
	
	
	[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<[R](RequestBuilder.html "type parameter in RequestBuilder")\> addQueryParameter([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") key,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") value)
	- ### modifyRequest
	
	
	[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<[R](RequestBuilder.html "type parameter in RequestBuilder")\> modifyRequest([Function](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html "class or interface in java.util.function")\<akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpRequest\> adapter)
	Transform the request before sending it. This method allows for extra request configuration.
	- ### withRequestBody
	
	
	[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<[R](RequestBuilder.html "type parameter in RequestBuilder")\> withRequestBody([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") object)
	Prepare for sending an HTTP request with an application/json body. The passed Object is
	 serialized to json using the application's default Jackson serializer.
	- ### withRequestBody
	
	
	[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<[R](RequestBuilder.html "type parameter in RequestBuilder")\> withRequestBody([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)
	Prepare for sending an HTTP request with a text/plain body.
	- ### withRequestBody
	
	
	[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<[R](RequestBuilder.html "type parameter in RequestBuilder")\> withRequestBody(byte\[] bytes)
	Prepare for sending an HTTP request with an application/octet\-stream body.
	- ### withRequestBody
	
	
	[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<[R](RequestBuilder.html "type parameter in RequestBuilder")\> withRequestBody(akka.http.javadsl.model.ContentType type,
	 byte\[] bytes)
	Prepare for sending an HTTP request with an arbitrary payload encoded as described by the
	 content type
	- ### withRetry
	
	
	[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<[R](RequestBuilder.html "type parameter in RequestBuilder")\> withRetry(akka.pattern.RetrySettings retrySettings)
	Set the retry settings for this call.
	
	Parameters:
	`retrySettings` \- The retry settings
	- ### withRetry
	
	
	[RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<[R](RequestBuilder.html "type parameter in RequestBuilder")\> withRetry(int maxRetries)
	Set the retry settings for this call. A predefined backoff strategy will be calculated based on
	 the number of maxRetries.
	
	Parameters:
	`maxRetries` \- The number of retries to make
	- ### invokeAsync
	
	
	[CompletionStage](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/CompletionStage.html "class or interface in java.util.concurrent")\<[StrictResponse](StrictResponse.html "class in akka.javasdk.http")\<[R](RequestBuilder.html "type parameter in RequestBuilder")\>\> invokeAsync()
	- ### invoke
	
	
	[StrictResponse](StrictResponse.html "class in akka.javasdk.http")\<[R](RequestBuilder.html "type parameter in RequestBuilder")\> invoke()
	- ### responseBodyAs
	
	
	\<T\> [RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<T\> responseBodyAs([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<T\> type)
	Converts the response body to the specified type.
	
	 The response body payload is expected to be a JSON object and will be deserialized to the
	 specified type using the application's default Jackson deserializer.
	
	
	
	Parameters:
	`type` \- the expected class type of the response body
	Returns:
	a RequestBuilder configured to produce a StrictResponse with a deserialized response
	 body of type T
	- ### responseBodyAsListOf
	
	
	\<T\> [RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<[List](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/List.html "class or interface in java.util")\<T\>\> responseBodyAsListOf([Class](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Class.html "class or interface in java.lang")\<T\> elementType)
	Converts the response body as a list of the specified type.
	
	 The response body payload is expected to be a JSON array and each element will be
	 deserialized to the specified type using the application's default Jackson deserializer.
	
	
	
	Parameters:
	`elementType` \- the expected class type of the response body
	Returns:
	a RequestBuilder configured to produce a StrictResponse with a deserialized response
	 body of type T
	- ### parseResponseBody
	
	
	\<T\> [RequestBuilder](RequestBuilder.html "interface in akka.javasdk.http")\<T\> parseResponseBody([Function](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html "class or interface in java.util.function")\<byte\[],T\> parse)
	Converts the response body to the specified type using the provided parser function.
	
	Parameters:
	`parse` \- the function to parse the response body
	Returns:
	a RequestBuilder configured to produce a StrictResponse with a deserialized response
	 body of type T

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpClient.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/RequestBuilder.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/StrictResponse.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/package-summary.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/RequestBuilder.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/RequestBuilder.html)*