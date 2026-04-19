---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:40:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/RespondWithDirectives.html
title: RespondWithDirectives
---

# RespondWithDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface RespondWithDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`, `[RespondWithDirectives$](RespondWithDirectives$.html "class in akka.http.scaladsl.server.directives")`

---

```
public interface RespondWithDirectives
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[respondWithDefaultHeader](#respondWithDefaultHeader(akka.http.scaladsl.model.HttpHeader))​([HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model") responseHeader)` | Adds the given response header to all HTTP responses of its inner Route,  if the response from the inner Route doesn't already contain a header with the same name. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[respondWithDefaultHeaders](#respondWithDefaultHeaders(akka.http.scaladsl.model.HttpHeader,scala.collection.immutable.Seq))​([HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model") firstHeader,  scala.collection.immutable.Seq<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")> otherHeaders)` | Adds the given response headers to all HTTP responses of its inner Route,  if a header already exists it is not added again. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[respondWithDefaultHeaders](#respondWithDefaultHeaders(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")> responseHeaders)` | Adds the given response headers to all HTTP responses of its inner Route,  if a header already exists it is not added again. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[respondWithHeader](#respondWithHeader(akka.http.scaladsl.model.HttpHeader))​([HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model") responseHeader)` | Unconditionally adds the given response header to all HTTP responses of its inner Route. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[respondWithHeaders](#respondWithHeaders(akka.http.scaladsl.model.HttpHeader,scala.collection.immutable.Seq))​([HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model") firstHeader,  scala.collection.immutable.Seq<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")> otherHeaders)` | Unconditionally adds the given response headers to all HTTP responses of its inner Route. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[respondWithHeaders](#respondWithHeaders(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")> responseHeaders)` | Unconditionally adds the given response headers to all HTTP responses of its inner Route. |

- - ### Method Detail
	
	
	
		- #### respondWithHeader
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> respondWithHeader​([HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model") responseHeader)
		```
		
		Unconditionally adds the given response header to all HTTP responses of its inner Route.
		 
		
		Parameters:
		`responseHeader` \- (undocumented)
		Returns:
		(undocumented)
		- #### respondWithDefaultHeader
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> respondWithDefaultHeader​([HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model") responseHeader)
		```
		
		Adds the given response header to all HTTP responses of its inner Route,
		 if the response from the inner Route doesn't already contain a header with the same name.
		 
		
		Parameters:
		`responseHeader` \- (undocumented)
		Returns:
		(undocumented)
		- #### respondWithHeaders
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> respondWithHeaders​([HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model") firstHeader,
		                                                      scala.collection.immutable.Seq<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")> otherHeaders)
		```
		
		Unconditionally adds the given response headers to all HTTP responses of its inner Route.
		 
		
		Parameters:
		`firstHeader` \- (undocumented)
		`otherHeaders` \- (undocumented)
		Returns:
		(undocumented)
		- #### respondWithHeaders
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> respondWithHeaders​(scala.collection.immutable.Seq<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")> responseHeaders)
		```
		
		Unconditionally adds the given response headers to all HTTP responses of its inner Route.
		 
		
		Parameters:
		`responseHeaders` \- (undocumented)
		Returns:
		(undocumented)
		- #### respondWithDefaultHeaders
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> respondWithDefaultHeaders​([HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model") firstHeader,
		                                                             scala.collection.immutable.Seq<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")> otherHeaders)
		```
		
		Adds the given response headers to all HTTP responses of its inner Route,
		 if a header already exists it is not added again.
		 
		
		Parameters:
		`firstHeader` \- (undocumented)
		`otherHeaders` \- (undocumented)
		Returns:
		(undocumented)
		- #### respondWithDefaultHeaders
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> respondWithDefaultHeaders​(scala.collection.immutable.Seq<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model")> responseHeaders)
		```
		
		Adds the given response headers to all HTTP responses of its inner Route,
		 if a header already exists it is not added again.
		 
		
		Parameters:
		`responseHeaders` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/RespondWithDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/RespondWithDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/RespondWithDirectives.html)*