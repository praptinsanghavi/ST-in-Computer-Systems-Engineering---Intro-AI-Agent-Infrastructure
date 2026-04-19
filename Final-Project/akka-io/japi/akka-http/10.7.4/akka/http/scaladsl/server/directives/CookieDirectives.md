---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/CookieDirectives.html
title: CookieDirectives
---

# CookieDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface CookieDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[CookieDirectives$](CookieDirectives$.html "class in akka.http.scaladsl.server.directives")`, `[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`

---

```
public interface CookieDirectives
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[HttpCookiePair](../../model/headers/HttpCookiePair.html "class in akka.http.scaladsl.model.headers")>>` | `[cookie](#cookie(java.lang.String))​(java.lang.String name)` | Extracts the `HttpCookiePair` with the given name. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[deleteCookie](#deleteCookie(akka.http.scaladsl.model.headers.HttpCookie,scala.collection.immutable.Seq))​([HttpCookie](../../model/headers/HttpCookie.html "class in akka.http.scaladsl.model.headers") first,  scala.collection.immutable.Seq<[HttpCookie](../../model/headers/HttpCookie.html "class in akka.http.scaladsl.model.headers")> more)` | Adds a {@link Set\-Cookie} response header expiring the given cookies. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[deleteCookie](#deleteCookie(java.lang.String,java.lang.String,java.lang.String))​(java.lang.String name,  java.lang.String domain,  java.lang.String path)` | Adds a {@link Set\-Cookie} response header expiring the cookie with the given properties. |
	| `scala.Function1<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model"),​scala.Option<[HttpCookiePair](../../model/headers/HttpCookiePair.html "class in akka.http.scaladsl.model.headers")>>` | `[findCookie](#findCookie(java.lang.String))​(java.lang.String name)` |  |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.Option<[HttpCookiePair](../../model/headers/HttpCookiePair.html "class in akka.http.scaladsl.model.headers")>>>` | `[optionalCookie](#optionalCookie(java.lang.String))​(java.lang.String name)` | Extracts the `HttpCookiePair` with the given name as an `Option[HttpCookiePair]`. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[setCookie](#setCookie(akka.http.scaladsl.model.headers.HttpCookie,scala.collection.immutable.Seq))​([HttpCookie](../../model/headers/HttpCookie.html "class in akka.http.scaladsl.model.headers") first,  scala.collection.immutable.Seq<[HttpCookie](../../model/headers/HttpCookie.html "class in akka.http.scaladsl.model.headers")> more)` | Adds a {@link Set\-Cookie} response header with the given cookies. |

- - ### Method Detail
	
	
	
		- #### cookie
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[HttpCookiePair](../../model/headers/HttpCookiePair.html "class in akka.http.scaladsl.model.headers")>> cookie​(java.lang.String name)
		```
		
		Extracts the `HttpCookiePair` with the given name. If the cookie is not present the
		 request is rejected with a respective `MissingCookieRejection`.
		 
		
		Parameters:
		`name` \- (undocumented)
		Returns:
		(undocumented)
		- #### optionalCookie
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.Option<[HttpCookiePair](../../model/headers/HttpCookiePair.html "class in akka.http.scaladsl.model.headers")>>> optionalCookie​(java.lang.String name)
		```
		
		Extracts the `HttpCookiePair` with the given name as an `Option[HttpCookiePair]`.
		 If the cookie is not present a value of `None` is extracted.
		 
		
		Parameters:
		`name` \- (undocumented)
		Returns:
		(undocumented)
		- #### findCookie
		
		
		
		```
		scala.Function1<[HttpHeader](../../model/HttpHeader.html "class in akka.http.scaladsl.model"),​scala.Option<[HttpCookiePair](../../model/headers/HttpCookiePair.html "class in akka.http.scaladsl.model.headers")>> findCookie​(java.lang.String name)
		```
		- #### setCookie
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> setCookie​([HttpCookie](../../model/headers/HttpCookie.html "class in akka.http.scaladsl.model.headers") first,
		                                             scala.collection.immutable.Seq<[HttpCookie](../../model/headers/HttpCookie.html "class in akka.http.scaladsl.model.headers")> more)
		```
		
		Adds a {@link Set\-Cookie} response header with the given cookies.
		 
		
		Parameters:
		`first` \- (undocumented)
		`more` \- (undocumented)
		Returns:
		(undocumented)
		- #### deleteCookie
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> deleteCookie​([HttpCookie](../../model/headers/HttpCookie.html "class in akka.http.scaladsl.model.headers") first,
		                                                scala.collection.immutable.Seq<[HttpCookie](../../model/headers/HttpCookie.html "class in akka.http.scaladsl.model.headers")> more)
		```
		
		Adds a {@link Set\-Cookie} response header expiring the given cookies.
		 
		
		Parameters:
		`first` \- (undocumented)
		`more` \- (undocumented)
		Returns:
		(undocumented)
		- #### deleteCookie
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> deleteCookie​(java.lang.String name,
		                                                java.lang.String domain,
		                                                java.lang.String path)
		```
		
		Adds a {@link Set\-Cookie} response header expiring the cookie with the given properties.
		 
		
		Parameters:
		`name` \- (undocumented)
		`domain` \- (undocumented)
		`path` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCookie.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCookiePair.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/CookieDirectives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/CookieDirectives.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/CookieDirectives.html)*