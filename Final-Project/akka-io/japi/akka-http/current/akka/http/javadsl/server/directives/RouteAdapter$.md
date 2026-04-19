---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:49:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/RouteAdapter$.html
title: RouteAdapter$
---

# RouteAdapter$

## Content

Package [akka.http.javadsl.server.directives](package-summary.html)
## Class RouteAdapter$

- java.lang.Object
- - akka.http.javadsl.server.directives.RouteAdapter$

- ---

```
public class RouteAdapter$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RouteAdapter$](RouteAdapter$.html "class in akka.http.javadsl.server.directives")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RouteAdapter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives")` | `[apply](#apply(scala.Function1))​(scala.Function1<[RequestContext](../../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../../../scaladsl/server/RouteResult.html "interface in akka.http.scaladsl.server")>> delegate)` |  |
	| `[Route](../Route.html "interface in akka.http.javadsl.server")` | `[asJava](#asJava(scala.Function1))​(scala.Function1<[RequestContext](../../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../../../scaladsl/server/RouteResult.html "interface in akka.http.scaladsl.server")>> delegate)` | Java DSL: Adapt an existing ScalaDSL Route as an Java DSL Route |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RouteAdapter$](RouteAdapter$.html "class in akka.http.javadsl.server.directives") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RouteAdapter$
		
		
		
		```
		public RouteAdapter$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [RouteAdapter](RouteAdapter.html "class in akka.http.javadsl.server.directives") apply​(scala.Function1<[RequestContext](../../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../../../scaladsl/server/RouteResult.html "interface in akka.http.scaladsl.server")>> delegate)
		```
		- #### asJava
		
		
		
		```
		public [Route](../Route.html "interface in akka.http.javadsl.server") asJava​(scala.Function1<[RequestContext](../../../scaladsl/server/RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../../../scaladsl/server/RouteResult.html "interface in akka.http.scaladsl.server")>> delegate)
		```
		
		Java DSL: Adapt an existing ScalaDSL Route as an Java DSL Route

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/RouteAdapter$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/RouteAdapter.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/RouteAdapter$.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/directives/RouteAdapter$.html)*