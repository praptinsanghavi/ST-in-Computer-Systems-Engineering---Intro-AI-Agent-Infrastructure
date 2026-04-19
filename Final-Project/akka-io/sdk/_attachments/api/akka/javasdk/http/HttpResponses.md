---
description: 'declaration: package: akka.javasdk.http, class: HttpResponses'
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:21:22Z'
section: sdk
site: akka-io
source_url: https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpResponses.html
title: HttpResponses
---

# HttpResponses

> **Summary:** declaration: package: akka.javasdk.http, class: HttpResponses

## Content

Package [akka.javasdk.http](package-summary.html)
# Class HttpResponses

[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
akka.javasdk.http.HttpResponses

---

public class HttpResponses
extends [Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")
Factory class for creating common HTTP responses in endpoint methods.

 HttpResponses provides convenient factory methods for creating `HttpResponse` objects for the most common HTTP status codes and response
 types. This eliminates the need to work directly with the lower\-level Akka HTTP APIs in most
 cases.

 

**Response Types:**

- **Success responses:** [`ok()`](#ok()), [`created()`](#created()), [`accepted()`](#accepted()),
 [`noContent()`](#noContent())
- **Error responses:** [`badRequest()`](#badRequest()), [`notFound()`](#notFound()), [`internalServerError()`](#internalServerError())
- **Static content:** [`staticResource(String)`](#staticResource(java.lang.String)) for serving files
- **Streaming:** [`serverSentEvents(Source)`](#serverSentEvents(akka.stream.javadsl.Source)) for SSE responses

**Content Types:** Methods automatically set appropriate content types:

 

- String parameters result in `text/plain` responses
- Object parameters are serialized to JSON with `application/json`
- Static resources use MIME type detection based on file extension

**Response Customization:** All returned `HttpResponse` objects can be
 further customized with additional headers, different status codes, or other modifications using
 the Akka HTTP API.

 

**Static Resources:** Use [`staticResource(String)`](#staticResource(java.lang.String)) to serve files from the
 `src/main/resources/static-resources` directory. This is convenient for documentation or
 small web UIs but not recommended for production where UI and service lifecycles should be
 decoupled.

- ## Method Summary

Modifier and Type
Method
Description
`static akka.http.javadsl.model.HttpResponse`
`[accepted](#accepted())()`

Creates a 202 ACCEPTED response.

`static akka.http.javadsl.model.HttpResponse`
`[accepted](#accepted(java.lang.Object))([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") object)`

Creates a 202 ACCEPTED response with an application/json body.

`static akka.http.javadsl.model.HttpResponse`
`[accepted](#accepted(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)`

Creates a 202 ACCEPTED response with a text/plain body.

`static akka.http.javadsl.model.HttpResponse`
`[badRequest](#badRequest())()`

Creates a 400 BAD REQUEST response.

`static akka.http.javadsl.model.HttpResponse`
`[badRequest](#badRequest(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)`

Creates a 400 BAD REQUEST response with a text/plain body.

`static akka.http.javadsl.model.HttpResponse`
`[created](#created())()`

Creates a 201 CREATED response.

`static akka.http.javadsl.model.HttpResponse`
`[created](#created(java.lang.Object))([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") object)`

Creates a 201 CREATED response with an application/json body The passed Object is serialized to
 json using the application's default Jackson serializer.

`static akka.http.javadsl.model.HttpResponse`
`[created](#created(java.lang.Object,java.lang.String))([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") object,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") location)`

Creates a 201 CREATED response with an application/json body and a location header.

`static akka.http.javadsl.model.HttpResponse`
`[created](#created(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)`

Creates a 201 CREATED response with a text/plain body.

`static akka.http.javadsl.model.HttpResponse`
`[created](#created(java.lang.String,java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") location)`

Creates a 201 CREATED response with a text/plain body and a location header.

`static akka.http.javadsl.model.HttpResponse`
`[internalServerError](#internalServerError())()`

Creates a 500 INTERNAL SERVER ERROR response.

`static akka.http.javadsl.model.HttpResponse`
`[internalServerError](#internalServerError(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)`

Creates a 500 INTERNAL SERVER ERROR response with a text/plain body.

`static akka.http.javadsl.model.HttpResponse`
`[noContent](#noContent())()`

Creates a 204 NO CONTENT response.

`static akka.http.javadsl.model.HttpResponse`
`[notFound](#notFound())()`

Creates a 404 NOT FOUND response.

`static akka.http.javadsl.model.HttpResponse`
`[notFound](#notFound(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)`

Creates a 404 NOT FOUND response with a text/plain body.

`static akka.http.javadsl.model.HttpResponse`
`[notImplemented](#notImplemented())()`

Creates a 501 NOT IMPLEMENTED response.

`static akka.http.javadsl.model.HttpResponse`
`[notImplemented](#notImplemented(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)`

Creates a 501 NOT IMPLEMENTED response with a text/plain body.

`static akka.http.javadsl.model.HttpResponse`
`[of](#of(akka.http.javadsl.model.StatusCode,akka.http.javadsl.model.ContentType,byte%5B%5D))(akka.http.javadsl.model.StatusCode statusCode,
 akka.http.javadsl.model.ContentType contentType,
 byte[] body)`

Creates an HTTP response with specified status code, content type and body.

`static akka.http.javadsl.model.HttpResponse`
`[ok](#ok())()`

Creates a 200 OK response.

`static akka.http.javadsl.model.HttpResponse`
`[ok](#ok(java.lang.Object))([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") object)`

Creates a 200 OK response with an application/json body.

`static akka.http.javadsl.model.HttpResponse`
`[ok](#ok(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)`

Creates a 200 OK response with a text/plain body.

`static <T> akka.http.javadsl.model.HttpResponse`
`[serverSentEvents](#serverSentEvents(akka.stream.javadsl.Source))(akka.stream.javadsl.Source<T,?> source)`

Return a stream of events as an HTTP SSE response.

`static <T> akka.http.javadsl.model.HttpResponse`
`[serverSentEvents](#serverSentEvents(akka.stream.javadsl.Source,java.util.function.Function))(akka.stream.javadsl.Source<T,?> source,
 [Function](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html "class or interface in java.util.function")<T,[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")> extractEventId)`

Return a stream of events as an HTTP SSE response.

`static <T> akka.http.javadsl.model.HttpResponse`
`[serverSentEvents](#serverSentEvents(akka.stream.javadsl.Source,java.util.function.Function,java.util.function.Function))(akka.stream.javadsl.Source<T,?> source,
 [Function](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html "class or interface in java.util.function")<T,[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")> extractEventId,
 [Function](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html "class or interface in java.util.function")<T,[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")> extractEventType)`

Return a stream of events as an HTTP Server Sent Events (SSE) response.

`static <T> akka.http.javadsl.model.HttpResponse`
`[serverSentEventsForView](#serverSentEventsForView(akka.stream.javadsl.Source))(akka.stream.javadsl.Source<[EntryWithMetadata](../view/EntryWithMetadata.html "class in akka.javasdk.view")<T>,?> source)`

Convenience for emitting a streaming\-updates view query as resume\-able SSE stream, where the
 latest seen event is where the query continues on reconnect.

`static akka.http.javadsl.model.HttpResponse`
`[staticResource](#staticResource(akka.http.javadsl.model.HttpRequest,java.lang.String))(akka.http.javadsl.model.HttpRequest request,
 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") prefixToStrip)`

Load a resource from the class\-path directory `static-resources` and return it as an
 HTTP response.

`static akka.http.javadsl.model.HttpResponse`
`[staticResource](#staticResource(java.lang.String))([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") resourcePath)`

Load a resource from the class\-path directory `static-resources` and return it as an
 HTTP response.

`static akka.http.javadsl.model.HttpResponse`
`[streamText](#streamText(akka.stream.javadsl.Source))(akka.stream.javadsl.Source<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),?> source)`
 

### Methods inherited from class java.lang.[Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang")

`[clone](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#clone() "class or interface in java.lang"), [equals](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#equals(java.lang.Object) "class or interface in java.lang"), [finalize](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#finalize() "class or interface in java.lang"), [getClass](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#getClass() "class or interface in java.lang"), [hashCode](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#hashCode() "class or interface in java.lang"), [notify](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notify() "class or interface in java.lang"), [notifyAll](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#notifyAll() "class or interface in java.lang"), [toString](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#toString() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait() "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long) "class or interface in java.lang"), [wait](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html#wait(long,int) "class or interface in java.lang")`

- ## Method Details

	- ### of
	
	
	public static akka.http.javadsl.model.HttpResponse of(akka.http.javadsl.model.StatusCode statusCode,
	 akka.http.javadsl.model.ContentType contentType,
	 byte\[] body)
	Creates an HTTP response with specified status code, content type and body.
	
	Parameters:
	`statusCode` \- HTTP status code
	`contentType` \- HTTP content type
	`body` \- HTTP body
	- ### ok
	
	
	public static akka.http.javadsl.model.HttpResponse ok()
	Creates a 200 OK response.
	- ### ok
	
	
	public static akka.http.javadsl.model.HttpResponse ok([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)
	Creates a 200 OK response with a text/plain body.
	- ### ok
	
	
	public static akka.http.javadsl.model.HttpResponse ok([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") object)
	Creates a 200 OK response with an application/json body. The passed Object is serialized to
	 json using the application's default Jackson serializer.
	- ### created
	
	
	public static akka.http.javadsl.model.HttpResponse created()
	Creates a 201 CREATED response.
	- ### created
	
	
	public static akka.http.javadsl.model.HttpResponse created([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)
	Creates a 201 CREATED response with a text/plain body.
	- ### created
	
	
	public static akka.http.javadsl.model.HttpResponse created([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") location)
	Creates a 201 CREATED response with a text/plain body and a location header.
	- ### created
	
	
	public static akka.http.javadsl.model.HttpResponse created([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") object)
	Creates a 201 CREATED response with an application/json body The passed Object is serialized to
	 json using the application's default Jackson serializer.
	- ### created
	
	
	public static akka.http.javadsl.model.HttpResponse created([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") object,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") location)
	Creates a 201 CREATED response with an application/json body and a location header. The passed
	 Object is serialized to json using the application's default Jackson serializer.
	- ### accepted
	
	
	public static akka.http.javadsl.model.HttpResponse accepted()
	Creates a 202 ACCEPTED response.
	- ### accepted
	
	
	public static akka.http.javadsl.model.HttpResponse accepted([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)
	Creates a 202 ACCEPTED response with a text/plain body.
	- ### accepted
	
	
	public static akka.http.javadsl.model.HttpResponse accepted([Object](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Object.html "class or interface in java.lang") object)
	Creates a 202 ACCEPTED response with an application/json body. The passed Object is serialized
	 to json using the application's default Jackson serializer.
	- ### noContent
	
	
	public static akka.http.javadsl.model.HttpResponse noContent()
	Creates a 204 NO CONTENT response.
	- ### badRequest
	
	
	public static akka.http.javadsl.model.HttpResponse badRequest()
	Creates a 400 BAD REQUEST response.
	- ### badRequest
	
	
	public static akka.http.javadsl.model.HttpResponse badRequest([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)
	Creates a 400 BAD REQUEST response with a text/plain body.
	- ### notFound
	
	
	public static akka.http.javadsl.model.HttpResponse notFound()
	Creates a 404 NOT FOUND response.
	- ### notFound
	
	
	public static akka.http.javadsl.model.HttpResponse notFound([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)
	Creates a 404 NOT FOUND response with a text/plain body.
	- ### internalServerError
	
	
	public static akka.http.javadsl.model.HttpResponse internalServerError()
	Creates a 500 INTERNAL SERVER ERROR response.
	- ### internalServerError
	
	
	public static akka.http.javadsl.model.HttpResponse internalServerError([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)
	Creates a 500 INTERNAL SERVER ERROR response with a text/plain body.
	- ### notImplemented
	
	
	public static akka.http.javadsl.model.HttpResponse notImplemented()
	Creates a 501 NOT IMPLEMENTED response.
	- ### notImplemented
	
	
	public static akka.http.javadsl.model.HttpResponse notImplemented([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") text)
	Creates a 501 NOT IMPLEMENTED response with a text/plain body.
	- ### staticResource
	
	
	public static akka.http.javadsl.model.HttpResponse staticResource([String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") resourcePath)
	Load a resource from the class\-path directory `static-resources` and return it as an
	 HTTP response.
	
	Parameters:
	`resourcePath` \- A relative path to the resource folder `static-resources` on the
	 class path. Must not start with `/`. An empty path or a path ending with `/`  will serve `index.html` from that directory.
	Returns:
	A 404 not found response if there is no such resource. 403 forbidden if the path
	 contains `..`.
	- ### staticResource
	
	
	public static akka.http.javadsl.model.HttpResponse staticResource(akka.http.javadsl.model.HttpRequest request,
	 [String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang") prefixToStrip)
	Load a resource from the class\-path directory `static-resources` and return it as an
	 HTTP response.
	
	Parameters:
	`request` \- A request to use the path from
	`prefixToStrip` \- Strip this prefix from the request path, to create the actual path
	 relative to `static-resources` to load the resource from. Must not be empty.
	Returns:
	A 404 not found response if there is no such resource. 403 forbidden if the path
	 contains `..`. When the stripped path is empty or ends with `/`,
	 `index.html` is served automatically.
	Throws:
	`[RuntimeException](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/RuntimeException.html "class or interface in java.lang")` \- if the request path does not start with `prefixToStrip` or
	 if `prefixToStrip` is empty
	- ### streamText
	
	
	public static akka.http.javadsl.model.HttpResponse streamText(akka.stream.javadsl.Source\<[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang"),?\> source)
	
	Parameters:
	`source` \- A stream of text
	Returns:
	A chunked HTTP response that will emit the text as it arrives rather than collect all
	 before responding
	- ### serverSentEvents
	
	
	public static \<T\>
	akka.http.javadsl.model.HttpResponse serverSentEvents(akka.stream.javadsl.Source\<T,?\> source)
	Return a stream of events as an HTTP SSE response. [See the Living HTML
	 standard for more details on SSE](https://html.spec.whatwg.org/multipage/server-sent-events.html)
	**Note** that browsers only support consuming SSE using HTTP GET requests.
	
	 
	
	**Note** in most cases you should use one of the overloads extracting an event id so that
	 clients can reconnect and continue the stream form the last seen event in case the response
	 connection is lost. This overload of the method can only be used in scenarios where a
	 reconnecting client without any offset to start from is fine.
	
	
	
	Returns:
	A HttpResponse with a server sent events (SSE) stream response. The HTTP response will
	 contain each element in the source, rendered to JSON using jackson. An SSE keepalive
	 element is emitted every 10 seconds if the stream is idle.
	- ### serverSentEvents
	
	
	public static \<T\>
	akka.http.javadsl.model.HttpResponse serverSentEvents(akka.stream.javadsl.Source\<T,?\> source,
	 [Function](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html "class or interface in java.util.function")\<T,[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> extractEventId)
	Return a stream of events as an HTTP SSE response. [See the Living HTML
	 standard for more details on SSE](https://html.spec.whatwg.org/multipage/server-sent-events.html)
	**Note** that browsers only support consuming SSE using HTTP GET requests.
	
	
	
	Parameters:
	`extractEventId` \- A function to extract a unique id or offset from the events to include in
	 the stream as SSE event id. This is then used by clients, passed as a header, in an HTTP
	 endpoint this will be available from [`RequestContext.lastSeenSseEventId()`](RequestContext.html#lastSeenSseEventId()) in the
	 HTTP endpoint. The extracted string id must not contain the null character, line feed or
	 carriage return.
	Returns:
	A HttpResponse with a server sent events (SSE) stream response. The HTTP response will
	 contain each element in the source, rendered to JSON using jackson. An SSE keepalive
	 element is emitted every 10 seconds if the stream is idle.
	- ### serverSentEvents
	
	
	public static \<T\>
	akka.http.javadsl.model.HttpResponse serverSentEvents(akka.stream.javadsl.Source\<T,?\> source,
	 [Function](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html "class or interface in java.util.function")\<T,[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> extractEventId,
	 [Function](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html "class or interface in java.util.function")\<T,[String](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html "class or interface in java.lang")\> extractEventType)
	Return a stream of events as an HTTP Server Sent Events (SSE) response. [See the Living HTML
	 standard for more details on SSE](https://html.spec.whatwg.org/multipage/server-sent-events.html).
	
	 **Note** that browsers only support consuming SSE using HTTP GET requests.
	
	
	
	Parameters:
	`extractEventId` \- A function to extract a unique id or offset from the events to include in
	 the stream as SSE event id. This is then used by clients, passed as a header, in an HTTP
	 endpoint this will be available from [`RequestContext.lastSeenSseEventId()`](RequestContext.html#lastSeenSseEventId()) in the
	 HTTP endpoint. The extracted string id must not contain the null character, line feed or
	 carriage return.
	`extractEventType` \- A function extracting an event type for the event, making it easier for
	 the SSE client to distinguish between a set of different kinds of events emitted.
	Returns:
	A HttpResponse with a server sent events (SSE) stream response. The HTTP response will
	 contain each element in the source, rendered to JSON using jackson. An SSE keepalive
	 element is emitted every 10 seconds if the stream is idle.
	- ### serverSentEventsForView
	
	
	public static \<T\>
	akka.http.javadsl.model.HttpResponse serverSentEventsForView(akka.stream.javadsl.Source\<[EntryWithMetadata](../view/EntryWithMetadata.html "class in akka.javasdk.view")\<T\>,?\> source)
	Convenience for emitting a streaming\-updates view query as resume\-able SSE stream, where the
	 latest seen event is where the query continues on reconnect.
	
	Type Parameters:
	`T` \- The type of the entries in the view
	Parameters:
	`source` \- A source from the view component client
	Returns:
	An HTTP stream with the events from the query

## Related Pages (Internal Links)

- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/RequestContext.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/package-summary.html
- https://doc.akka.io/sdk/_attachments/api/akka/javasdk/view/EntryWithMetadata.html

---
*Source: [https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpResponses.html](https://doc.akka.io/sdk/_attachments/api/akka/javasdk/http/HttpResponses.html)*