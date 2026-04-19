---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/TestRoute.html
title: TestRoute
---

# TestRoute

## Content

Package [akka.http.javadsl.testkit](package-summary.html)
## Interface TestRoute

- ---

```
public interface TestRoute
```

A wrapped route that has a `run` method to run a request through the underlying route to create
 a `TestResponse`.
 
 A TestRoute is created by deriving a test class from the concrete RouteTest implementation for your
 testing framework (like [`JUnitRouteTest`](JUnitRouteTest.html "class in akka.http.javadsl.testkit") for JUnit) and then using its `testRoute` method to wrap
 a route with testing support.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit")` | `[run](#run(akka.http.javadsl.model.HttpRequest))​([HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model") request)` | Run the request against the sealed route, meaning that exceptions and rejections will be handled by  the default exception and rejection handlers. |
	| `[TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit")` | `[runClientServer](#runClientServer(akka.http.javadsl.model.HttpRequest))​([HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model") request)` | Similar to [`run(akka.http.javadsl.model.HttpRequest)`](#run(akka.http.javadsl.model.HttpRequest)) but runs the request through a full HTTP client and server stack. |
	| `[TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit")` | `[runWithRejections](#runWithRejections(akka.http.javadsl.model.HttpRequest))​([HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model") request)` | Run the request against the "semi\-sealed" route, meaning that exceptions will be handled by the  default exception handler but rejections will not be handled. |
	| `[Route](../server/Route.html "interface in akka.http.javadsl.server")` | `[underlying](#underlying())()` |  |

- - ### Method Detail
	
	
	
		- #### run
		
		
		
		```
		[TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit") run​([HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model") request)
		```
		
		Run the request against the sealed route, meaning that exceptions and rejections will be handled by
		 the default exception and rejection handlers. The default handlers will convert exceptions and
		 rejections into HTTP responses with corresponding status codes (like 404 when no route matches
		 the path or 500 in cases of exceptions).
		 
		 If you want to assert on the original rejections instead, use [`runWithRejections(akka.http.javadsl.model.HttpRequest)`](#runWithRejections(akka.http.javadsl.model.HttpRequest)).
		
		
		
		Parameters:
		`request` \- (undocumented)
		Returns:
		(undocumented)
		- #### runClientServer
		
		
		
		```
		[TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit") runClientServer​([HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model") request)
		```
		
		Similar to [`run(akka.http.javadsl.model.HttpRequest)`](#run(akka.http.javadsl.model.HttpRequest)) but runs the request through a full HTTP client and server stack.
		 
		 Run the request against the sealed route, meaning that exceptions and rejections will be handled by
		 the default exception and rejection handlers. The default handlers will convert exceptions and
		 rejections into HTTP responses with corresponding status codes (like 404 when no route matches
		 the path or 500 in cases of exceptions).
		 
		
		
		 If you want to assert on the original rejections instead, use [`runWithRejections(akka.http.javadsl.model.HttpRequest)`](#runWithRejections(akka.http.javadsl.model.HttpRequest)).
		
		
		
		Parameters:
		`request` \- (undocumented)
		Returns:
		(undocumented)
		- #### runWithRejections
		
		
		
		```
		[TestRouteResult](TestRouteResult.html "class in akka.http.javadsl.testkit") runWithRejections​([HttpRequest](../model/HttpRequest.html "class in akka.http.javadsl.model") request)
		```
		
		Run the request against the "semi\-sealed" route, meaning that exceptions will be handled by the
		 default exception handler but rejections will not be handled. This means that the test will not
		 see HTTP responses with error status codes for routes that rejected a request. Instead, the
		 [`TestRouteResult`](TestRouteResult.html "class in akka.http.javadsl.testkit") allows access to the original rejection containing all the rejection details
		 in structured form. Use [`TestRouteResult.assertRejections(akka.http.javadsl.server.Rejection...)`](TestRouteResult.html#assertRejections(akka.http.javadsl.server.Rejection...)) to check that a route rejected a
		 request with expected rejections.
		 
		 Otherwise, to assert on the actual error HTTP response generated by the default rejection handler,
		 use the [`run(akka.http.javadsl.model.HttpRequest)`](#run(akka.http.javadsl.model.HttpRequest)) method, instead.
		
		
		
		Parameters:
		`request` \- (undocumented)
		Returns:
		(undocumented)
		- #### underlying
		
		
		
		```
		[Route](../server/Route.html "interface in akka.http.javadsl.server") underlying()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/server/Route.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/JUnitRouteTest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/TestRouteResult.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/TestRoute.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/testkit/TestRoute.html)*