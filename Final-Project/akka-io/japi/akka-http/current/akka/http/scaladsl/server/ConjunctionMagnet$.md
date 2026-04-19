---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:38:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ConjunctionMagnet$.html
title: ConjunctionMagnet$
---

# ConjunctionMagnet$

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class ConjunctionMagnet$

- java.lang.Object
- - akka.http.scaladsl.server.ConjunctionMagnet$

- ---

```
public class ConjunctionMagnet$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ConjunctionMagnet$](ConjunctionMagnet$.html "class in akka.http.scaladsl.server")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConjunctionMagnet$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<L,​R>[ConjunctionMagnet](ConjunctionMagnet.html "interface in akka.http.scaladsl.server")<L>` | `[fromDirective](#fromDirective(akka.http.scaladsl.server.Directive,akka.http.scaladsl.server.util.TupleOps.Join))​([Directive](Directive.html "class in akka.http.scaladsl.server")<R> other,  [TupleOps.Join](util/TupleOps.Join.html "interface in akka.http.scaladsl.server.util")<L,​R> join)` |  |
	| `<T,​R extends scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>>[ConjunctionMagnet](ConjunctionMagnet.html "interface in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[fromRouteGenerator](#fromRouteGenerator(scala.Function1))​(scala.Function1<T,​R> generator)` |  |
	| `<L> [ConjunctionMagnet](ConjunctionMagnet.html "interface in akka.http.scaladsl.server")<L>` | `[fromStandardRoute](#fromStandardRoute(akka.http.scaladsl.server.StandardRoute))​([StandardRoute](StandardRoute.html "class in akka.http.scaladsl.server") route)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ConjunctionMagnet$](ConjunctionMagnet$.html "class in akka.http.scaladsl.server") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ConjunctionMagnet$
		
		
		
		```
		public ConjunctionMagnet$()
		```

	- ### Method Detail
	
	
	
		- #### fromDirective
		
		
		
		```
		public <L,​R> [ConjunctionMagnet](ConjunctionMagnet.html "interface in akka.http.scaladsl.server")<L> fromDirective​([Directive](Directive.html "class in akka.http.scaladsl.server")<R> other,
		                                                      [TupleOps.Join](util/TupleOps.Join.html "interface in akka.http.scaladsl.server.util")<L,​R> join)
		```
		- #### fromStandardRoute
		
		
		
		```
		public <L> [ConjunctionMagnet](ConjunctionMagnet.html "interface in akka.http.scaladsl.server")<L> fromStandardRoute​([StandardRoute](StandardRoute.html "class in akka.http.scaladsl.server") route)
		```
		- #### fromRouteGenerator
		
		
		
		```
		public <T,​R extends scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>> [ConjunctionMagnet](ConjunctionMagnet.html "interface in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> fromRouteGenerator​(scala.Function1<T,​R> generator)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ConjunctionMagnet$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ConjunctionMagnet.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/StandardRoute.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/TupleOps.Join.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ConjunctionMagnet$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/ConjunctionMagnet$.html)*