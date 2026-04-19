---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:38:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/LanguageNegotiator.html
title: LanguageNegotiator
---

# LanguageNegotiator

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class LanguageNegotiator

- java.lang.Object
- - akka.http.scaladsl.server.LanguageNegotiator

- ---

```
public final class LanguageNegotiator
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LanguageNegotiator](#%3Cinit%3E(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")> requestHeaders)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.List<[LanguageRange](../model/headers/LanguageRange.html "interface in akka.http.scaladsl.model.headers")>` | `[acceptedLanguageRanges](#acceptedLanguageRanges())()` | The language\-ranges accepted by the client according to given request headers, sorted by  1\. increasing generality (i.e. most specific first)  2\. decreasing q\-value (only for ranges targeting a single Language)  3\. order of appearance in the `Accept-Language` header(s) |
	| `static [LanguageNegotiator](LanguageNegotiator.html "class in akka.http.scaladsl.server")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")> requestHeaders)` |  |
	| `boolean` | `[isAccepted](#isAccepted(akka.http.scaladsl.model.headers.Language))​([Language](../model/headers/Language.html "class in akka.http.scaladsl.model.headers") language)` | Determines whether the given language is accepted by the client. |
	| `scala.Option<[Language](../model/headers/Language.html "class in akka.http.scaladsl.model.headers")>` | `[pickLanguage](#pickLanguage(scala.collection.immutable.List))​(scala.collection.immutable.List<[Language](../model/headers/Language.html "class in akka.http.scaladsl.model.headers")> alternatives)` | Picks the best of the given language alternatives given the preferences  the client indicated in the request's `Accept-Language` headers. |
	| `float` | `[qValueFor](#qValueFor(akka.http.scaladsl.model.headers.Language))​([Language](../model/headers/Language.html "class in akka.http.scaladsl.model.headers") language)` | Returns the q\-value that the client (implicitly or explicitly) attaches to the given language. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### LanguageNegotiator
		
		
		
		```
		public LanguageNegotiator​(scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")> requestHeaders)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [LanguageNegotiator](LanguageNegotiator.html "class in akka.http.scaladsl.server") apply​(scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")> requestHeaders)
		```
		- #### acceptedLanguageRanges
		
		
		
		```
		public scala.collection.immutable.List<[LanguageRange](../model/headers/LanguageRange.html "interface in akka.http.scaladsl.model.headers")> acceptedLanguageRanges()
		```
		
		The language\-ranges accepted by the client according to given request headers, sorted by
		 1\. increasing generality (i.e. most specific first)
		 2\. decreasing q\-value (only for ranges targeting a single Language)
		 3\. order of appearance in the `Accept-Language` header(s)
		
		Returns:
		(undocumented)
		- #### qValueFor
		
		
		
		```
		public float qValueFor​([Language](../model/headers/Language.html "class in akka.http.scaladsl.model.headers") language)
		```
		
		Returns the q\-value that the client (implicitly or explicitly) attaches to the given language.
		 See http://tools.ietf.org/html/rfc7231\#section\-5\.3\.1 for details.
		
		Parameters:
		`language` \- (undocumented)
		Returns:
		(undocumented)
		- #### isAccepted
		
		
		
		```
		public boolean isAccepted​([Language](../model/headers/Language.html "class in akka.http.scaladsl.model.headers") language)
		```
		
		Determines whether the given language is accepted by the client.
		
		Parameters:
		`language` \- (undocumented)
		Returns:
		(undocumented)
		- #### pickLanguage
		
		
		
		```
		public scala.Option<[Language](../model/headers/Language.html "class in akka.http.scaladsl.model.headers")> pickLanguage​(scala.collection.immutable.List<[Language](../model/headers/Language.html "class in akka.http.scaladsl.model.headers")> alternatives)
		```
		
		Picks the best of the given language alternatives given the preferences
		 the client indicated in the request's `Accept-Language` headers.
		 See http://tools.ietf.org/html/rfc7231\#section\-5\.3\.5 for details on the negotiation logic.
		 
		 If there are several best language alternatives that the client has equal preference for
		 the order of the given alternatives is used as a tie breaker (first one wins).
		 
		
		
		 If none of the given alternatives is acceptable to the client the methods return `None`.
		
		
		
		Parameters:
		`alternatives` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Language.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/LanguageRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/LanguageNegotiator.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/LanguageNegotiator.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/LanguageNegotiator.html)*