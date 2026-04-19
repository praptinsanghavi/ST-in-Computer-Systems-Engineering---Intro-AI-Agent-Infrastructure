---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:37:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ExceptionHandler.html
title: ExceptionHandler
---

# ExceptionHandler

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Interface ExceptionHandler

- All Superinterfaces:
`scala.Function1<java.lang.Throwable,​scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>>`, `scala.PartialFunction<java.lang.Throwable,​scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>>`

---

```
public interface ExceptionHandler
extends scala.PartialFunction<java.lang.Throwable,​scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`
		- ### Nested classes/interfaces inherited from interface scala.PartialFunction
		
		
		`scala.PartialFunction.ElementWiseExtractor<A extends java.lang.Object,​B extends java.lang.Object>, scala.PartialFunction.ElementWiseExtractor$`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[ExceptionHandler](ExceptionHandler.html "interface in akka.http.scaladsl.server")` | `[seal](#seal(akka.http.scaladsl.settings.RoutingSettings))​([RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") settings)` | "Seals" this handler by attaching a default handler as fallback if necessary. |
	| `[ExceptionHandler](ExceptionHandler.html "interface in akka.http.scaladsl.server")` | `[withFallback](#withFallback(akka.http.scaladsl.server.ExceptionHandler))​([ExceptionHandler](ExceptionHandler.html "interface in akka.http.scaladsl.server") that)` | Creates a new [`ExceptionHandler`](ExceptionHandler.html "interface in akka.http.scaladsl.server") which uses the given one as fallback for this one. |
	
	
		- ### Methods inherited from interface scala.Function1
		
		
		`apply, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose, toString`
		- ### Methods inherited from interface scala.PartialFunction
		
		
		`andThen, andThen, applyOrElse, compose, elementWise, isDefinedAt, lift, orElse, runWith, unapply`

- - ### Method Detail
	
	
	
		- #### withFallback
		
		
		
		```
		[ExceptionHandler](ExceptionHandler.html "interface in akka.http.scaladsl.server") withFallback​([ExceptionHandler](ExceptionHandler.html "interface in akka.http.scaladsl.server") that)
		```
		
		Creates a new [`ExceptionHandler`](ExceptionHandler.html "interface in akka.http.scaladsl.server") which uses the given one as fallback for this one.
		
		Parameters:
		`that` \- (undocumented)
		Returns:
		(undocumented)
		- #### seal
		
		
		
		```
		[ExceptionHandler](ExceptionHandler.html "interface in akka.http.scaladsl.server") seal​([RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") settings)
		```
		
		"Seals" this handler by attaching a default handler as fallback if necessary.
		
		Parameters:
		`settings` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ExceptionHandler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/RoutingSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ExceptionHandler.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ExceptionHandler.html)*