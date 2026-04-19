---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/StandardRoute$.html
title: StandardRoute$
---

# StandardRoute$

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class StandardRoute$

- java.lang.Object
- - akka.http.scaladsl.server.StandardRoute$

- ---

```
public class StandardRoute$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StandardRoute$](StandardRoute$.html "class in akka.http.scaladsl.server")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StandardRoute$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[StandardRoute](StandardRoute.html "class in akka.http.scaladsl.server")` | `[apply](#apply(scala.Function1))​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route)` |  |
	| `<L> [Directive](Directive.html "class in akka.http.scaladsl.server")<L>` | `[toDirective](#toDirective(akka.http.scaladsl.server.StandardRoute,akka.http.scaladsl.server.util.Tuple))​([StandardRoute](StandardRoute.html "class in akka.http.scaladsl.server") route,  [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<L> evidence$2)` | Converts the StandardRoute into a directive that never passes the request to its inner route  (and always returns its underlying route). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [StandardRoute$](StandardRoute$.html "class in akka.http.scaladsl.server") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### StandardRoute$
		
		
		
		```
		public StandardRoute$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [StandardRoute](StandardRoute.html "class in akka.http.scaladsl.server") apply​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route)
		```
		- #### toDirective
		
		
		
		```
		public <L> [Directive](Directive.html "class in akka.http.scaladsl.server")<L> toDirective​([StandardRoute](StandardRoute.html "class in akka.http.scaladsl.server") route,
		                                    [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<L> evidence$2)
		```
		
		Converts the StandardRoute into a directive that never passes the request to its inner route
		 (and always returns its underlying route).
		
		Parameters:
		`route` \- (undocumented)
		`evidence$2` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/StandardRoute$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/StandardRoute.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/Tuple.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/StandardRoute$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/StandardRoute$.html)*