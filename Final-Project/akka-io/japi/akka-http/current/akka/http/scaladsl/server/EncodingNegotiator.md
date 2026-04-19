---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:38:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/EncodingNegotiator.html
title: EncodingNegotiator
---

# EncodingNegotiator

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class EncodingNegotiator

- java.lang.Object
- - akka.http.scaladsl.server.EncodingNegotiator

- ---

```
public final class EncodingNegotiator
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EncodingNegotiator](#%3Cinit%3E(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")> requestHeaders)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.List<[HttpEncodingRange](../model/headers/HttpEncodingRange.html "class in akka.http.scaladsl.model.headers")>` | `[acceptedEncodingRanges](#acceptedEncodingRanges())()` | The encoding\-ranges accepted by the client according to given request headers, sorted by  1\. increasing generality (i.e. most specific first)  2\. decreasing q\-value (only for ranges targeting a single HttpEncoding)  3\. order of appearance in the `Accept-Encoding` header(s) |
	| `static [EncodingNegotiator](EncodingNegotiator.html "class in akka.http.scaladsl.server")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")> requestHeaders)` |  |
	| `boolean` | `[hasMatchingFor](#hasMatchingFor(akka.http.scaladsl.model.headers.HttpEncoding))​([HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers") encoding)` | Determines whether the request has an `Accept-Encoding` clause matching the given encoding. |
	| `boolean` | `[isAccepted](#isAccepted(akka.http.scaladsl.model.headers.HttpEncoding))​([HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers") encoding)` | Determines whether the given encoding is accepted by the client. |
	| `scala.Option<[HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers")>` | `[pickEncoding](#pickEncoding(scala.collection.immutable.List))​(scala.collection.immutable.List<[HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers")> alternatives)` | Picks the best of the given encoding alternatives given the preferences  the client indicated in the request's `Accept-Encoding` headers. |
	| `float` | `[qValueFor](#qValueFor(akka.http.scaladsl.model.headers.HttpEncoding))​([HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers") encoding)` | Returns the q\-value that the client (implicitly or explicitly) attaches to the given encoding. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EncodingNegotiator
		
		
		
		```
		public EncodingNegotiator​(scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")> requestHeaders)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [EncodingNegotiator](EncodingNegotiator.html "class in akka.http.scaladsl.server") apply​(scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")> requestHeaders)
		```
		- #### acceptedEncodingRanges
		
		
		
		```
		public scala.collection.immutable.List<[HttpEncodingRange](../model/headers/HttpEncodingRange.html "class in akka.http.scaladsl.model.headers")> acceptedEncodingRanges()
		```
		
		The encoding\-ranges accepted by the client according to given request headers, sorted by
		 1\. increasing generality (i.e. most specific first)
		 2\. decreasing q\-value (only for ranges targeting a single HttpEncoding)
		 3\. order of appearance in the `Accept-Encoding` header(s)
		
		Returns:
		(undocumented)
		- #### qValueFor
		
		
		
		```
		public float qValueFor​([HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers") encoding)
		```
		
		Returns the q\-value that the client (implicitly or explicitly) attaches to the given encoding.
		 See http://tools.ietf.org/html/rfc7231\#section\-5\.3\.1 for details.
		
		Parameters:
		`encoding` \- (undocumented)
		Returns:
		(undocumented)
		- #### isAccepted
		
		
		
		```
		public boolean isAccepted​([HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers") encoding)
		```
		
		Determines whether the given encoding is accepted by the client.
		
		Parameters:
		`encoding` \- (undocumented)
		Returns:
		(undocumented)
		- #### hasMatchingFor
		
		
		
		```
		public boolean hasMatchingFor​([HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers") encoding)
		```
		
		Determines whether the request has an `Accept-Encoding` clause matching the given encoding.
		
		Parameters:
		`encoding` \- (undocumented)
		Returns:
		(undocumented)
		- #### pickEncoding
		
		
		
		```
		public scala.Option<[HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers")> pickEncoding​(scala.collection.immutable.List<[HttpEncoding](../model/headers/HttpEncoding.html "class in akka.http.scaladsl.model.headers")> alternatives)
		```
		
		Picks the best of the given encoding alternatives given the preferences
		 the client indicated in the request's `Accept-Encoding` headers.
		 See http://tools.ietf.org/html/rfc7231\#section\-5\.3\.4 for details on the negotiation logic.
		 
		 If there are several best encoding alternatives that the client has equal preference for
		 the order of the given alternatives is used as a tie breaker (first one wins).
		 
		
		
		 If none of the given alternatives is acceptable to the client the methods return `None`.
		
		
		
		Parameters:
		`alternatives` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncodingRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/EncodingNegotiator.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/EncodingNegotiator.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/EncodingNegotiator.html)*