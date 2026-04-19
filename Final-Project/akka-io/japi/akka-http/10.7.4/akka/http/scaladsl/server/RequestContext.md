---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
title: RequestContext
---

# RequestContext

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Interface RequestContext

- All Known Implementing Classes:
`[RequestContextImpl](RequestContextImpl.html "class in akka.http.scaladsl.server")`

---

```
public interface RequestContext
```

This class is not meant to be extended by user code.
 
 Immutable object encapsulating the context of an [`HttpRequest`](../model/HttpRequest.html "class in akka.http.scaladsl.model")
 as it flows through a akka\-http Route structure.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>` | `[complete](#complete(akka.http.scaladsl.marshalling.ToResponseMarshallable))​([ToResponseMarshallable](../marshalling/ToResponseMarshallable.html "interface in akka.http.scaladsl.marshalling") obj)` | Completes the request with the given ToResponseMarshallable. |
	| `scala.concurrent.ExecutionContextExecutor` | `[executionContext](#executionContext())()` | The default ExecutionContext to be used for scheduling asynchronous logic related to this request. |
	| `scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>` | `[fail](#fail(java.lang.Throwable))​(java.lang.Throwable error)` | Bubbles the given error up the response chain where it is dealt with by the closest `handleExceptions`  directive and its `ExceptionHandler`, unless the error is a `RejectionError`. |
	| `akka.event.LoggingAdapter` | `[log](#log())()` | The default LoggingAdapter to be used for logging messages related to this request. |
	| `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")` | `[mapRequest](#mapRequest(scala.Function1))​(scala.Function1<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")> f)` | Returns a copy of this context with the HttpRequest transformed by the given function. |
	| `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")` | `[mapUnmatchedPath](#mapUnmatchedPath(scala.Function1))​(scala.Function1<[Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model"),​[Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model")> f)` | Returns a copy of this context with the unmatchedPath transformed by the given function. |
	| `akka.stream.Materializer` | `[materializer](#materializer())()` | The default Materializer. |
	| `[ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings")` | `[parserSettings](#parserSettings())()` | The default ParserSettings to be used for configuring directives. |
	| `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")` | `[reconfigure](#reconfigure(scala.concurrent.ExecutionContextExecutor,akka.stream.Materializer,akka.event.LoggingAdapter,akka.http.scaladsl.settings.RoutingSettings))​(scala.concurrent.ExecutionContextExecutor executionContext,  akka.stream.Materializer materializer,  akka.event.LoggingAdapter log,  [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") settings)` | Returns a copy of this context with the given fields updated. |
	| `scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>` | `[redirect](#redirect(akka.http.scaladsl.model.Uri,akka.http.scaladsl.model.StatusCodes.Redirection))​([Uri](../model/Uri.html "class in akka.http.scaladsl.model") uri,  [StatusCodes.Redirection](../model/StatusCodes.Redirection.html "class in akka.http.scaladsl.model") redirectionType)` | Completes the request with redirection response of the given type to the given URI. |
	| `scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>` | `[reject](#reject(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Rejection](Rejection.html "interface in akka.http.scaladsl.server")> rejections)` | Rejects the request with the given rejections. |
	| `[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")` | `[request](#request())()` | The request this context represents. |
	| `[RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings")` | `[settings](#settings())()` | The default RoutingSettings to be used for configuring directives. |
	| `[Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model")` | `[unmatchedPath](#unmatchedPath())()` | The unmatched path of this context. |
	| `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")` | `[withAcceptAll](#withAcceptAll())()` | Removes a potentially existing Accept header from the request headers. |
	| `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")` | `[withExecutionContext](#withExecutionContext(scala.concurrent.ExecutionContextExecutor))​(scala.concurrent.ExecutionContextExecutor ec)` | Returns a copy of this context with the new HttpRequest. |
	| `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")` | `[withLog](#withLog(akka.event.LoggingAdapter))​(akka.event.LoggingAdapter log)` | Returns a copy of this context with the new LoggingAdapter. |
	| `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")` | `[withMaterializer](#withMaterializer(akka.stream.Materializer))​(akka.stream.Materializer materializer)` | Returns a copy of this context with the new HttpRequest. |
	| `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")` | `[withParserSettings](#withParserSettings(akka.http.scaladsl.settings.ParserSettings))​([ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") settings)` | Returns a copy of this context with the new [`ParserSettings`](../settings/ParserSettings.html "class in akka.http.scaladsl.settings"). |
	| `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")` | `[withRequest](#withRequest(akka.http.scaladsl.model.HttpRequest))​([HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") req)` | Returns a copy of this context with the new HttpRequest. |
	| `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")` | `[withRoutingSettings](#withRoutingSettings(akka.http.scaladsl.settings.RoutingSettings))​([RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") settings)` | Returns a copy of this context with the new RoutingSettings. |
	| `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")` | `[withUnmatchedPath](#withUnmatchedPath(akka.http.scaladsl.model.Uri.Path))​([Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model") path)` | Returns a copy of this context with the unmatched path updated to the given one. |

- - ### Method Detail
	
	
	
		- #### complete
		
		
		
		```
		scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")> complete​([ToResponseMarshallable](../marshalling/ToResponseMarshallable.html "interface in akka.http.scaladsl.marshalling") obj)
		```
		
		Completes the request with the given ToResponseMarshallable.
		
		Parameters:
		`obj` \- (undocumented)
		Returns:
		(undocumented)
		- #### executionContext
		
		
		
		```
		scala.concurrent.ExecutionContextExecutor executionContext()
		```
		
		The default ExecutionContext to be used for scheduling asynchronous logic related to this request.
		
		Returns:
		(undocumented)
		- #### fail
		
		
		
		```
		scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")> fail​(java.lang.Throwable error)
		```
		
		Bubbles the given error up the response chain where it is dealt with by the closest `handleExceptions`
		 directive and its `ExceptionHandler`, unless the error is a `RejectionError`. In this case the
		 wrapped rejection is unpacked and "executed".
		
		Parameters:
		`error` \- (undocumented)
		Returns:
		(undocumented)
		- #### log
		
		
		
		```
		akka.event.LoggingAdapter log()
		```
		
		The default LoggingAdapter to be used for logging messages related to this request.
		
		Returns:
		(undocumented)
		- #### mapRequest
		
		
		
		```
		[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") mapRequest​(scala.Function1<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")> f)
		```
		
		Returns a copy of this context with the HttpRequest transformed by the given function.
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### mapUnmatchedPath
		
		
		
		```
		[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") mapUnmatchedPath​(scala.Function1<[Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model"),​[Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model")> f)
		```
		
		Returns a copy of this context with the unmatchedPath transformed by the given function.
		
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### materializer
		
		
		
		```
		akka.stream.Materializer materializer()
		```
		
		The default Materializer.
		
		Returns:
		(undocumented)
		- #### parserSettings
		
		
		
		```
		[ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings()
		```
		
		The default ParserSettings to be used for configuring directives.
		
		Returns:
		(undocumented)
		- #### reconfigure
		
		
		
		```
		[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") reconfigure​(scala.concurrent.ExecutionContextExecutor executionContext,
		                           akka.stream.Materializer materializer,
		                           akka.event.LoggingAdapter log,
		                           [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") settings)
		```
		
		Returns a copy of this context with the given fields updated.
		
		Parameters:
		`executionContext` \- (undocumented)
		`materializer` \- (undocumented)
		`log` \- (undocumented)
		`settings` \- (undocumented)
		Returns:
		(undocumented)
		- #### redirect
		
		
		
		```
		scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")> redirect​([Uri](../model/Uri.html "class in akka.http.scaladsl.model") uri,
		                                              [StatusCodes.Redirection](../model/StatusCodes.Redirection.html "class in akka.http.scaladsl.model") redirectionType)
		```
		
		Completes the request with redirection response of the given type to the given URI.
		 
		
		Parameters:
		`uri` \- (undocumented)
		`redirectionType` \- (undocumented)
		Returns:
		(undocumented)
		- #### reject
		
		
		
		```
		scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")> reject​(scala.collection.immutable.Seq<[Rejection](Rejection.html "interface in akka.http.scaladsl.server")> rejections)
		```
		
		Rejects the request with the given rejections.
		
		Parameters:
		`rejections` \- (undocumented)
		Returns:
		(undocumented)
		- #### request
		
		
		
		```
		[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") request()
		```
		
		The request this context represents. Modelled as a \`val\` so as to enable an \`import ctx.request.\_\`.
		- #### settings
		
		
		
		```
		[RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") settings()
		```
		
		The default RoutingSettings to be used for configuring directives.
		
		Returns:
		(undocumented)
		- #### unmatchedPath
		
		
		
		```
		[Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model") unmatchedPath()
		```
		
		The unmatched path of this context. Modelled as a \`val\` so as to enable an \`import ctx.unmatchedPath.\_\`.
		- #### withAcceptAll
		
		
		
		```
		[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") withAcceptAll()
		```
		
		Removes a potentially existing Accept header from the request headers.
		
		Returns:
		(undocumented)
		- #### withExecutionContext
		
		
		
		```
		[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") withExecutionContext​(scala.concurrent.ExecutionContextExecutor ec)
		```
		
		Returns a copy of this context with the new HttpRequest.
		
		Parameters:
		`ec` \- (undocumented)
		Returns:
		(undocumented)
		- #### withLog
		
		
		
		```
		[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") withLog​(akka.event.LoggingAdapter log)
		```
		
		Returns a copy of this context with the new LoggingAdapter.
		
		Parameters:
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### withMaterializer
		
		
		
		```
		[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") withMaterializer​(akka.stream.Materializer materializer)
		```
		
		Returns a copy of this context with the new HttpRequest.
		
		Parameters:
		`materializer` \- (undocumented)
		Returns:
		(undocumented)
		- #### withParserSettings
		
		
		
		```
		[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") withParserSettings​([ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") settings)
		```
		
		Returns a copy of this context with the new [`ParserSettings`](../settings/ParserSettings.html "class in akka.http.scaladsl.settings").
		
		Parameters:
		`settings` \- (undocumented)
		Returns:
		(undocumented)
		- #### withRequest
		
		
		
		```
		[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") withRequest​([HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") req)
		```
		
		Returns a copy of this context with the new HttpRequest.
		
		Parameters:
		`req` \- (undocumented)
		Returns:
		(undocumented)
		- #### withRoutingSettings
		
		
		
		```
		[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") withRoutingSettings​([RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") settings)
		```
		
		Returns a copy of this context with the new RoutingSettings.
		
		Parameters:
		`settings` \- (undocumented)
		Returns:
		(undocumented)
		- #### withUnmatchedPath
		
		
		
		```
		[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") withUnmatchedPath​([Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model") path)
		```
		
		Returns a copy of this context with the unmatched path updated to the given one.
		
		Parameters:
		`path` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/marshalling/ToResponseMarshallable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/StatusCodes.Redirection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Uri.Path.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RequestContextImpl.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/settings/RoutingSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html)*