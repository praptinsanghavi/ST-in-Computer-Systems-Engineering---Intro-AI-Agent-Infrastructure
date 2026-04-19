---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:38:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ExceptionHandler$.html
title: ExceptionHandler$
---

# ExceptionHandler$

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class ExceptionHandler$

- java.lang.Object
- - akka.http.scaladsl.server.ExceptionHandler$

- ---

```
public class ExceptionHandler$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ExceptionHandler$](ExceptionHandler$.html "class in akka.http.scaladsl.server")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ExceptionHandler$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ExceptionHandler](ExceptionHandler.html "interface in akka.http.scaladsl.server")` | `[apply](#apply(scala.PartialFunction))​(scala.PartialFunction<java.lang.Throwable,​scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>> pf)` |  |
	| `java.lang.String` | `[ErrorMessageTemplate](#ErrorMessageTemplate())()` |  |
	| `[ExceptionHandler](ExceptionHandler.html "interface in akka.http.scaladsl.server")` | `[seal](#seal(akka.http.scaladsl.server.ExceptionHandler,akka.http.scaladsl.settings.RoutingSettings))​([ExceptionHandler](ExceptionHandler.html "interface in akka.http.scaladsl.server") handler,  [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") settings)` | Creates a sealed ExceptionHandler from the given one. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ExceptionHandler$](ExceptionHandler$.html "class in akka.http.scaladsl.server") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ExceptionHandler$
		
		
		
		```
		public ExceptionHandler$()
		```

	- ### Method Detail
	
	
	
		- #### ErrorMessageTemplate
		
		
		
		```
		public java.lang.String ErrorMessageTemplate()
		```
		- #### apply
		
		
		
		```
		public [ExceptionHandler](ExceptionHandler.html "interface in akka.http.scaladsl.server") apply​(scala.PartialFunction<java.lang.Throwable,​scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>> pf)
		```
		- #### seal
		
		
		
		```
		public [ExceptionHandler](ExceptionHandler.html "interface in akka.http.scaladsl.server") seal​([ExceptionHandler](ExceptionHandler.html "interface in akka.http.scaladsl.server") handler,
		                             [RoutingSettings](../settings/RoutingSettings.html "class in akka.http.scaladsl.settings") settings)
		```
		
		Creates a sealed ExceptionHandler from the given one. Returns the default handler if the given one
		 is `null`.
		
		Parameters:
		`handler` \- (undocumented)
		`settings` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ExceptionHandler$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ExceptionHandler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/RoutingSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ExceptionHandler$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ExceptionHandler$.html)*