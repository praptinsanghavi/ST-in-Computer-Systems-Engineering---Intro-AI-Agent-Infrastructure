---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:47:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/ExceptionHandler.html
title: ExceptionHandler
---

# ExceptionHandler

## Content

Package [akka.http.javadsl.server](package-summary.html)
## Class ExceptionHandler

- java.lang.Object
- - akka.http.javadsl.server.ExceptionHandler

- ---

```
public final class ExceptionHandler
extends java.lang.Object
```

Handles exceptions by turning them into routes. You can create an exception handler in Java code like the following example:
 
```

     ExceptionHandler myHandler = ExceptionHandler.of (ExceptionHandler.newPFBuilder()
         .match(IllegalArgumentException.class, x -> Directives.complete(StatusCodes.BAD_REQUEST))
         .build()
     ));
 
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ExceptionHandler](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ExceptionHandler](../../scaladsl/server/ExceptionHandler.html "interface in akka.http.scaladsl.server")` | `[asScala](#asScala())()` |  |
	| `static [ExceptionHandlerBuilder](ExceptionHandlerBuilder.html "class in akka.http.javadsl.server")` | `[newBuilder](#newBuilder())()` | Creates a new builder DSL for creating an ExceptionHandler |
	| `static [ExceptionHandler](ExceptionHandler.html "class in akka.http.javadsl.server")` | `[of](#of(scala.PartialFunction))​(scala.PartialFunction<java.lang.Throwable,​[Route](Route.html "interface in akka.http.javadsl.server")> pf)` | INTERNAL API |
	| `[ExceptionHandler](ExceptionHandler.html "class in akka.http.javadsl.server")` | `[seal](#seal(akka.http.javadsl.settings.RoutingSettings))​([RoutingSettings](../settings/RoutingSettings.html "class in akka.http.javadsl.settings") settings)` | "Seals" this handler by attaching a default handler as fallback if necessary. |
	| `[ExceptionHandler](ExceptionHandler.html "class in akka.http.javadsl.server")` | `[withFallback](#withFallback(akka.http.javadsl.server.ExceptionHandler))​([ExceptionHandler](ExceptionHandler.html "class in akka.http.javadsl.server") that)` | Creates a new [`ExceptionHandler`](ExceptionHandler.html "class in akka.http.javadsl.server") which uses the given one as fallback for this one. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ExceptionHandler
		
		
		
		```
		public ExceptionHandler()
		```

	- ### Method Detail
	
	
	
		- #### newBuilder
		
		
		
		```
		public static [ExceptionHandlerBuilder](ExceptionHandlerBuilder.html "class in akka.http.javadsl.server") newBuilder()
		```
		
		Creates a new builder DSL for creating an ExceptionHandler
		
		Returns:
		(undocumented)
		- #### of
		
		
		
		```
		public static [ExceptionHandler](ExceptionHandler.html "class in akka.http.javadsl.server") of​(scala.PartialFunction<java.lang.Throwable,​[Route](Route.html "interface in akka.http.javadsl.server")> pf)
		```
		
		INTERNAL API
		- #### asScala
		
		
		
		```
		public [ExceptionHandler](../../scaladsl/server/ExceptionHandler.html "interface in akka.http.scaladsl.server") asScala()
		```
		- #### withFallback
		
		
		
		```
		public [ExceptionHandler](ExceptionHandler.html "class in akka.http.javadsl.server") withFallback​([ExceptionHandler](ExceptionHandler.html "class in akka.http.javadsl.server") that)
		```
		
		Creates a new [`ExceptionHandler`](ExceptionHandler.html "class in akka.http.javadsl.server") which uses the given one as fallback for this one.
		
		Parameters:
		`that` \- (undocumented)
		Returns:
		(undocumented)
		- #### seal
		
		
		
		```
		public [ExceptionHandler](ExceptionHandler.html "class in akka.http.javadsl.server") seal​([RoutingSettings](../settings/RoutingSettings.html "class in akka.http.javadsl.settings") settings)
		```
		
		"Seals" this handler by attaching a default handler as fallback if necessary.
		
		Parameters:
		`settings` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/ExceptionHandler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/ExceptionHandlerBuilder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/RoutingSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ExceptionHandler.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/ExceptionHandler.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/ExceptionHandler.html)*