---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:40:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/MiscDirectives.html
title: MiscDirectives
---

# MiscDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface MiscDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`, `[MiscDirectives$](MiscDirectives$.html "class in akka.http.scaladsl.server.directives")`

---

```
public interface MiscDirectives
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[RemoteAddress](../../model/RemoteAddress.html "class in akka.http.scaladsl.model")>>` | `[extractClientIP](#extractClientIP())()` | Extracts the client's IP from either the X\-Forwarded\-For, Remote\-Address, X\-Real\-IP header  or `akka.http.scaladsl.model.AttributeKeys.remoteAddress` attribute  (in that order of priority). |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[rejectEmptyResponse](#rejectEmptyResponse())()` | Converts responses with an empty entity into (empty) rejections. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[requestEntityEmpty](#requestEntityEmpty())()` | Rejects if the request entity is non\-empty. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[requestEntityPresent](#requestEntityPresent())()` | Rejects with a `RequestEntityExpectedRejection` if the request entity is empty. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[Language](../../model/headers/Language.html "class in akka.http.scaladsl.model.headers")>>` | `[selectPreferredLanguage](#selectPreferredLanguage(akka.http.scaladsl.model.headers.Language,scala.collection.immutable.Seq))​([Language](../../model/headers/Language.html "class in akka.http.scaladsl.model.headers") first,  scala.collection.immutable.Seq<[Language](../../model/headers/Language.html "class in akka.http.scaladsl.model.headers")> more)` | Inspects the request's `Accept-Language` header and determines,  which of the given language alternatives is preferred by the client. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[validate](#validate(scala.Function0,java.lang.String))​(scala.Function0<java.lang.Object> check,  java.lang.String errorMsg)` | Checks the given condition before running its inner route. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[withoutSizeLimit](#withoutSizeLimit())()` | Disables the size limit (configured by `akka.http.parsing.max-content-length` by default) checking on the incoming  `HttpRequest` entity. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[withSizeLimit](#withSizeLimit(long))​(long maxBytes)` | Fails the stream with [`EntityStreamSizeException`](../../model/EntityStreamSizeException.html "class in akka.http.scaladsl.model") if its request entity size exceeds  given limit. |

- - ### Method Detail
	
	
	
		- #### validate
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> validate​(scala.Function0<java.lang.Object> check,
		                                            java.lang.String errorMsg)
		```
		
		Checks the given condition before running its inner route.
		 If the condition fails the route is rejected with a `ValidationRejection`.
		 
		
		Parameters:
		`check` \- (undocumented)
		`errorMsg` \- (undocumented)
		Returns:
		(undocumented)
		- #### extractClientIP
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[RemoteAddress](../../model/RemoteAddress.html "class in akka.http.scaladsl.model")>> extractClientIP()
		```
		
		Extracts the client's IP from either the X\-Forwarded\-For, Remote\-Address, X\-Real\-IP header
		 or `akka.http.scaladsl.model.AttributeKeys.remoteAddress` attribute
		 (in that order of priority).
		 
		
		Returns:
		(undocumented)
		- #### requestEntityEmpty
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> requestEntityEmpty()
		```
		
		Rejects if the request entity is non\-empty.
		 
		
		Returns:
		(undocumented)
		- #### requestEntityPresent
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> requestEntityPresent()
		```
		
		Rejects with a `RequestEntityExpectedRejection` if the request entity is empty.
		 Non\-empty requests are passed on unchanged to the inner route.
		 
		
		Returns:
		(undocumented)
		- #### rejectEmptyResponse
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> rejectEmptyResponse()
		```
		
		Converts responses with an empty entity into (empty) rejections.
		 This way you can, for example, have the marshalling of a ''None'' option
		 be treated as if the request could not be matched.
		 
		
		Returns:
		(undocumented)
		- #### selectPreferredLanguage
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[Language](../../model/headers/Language.html "class in akka.http.scaladsl.model.headers")>> selectPreferredLanguage​([Language](../../model/headers/Language.html "class in akka.http.scaladsl.model.headers") first,
		                                                          scala.collection.immutable.Seq<[Language](../../model/headers/Language.html "class in akka.http.scaladsl.model.headers")> more)
		```
		
		Inspects the request's `Accept-Language` header and determines,
		 which of the given language alternatives is preferred by the client.
		 (See http://tools.ietf.org/html/rfc7231\#section\-5\.3\.5 for more details on the
		 negotiation logic.)
		 If there are several best language alternatives that the client
		 has equal preference for (even if this preference is zero!)
		 the order of the arguments is used as a tie breaker (First one wins).
		 
		
		Parameters:
		`first` \- (undocumented)
		`more` \- (undocumented)
		Returns:
		(undocumented)
		- #### withSizeLimit
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> withSizeLimit​(long maxBytes)
		```
		
		Fails the stream with [`EntityStreamSizeException`](../../model/EntityStreamSizeException.html "class in akka.http.scaladsl.model") if its request entity size exceeds
		 given limit. Limit given as parameter overrides limit configured with `akka.http.parsing.max-content-length`.
		 
		 Beware that request entity size check is executed when entity is consumed.
		 
		
		
		
		Parameters:
		`maxBytes` \- (undocumented)
		Returns:
		(undocumented)
		- #### withoutSizeLimit
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> withoutSizeLimit()
		```
		
		Disables the size limit (configured by `akka.http.parsing.max-content-length` by default) checking on the incoming
		 `HttpRequest` entity.
		 Can be useful when handling arbitrarily large data uploads in specific parts of your routes.
		 
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/EntityStreamSizeException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RemoteAddress.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Language.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/MiscDirectives$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/MiscDirectives.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/directives/MiscDirectives.html)*