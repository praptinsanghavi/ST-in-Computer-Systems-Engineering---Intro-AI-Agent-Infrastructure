---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RejectionHandler.html
title: RejectionHandler
---

# RejectionHandler

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class RejectionHandler

- java.lang.Object
- - akka.http.javadsl.server.RejectionHandler

- ---

```
public final class RejectionHandler
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RejectionHandler](#%3Cinit%3E(akka.http.scaladsl.server.RejectionHandler))​([RejectionHandler](../../scaladsl/server/RejectionHandler.html "interface in akka.http.scaladsl.server") asScala)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RejectionHandler](../../scaladsl/server/RejectionHandler.html "interface in akka.http.scaladsl.server")` | `[asScala](#asScala())()` |  |
	| `static [RejectionHandler](RejectionHandler.html "class in akka.http.javadsl.server")` | `[defaultHandler](#defaultHandler())()` |  |
	| `[RejectionHandler](RejectionHandler.html "class in akka.http.javadsl.server")` | `[mapRejectionResponse](#mapRejectionResponse(java.util.function.UnaryOperator))​(java.util.function.UnaryOperator<[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> map)` | Map any HTTP response which was returned by this RejectionHandler to a different one before rendering it. |
	| `static [RejectionHandlerBuilder](RejectionHandlerBuilder.html "class in akka.http.javadsl.server")` | `[newBuilder](#newBuilder())()` | Creates a new [`RejectionHandler`](RejectionHandler.html "class in akka.http.javadsl.server") builder. |
	| `[RejectionHandler](RejectionHandler.html "class in akka.http.javadsl.server")` | `[seal](#seal())()` | "Seals" this handler by attaching a default handler as fallback if necessary. |
	| `[RejectionHandler](RejectionHandler.html "class in akka.http.javadsl.server")` | `[withFallback](#withFallback(akka.http.javadsl.server.RejectionHandler))​([RejectionHandler](RejectionHandler.html "class in akka.http.javadsl.server") fallback)` | Creates a new [`RejectionHandler`](RejectionHandler.html "class in akka.http.javadsl.server") which uses the given one as fallback for this one. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RejectionHandler
		
		
		
		```
		public RejectionHandler​([RejectionHandler](../../scaladsl/server/RejectionHandler.html "interface in akka.http.scaladsl.server") asScala)
		```

	- ### Method Detail
	
	
	
		- #### newBuilder
		
		
		
		```
		public static [RejectionHandlerBuilder](RejectionHandlerBuilder.html "class in akka.http.javadsl.server") newBuilder()
		```
		
		Creates a new [`RejectionHandler`](RejectionHandler.html "class in akka.http.javadsl.server") builder.
		
		Returns:
		(undocumented)
		- #### defaultHandler
		
		
		
		```
		public static [RejectionHandler](RejectionHandler.html "class in akka.http.javadsl.server") defaultHandler()
		```
		- #### asScala
		
		
		
		```
		public [RejectionHandler](../../scaladsl/server/RejectionHandler.html "interface in akka.http.scaladsl.server") asScala()
		```
		- #### withFallback
		
		
		
		```
		public [RejectionHandler](RejectionHandler.html "class in akka.http.javadsl.server") withFallback​([RejectionHandler](RejectionHandler.html "class in akka.http.javadsl.server") fallback)
		```
		
		Creates a new [`RejectionHandler`](RejectionHandler.html "class in akka.http.javadsl.server") which uses the given one as fallback for this one.
		
		Parameters:
		`fallback` \- (undocumented)
		Returns:
		(undocumented)
		- #### seal
		
		
		
		```
		public [RejectionHandler](RejectionHandler.html "class in akka.http.javadsl.server") seal()
		```
		
		"Seals" this handler by attaching a default handler as fallback if necessary.
		
		Returns:
		(undocumented)
		- #### mapRejectionResponse
		
		
		
		```
		public [RejectionHandler](RejectionHandler.html "class in akka.http.javadsl.server") mapRejectionResponse​(java.util.function.UnaryOperator<[HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")> map)
		```
		
		Map any HTTP response which was returned by this RejectionHandler to a different one before rendering it.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RejectionHandler.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RejectionHandlerBuilder.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RejectionHandler.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RejectionHandler.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/server/RejectionHandler.html)*