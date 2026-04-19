---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestContextImpl.html
title: RequestContextImpl
---

# RequestContextImpl

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class RequestContextImpl

- java.lang.Object
- - akka.http.scaladsl.server.RequestContextImpl

- All Implemented Interfaces:
`[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`

---

```
public class RequestContextImpl
extends java.lang.Object
implements [RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RequestContextImpl](#%3Cinit%3E(akka.http.scaladsl.model.HttpRequest,akka.event.LoggingAdapter,akka.http.scaladsl.settings.RoutingSettings,akka.http.scaladsl.settings.ParserSettings,scala.concurrent.ExecutionContextExecutor,akka.stream.Materializer))​([HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") request,  akka.event.LoggingAdapter log,  [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") settings,  [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings,  scala.concurrent.ExecutionContextExecutor ec,  akka.stream.Materializer materializer)` |  |
	| `[RequestContextImpl](#%3Cinit%3E(akka.http.scaladsl.model.HttpRequest,akka.http.scaladsl.model.Uri.Path,scala.concurrent.ExecutionContextExecutor,akka.stream.Materializer,akka.event.LoggingAdapter,akka.http.scaladsl.settings.RoutingSettings,akka.http.scaladsl.settings.ParserSettings))​([HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") request,  [Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model") unmatchedPath,  scala.concurrent.ExecutionContextExecutor executionContext,  akka.stream.Materializer materializer,  akka.event.LoggingAdapter log,  [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") settings,  [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>` | `[complete](#complete(akka.http.scaladsl.marshalling.ToResponseMarshallable))​([ToResponseMarshallable](../marshalling/ToResponseMarshallable.html "interface in akka.http.scaladsl.marshalling") trm)` | Completes the request with the given ToResponseMarshallable. |
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
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `[Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model")` | `[unmatchedPath](#unmatchedPath())()` | The unmatched path of this context. |
	| `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")` | `[withAcceptAll](#withAcceptAll())()` | Removes a potentially existing Accept header from the request headers. |
	| `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")` | `[withExecutionContext](#withExecutionContext(scala.concurrent.ExecutionContextExecutor))​(scala.concurrent.ExecutionContextExecutor executionContext)` | Returns a copy of this context with the new HttpRequest. |
	| `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")` | `[withLog](#withLog(akka.event.LoggingAdapter))​(akka.event.LoggingAdapter log)` | Returns a copy of this context with the new LoggingAdapter. |
	| `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")` | `[withMaterializer](#withMaterializer(akka.stream.Materializer))​(akka.stream.Materializer materializer)` | Returns a copy of this context with the new HttpRequest. |
	| `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")` | `[withParserSettings](#withParserSettings(akka.http.scaladsl.settings.ParserSettings))​([ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings)` | Returns a copy of this context with the new [`ParserSettings`](../settings/ParserSettings.html "class in akka.http.scaladsl.settings"). |
	| `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")` | `[withRequest](#withRequest(akka.http.scaladsl.model.HttpRequest))​([HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") request)` | Returns a copy of this context with the new HttpRequest. |
	| `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")` | `[withRoutingSettings](#withRoutingSettings(akka.http.scaladsl.settings.RoutingSettings))​([RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") routingSettings)` | Returns a copy of this context with the new RoutingSettings. |
	| `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")` | `[withUnmatchedPath](#withUnmatchedPath(akka.http.scaladsl.model.Uri.Path))​([Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model") path)` | Returns a copy of this context with the unmatched path updated to the given one. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RequestContextImpl
		
		
		
		```
		public RequestContextImpl​([HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") request,
		                          [Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model") unmatchedPath,
		                          scala.concurrent.ExecutionContextExecutor executionContext,
		                          akka.stream.Materializer materializer,
		                          akka.event.LoggingAdapter log,
		                          [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") settings,
		                          [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings)
		```
		- #### RequestContextImpl
		
		
		
		```
		public RequestContextImpl​([HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") request,
		                          akka.event.LoggingAdapter log,
		                          [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") settings,
		                          [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings,
		                          scala.concurrent.ExecutionContextExecutor ec,
		                          akka.stream.Materializer materializer)
		```

	- ### Method Detail
	
	
	
		- #### complete
		
		
		
		```
		public scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")> complete​([ToResponseMarshallable](../marshalling/ToResponseMarshallable.html "interface in akka.http.scaladsl.marshalling") trm)
		```
		
		Description copied from interface: `[RequestContext](RequestContext.html#complete(akka.http.scaladsl.marshalling.ToResponseMarshallable))`
		Completes the request with the given ToResponseMarshallable.
		
		Specified by:
		`[complete](RequestContext.html#complete(akka.http.scaladsl.marshalling.ToResponseMarshallable))` in interface `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`
		Parameters:
		`trm` \- (undocumented)
		Returns:
		(undocumented)
		- #### executionContext
		
		
		
		```
		public scala.concurrent.ExecutionContextExecutor executionContext()
		```
		
		Description copied from interface: `[RequestContext](RequestContext.html#executionContext())`
		The default ExecutionContext to be used for scheduling asynchronous logic related to this request.
		
		Specified by:
		`[executionContext](RequestContext.html#executionContext())` in interface `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### fail
		
		
		
		```
		public scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")> fail​(java.lang.Throwable error)
		```
		
		Description copied from interface: `[RequestContext](RequestContext.html#fail(java.lang.Throwable))`
		Bubbles the given error up the response chain where it is dealt with by the closest `handleExceptions`
		 directive and its `ExceptionHandler`, unless the error is a `RejectionError`. In this case the
		 wrapped rejection is unpacked and "executed".
		
		Specified by:
		`[fail](RequestContext.html#fail(java.lang.Throwable))` in interface `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`
		Parameters:
		`error` \- (undocumented)
		Returns:
		(undocumented)
		- #### log
		
		
		
		```
		public akka.event.LoggingAdapter log()
		```
		
		Description copied from interface: `[RequestContext](RequestContext.html#log())`
		The default LoggingAdapter to be used for logging messages related to this request.
		
		Specified by:
		`[log](RequestContext.html#log())` in interface `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### mapRequest
		
		
		
		```
		public [RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") mapRequest​(scala.Function1<[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model")> f)
		```
		
		Description copied from interface: `[RequestContext](RequestContext.html#mapRequest(scala.Function1))`
		Returns a copy of this context with the HttpRequest transformed by the given function.
		
		Specified by:
		`[mapRequest](RequestContext.html#mapRequest(scala.Function1))` in interface `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### mapUnmatchedPath
		
		
		
		```
		public [RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") mapUnmatchedPath​(scala.Function1<[Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model"),​[Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model")> f)
		```
		
		Description copied from interface: `[RequestContext](RequestContext.html#mapUnmatchedPath(scala.Function1))`
		Returns a copy of this context with the unmatchedPath transformed by the given function.
		
		Specified by:
		`[mapUnmatchedPath](RequestContext.html#mapUnmatchedPath(scala.Function1))` in interface `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`
		Parameters:
		`f` \- (undocumented)
		Returns:
		(undocumented)
		- #### materializer
		
		
		
		```
		public akka.stream.Materializer materializer()
		```
		
		Description copied from interface: `[RequestContext](RequestContext.html#materializer())`
		The default Materializer.
		
		Specified by:
		`[materializer](RequestContext.html#materializer())` in interface `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### parserSettings
		
		
		
		```
		public [ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings()
		```
		
		Description copied from interface: `[RequestContext](RequestContext.html#parserSettings())`
		The default ParserSettings to be used for configuring directives.
		
		Specified by:
		`[parserSettings](RequestContext.html#parserSettings())` in interface `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### reconfigure
		
		
		
		```
		public [RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") reconfigure​(scala.concurrent.ExecutionContextExecutor executionContext,
		                                  akka.stream.Materializer materializer,
		                                  akka.event.LoggingAdapter log,
		                                  [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") settings)
		```
		
		Description copied from interface: `[RequestContext](RequestContext.html#reconfigure(scala.concurrent.ExecutionContextExecutor,akka.stream.Materializer,akka.event.LoggingAdapter,akka.http.scaladsl.settings.RoutingSettings))`
		Returns a copy of this context with the given fields updated.
		
		Specified by:
		`[reconfigure](RequestContext.html#reconfigure(scala.concurrent.ExecutionContextExecutor,akka.stream.Materializer,akka.event.LoggingAdapter,akka.http.scaladsl.settings.RoutingSettings))` in interface `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`
		Parameters:
		`executionContext` \- (undocumented)
		`materializer` \- (undocumented)
		`log` \- (undocumented)
		`settings` \- (undocumented)
		Returns:
		(undocumented)
		- #### redirect
		
		
		
		```
		public scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")> redirect​([Uri](../model/Uri.html "class in akka.http.scaladsl.model") uri,
		                                                     [StatusCodes.Redirection](../model/StatusCodes.Redirection.html "class in akka.http.scaladsl.model") redirectionType)
		```
		
		Description copied from interface: `[RequestContext](RequestContext.html#redirect(akka.http.scaladsl.model.Uri,akka.http.scaladsl.model.StatusCodes.Redirection))`
		Completes the request with redirection response of the given type to the given URI.
		 
		
		Specified by:
		`[redirect](RequestContext.html#redirect(akka.http.scaladsl.model.Uri,akka.http.scaladsl.model.StatusCodes.Redirection))` in interface `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`
		Parameters:
		`uri` \- (undocumented)
		`redirectionType` \- (undocumented)
		Returns:
		(undocumented)
		- #### reject
		
		
		
		```
		public scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")> reject​(scala.collection.immutable.Seq<[Rejection](Rejection.html "interface in akka.http.scaladsl.server")> rejections)
		```
		
		Description copied from interface: `[RequestContext](RequestContext.html#reject(scala.collection.immutable.Seq))`
		Rejects the request with the given rejections.
		
		Specified by:
		`[reject](RequestContext.html#reject(scala.collection.immutable.Seq))` in interface `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`
		Parameters:
		`rejections` \- (undocumented)
		Returns:
		(undocumented)
		- #### request
		
		
		
		```
		public [HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") request()
		```
		
		Description copied from interface: `[RequestContext](RequestContext.html#request())`
		The request this context represents. Modelled as a \`val\` so as to enable an \`import ctx.request.\_\`.
		
		Specified by:
		`[request](RequestContext.html#request())` in interface `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`
		- #### settings
		
		
		
		```
		public [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") settings()
		```
		
		Description copied from interface: `[RequestContext](RequestContext.html#settings())`
		The default RoutingSettings to be used for configuring directives.
		
		Specified by:
		`[settings](RequestContext.html#settings())` in interface `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### unmatchedPath
		
		
		
		```
		public [Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model") unmatchedPath()
		```
		
		Description copied from interface: `[RequestContext](RequestContext.html#unmatchedPath())`
		The unmatched path of this context. Modelled as a \`val\` so as to enable an \`import ctx.unmatchedPath.\_\`.
		
		Specified by:
		`[unmatchedPath](RequestContext.html#unmatchedPath())` in interface `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`
		- #### withAcceptAll
		
		
		
		```
		public [RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") withAcceptAll()
		```
		
		Description copied from interface: `[RequestContext](RequestContext.html#withAcceptAll())`
		Removes a potentially existing Accept header from the request headers.
		
		Specified by:
		`[withAcceptAll](RequestContext.html#withAcceptAll())` in interface `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### withExecutionContext
		
		
		
		```
		public [RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") withExecutionContext​(scala.concurrent.ExecutionContextExecutor executionContext)
		```
		
		Description copied from interface: `[RequestContext](RequestContext.html#withExecutionContext(scala.concurrent.ExecutionContextExecutor))`
		Returns a copy of this context with the new HttpRequest.
		
		Specified by:
		`[withExecutionContext](RequestContext.html#withExecutionContext(scala.concurrent.ExecutionContextExecutor))` in interface `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`
		Parameters:
		`executionContext` \- (undocumented)
		Returns:
		(undocumented)
		- #### withLog
		
		
		
		```
		public [RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") withLog​(akka.event.LoggingAdapter log)
		```
		
		Description copied from interface: `[RequestContext](RequestContext.html#withLog(akka.event.LoggingAdapter))`
		Returns a copy of this context with the new LoggingAdapter.
		
		Specified by:
		`[withLog](RequestContext.html#withLog(akka.event.LoggingAdapter))` in interface `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`
		Parameters:
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### withMaterializer
		
		
		
		```
		public [RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") withMaterializer​(akka.stream.Materializer materializer)
		```
		
		Description copied from interface: `[RequestContext](RequestContext.html#withMaterializer(akka.stream.Materializer))`
		Returns a copy of this context with the new HttpRequest.
		
		Specified by:
		`[withMaterializer](RequestContext.html#withMaterializer(akka.stream.Materializer))` in interface `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`
		Parameters:
		`materializer` \- (undocumented)
		Returns:
		(undocumented)
		- #### withParserSettings
		
		
		
		```
		public [RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") withParserSettings​([ParserSettings](../settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings)
		```
		
		Description copied from interface: `[RequestContext](RequestContext.html#withParserSettings(akka.http.scaladsl.settings.ParserSettings))`
		Returns a copy of this context with the new [`ParserSettings`](../settings/ParserSettings.html "class in akka.http.scaladsl.settings").
		
		Specified by:
		`[withParserSettings](RequestContext.html#withParserSettings(akka.http.scaladsl.settings.ParserSettings))` in interface `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`
		Parameters:
		`parserSettings` \- (undocumented)
		Returns:
		(undocumented)
		- #### withRequest
		
		
		
		```
		public [RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") withRequest​([HttpRequest](../model/HttpRequest.html "class in akka.http.scaladsl.model") request)
		```
		
		Description copied from interface: `[RequestContext](RequestContext.html#withRequest(akka.http.scaladsl.model.HttpRequest))`
		Returns a copy of this context with the new HttpRequest.
		
		Specified by:
		`[withRequest](RequestContext.html#withRequest(akka.http.scaladsl.model.HttpRequest))` in interface `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`
		Parameters:
		`request` \- (undocumented)
		Returns:
		(undocumented)
		- #### withRoutingSettings
		
		
		
		```
		public [RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") withRoutingSettings​([RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") routingSettings)
		```
		
		Description copied from interface: `[RequestContext](RequestContext.html#withRoutingSettings(akka.http.scaladsl.settings.RoutingSettings))`
		Returns a copy of this context with the new RoutingSettings.
		
		Specified by:
		`[withRoutingSettings](RequestContext.html#withRoutingSettings(akka.http.scaladsl.settings.RoutingSettings))` in interface `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`
		Parameters:
		`routingSettings` \- (undocumented)
		Returns:
		(undocumented)
		- #### withUnmatchedPath
		
		
		
		```
		public [RequestContext](RequestContext.html "interface in akka.http.scaladsl.server") withUnmatchedPath​([Uri.Path](../model/Uri.Path.html "class in akka.http.scaladsl.model") path)
		```
		
		Description copied from interface: `[RequestContext](RequestContext.html#withUnmatchedPath(akka.http.scaladsl.model.Uri.Path))`
		Returns a copy of this context with the unmatched path updated to the given one.
		
		Specified by:
		`[withUnmatchedPath](RequestContext.html#withUnmatchedPath(akka.http.scaladsl.model.Uri.Path))` in interface `[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server")`
		Parameters:
		`path` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/marshalling/ToResponseMarshallable.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/StatusCodes.Redirection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.Path.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/RoutingSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestContextImpl.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestContextImpl.html)*