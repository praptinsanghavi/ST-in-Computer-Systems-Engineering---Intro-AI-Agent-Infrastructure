---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/StandardRoute.html
title: StandardRoute
---

# StandardRoute

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class StandardRoute

- java.lang.Object
- - akka.http.scaladsl.server.StandardRoute

- All Implemented Interfaces:
`scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>`

---

```
public abstract class StandardRoute
extends java.lang.Object
implements scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>
```

A Route that can be implicitly converted into a Directive (fitting any signature).

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StandardRoute](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [StandardRoute](StandardRoute.html "class in akka.http.scaladsl.server")` | `[apply](#apply(scala.Function1))​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route)` |  |
	| `<L> [Directive](Directive.html "class in akka.http.scaladsl.server")<L>` | `[toDirective](#toDirective(akka.http.scaladsl.server.util.Tuple))​([Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<L> evidence$1)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Function1
		
		
		`andThen, apply, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose, toString`

- - ### Constructor Detail
	
	
	
		- #### StandardRoute
		
		
		
		```
		public StandardRoute()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [StandardRoute](StandardRoute.html "class in akka.http.scaladsl.server") apply​(scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>> route)
		```
		- #### toDirective
		
		
		
		```
		public <L> [Directive](Directive.html "class in akka.http.scaladsl.server")<L> toDirective​([Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<L> evidence$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/StandardRoute.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/Tuple.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/StandardRoute.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/StandardRoute.html)*