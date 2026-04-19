---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:56:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
title: RequestContext
---

# RequestContext

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class RequestContext

- java.lang.Object
- - akka.http.javadsl.server.RequestContext

- ---

```
public class RequestContext
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RequestContext](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> java.util.concurrent.CompletionStage<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")>` | `[complete](#complete(T,akka.http.javadsl.marshalling.Marshaller))​(T value,  [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> marshaller)` |  |
	| `java.util.concurrent.CompletionStage<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")>` | `[completeWith](#completeWith(akka.http.javadsl.model.HttpResponse))​([HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model") response)` |  |
	| `[RequestContext](../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server")` | `[delegate](#delegate())()` |  |
	| `java.util.concurrent.CompletionStage<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")>` | `[fail](#fail(java.lang.Throwable))​(java.lang.Throwable error)` |  |
	| `scala.concurrent.ExecutionContextExecutor` | `[getExecutionContext](#getExecutionContext())()` |  |
	| `akka.event.LoggingAdapter` | `[getLog](#getLog())()` |  |
	| `akka.stream.Materializer` | `[getMaterializer](#getMaterializer())()` |  |
	| `[ParserSettings](../settings/ParserSettings.html "class in akka.http.javadsl.settings")` | `[getParserSettings](#getParserSettings())()` |  |
	| `[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model")` | `[getRequest](#getRequest())()` |  |
	| `[RoutingSettings](../settings/RoutingSettings.html "class in akka.http.javadsl.settings")` | `[getSettings](#getSettings())()` |  |
	| `java.lang.String` | `[getUnmatchedPath](#getUnmatchedPath())()` |  |
	| `[RequestContext](RequestContext.html "class in akka.http.javadsl.server")` | `[mapRequest](#mapRequest(java.util.function.Function))​(java.util.function.Function<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model")> f)` |  |
	| `[RequestContext](RequestContext.html "class in akka.http.javadsl.server")` | `[mapUnmatchedPath](#mapUnmatchedPath(java.util.function.Function))​(java.util.function.Function<java.lang.String,​java.lang.String> f)` |  |
	| `[RequestContext](RequestContext.html "class in akka.http.javadsl.server")` | `[reconfigure](#reconfigure(scala.concurrent.ExecutionContextExecutor,akka.stream.Materializer,akka.event.LoggingAdapter,akka.http.javadsl.settings.RoutingSettings))​(scala.concurrent.ExecutionContextExecutor executionContext,  akka.stream.Materializer materializer,  akka.event.LoggingAdapter log,  [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.javadsl.settings") settings)` |  |
	| `java.util.concurrent.CompletionStage<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")>` | `[redirect](#redirect(akka.http.javadsl.model.Uri,akka.http.javadsl.model.StatusCode))​([Uri](../model/Uri.html "class in akka.http.javadsl.model") uri,  [StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") redirectionType)` |  |
	| `java.util.concurrent.CompletionStage<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")>` | `[reject](#reject(akka.http.javadsl.server.Rejection...))​([Rejection](Rejection.html "interface in akka.http.javadsl.server")... rejections)` |  |
	| `java.util.concurrent.CompletionStage<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")>` | `[reject](#reject(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[Rejection](Rejection.html "interface in akka.http.javadsl.server")> rejections)` |  |
	| `[RequestContext](RequestContext.html "class in akka.http.javadsl.server")` | `[withAcceptAll](#withAcceptAll())()` |  |
	| `[RequestContext](RequestContext.html "class in akka.http.javadsl.server")` | `[withExecutionContext](#withExecutionContext(scala.concurrent.ExecutionContextExecutor))​(scala.concurrent.ExecutionContextExecutor ec)` |  |
	| `[RequestContext](RequestContext.html "class in akka.http.javadsl.server")` | `[withLog](#withLog(akka.event.LoggingAdapter))​(akka.event.LoggingAdapter log)` |  |
	| `[RequestContext](RequestContext.html "class in akka.http.javadsl.server")` | `[withMaterializer](#withMaterializer(akka.stream.Materializer))​(akka.stream.Materializer materializer)` |  |
	| `[RequestContext](RequestContext.html "class in akka.http.javadsl.server")` | `[withParserSettings](#withParserSettings(akka.http.javadsl.settings.ParserSettings))​([ParserSettings](../settings/ParserSettings.html "class in akka.http.javadsl.settings") settings)` |  |
	| `[RequestContext](RequestContext.html "class in akka.http.javadsl.server")` | `[withRequest](#withRequest(akka.http.javadsl.model.HttpRequest))​([HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model") req)` |  |
	| `[RequestContext](RequestContext.html "class in akka.http.javadsl.server")` | `[withRoutingSettings](#withRoutingSettings(akka.http.javadsl.settings.RoutingSettings))​([RoutingSettings](../settings/RoutingSettings.html "class in akka.http.javadsl.settings") settings)` |  |
	| `[RequestContext](RequestContext.html "class in akka.http.javadsl.server")` | `[withUnmatchedPath](#withUnmatchedPath(java.lang.String))​(java.lang.String path)` |  |
	| `static [RequestContext](RequestContext.html "class in akka.http.javadsl.server")` | `[wrap](#wrap(akka.http.scaladsl.server.RequestContext))​([RequestContext](../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server") delegate)` | INTERNAL API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RequestContext
		
		
		
		```
		public RequestContext()
		```

	- ### Method Detail
	
	
	
		- #### wrap
		
		
		
		```
		public static [RequestContext](RequestContext.html "class in akka.http.javadsl.server") wrap​([RequestContext](../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server") delegate)
		```
		
		INTERNAL API
		- #### reject
		
		
		
		```
		public java.util.concurrent.CompletionStage<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")> reject​([Rejection](Rejection.html "interface in akka.http.javadsl.server")... rejections)
		```
		- #### delegate
		
		
		
		```
		public [RequestContext](../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server") delegate()
		```
		- #### getRequest
		
		
		
		```
		public [HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model") getRequest()
		```
		- #### getUnmatchedPath
		
		
		
		```
		public java.lang.String getUnmatchedPath()
		```
		- #### getExecutionContext
		
		
		
		```
		public scala.concurrent.ExecutionContextExecutor getExecutionContext()
		```
		- #### getMaterializer
		
		
		
		```
		public akka.stream.Materializer getMaterializer()
		```
		- #### getLog
		
		
		
		```
		public akka.event.LoggingAdapter getLog()
		```
		- #### getSettings
		
		
		
		```
		public [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.javadsl.settings") getSettings()
		```
		- #### getParserSettings
		
		
		
		```
		public [ParserSettings](../settings/ParserSettings.html "class in akka.http.javadsl.settings") getParserSettings()
		```
		- #### reconfigure
		
		
		
		```
		public [RequestContext](RequestContext.html "class in akka.http.javadsl.server") reconfigure​(scala.concurrent.ExecutionContextExecutor executionContext,
		                                  akka.stream.Materializer materializer,
		                                  akka.event.LoggingAdapter log,
		                                  [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.javadsl.settings") settings)
		```
		- #### complete
		
		
		
		```
		public <T> java.util.concurrent.CompletionStage<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")> complete​(T value,
		                                                                      [Marshaller](../marshalling/Marshaller.html "class in akka.http.javadsl.marshalling")<T,​[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> marshaller)
		```
		- #### completeWith
		
		
		
		```
		public java.util.concurrent.CompletionStage<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")> completeWith​([HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model") response)
		```
		- #### reject
		
		
		
		```
		public java.util.concurrent.CompletionStage<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")> reject​(scala.collection.immutable.Seq<[Rejection](Rejection.html "interface in akka.http.javadsl.server")> rejections)
		```
		- #### redirect
		
		
		
		```
		public java.util.concurrent.CompletionStage<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")> redirect​([Uri](../model/Uri.html "class in akka.http.javadsl.model") uri,
		                                                                  [StatusCode](../model/StatusCode.html "class in akka.http.javadsl.model") redirectionType)
		```
		- #### fail
		
		
		
		```
		public java.util.concurrent.CompletionStage<[RouteResult](RouteResult.html "interface in akka.http.javadsl.server")> fail​(java.lang.Throwable error)
		```
		- #### withRequest
		
		
		
		```
		public [RequestContext](RequestContext.html "class in akka.http.javadsl.server") withRequest​([HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model") req)
		```
		- #### withExecutionContext
		
		
		
		```
		public [RequestContext](RequestContext.html "class in akka.http.javadsl.server") withExecutionContext​(scala.concurrent.ExecutionContextExecutor ec)
		```
		- #### withMaterializer
		
		
		
		```
		public [RequestContext](RequestContext.html "class in akka.http.javadsl.server") withMaterializer​(akka.stream.Materializer materializer)
		```
		- #### withLog
		
		
		
		```
		public [RequestContext](RequestContext.html "class in akka.http.javadsl.server") withLog​(akka.event.LoggingAdapter log)
		```
		- #### withRoutingSettings
		
		
		
		```
		public [RequestContext](RequestContext.html "class in akka.http.javadsl.server") withRoutingSettings​([RoutingSettings](../settings/RoutingSettings.html "class in akka.http.javadsl.settings") settings)
		```
		- #### withParserSettings
		
		
		
		```
		public [RequestContext](RequestContext.html "class in akka.http.javadsl.server") withParserSettings​([ParserSettings](../settings/ParserSettings.html "class in akka.http.javadsl.settings") settings)
		```
		- #### mapRequest
		
		
		
		```
		public [RequestContext](RequestContext.html "class in akka.http.javadsl.server") mapRequest​(java.util.function.Function<[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model")> f)
		```
		- #### withUnmatchedPath
		
		
		
		```
		public [RequestContext](RequestContext.html "class in akka.http.javadsl.server") withUnmatchedPath​(java.lang.String path)
		```
		- #### mapUnmatchedPath
		
		
		
		```
		public [RequestContext](RequestContext.html "class in akka.http.javadsl.server") mapUnmatchedPath​(java.util.function.Function<java.lang.String,​java.lang.String> f)
		```
		- #### withAcceptAll
		
		
		
		```
		public [RequestContext](RequestContext.html "class in akka.http.javadsl.server") withAcceptAll()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/marshalling/Marshaller.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/StatusCode.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/settings/RoutingSettings.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RequestContext.html)*