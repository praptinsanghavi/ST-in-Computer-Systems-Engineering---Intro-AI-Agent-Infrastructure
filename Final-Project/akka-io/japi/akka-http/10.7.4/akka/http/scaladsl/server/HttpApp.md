---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/HttpApp.html
title: HttpApp
---

# HttpApp

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class HttpApp

- java.lang.Object
- - akka.http.scaladsl.server.HttpApp

- All Implemented Interfaces:
`[ToNameReceptacleEnhancements](../common/ToNameReceptacleEnhancements.html "interface in akka.http.scaladsl.common")`, `[Directives](Directives.html "interface in akka.http.scaladsl.server")`, `[AttributeDirectives](directives/AttributeDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[BasicDirectives](directives/BasicDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[CacheConditionDirectives](directives/CacheConditionDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[CodingDirectives](directives/CodingDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[CookieDirectives](directives/CookieDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[CorsDirectives](directives/CorsDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[DebuggingDirectives](directives/DebuggingDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[ExecutionDirectives](directives/ExecutionDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[FileAndResourceDirectives](directives/FileAndResourceDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[FileUploadDirectives](directives/FileUploadDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[FormFieldDirectives](directives/FormFieldDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html "interface in akka.http.scaladsl.server.directives")`, `[FramedEntityStreamingDirectives](directives/FramedEntityStreamingDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[FutureDirectives](directives/FutureDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[HeaderDirectives](directives/HeaderDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[HostDirectives](directives/HostDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[MarshallingDirectives](directives/MarshallingDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[MethodDirectives](directives/MethodDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[MiscDirectives](directives/MiscDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[ParameterDirectives](directives/ParameterDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html "interface in akka.http.scaladsl.server.directives")`, `[PathDirectives](directives/PathDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[RangeDirectives](directives/RangeDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[RespondWithDirectives](directives/RespondWithDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[RouteDirectives](directives/RouteDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[SchemeDirectives](directives/SchemeDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[SecurityDirectives](directives/SecurityDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[TimeoutDirectives](directives/TimeoutDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[TlsDirectives](directives/TlsDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[WebSocketDirectives](directives/WebSocketDirectives.html "interface in akka.http.scaladsl.server.directives")`, `[ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html "interface in akka.http.scaladsl.server")`, `[PathMatchers](PathMatchers.html "interface in akka.http.scaladsl.server")`, `[RouteConcatenation](RouteConcatenation.html "interface in akka.http.scaladsl.server")`

---

```
public abstract class HttpApp
extends java.lang.Object
implements [Directives](Directives.html "interface in akka.http.scaladsl.server")
```

Deprecated.
HttpApp this doesn't reflect the latest Akka APIs. Since 10\.2\.0\.

DEPRECATED, consider https://doc.akka.io/docs/akka\-http/current/quickstart\-scala/ instead
 
 Bootstrap trait for Http Server. It helps booting up an akka\-http server by only defining the desired routes.
 It offers additional hooks to modify the default behavior.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.server.directives.[FileAndResourceDirectives](directives/FileAndResourceDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[FileAndResourceDirectives.DirectoryRenderer](directives/FileAndResourceDirectives.DirectoryRenderer.html "interface in akka.http.scaladsl.server.directives"), [FileAndResourceDirectives.DirectoryRenderer$](directives/FileAndResourceDirectives.DirectoryRenderer$.html "class in akka.http.scaladsl.server.directives"), [FileAndResourceDirectives.LowLevelDirectoryRenderer](directives/FileAndResourceDirectives.LowLevelDirectoryRenderer.html "interface in akka.http.scaladsl.server.directives"), [FileAndResourceDirectives.ResourceFile](directives/FileAndResourceDirectives.ResourceFile.html "class in akka.http.scaladsl.server.directives"), [FileAndResourceDirectives.ResourceFile$](directives/FileAndResourceDirectives.ResourceFile$.html "class in akka.http.scaladsl.server.directives")`
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.server.directives.[FormFieldDirectives](directives/FormFieldDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[FormFieldDirectives.FieldDef](directives/FormFieldDirectives.FieldDef.html "interface in akka.http.scaladsl.server.directives")<[T](directives/FormFieldDirectives.FieldDef.html "type parameter in FormFieldDirectives.FieldDef")>, [FormFieldDirectives.FieldDef$](directives/FormFieldDirectives.FieldDef$.html "class in akka.http.scaladsl.server.directives"), [FormFieldDirectives.FieldMagnet](directives/FormFieldDirectives.FieldMagnet.html "interface in akka.http.scaladsl.server.directives"), [FormFieldDirectives.FieldMagnet$](directives/FormFieldDirectives.FieldMagnet$.html "class in akka.http.scaladsl.server.directives"), [FormFieldDirectives.FieldSpec](directives/FormFieldDirectives.FieldSpec.html "interface in akka.http.scaladsl.server.directives"), [FormFieldDirectives.FieldSpec$](directives/FormFieldDirectives.FieldSpec$.html "class in akka.http.scaladsl.server.directives"), [FormFieldDirectives.Impl$](directives/FormFieldDirectives.Impl$.html "class in akka.http.scaladsl.server.directives")`
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.server.directives.[ParameterDirectives](directives/ParameterDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[ParameterDirectives.ParamDef](directives/ParameterDirectives.ParamDef.html "interface in akka.http.scaladsl.server.directives")<[T](directives/ParameterDirectives.ParamDef.html "type parameter in ParameterDirectives.ParamDef")>, [ParameterDirectives.ParamDef$](directives/ParameterDirectives.ParamDef$.html "class in akka.http.scaladsl.server.directives"), [ParameterDirectives.ParamMagnet](directives/ParameterDirectives.ParamMagnet.html "interface in akka.http.scaladsl.server.directives"), [ParameterDirectives.ParamMagnet$](directives/ParameterDirectives.ParamMagnet$.html "class in akka.http.scaladsl.server.directives"), [ParameterDirectives.ParamSpec](directives/ParameterDirectives.ParamSpec.html "interface in akka.http.scaladsl.server.directives"), [ParameterDirectives.ParamSpec$](directives/ParameterDirectives.ParamSpec$.html "class in akka.http.scaladsl.server.directives")`
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.server.directives.[PathDirectives](directives/PathDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[PathDirectives.TrailingRetryRejection$](directives/PathDirectives.TrailingRetryRejection$.html "class in akka.http.scaladsl.server.directives")`
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.server.[PathMatchers](PathMatchers.html "interface in akka.http.scaladsl.server")
		
		
		`[PathMatchers.HexIntNumber$](PathMatchers.HexIntNumber$.html "class in akka.http.scaladsl.server"), [PathMatchers.HexLongNumber$](PathMatchers.HexLongNumber$.html "class in akka.http.scaladsl.server"), [PathMatchers.IntNumber$](PathMatchers.IntNumber$.html "class in akka.http.scaladsl.server"), [PathMatchers.LongNumber$](PathMatchers.LongNumber$.html "class in akka.http.scaladsl.server"), [PathMatchers.NumberMatcher](PathMatchers.NumberMatcher.html "class in akka.http.scaladsl.server")<[T](PathMatchers.NumberMatcher.html "type parameter in PathMatchers.NumberMatcher")>, [PathMatchers.PathEnd$](PathMatchers.PathEnd$.html "class in akka.http.scaladsl.server"), [PathMatchers.Remaining$](PathMatchers.Remaining$.html "class in akka.http.scaladsl.server"), [PathMatchers.RemainingPath$](PathMatchers.RemainingPath$.html "class in akka.http.scaladsl.server"), [PathMatchers.Segment$](PathMatchers.Segment$.html "class in akka.http.scaladsl.server"), [PathMatchers.Slash$](PathMatchers.Slash$.html "class in akka.http.scaladsl.server")`
		- ### Nested classes/interfaces inherited from interface akka.http.scaladsl.server.[RouteConcatenation](RouteConcatenation.html "interface in akka.http.scaladsl.server")
		
		
		`[RouteConcatenation.RouteWithConcatenation](RouteConcatenation.RouteWithConcatenation.html "class in akka.http.scaladsl.server")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpApp](#%3Cinit%3E())()` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `scala.util.Try<[Http.ServerBinding](../Http.ServerBinding.html "class in akka.http.scaladsl")>` | `[binding](#binding())()` | Deprecated. It tries to retrieve the `ServerBinding` if the server has been successfully started. |
	| `[PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.Object>>` | `[DoubleNumber](#DoubleNumber())()` | Deprecated. |
	| `[PathMatchers.HexIntNumber$](PathMatchers.HexIntNumber$.html "class in akka.http.scaladsl.server")` | `[HexIntNumber](#HexIntNumber())()` | Deprecated. Accessor for nested Scala object |
	| `[PathMatchers.HexLongNumber$](PathMatchers.HexLongNumber$.html "class in akka.http.scaladsl.server")` | `[HexLongNumber](#HexLongNumber())()` | Deprecated. Accessor for nested Scala object |
	| `[PathMatchers.IntNumber$](PathMatchers.IntNumber$.html "class in akka.http.scaladsl.server")` | `[IntNumber](#IntNumber())()` | Deprecated. Accessor for nested Scala object |
	| `[PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.util.UUID>>` | `[JavaUUID](#JavaUUID())()` | Deprecated. |
	| `[PathMatchers.LongNumber$](PathMatchers.LongNumber$.html "class in akka.http.scaladsl.server")` | `[LongNumber](#LongNumber())()` | Deprecated. Accessor for nested Scala object |
	| `[PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[Neutral](#Neutral())()` | Deprecated. |
	| `[PathMatchers.PathEnd$](PathMatchers.PathEnd$.html "class in akka.http.scaladsl.server")` | `[PathEnd](#PathEnd())()` | Deprecated. Accessor for nested Scala object |
	| `protected void` | `[postHttpBinding](#postHttpBinding(akka.http.scaladsl.Http.ServerBinding))​([Http.ServerBinding](../Http.ServerBinding.html "class in akka.http.scaladsl") binding)` | Deprecated. Hook that will be called just after the Http server binding is done. |
	| `protected void` | `[postHttpBindingFailure](#postHttpBindingFailure(java.lang.Throwable))​(java.lang.Throwable cause)` | Deprecated. Hook that will be called in case the Http server binding fails. |
	| `protected void` | `[postServerShutdown](#postServerShutdown(scala.util.Try,akka.actor.ActorSystem))​(scala.util.Try<akka.Done> attempt,  akka.actor.ActorSystem system)` | Deprecated. Hook that will be called just after the server termination. |
	| `[PathMatchers.Remaining$](PathMatchers.Remaining$.html "class in akka.http.scaladsl.server")` | `[Remaining](#Remaining())()` | Deprecated. Accessor for nested Scala object |
	| `[PathMatchers.RemainingPath$](PathMatchers.RemainingPath$.html "class in akka.http.scaladsl.server")` | `[RemainingPath](#RemainingPath())()` | Deprecated. Accessor for nested Scala object |
	| `protected abstract scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>` | `[routes](#routes())()` | Deprecated. Override to implement the routes that will be served by this http server. |
	| `[PathMatchers.Segment$](PathMatchers.Segment$.html "class in akka.http.scaladsl.server")` | `[Segment](#Segment())()` | Deprecated. Accessor for nested Scala object |
	| `[PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.collection.immutable.List<java.lang.String>>>` | `[Segments](#Segments())()` | Deprecated. |
	| `[PathMatchers.Slash$](PathMatchers.Slash$.html "class in akka.http.scaladsl.server")` | `[Slash](#Slash())()` | Deprecated. Accessor for nested Scala object |
	| `void` | `[startServer](#startServer(java.lang.String,int))​(java.lang.String host,  int port)` | Deprecated. Start a server on the specified host and port. |
	| `void` | `[startServer](#startServer(java.lang.String,int,akka.actor.ActorSystem))​(java.lang.String host,  int port,  akka.actor.ActorSystem system)` | Deprecated. Start a server on the specified host and port, using the provided `ActorSystem`. |
	| `void` | `[startServer](#startServer(java.lang.String,int,akka.http.scaladsl.settings.ServerSettings))​(java.lang.String host,  int port,  [ServerSettings](../settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings)` | Deprecated. Start a server on the specified host and port, using the provided settings. |
	| `void` | `[startServer](#startServer(java.lang.String,int,akka.http.scaladsl.settings.ServerSettings,akka.actor.ActorSystem))​(java.lang.String host,  int port,  [ServerSettings](../settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,  akka.actor.ActorSystem system)` | Deprecated. Start a server on the specified host and port, using the provided settings and `ActorSystem`. |
	| `void` | `[startServer](#startServer(java.lang.String,int,akka.http.scaladsl.settings.ServerSettings,scala.Option))​(java.lang.String host,  int port,  [ServerSettings](../settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,  scala.Option<akka.actor.ActorSystem> system)` | Deprecated. Start a server on the specified host and port, using the provided settings and `ActorSystem` if present. |
	| `protected java.util.concurrent.atomic.AtomicReference<akka.actor.ActorSystem>` | `[systemReference](#systemReference())()` | Deprecated. `ActorSystem` used to start this server. |
	| `protected scala.concurrent.Future<akka.Done>` | `[waitForShutdownSignal](#waitForShutdownSignal(akka.actor.ActorSystem,scala.concurrent.ExecutionContext))​(akka.actor.ActorSystem system,  scala.concurrent.ExecutionContext ec)` | Deprecated. Hook that lets the user specify the future that will signal the shutdown of the server whenever completed. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[AttributeDirectives](directives/AttributeDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[attribute](directives/AttributeDirectives.html#attribute(akka.http.scaladsl.model.AttributeKey)), [optionalAttribute](directives/AttributeDirectives.html#optionalAttribute(akka.http.scaladsl.model.AttributeKey))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[BasicDirectives](directives/BasicDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[cancelRejection](directives/BasicDirectives.html#cancelRejection(akka.http.scaladsl.server.Rejection)), [cancelRejections](directives/BasicDirectives.html#cancelRejections(scala.collection.immutable.Seq)), [cancelRejections](directives/BasicDirectives.html#cancelRejections(scala.Function1)), [extract](directives/BasicDirectives.html#extract(scala.Function1)), [extractActorSystem](directives/BasicDirectives.html#extractActorSystem()), [extractDataBytes](directives/BasicDirectives.html#extractDataBytes()), [extractExecutionContext](directives/BasicDirectives.html#extractExecutionContext()), [extractLog](directives/BasicDirectives.html#extractLog()), [extractMatchedPath](directives/BasicDirectives.html#extractMatchedPath()), [extractMaterializer](directives/BasicDirectives.html#extractMaterializer()), [extractParserSettings](directives/BasicDirectives.html#extractParserSettings()), [extractRequest](directives/BasicDirectives.html#extractRequest()), [extractRequestContext](directives/BasicDirectives.html#extractRequestContext()), [extractRequestEntity](directives/BasicDirectives.html#extractRequestEntity()), [extractSettings](directives/BasicDirectives.html#extractSettings()), [extractStrictEntity](directives/BasicDirectives.html#extractStrictEntity(scala.concurrent.duration.FiniteDuration)), [extractStrictEntity](directives/BasicDirectives.html#extractStrictEntity(scala.concurrent.duration.FiniteDuration,long)), [extractUnmatchedPath](directives/BasicDirectives.html#extractUnmatchedPath()), [extractUri](directives/BasicDirectives.html#extractUri()), [mapInnerRoute](directives/BasicDirectives.html#mapInnerRoute(scala.Function1)), [mapRejections](directives/BasicDirectives.html#mapRejections(scala.Function1)), [mapRequest](directives/BasicDirectives.html#mapRequest(scala.Function1)), [mapRequestContext](directives/BasicDirectives.html#mapRequestContext(scala.Function1)), [mapResponse](directives/BasicDirectives.html#mapResponse(scala.Function1)), [mapResponseEntity](directives/BasicDirectives.html#mapResponseEntity(scala.Function1)), [mapResponseHeaders](directives/BasicDirectives.html#mapResponseHeaders(scala.Function1)), [mapRouteResult](directives/BasicDirectives.html#mapRouteResult(scala.Function1)), [mapRouteResultFuture](directives/BasicDirectives.html#mapRouteResultFuture(scala.Function1)), [mapRouteResultPF](directives/BasicDirectives.html#mapRouteResultPF(scala.PartialFunction)), [mapRouteResultWith](directives/BasicDirectives.html#mapRouteResultWith(scala.Function1)), [mapRouteResultWithPF](directives/BasicDirectives.html#mapRouteResultWithPF(scala.PartialFunction)), [mapSettings](directives/BasicDirectives.html#mapSettings(scala.Function1)), [mapUnmatchedPath](directives/BasicDirectives.html#mapUnmatchedPath(scala.Function1)), [pass](directives/BasicDirectives.html#pass()), [provide](directives/BasicDirectives.html#provide(T)), [recoverRejections](directives/BasicDirectives.html#recoverRejections(scala.Function1)), [recoverRejectionsWith](directives/BasicDirectives.html#recoverRejectionsWith(scala.Function1)), [textract](directives/BasicDirectives.html#textract(scala.Function1,akka.http.scaladsl.server.util.Tuple)), [toStrictEntity](directives/BasicDirectives.html#toStrictEntity(scala.concurrent.duration.FiniteDuration)), [toStrictEntity](directives/BasicDirectives.html#toStrictEntity(scala.concurrent.duration.FiniteDuration,long)), [tprovide](directives/BasicDirectives.html#tprovide(L,akka.http.scaladsl.server.util.Tuple)), [withExecutionContext](directives/BasicDirectives.html#withExecutionContext(scala.concurrent.ExecutionContextExecutor)), [withLog](directives/BasicDirectives.html#withLog(akka.event.LoggingAdapter)), [withMaterializer](directives/BasicDirectives.html#withMaterializer(akka.stream.Materializer)), [withSettings](directives/BasicDirectives.html#withSettings(akka.http.scaladsl.settings.RoutingSettings))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[CacheConditionDirectives](directives/CacheConditionDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[conditional](directives/CacheConditionDirectives.html#conditional(akka.http.scaladsl.model.DateTime)), [conditional](directives/CacheConditionDirectives.html#conditional(akka.http.scaladsl.model.headers.EntityTag)), [conditional](directives/CacheConditionDirectives.html#conditional(akka.http.scaladsl.model.headers.EntityTag,akka.http.scaladsl.model.DateTime)), [conditional](directives/CacheConditionDirectives.html#conditional(scala.Option,scala.Option))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[CodingDirectives](directives/CodingDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[decodeRequest](directives/CodingDirectives.html#decodeRequest()), [decodeRequestWith](directives/CodingDirectives.html#decodeRequestWith(akka.http.scaladsl.coding.Decoder)), [decodeRequestWith](directives/CodingDirectives.html#decodeRequestWith(scala.collection.immutable.Seq)), [encodeResponse](directives/CodingDirectives.html#encodeResponse()), [encodeResponseWith](directives/CodingDirectives.html#encodeResponseWith(akka.http.scaladsl.coding.Encoder,scala.collection.immutable.Seq)), [requestEncodedWith](directives/CodingDirectives.html#requestEncodedWith(akka.http.scaladsl.model.headers.HttpEncoding)), [responseEncodingAccepted](directives/CodingDirectives.html#responseEncodingAccepted(akka.http.scaladsl.model.headers.HttpEncoding)), [withPrecompressedMediaTypeSupport](directives/CodingDirectives.html#withPrecompressedMediaTypeSupport())`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[CookieDirectives](directives/CookieDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[cookie](directives/CookieDirectives.html#cookie(java.lang.String)), [deleteCookie](directives/CookieDirectives.html#deleteCookie(akka.http.scaladsl.model.headers.HttpCookie,scala.collection.immutable.Seq)), [deleteCookie](directives/CookieDirectives.html#deleteCookie(java.lang.String,java.lang.String,java.lang.String)), [findCookie](directives/CookieDirectives.html#findCookie(java.lang.String)), [optionalCookie](directives/CookieDirectives.html#optionalCookie(java.lang.String)), [setCookie](directives/CookieDirectives.html#setCookie(akka.http.scaladsl.model.headers.HttpCookie,scala.collection.immutable.Seq))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[CorsDirectives](directives/CorsDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[cors](directives/CorsDirectives.html#cors()), [cors](directives/CorsDirectives.html#cors(akka.http.scaladsl.settings.CorsSettings))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[DebuggingDirectives](directives/DebuggingDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[logRequest](directives/DebuggingDirectives.html#logRequest(akka.http.scaladsl.server.directives.LoggingMagnet)), [logRequestResult](directives/DebuggingDirectives.html#logRequestResult(akka.http.scaladsl.server.directives.LoggingMagnet)), [logResult](directives/DebuggingDirectives.html#logResult(akka.http.scaladsl.server.directives.LoggingMagnet))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[ExecutionDirectives](directives/ExecutionDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[handleExceptions](directives/ExecutionDirectives.html#handleExceptions(akka.http.scaladsl.server.ExceptionHandler)), [handleRejections](directives/ExecutionDirectives.html#handleRejections(akka.http.scaladsl.server.RejectionHandler))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[FileAndResourceDirectives](directives/FileAndResourceDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[_defaultClassLoader](directives/FileAndResourceDirectives.html#_defaultClassLoader()), [conditionalFor](directives/FileAndResourceDirectives.html#conditionalFor(long,long)), [getFromBrowseableDirectories](directives/FileAndResourceDirectives.html#getFromBrowseableDirectories(scala.collection.immutable.Seq,akka.http.scaladsl.server.directives.FileAndResourceDirectives.DirectoryRenderer,akka.http.scaladsl.server.directives.ContentTypeResolver)), [getFromBrowseableDirectory](directives/FileAndResourceDirectives.html#getFromBrowseableDirectory(java.lang.String,akka.http.scaladsl.server.directives.FileAndResourceDirectives.DirectoryRenderer,akka.http.scaladsl.server.directives.ContentTypeResolver)), [getFromDirectory](directives/FileAndResourceDirectives.html#getFromDirectory(java.lang.String,akka.http.scaladsl.server.directives.ContentTypeResolver)), [getFromFile](directives/FileAndResourceDirectives.html#getFromFile(java.io.File,akka.http.scaladsl.model.ContentType)), [getFromFile](directives/FileAndResourceDirectives.html#getFromFile(java.io.File,akka.http.scaladsl.server.directives.ContentTypeResolver)), [getFromFile](directives/FileAndResourceDirectives.html#getFromFile(java.lang.String,akka.http.scaladsl.server.directives.ContentTypeResolver)), [getFromResource](directives/FileAndResourceDirectives.html#getFromResource(java.lang.String,akka.http.scaladsl.model.ContentType,java.lang.ClassLoader)), [getFromResource](directives/FileAndResourceDirectives.html#getFromResource(java.lang.String,akka.http.scaladsl.server.directives.ContentTypeResolver)), [getFromResourceDirectory](directives/FileAndResourceDirectives.html#getFromResourceDirectory(java.lang.String,java.lang.ClassLoader,akka.http.scaladsl.server.directives.ContentTypeResolver)), [listDirectoryContents](directives/FileAndResourceDirectives.html#listDirectoryContents(scala.collection.immutable.Seq,akka.http.scaladsl.server.directives.FileAndResourceDirectives.DirectoryRenderer))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[FileUploadDirectives](directives/FileUploadDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[fileUpload](directives/FileUploadDirectives.html#fileUpload(java.lang.String)), [fileUploadAll](directives/FileUploadDirectives.html#fileUploadAll(java.lang.String)), [storeUploadedFile](directives/FileUploadDirectives.html#storeUploadedFile(java.lang.String,scala.Function1)), [storeUploadedFiles](directives/FileUploadDirectives.html#storeUploadedFiles(java.lang.String,scala.Function1))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[FormFieldDirectives](directives/FormFieldDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[formField](directives/FormFieldDirectives.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldMagnet)), [formFieldMap](directives/FormFieldDirectives.html#formFieldMap()), [formFieldMultiMap](directives/FormFieldDirectives.html#formFieldMultiMap()), [formFields](directives/FormFieldDirectives.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldMagnet)), [formFieldSeq](directives/FormFieldDirectives.html#formFieldSeq())`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[FormFieldDirectivesInstances](directives/FormFieldDirectivesInstances.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[formField](directives/FormFieldDirectivesInstances.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formField](directives/FormFieldDirectivesInstances.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formField](directives/FormFieldDirectivesInstances.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formField](directives/FormFieldDirectivesInstances.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formField](directives/FormFieldDirectivesInstances.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formField](directives/FormFieldDirectivesInstances.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formField](directives/FormFieldDirectivesInstances.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formField](directives/FormFieldDirectivesInstances.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formField](directives/FormFieldDirectivesInstances.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formField](directives/FormFieldDirectivesInstances.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formField](directives/FormFieldDirectivesInstances.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formField](directives/FormFieldDirectivesInstances.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formField](directives/FormFieldDirectivesInstances.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formField](directives/FormFieldDirectivesInstances.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formField](directives/FormFieldDirectivesInstances.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formField](directives/FormFieldDirectivesInstances.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formField](directives/FormFieldDirectivesInstances.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formField](directives/FormFieldDirectivesInstances.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formField](directives/FormFieldDirectivesInstances.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formField](directives/FormFieldDirectivesInstances.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formField](directives/FormFieldDirectivesInstances.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formField](directives/FormFieldDirectivesInstances.html#formField(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formFields](directives/FormFieldDirectivesInstances.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formFields](directives/FormFieldDirectivesInstances.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formFields](directives/FormFieldDirectivesInstances.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formFields](directives/FormFieldDirectivesInstances.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formFields](directives/FormFieldDirectivesInstances.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formFields](directives/FormFieldDirectivesInstances.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formFields](directives/FormFieldDirectivesInstances.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formFields](directives/FormFieldDirectivesInstances.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formFields](directives/FormFieldDirectivesInstances.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formFields](directives/FormFieldDirectivesInstances.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formFields](directives/FormFieldDirectivesInstances.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formFields](directives/FormFieldDirectivesInstances.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formFields](directives/FormFieldDirectivesInstances.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formFields](directives/FormFieldDirectivesInstances.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formFields](directives/FormFieldDirectivesInstances.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formFields](directives/FormFieldDirectivesInstances.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formFields](directives/FormFieldDirectivesInstances.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formFields](directives/FormFieldDirectivesInstances.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formFields](directives/FormFieldDirectivesInstances.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formFields](directives/FormFieldDirectivesInstances.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formFields](directives/FormFieldDirectivesInstances.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec)), [formFields](directives/FormFieldDirectivesInstances.html#formFields(akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec,akka.http.scaladsl.server.directives.FormFieldDirectives.FieldSpec))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[FramedEntityStreamingDirectives](directives/FramedEntityStreamingDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[asSourceOf](directives/FramedEntityStreamingDirectives.html#asSourceOf(akka.http.scaladsl.common.EntityStreamingSupport,akka.http.scaladsl.unmarshalling.Unmarshaller)), [asSourceOf](directives/FramedEntityStreamingDirectives.html#asSourceOf(akka.http.scaladsl.unmarshalling.Unmarshaller,akka.http.scaladsl.common.EntityStreamingSupport)), [asSourceOfInternal](directives/FramedEntityStreamingDirectives.html#asSourceOfInternal(akka.http.scaladsl.unmarshalling.Unmarshaller,akka.http.scaladsl.common.EntityStreamingSupport))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[FutureDirectives](directives/FutureDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[completeOrRecoverWith](directives/FutureDirectives.html#completeOrRecoverWith(akka.http.scaladsl.server.directives.CompleteOrRecoverWithMagnet)), [onComplete](directives/FutureDirectives.html#onComplete(scala.Function0)), [onCompleteWithBreaker](directives/FutureDirectives.html#onCompleteWithBreaker(akka.pattern.CircuitBreaker,scala.Function0)), [onSuccess](directives/FutureDirectives.html#onSuccess(akka.http.scaladsl.server.directives.OnSuccessMagnet))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[HeaderDirectives](directives/HeaderDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[checkSameOrigin](directives/HeaderDirectives.html#checkSameOrigin(akka.http.scaladsl.model.headers.HttpOriginRange.Default)), [headerValue](directives/HeaderDirectives.html#headerValue(scala.Function1)), [headerValueByName](directives/HeaderDirectives.html#headerValueByName(java.lang.String)), [headerValueByName](directives/HeaderDirectives.html#headerValueByName(scala.Symbol)), [headerValueByType](directives/HeaderDirectives.html#headerValueByType(akka.http.scaladsl.server.directives.HeaderMagnet)), [headerValuePF](directives/HeaderDirectives.html#headerValuePF(scala.PartialFunction)), [optionalHeaderValue](directives/HeaderDirectives.html#optionalHeaderValue(scala.Function1)), [optionalHeaderValueByName](directives/HeaderDirectives.html#optionalHeaderValueByName(java.lang.String)), [optionalHeaderValueByName](directives/HeaderDirectives.html#optionalHeaderValueByName(scala.Symbol)), [optionalHeaderValueByType](directives/HeaderDirectives.html#optionalHeaderValueByType(akka.http.scaladsl.server.directives.HeaderMagnet)), [optionalHeaderValuePF](directives/HeaderDirectives.html#optionalHeaderValuePF(scala.PartialFunction)), [optionalValue](directives/HeaderDirectives.html#optionalValue(java.lang.String))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[HostDirectives](directives/HostDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[extractHost](directives/HostDirectives.html#extractHost()), [host](directives/HostDirectives.html#host(scala.collection.immutable.Seq)), [host](directives/HostDirectives.html#host(scala.Function1)), [host](directives/HostDirectives.html#host(scala.util.matching.Regex))`
		- ### Methods inherited from interface akka.http.scaladsl.server.[ImplicitPathMatcherConstruction](ImplicitPathMatcherConstruction.html "interface in akka.http.scaladsl.server")
		
		
		`[_regex2PathMatcher](ImplicitPathMatcherConstruction.html#_regex2PathMatcher(scala.util.matching.Regex)), [_segmentStringToPathMatcher](ImplicitPathMatcherConstruction.html#_segmentStringToPathMatcher(java.lang.String)), [_stringExtractionPair2PathMatcher](ImplicitPathMatcherConstruction.html#_stringExtractionPair2PathMatcher(scala.Tuple2)), [_stringNameOptionReceptacle2PathMatcher](ImplicitPathMatcherConstruction.html#_stringNameOptionReceptacle2PathMatcher(akka.http.scaladsl.common.NameOptionReceptacle)), [_valueMap2PathMatcher](ImplicitPathMatcherConstruction.html#_valueMap2PathMatcher(scala.collection.immutable.Map))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[MarshallingDirectives](directives/MarshallingDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[as](directives/MarshallingDirectives.html#as(akka.http.scaladsl.unmarshalling.Unmarshaller)), [completeWith](directives/MarshallingDirectives.html#completeWith(akka.http.scaladsl.marshalling.Marshaller,scala.Function1)), [entity](directives/MarshallingDirectives.html#entity(akka.http.scaladsl.unmarshalling.Unmarshaller)), [handleWith](directives/MarshallingDirectives.html#handleWith(scala.Function1,akka.http.scaladsl.unmarshalling.Unmarshaller,akka.http.scaladsl.marshalling.Marshaller)), [instanceOf](directives/MarshallingDirectives.html#instanceOf(akka.http.scaladsl.marshalling.Marshaller))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[MethodDirectives](directives/MethodDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[delete](directives/MethodDirectives.html#delete()), [extractMethod](directives/MethodDirectives.html#extractMethod()), [get](directives/MethodDirectives.html#get()), [head](directives/MethodDirectives.html#head()), [method](directives/MethodDirectives.html#method(akka.http.scaladsl.model.HttpMethod)), [options](directives/MethodDirectives.html#options()), [overrideMethodWithParameter](directives/MethodDirectives.html#overrideMethodWithParameter(java.lang.String)), [patch](directives/MethodDirectives.html#patch()), [post](directives/MethodDirectives.html#post()), [put](directives/MethodDirectives.html#put())`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[MiscDirectives](directives/MiscDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[extractClientIP](directives/MiscDirectives.html#extractClientIP()), [rejectEmptyResponse](directives/MiscDirectives.html#rejectEmptyResponse()), [requestEntityEmpty](directives/MiscDirectives.html#requestEntityEmpty()), [requestEntityPresent](directives/MiscDirectives.html#requestEntityPresent()), [selectPreferredLanguage](directives/MiscDirectives.html#selectPreferredLanguage(akka.http.scaladsl.model.headers.Language,scala.collection.immutable.Seq)), [validate](directives/MiscDirectives.html#validate(scala.Function0,java.lang.String)), [withoutSizeLimit](directives/MiscDirectives.html#withoutSizeLimit()), [withSizeLimit](directives/MiscDirectives.html#withSizeLimit(long))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[ParameterDirectives](directives/ParameterDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[parameter](directives/ParameterDirectives.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamMagnet)), [parameterMap](directives/ParameterDirectives.html#parameterMap()), [parameterMultiMap](directives/ParameterDirectives.html#parameterMultiMap()), [parameters](directives/ParameterDirectives.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamMagnet)), [parameterSeq](directives/ParameterDirectives.html#parameterSeq())`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[ParameterDirectivesInstances](directives/ParameterDirectivesInstances.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[parameter](directives/ParameterDirectivesInstances.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameter](directives/ParameterDirectivesInstances.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameter](directives/ParameterDirectivesInstances.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameter](directives/ParameterDirectivesInstances.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameter](directives/ParameterDirectivesInstances.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameter](directives/ParameterDirectivesInstances.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameter](directives/ParameterDirectivesInstances.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameter](directives/ParameterDirectivesInstances.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameter](directives/ParameterDirectivesInstances.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameter](directives/ParameterDirectivesInstances.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameter](directives/ParameterDirectivesInstances.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameter](directives/ParameterDirectivesInstances.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameter](directives/ParameterDirectivesInstances.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameter](directives/ParameterDirectivesInstances.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameter](directives/ParameterDirectivesInstances.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameter](directives/ParameterDirectivesInstances.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameter](directives/ParameterDirectivesInstances.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameter](directives/ParameterDirectivesInstances.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameter](directives/ParameterDirectivesInstances.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameter](directives/ParameterDirectivesInstances.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameter](directives/ParameterDirectivesInstances.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameter](directives/ParameterDirectivesInstances.html#parameter(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameters](directives/ParameterDirectivesInstances.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameters](directives/ParameterDirectivesInstances.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameters](directives/ParameterDirectivesInstances.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameters](directives/ParameterDirectivesInstances.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameters](directives/ParameterDirectivesInstances.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameters](directives/ParameterDirectivesInstances.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameters](directives/ParameterDirectivesInstances.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameters](directives/ParameterDirectivesInstances.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameters](directives/ParameterDirectivesInstances.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameters](directives/ParameterDirectivesInstances.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameters](directives/ParameterDirectivesInstances.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameters](directives/ParameterDirectivesInstances.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameters](directives/ParameterDirectivesInstances.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameters](directives/ParameterDirectivesInstances.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameters](directives/ParameterDirectivesInstances.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameters](directives/ParameterDirectivesInstances.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameters](directives/ParameterDirectivesInstances.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameters](directives/ParameterDirectivesInstances.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameters](directives/ParameterDirectivesInstances.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameters](directives/ParameterDirectivesInstances.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameters](directives/ParameterDirectivesInstances.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec)), [parameters](directives/ParameterDirectivesInstances.html#parameters(akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec,akka.http.scaladsl.server.directives.ParameterDirectives.ParamSpec))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[PathDirectives](directives/PathDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[ignoreTrailingSlash](directives/PathDirectives.html#ignoreTrailingSlash()), [path](directives/PathDirectives.html#path(akka.http.scaladsl.server.PathMatcher)), [pathEnd](directives/PathDirectives.html#pathEnd()), [pathEndOrSingleSlash](directives/PathDirectives.html#pathEndOrSingleSlash()), [pathPrefix](directives/PathDirectives.html#pathPrefix(akka.http.scaladsl.server.PathMatcher)), [pathPrefixTest](directives/PathDirectives.html#pathPrefixTest(akka.http.scaladsl.server.PathMatcher)), [pathSingleSlash](directives/PathDirectives.html#pathSingleSlash()), [pathSuffix](directives/PathDirectives.html#pathSuffix(akka.http.scaladsl.server.PathMatcher)), [pathSuffixTest](directives/PathDirectives.html#pathSuffixTest(akka.http.scaladsl.server.PathMatcher)), [rawPathPrefix](directives/PathDirectives.html#rawPathPrefix(akka.http.scaladsl.server.PathMatcher)), [rawPathPrefixTest](directives/PathDirectives.html#rawPathPrefixTest(akka.http.scaladsl.server.PathMatcher)), [redirectToNoTrailingSlashIfPresent](directives/PathDirectives.html#redirectToNoTrailingSlashIfPresent(akka.http.scaladsl.model.StatusCodes.Redirection)), [redirectToTrailingSlashIfMissing](directives/PathDirectives.html#redirectToTrailingSlashIfMissing(akka.http.scaladsl.model.StatusCodes.Redirection))`
		- ### Methods inherited from interface akka.http.scaladsl.server.[PathMatchers](PathMatchers.html "interface in akka.http.scaladsl.server")
		
		
		`[not](PathMatchers.html#not(akka.http.scaladsl.server.PathMatcher)), [nothingMatcher](PathMatchers.html#nothingMatcher(akka.http.scaladsl.server.util.Tuple)), [Segments](PathMatchers.html#Segments(int)), [Segments](PathMatchers.html#Segments(int,int)), [separateOnSlashes](PathMatchers.html#separateOnSlashes(java.lang.String))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[RangeDirectives](directives/RangeDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[withRangeSupport](directives/RangeDirectives.html#withRangeSupport())`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[RespondWithDirectives](directives/RespondWithDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[respondWithDefaultHeader](directives/RespondWithDirectives.html#respondWithDefaultHeader(akka.http.scaladsl.model.HttpHeader)), [respondWithDefaultHeaders](directives/RespondWithDirectives.html#respondWithDefaultHeaders(akka.http.scaladsl.model.HttpHeader,scala.collection.immutable.Seq)), [respondWithDefaultHeaders](directives/RespondWithDirectives.html#respondWithDefaultHeaders(scala.collection.immutable.Seq)), [respondWithHeader](directives/RespondWithDirectives.html#respondWithHeader(akka.http.scaladsl.model.HttpHeader)), [respondWithHeaders](directives/RespondWithDirectives.html#respondWithHeaders(akka.http.scaladsl.model.HttpHeader,scala.collection.immutable.Seq)), [respondWithHeaders](directives/RespondWithDirectives.html#respondWithHeaders(scala.collection.immutable.Seq))`
		- ### Methods inherited from interface akka.http.scaladsl.server.[RouteConcatenation](RouteConcatenation.html "interface in akka.http.scaladsl.server")
		
		
		`[_enhanceRouteWithConcatenation](RouteConcatenation.html#_enhanceRouteWithConcatenation(scala.Function1)), [concat](RouteConcatenation.html#concat(scala.collection.immutable.Seq))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[RouteDirectives](directives/RouteDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[complete](directives/RouteDirectives.html#complete(akka.http.scaladsl.model.StatusCode,scala.collection.immutable.Seq,scala.Function0,akka.http.scaladsl.marshalling.Marshaller)), [complete](directives/RouteDirectives.html#complete(akka.http.scaladsl.model.StatusCode,scala.Function0,akka.http.scaladsl.marshalling.Marshaller)), [complete](directives/RouteDirectives.html#complete(scala.Function0)), [failWith](directives/RouteDirectives.html#failWith(java.lang.Throwable)), [handle](directives/RouteDirectives.html#handle(scala.Function1)), [handle](directives/RouteDirectives.html#handle(scala.PartialFunction)), [handle](directives/RouteDirectives.html#handle(scala.PartialFunction,scala.collection.immutable.Seq)), [handleSync](directives/RouteDirectives.html#handleSync(scala.Function1)), [handleSync](directives/RouteDirectives.html#handleSync(scala.PartialFunction)), [handleSync](directives/RouteDirectives.html#handleSync(scala.PartialFunction,scala.collection.immutable.Seq)), [redirect](directives/RouteDirectives.html#redirect(akka.http.scaladsl.model.Uri,akka.http.scaladsl.model.StatusCodes.Redirection)), [reject](directives/RouteDirectives.html#reject()), [reject](directives/RouteDirectives.html#reject(scala.collection.immutable.Seq))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[SchemeDirectives](directives/SchemeDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[extractScheme](directives/SchemeDirectives.html#extractScheme()), [scheme](directives/SchemeDirectives.html#scheme(java.lang.String))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[SecurityDirectives](directives/SecurityDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[authenticateBasic](directives/SecurityDirectives.html#authenticateBasic(java.lang.String,scala.Function1)), [authenticateBasicAsync](directives/SecurityDirectives.html#authenticateBasicAsync(java.lang.String,scala.Function1)), [authenticateBasicPF](directives/SecurityDirectives.html#authenticateBasicPF(java.lang.String,scala.PartialFunction)), [authenticateBasicPFAsync](directives/SecurityDirectives.html#authenticateBasicPFAsync(java.lang.String,scala.PartialFunction)), [authenticateOAuth2](directives/SecurityDirectives.html#authenticateOAuth2(java.lang.String,scala.Function1)), [authenticateOAuth2Async](directives/SecurityDirectives.html#authenticateOAuth2Async(java.lang.String,scala.Function1)), [authenticateOAuth2PF](directives/SecurityDirectives.html#authenticateOAuth2PF(java.lang.String,scala.PartialFunction)), [authenticateOAuth2PFAsync](directives/SecurityDirectives.html#authenticateOAuth2PFAsync(java.lang.String,scala.PartialFunction)), [authenticateOrRejectWithChallenge](directives/SecurityDirectives.html#authenticateOrRejectWithChallenge(scala.Function1)), [authenticateOrRejectWithChallenge](directives/SecurityDirectives.html#authenticateOrRejectWithChallenge(scala.Function1,scala.reflect.ClassTag)), [authorize](directives/SecurityDirectives.html#authorize(scala.Function0)), [authorize](directives/SecurityDirectives.html#authorize(scala.Function1)), [authorizeAsync](directives/SecurityDirectives.html#authorizeAsync(scala.Function0)), [authorizeAsync](directives/SecurityDirectives.html#authorizeAsync(scala.Function1)), [extractCredentials](directives/SecurityDirectives.html#extractCredentials()), [extractCredentialsAndAuthenticateOrRejectWithChallenge](directives/SecurityDirectives.html#extractCredentialsAndAuthenticateOrRejectWithChallenge(akka.http.scaladsl.server.Directive,scala.Function1))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[TimeoutDirectives](directives/TimeoutDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[extractRequestTimeout](directives/TimeoutDirectives.html#extractRequestTimeout()), [withoutRequestTimeout](directives/TimeoutDirectives.html#withoutRequestTimeout()), [withRequestTimeout](directives/TimeoutDirectives.html#withRequestTimeout(scala.concurrent.duration.Duration)), [withRequestTimeout](directives/TimeoutDirectives.html#withRequestTimeout(scala.concurrent.duration.Duration,scala.Function1)), [withRequestTimeout](directives/TimeoutDirectives.html#withRequestTimeout(scala.concurrent.duration.Duration,scala.Option)), [withRequestTimeoutResponse](directives/TimeoutDirectives.html#withRequestTimeoutResponse(scala.Function1))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[TlsDirectives](directives/TlsDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[extractClientCertificate](directives/TlsDirectives.html#extractClientCertificate()), [extractSslSession](directives/TlsDirectives.html#extractSslSession()), [requireClientCertificateIdentity](directives/TlsDirectives.html#requireClientCertificateIdentity(scala.util.matching.Regex))`
		- ### Methods inherited from interface akka.http.scaladsl.common.[ToNameReceptacleEnhancements](../common/ToNameReceptacleEnhancements.html "interface in akka.http.scaladsl.common")
		
		
		`[_string2NR](../common/ToNameReceptacleEnhancements.html#_string2NR(java.lang.String)), [_symbol2NR](../common/ToNameReceptacleEnhancements.html#_symbol2NR(scala.Symbol))`
		- ### Methods inherited from interface akka.http.scaladsl.server.directives.[WebSocketDirectives](directives/WebSocketDirectives.html "interface in akka.http.scaladsl.server.directives")
		
		
		`[extractOfferedWsProtocols](directives/WebSocketDirectives.html#extractOfferedWsProtocols()), [extractUpgradeToWebSocket](directives/WebSocketDirectives.html#extractUpgradeToWebSocket()), [extractWebSocketUpgrade](directives/WebSocketDirectives.html#extractWebSocketUpgrade()), [handleWebSocketMessages](directives/WebSocketDirectives.html#handleWebSocketMessages(akka.stream.scaladsl.Flow)), [handleWebSocketMessagesForOptionalProtocol](directives/WebSocketDirectives.html#handleWebSocketMessagesForOptionalProtocol(akka.stream.scaladsl.Flow,scala.Option)), [handleWebSocketMessagesForProtocol](directives/WebSocketDirectives.html#handleWebSocketMessagesForProtocol(akka.stream.scaladsl.Flow,java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### HttpApp
		
		
		
		```
		public HttpApp()
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### DoubleNumber
		
		
		
		```
		public [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.lang.Object>> DoubleNumber()
		```
		
		Deprecated.
		
		Specified by:
		`[DoubleNumber](PathMatchers.html#DoubleNumber())` in interface `[PathMatchers](PathMatchers.html "interface in akka.http.scaladsl.server")`
		- #### HexIntNumber
		
		
		
		```
		public [PathMatchers.HexIntNumber$](PathMatchers.HexIntNumber$.html "class in akka.http.scaladsl.server") HexIntNumber()
		```
		
		Deprecated.
		Description copied from interface: `[PathMatchers](PathMatchers.html#HexIntNumber())`
		Accessor for nested Scala object
		
		Specified by:
		`[HexIntNumber](PathMatchers.html#HexIntNumber())` in interface `[PathMatchers](PathMatchers.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### HexLongNumber
		
		
		
		```
		public [PathMatchers.HexLongNumber$](PathMatchers.HexLongNumber$.html "class in akka.http.scaladsl.server") HexLongNumber()
		```
		
		Deprecated.
		Description copied from interface: `[PathMatchers](PathMatchers.html#HexLongNumber())`
		Accessor for nested Scala object
		
		Specified by:
		`[HexLongNumber](PathMatchers.html#HexLongNumber())` in interface `[PathMatchers](PathMatchers.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### IntNumber
		
		
		
		```
		public [PathMatchers.IntNumber$](PathMatchers.IntNumber$.html "class in akka.http.scaladsl.server") IntNumber()
		```
		
		Deprecated.
		Description copied from interface: `[PathMatchers](PathMatchers.html#IntNumber())`
		Accessor for nested Scala object
		
		Specified by:
		`[IntNumber](PathMatchers.html#IntNumber())` in interface `[PathMatchers](PathMatchers.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### JavaUUID
		
		
		
		```
		public [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.util.UUID>> JavaUUID()
		```
		
		Deprecated.
		
		Specified by:
		`[JavaUUID](PathMatchers.html#JavaUUID())` in interface `[PathMatchers](PathMatchers.html "interface in akka.http.scaladsl.server")`
		- #### LongNumber
		
		
		
		```
		public [PathMatchers.LongNumber$](PathMatchers.LongNumber$.html "class in akka.http.scaladsl.server") LongNumber()
		```
		
		Deprecated.
		Description copied from interface: `[PathMatchers](PathMatchers.html#LongNumber())`
		Accessor for nested Scala object
		
		Specified by:
		`[LongNumber](PathMatchers.html#LongNumber())` in interface `[PathMatchers](PathMatchers.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### Neutral
		
		
		
		```
		public [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> Neutral()
		```
		
		Deprecated.
		
		Specified by:
		`[Neutral](PathMatchers.html#Neutral())` in interface `[PathMatchers](PathMatchers.html "interface in akka.http.scaladsl.server")`
		- #### PathEnd
		
		
		
		```
		public [PathMatchers.PathEnd$](PathMatchers.PathEnd$.html "class in akka.http.scaladsl.server") PathEnd()
		```
		
		Deprecated.
		Description copied from interface: `[PathMatchers](PathMatchers.html#PathEnd())`
		Accessor for nested Scala object
		
		Specified by:
		`[PathEnd](PathMatchers.html#PathEnd())` in interface `[PathMatchers](PathMatchers.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### Remaining
		
		
		
		```
		public [PathMatchers.Remaining$](PathMatchers.Remaining$.html "class in akka.http.scaladsl.server") Remaining()
		```
		
		Deprecated.
		Description copied from interface: `[PathMatchers](PathMatchers.html#Remaining())`
		Accessor for nested Scala object
		
		Specified by:
		`[Remaining](PathMatchers.html#Remaining())` in interface `[PathMatchers](PathMatchers.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### RemainingPath
		
		
		
		```
		public [PathMatchers.RemainingPath$](PathMatchers.RemainingPath$.html "class in akka.http.scaladsl.server") RemainingPath()
		```
		
		Deprecated.
		Description copied from interface: `[PathMatchers](PathMatchers.html#RemainingPath())`
		Accessor for nested Scala object
		
		Specified by:
		`[RemainingPath](PathMatchers.html#RemainingPath())` in interface `[PathMatchers](PathMatchers.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### Segment
		
		
		
		```
		public [PathMatchers.Segment$](PathMatchers.Segment$.html "class in akka.http.scaladsl.server") Segment()
		```
		
		Deprecated.
		Description copied from interface: `[PathMatchers](PathMatchers.html#Segment())`
		Accessor for nested Scala object
		
		Specified by:
		`[Segment](PathMatchers.html#Segment())` in interface `[PathMatchers](PathMatchers.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### Segments
		
		
		
		```
		public [PathMatcher](PathMatcher.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.collection.immutable.List<java.lang.String>>> Segments()
		```
		
		Deprecated.
		
		Specified by:
		`[Segments](PathMatchers.html#Segments())` in interface `[PathMatchers](PathMatchers.html "interface in akka.http.scaladsl.server")`
		- #### Slash
		
		
		
		```
		public [PathMatchers.Slash$](PathMatchers.Slash$.html "class in akka.http.scaladsl.server") Slash()
		```
		
		Deprecated.
		Description copied from interface: `[PathMatchers](PathMatchers.html#Slash())`
		Accessor for nested Scala object
		
		Specified by:
		`[Slash](PathMatchers.html#Slash())` in interface `[PathMatchers](PathMatchers.html "interface in akka.http.scaladsl.server")`
		Returns:
		(undocumented)
		- #### binding
		
		
		
		```
		public scala.util.Try<[Http.ServerBinding](../Http.ServerBinding.html "class in akka.http.scaladsl")> binding()
		```
		
		Deprecated.
		It tries to retrieve the `ServerBinding` if the server has been successfully started. It fails otherwise.
		 You can use this method to attempt to retrieve the `ServerBinding` at any point in time to, for example, stop the server due to unexpected circumstances.
		
		Returns:
		(undocumented)
		- #### postHttpBinding
		
		
		
		```
		protected void postHttpBinding​([Http.ServerBinding](../Http.ServerBinding.html "class in akka.http.scaladsl") binding)
		```
		
		Deprecated.
		Hook that will be called just after the Http server binding is done. Override this method if you want to perform some actions after the server is up.
		
		Parameters:
		`binding` \- (undocumented)
		- #### postHttpBindingFailure
		
		
		
		```
		protected void postHttpBindingFailure​(java.lang.Throwable cause)
		```
		
		Deprecated.
		Hook that will be called in case the Http server binding fails. Override this method if you want to perform some actions after the server binding failed.
		
		Parameters:
		`cause` \- (undocumented)
		- #### postServerShutdown
		
		
		
		```
		protected void postServerShutdown​(scala.util.Try<akka.Done> attempt,
		                                  akka.actor.ActorSystem system)
		```
		
		Deprecated.
		Hook that will be called just after the server termination. Override this method if you want to perform some cleanup actions after the server is stopped.
		 The `attempt` parameter is represented with a `Try` type that is successful only if the server was successfully shut down.
		
		Parameters:
		`attempt` \- (undocumented)
		`system` \- (undocumented)
		- #### routes
		
		
		
		```
		protected abstract scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> routes()
		```
		
		Deprecated.
		Override to implement the routes that will be served by this http server.
		
		Returns:
		(undocumented)
		- #### startServer
		
		
		
		```
		public void startServer​(java.lang.String host,
		                        int port)
		```
		
		Deprecated.
		Start a server on the specified host and port.
		 Note that this method is blocking
		
		Parameters:
		`host` \- (undocumented)
		`port` \- (undocumented)
		- #### startServer
		
		
		
		```
		public void startServer​(java.lang.String host,
		                        int port,
		                        akka.actor.ActorSystem system)
		```
		
		Deprecated.
		Start a server on the specified host and port, using the provided `ActorSystem`.
		 Note that this method is blocking
		 
		
		Parameters:
		`system` \- ActorSystem to use for starting the app,
		 if `null` is passed in a new default ActorSystem will be created instead, which will
		 be terminated when the server is stopped.
		`host` \- (undocumented)
		`port` \- (undocumented)
		- #### startServer
		
		
		
		```
		public void startServer​(java.lang.String host,
		                        int port,
		                        [ServerSettings](../settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings)
		```
		
		Deprecated.
		Start a server on the specified host and port, using the provided settings.
		 Note that this method is blocking.
		
		Parameters:
		`host` \- (undocumented)
		`port` \- (undocumented)
		`settings` \- (undocumented)
		- #### startServer
		
		
		
		```
		public void startServer​(java.lang.String host,
		                        int port,
		                        [ServerSettings](../settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,
		                        akka.actor.ActorSystem system)
		```
		
		Deprecated.
		Start a server on the specified host and port, using the provided settings and `ActorSystem`.
		 Note that this method is blocking.
		 
		
		Parameters:
		`system` \- ActorSystem to use for starting the app,
		 if `null` is passed in a new default ActorSystem will be created instead, which will
		 be terminated when the server is stopped.
		`host` \- (undocumented)
		`port` \- (undocumented)
		`settings` \- (undocumented)
		- #### startServer
		
		
		
		```
		public void startServer​(java.lang.String host,
		                        int port,
		                        [ServerSettings](../settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,
		                        scala.Option<akka.actor.ActorSystem> system)
		```
		
		Deprecated.
		Start a server on the specified host and port, using the provided settings and `ActorSystem` if present.
		 Note that this method is blocking.
		 
		
		Parameters:
		`system` \- ActorSystem to use for starting the app,
		 if `None` is passed in a new default ActorSystem will be created instead, which will
		 be terminated when the server is stopped.
		`host` \- (undocumented)
		`port` \- (undocumented)
		`settings` \- (undocumented)
		- #### systemReference
		
		
		
		```
		protected java.util.concurrent.atomic.AtomicReference<akka.actor.ActorSystem> systemReference()
		```
		
		Deprecated.
		`ActorSystem` used to start this server. Stopping this system will interfere with the proper functioning condition of the server.
		
		Returns:
		(undocumented)
		- #### waitForShutdownSignal
		
		
		
		```
		protected scala.concurrent.Future<akka.Done> waitForShutdownSignal​(akka.actor.ActorSystem system,
		                                                                   scala.concurrent.ExecutionContext ec)
		```
		
		Deprecated.
		Hook that lets the user specify the future that will signal the shutdown of the server whenever completed.
		
		Parameters:
		`system` \- (undocumented)
		`ec` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/Http.ServerBinding.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/common/ToNameReceptacleEnhancements.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/ImplicitPathMatcherConstruction.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatcher.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.HexIntNumber$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.HexLongNumber$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.IntNumber$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.LongNumber$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.NumberMatcher.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.PathEnd$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.Remaining$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.RemainingPath$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.Segment$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.Slash$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/PathMatchers.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RouteConcatenation.RouteWithConcatenation.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RouteConcatenation.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/AttributeDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/BasicDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/CacheConditionDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/CodingDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/CookieDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/CorsDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/DebuggingDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/ExecutionDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives.DirectoryRenderer$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives.DirectoryRenderer.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives.LowLevelDirectoryRenderer.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives.ResourceFile$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives.ResourceFile.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileAndResourceDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FileUploadDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives.FieldDef$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives.FieldDef.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives.FieldMagnet$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives.FieldMagnet.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives.FieldSpec$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives.FieldSpec.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives.Impl$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FormFieldDirectivesInstances.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FramedEntityStreamingDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/FutureDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/HeaderDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/HostDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/MarshallingDirectives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/MethodDirectives.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/HttpApp.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/HttpApp.html)*