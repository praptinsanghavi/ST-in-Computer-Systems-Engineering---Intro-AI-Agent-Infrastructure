---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:38:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive$.html
title: Directive$
---

# Directive$

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class Directive$

- java.lang.Object
- - akka.http.scaladsl.server.Directive$

- ---

```
public class Directive$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Directive$](Directive$.html "class in akka.http.scaladsl.server")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Directive$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Function1<scala.Function0<scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>>,​scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>>` | `[addByNameNullaryApply](#addByNameNullaryApply(akka.http.scaladsl.server.Directive))​([Directive](Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> directive)` | Adds `apply` to Directive0\. |
	| `<L> scala.Function1<java.lang.Object,​scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>>` | `[addDirectiveApply](#addDirectiveApply(akka.http.scaladsl.server.Directive,akka.http.scaladsl.server.util.ApplyConverter))​([Directive](Directive.html "class in akka.http.scaladsl.server")<L> directive,  [ApplyConverter](util/ApplyConverter.html "class in akka.http.scaladsl.server.util")<L> hac)` | Adds `apply` to all Directives with 1 or more extractions,  which allows specifying an n\-ary function to receive the extractions instead of a Function1\[TupleX, Route]. |
	| `<T> [Directive](Directive.html "class in akka.http.scaladsl.server")<T>` | `[apply](#apply(scala.Function1,akka.http.scaladsl.server.util.Tuple))​(scala.Function1<scala.Function1<T,​scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>>,​scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>> f,  [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<T> evidence$4)` | Constructs a directive from a function literal. |
	| `[Directive](Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[Empty](#Empty())()` | A Directive that always passes the request on to its inner route (i.e. does nothing). |
	| `<T> [Directive.SingleValueModifiers](Directive.SingleValueModifiers.html "class in akka.http.scaladsl.server")<T>` | `[SingleValueModifiers](#SingleValueModifiers(akka.http.scaladsl.server.Directive))​([Directive](Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>> underlying)` | previous, non\-value class implementation kept around for binary compatibility  TODO: remove with next binary incompatible release bump |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Directive$](Directive$.html "class in akka.http.scaladsl.server") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Directive$
		
		
		
		```
		public Directive$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [Directive](Directive.html "class in akka.http.scaladsl.server")<T> apply​(scala.Function1<scala.Function1<T,​scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>>,​scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>> f,
		                              [Tuple](util/Tuple.html "interface in akka.http.scaladsl.server.util")<T> evidence$4)
		```
		
		Constructs a directive from a function literal.
		
		Parameters:
		`f` \- (undocumented)
		`evidence$4` \- (undocumented)
		Returns:
		(undocumented)
		- #### Empty
		
		
		
		```
		public [Directive](Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> Empty()
		```
		
		A Directive that always passes the request on to its inner route (i.e. does nothing).
		
		Returns:
		(undocumented)
		- #### addDirectiveApply
		
		
		
		```
		public <L> scala.Function1<java.lang.Object,​scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>> addDirectiveApply​([Directive](Directive.html "class in akka.http.scaladsl.server")<L> directive,
		                                                                                                                                                [ApplyConverter](util/ApplyConverter.html "class in akka.http.scaladsl.server.util")<L> hac)
		```
		
		Adds `apply` to all Directives with 1 or more extractions,
		 which allows specifying an n\-ary function to receive the extractions instead of a Function1\[TupleX, Route].
		
		Parameters:
		`directive` \- (undocumented)
		`hac` \- (undocumented)
		Returns:
		(undocumented)
		- #### addByNameNullaryApply
		
		
		
		```
		public scala.Function1<scala.Function0<scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>>,​scala.Function1<[RequestContext](RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](RouteResult.html "interface in akka.http.scaladsl.server")>>> addByNameNullaryApply​([Directive](Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> directive)
		```
		
		Adds `apply` to Directive0\. Note: The `apply` parameter is call\-by\-name to ensure consistent execution behavior
		 with the directives producing extractions.
		
		Parameters:
		`directive` \- (undocumented)
		Returns:
		(undocumented)
		- #### SingleValueModifiers
		
		
		
		```
		public <T> [Directive.SingleValueModifiers](Directive.SingleValueModifiers.html "class in akka.http.scaladsl.server")<T> SingleValueModifiers​([Directive](Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<T>> underlying)
		```
		
		previous, non\-value class implementation kept around for binary compatibility
		 TODO: remove with next binary incompatible release bump
		 
		 INTERNAL API
		
		
		
		Parameters:
		`underlying` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.SingleValueModifiers.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/ApplyConverter.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/util/Tuple.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive$.html)*