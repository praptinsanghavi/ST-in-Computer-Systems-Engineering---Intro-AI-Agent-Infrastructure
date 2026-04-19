---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CacheConditionDirectives.html
title: CacheConditionDirectives
---

# CacheConditionDirectives

## Content

Package [akka.http.javadsl.server.directives](package-summary.html)
## Class CacheConditionDirectives

- java.lang.Object
- - [akka.http.javadsl.server.directives.BasicDirectives](BasicDirectives.html "class in akka.http.javadsl.server.directives")
	- - akka.http.javadsl.server.directives.CacheConditionDirectives

- Direct Known Subclasses:
`[CodingDirectives](CodingDirectives.html "class in akka.http.javadsl.server.directives")`

---

```
public abstract class CacheConditionDirectives
extends [BasicDirectives](BasicDirectives.html "class in akka.http.javadsl.server.directives")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CacheConditionDirectives](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[conditional](#conditional(akka.http.javadsl.model.DateTime,java.util.function.Supplier))​([DateTime](../../model/DateTime.html "class in akka.http.javadsl.model") lastModified,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Wraps its inner route with support for Conditional Requests as defined  by http://tools.ietf.org/html/rfc7232 |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[conditional](#conditional(akka.http.javadsl.model.headers.EntityTag,akka.http.javadsl.model.DateTime,java.util.function.Supplier))​([EntityTag](../../model/headers/EntityTag.html "class in akka.http.javadsl.model.headers") eTag,  [DateTime](../../model/DateTime.html "class in akka.http.javadsl.model") lastModified,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Wraps its inner route with support for Conditional Requests as defined  by http://tools.ietf.org/html/rfc7232 |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[conditional](#conditional(akka.http.javadsl.model.headers.EntityTag,java.util.function.Supplier))​([EntityTag](../../model/headers/EntityTag.html "class in akka.http.javadsl.model.headers") eTag,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Wraps its inner route with support for Conditional Requests as defined  by http://tools.ietf.org/html/rfc7232 |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[conditional](#conditional(java.util.Optional,java.util.Optional,java.util.function.Supplier))​(java.util.Optional<[EntityTag](../../model/headers/EntityTag.html "class in akka.http.javadsl.model.headers")> eTag,  java.util.Optional<[DateTime](../../model/DateTime.html "class in akka.http.javadsl.model")> lastModified,  java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)` | Wraps its inner route with support for Conditional Requests as defined  by http://tools.ietf.org/html/rfc7232 |
	
	
		- ### Methods inherited from class akka.http.javadsl.server.directives.[BasicDirectives](BasicDirectives.html "class in akka.http.javadsl.server.directives")
		
		
		`[cancelRejection](BasicDirectives.html#cancelRejection(akka.http.javadsl.server.Rejection,java.util.function.Supplier)), [cancelRejections](BasicDirectives.html#cancelRejections(java.lang.Iterable,java.util.function.Supplier)), [cancelRejections](BasicDirectives.html#cancelRejections(java.util.function.Predicate,java.util.function.Supplier)), [extract](BasicDirectives.html#extract(java.util.function.Function,java.util.function.Function)), [extractActorSystem](BasicDirectives.html#extractActorSystem(java.util.function.Function)), [extractDataBytes](BasicDirectives.html#extractDataBytes(java.util.function.Function)), [extractEntity](BasicDirectives.html#extractEntity(java.util.function.Function)), [extractExecutionContext](BasicDirectives.html#extractExecutionContext(java.util.function.Function)), [extractLog](BasicDirectives.html#extractLog(java.util.function.Function)), [extractMatchedPath](BasicDirectives.html#extractMatchedPath(java.util.function.Function)), [extractMaterializer](BasicDirectives.html#extractMaterializer(java.util.function.Function)), [extractParserSettings](BasicDirectives.html#extractParserSettings(java.util.function.Function)), [extractRequest](BasicDirectives.html#extractRequest(java.util.function.Function)), [extractRequestContext](BasicDirectives.html#extractRequestContext(java.util.function.Function)), [extractRequestEntity](BasicDirectives.html#extractRequestEntity(java.util.function.Function)), [extractSettings](BasicDirectives.html#extractSettings(java.util.function.Function)), [extractStrictEntity](BasicDirectives.html#extractStrictEntity(scala.concurrent.duration.FiniteDuration,long,java.util.function.Function)), [extractStrictEntity](BasicDirectives.html#extractStrictEntity(scala.concurrent.duration.FiniteDuration,java.util.function.Function)), [extractUnmatchedPath](BasicDirectives.html#extractUnmatchedPath(java.util.function.Function)), [extractUri](BasicDirectives.html#extractUri(java.util.function.Function)), [mapInnerRoute](BasicDirectives.html#mapInnerRoute(java.util.function.Function,java.util.function.Supplier)), [mapRejections](BasicDirectives.html#mapRejections(java.util.function.Function,java.util.function.Supplier)), [mapRequest](BasicDirectives.html#mapRequest(java.util.function.Function,java.util.function.Supplier)), [mapRequestContext](BasicDirectives.html#mapRequestContext(java.util.function.Function,java.util.function.Supplier)), [mapResponse](BasicDirectives.html#mapResponse(java.util.function.Function,java.util.function.Supplier)), [mapResponseEntity](BasicDirectives.html#mapResponseEntity(java.util.function.Function,java.util.function.Supplier)), [mapResponseHeaders](BasicDirectives.html#mapResponseHeaders(java.util.function.Function,java.util.function.Supplier)), [mapRouteResult](BasicDirectives.html#mapRouteResult(java.util.function.Function,java.util.function.Supplier)), [mapRouteResultFuture](BasicDirectives.html#mapRouteResultFuture(java.util.function.Function,java.util.function.Supplier)), [mapRouteResultPF](BasicDirectives.html#mapRouteResultPF(scala.PartialFunction,java.util.function.Supplier)), [mapRouteResultWith](BasicDirectives.html#mapRouteResultWith(java.util.function.Function,java.util.function.Supplier)), [mapRouteResultWithPF](BasicDirectives.html#mapRouteResultWithPF(scala.PartialFunction,java.util.function.Supplier)), [mapSettings](BasicDirectives.html#mapSettings(java.util.function.Function,java.util.function.Supplier)), [mapUnmatchedPath](BasicDirectives.html#mapUnmatchedPath(java.util.function.Function,java.util.function.Supplier)), [pass](BasicDirectives.html#pass(java.util.function.Supplier)), [provide](BasicDirectives.html#provide(T,java.util.function.Function)), [recoverRejections](BasicDirectives.html#recoverRejections(java.util.function.Function,java.util.function.Supplier)), [recoverRejectionsWith](BasicDirectives.html#recoverRejectionsWith(java.util.function.Function,java.util.function.Supplier)), [toStrictEntity](BasicDirectives.html#toStrictEntity(scala.concurrent.duration.FiniteDuration,long,java.util.function.Supplier)), [toStrictEntity](BasicDirectives.html#toStrictEntity(scala.concurrent.duration.FiniteDuration,java.util.function.Supplier)), [withExecutionContext](BasicDirectives.html#withExecutionContext(scala.concurrent.ExecutionContextExecutor,java.util.function.Supplier)), [withLog](BasicDirectives.html#withLog(akka.event.LoggingAdapter,java.util.function.Supplier)), [withMaterializer](BasicDirectives.html#withMaterializer(akka.stream.Materializer,java.util.function.Supplier)), [withSettings](BasicDirectives.html#withSettings(akka.http.javadsl.settings.RoutingSettings,java.util.function.Supplier))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### CacheConditionDirectives
		
		
		
		```
		public CacheConditionDirectives()
		```

	- ### Method Detail
	
	
	
		- #### conditional
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") conditional​([EntityTag](../../model/headers/EntityTag.html "class in akka.http.javadsl.model.headers") eTag,
		                         java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Wraps its inner route with support for Conditional Requests as defined
		 by http://tools.ietf.org/html/rfc7232
		 
		 In particular the algorithm defined by http://tools.ietf.org/html/rfc7232\#section\-6
		 is implemented by this directive.
		 
		
		
		 Note: if you want to combine this directive with `withRangeSupport(...)` you need to put
		 it on the \*outside\* of the `withRangeSupport(...)` directive, i.e. `withRangeSupport(...)`
		 must be on a deeper level in your route structure in order to function correctly.
		
		
		
		Parameters:
		`eTag` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### conditional
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") conditional​([DateTime](../../model/DateTime.html "class in akka.http.javadsl.model") lastModified,
		                         java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Wraps its inner route with support for Conditional Requests as defined
		 by http://tools.ietf.org/html/rfc7232
		 
		 In particular the algorithm defined by http://tools.ietf.org/html/rfc7232\#section\-6
		 is implemented by this directive.
		 
		
		
		 Note: if you want to combine this directive with `withRangeSupport(...)` you need to put
		 it on the \*outside\* of the `withRangeSupport(...)` directive, i.e. `withRangeSupport(...)`
		 must be on a deeper level in your route structure in order to function correctly.
		
		
		
		Parameters:
		`lastModified` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### conditional
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") conditional​([EntityTag](../../model/headers/EntityTag.html "class in akka.http.javadsl.model.headers") eTag,
		                         [DateTime](../../model/DateTime.html "class in akka.http.javadsl.model") lastModified,
		                         java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Wraps its inner route with support for Conditional Requests as defined
		 by http://tools.ietf.org/html/rfc7232
		 
		 In particular the algorithm defined by http://tools.ietf.org/html/rfc7232\#section\-6
		 is implemented by this directive.
		 
		
		
		 Note: if you want to combine this directive with `withRangeSupport(...)` you need to put
		 it on the \*outside\* of the `withRangeSupport(...)` directive, i.e. `withRangeSupport(...)`
		 must be on a deeper level in your route structure in order to function correctly.
		
		
		
		Parameters:
		`eTag` \- (undocumented)
		`lastModified` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)
		- #### conditional
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") conditional​(java.util.Optional<[EntityTag](../../model/headers/EntityTag.html "class in akka.http.javadsl.model.headers")> eTag,
		                         java.util.Optional<[DateTime](../../model/DateTime.html "class in akka.http.javadsl.model")> lastModified,
		                         java.util.function.Supplier<[Route](../Route.html "interface in akka.http.javadsl.server")> inner)
		```
		
		Wraps its inner route with support for Conditional Requests as defined
		 by http://tools.ietf.org/html/rfc7232
		 
		 In particular the algorithm defined by http://tools.ietf.org/html/rfc7232\#section\-6
		 is implemented by this directive.
		 
		
		
		 Note: if you want to combine this directive with `withRangeSupport(...)` you need to put
		 it on the \*outside\* of the `withRangeSupport(...)` directive, i.e. `withRangeSupport(...)`
		 must be on a deeper level in your route structure in order to function correctly.
		
		
		
		Parameters:
		`eTag` \- (undocumented)
		`lastModified` \- (undocumented)
		`inner` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/DateTime.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/EntityTag.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/BasicDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CodingDirectives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CacheConditionDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/CacheConditionDirectives.html)*