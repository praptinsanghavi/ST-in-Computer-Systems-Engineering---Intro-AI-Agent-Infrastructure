---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RejectionHandler.html
title: RejectionHandler
---

# RejectionHandler

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Interface RejectionHandler

- All Superinterfaces:
`scala.Function1<scala.collection.immutable.Seq<[Rejection](Rejection.html "interface in akka.http.scaladsl.server")>,​scala.Option<scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>>>`

---

```
public interface RejectionHandler
extends scala.Function1<scala.collection.immutable.Seq<[Rejection](Rejection.html "interface in akka.http.scaladsl.server")>,​scala.Option<scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>>>
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[RejectionHandler.Builder](RejectionHandler.Builder.html "class in akka.http.scaladsl.server")` |  |
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[RejectionHandler](RejectionHandler.html "interface in akka.http.scaladsl.server")` | `[mapRejectionResponse](#mapRejectionResponse(scala.Function1))​(scala.Function1<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> map)` | Map any HTTP response which was returned by this RejectionHandler to a different one before rendering it. |
	| `[RejectionHandler](RejectionHandler.html "interface in akka.http.scaladsl.server")` | `[seal](#seal())()` | "Seals" this handler by attaching a default handler as fallback if necessary. |
	| `[RejectionHandler](RejectionHandler.html "interface in akka.http.scaladsl.server")` | `[withFallback](#withFallback(akka.http.scaladsl.server.RejectionHandler))​([RejectionHandler](RejectionHandler.html "interface in akka.http.scaladsl.server") that)` | Creates a new [`RejectionHandler`](RejectionHandler.html "interface in akka.http.scaladsl.server") which uses the given one as fallback for this one. |
	
	
		- ### Methods inherited from interface scala.Function1
		
		
		`andThen, apply, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose, toString`

- - ### Method Detail
	
	
	
		- #### mapRejectionResponse
		
		
		
		```
		[RejectionHandler](RejectionHandler.html "interface in akka.http.scaladsl.server") mapRejectionResponse​(scala.Function1<[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../model/HttpResponse.html "class in akka.http.scaladsl.model")> map)
		```
		
		Map any HTTP response which was returned by this RejectionHandler to a different one before rendering it.
		- #### withFallback
		
		
		
		```
		[RejectionHandler](RejectionHandler.html "interface in akka.http.scaladsl.server") withFallback​([RejectionHandler](RejectionHandler.html "interface in akka.http.scaladsl.server") that)
		```
		
		Creates a new [`RejectionHandler`](RejectionHandler.html "interface in akka.http.scaladsl.server") which uses the given one as fallback for this one.
		
		Parameters:
		`that` \- (undocumented)
		Returns:
		(undocumented)
		- #### seal
		
		
		
		```
		[RejectionHandler](RejectionHandler.html "interface in akka.http.scaladsl.server") seal()
		```
		
		"Seals" this handler by attaching a default handler as fallback if necessary.
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Rejection.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RejectionHandler.Builder.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RejectionHandler.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RejectionHandler.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RejectionHandler.html)*