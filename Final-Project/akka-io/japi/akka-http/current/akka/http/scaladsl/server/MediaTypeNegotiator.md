---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:38:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MediaTypeNegotiator.html
title: MediaTypeNegotiator
---

# MediaTypeNegotiator

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class MediaTypeNegotiator

- java.lang.Object
- - akka.http.scaladsl.server.MediaTypeNegotiator

- ---

```
public final class MediaTypeNegotiator
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MediaTypeNegotiator](#%3Cinit%3E(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")> requestHeaders)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.List<[MediaRange](../model/MediaRange.html "class in akka.http.scaladsl.model")>` | `[acceptedMediaRanges](#acceptedMediaRanges())()` | The media\-ranges accepted by the client according to the given request headers, sorted by  1\. increasing generality (i.e. most specific first)  2\. decreasing q\-value (only for ranges targeting a single MediaType)  3\. order of appearance in the `Accept` header(s) |
	| `boolean` | `[isAccepted](#isAccepted(akka.http.scaladsl.model.MediaType))​([MediaType](../model/MediaType.html "class in akka.http.scaladsl.model") mediaType)` | Determines whether the given [`MediaType`](../model/MediaType.html "class in akka.http.scaladsl.model") is accepted by the client. |
	| `float` | `[qValueFor](#qValueFor(akka.http.scaladsl.model.MediaType))​([MediaType](../model/MediaType.html "class in akka.http.scaladsl.model") mediaType)` | Returns the q\-value that the client (implicitly or explicitly) attaches to the given media\-type. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### MediaTypeNegotiator
		
		
		
		```
		public MediaTypeNegotiator​(scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")> requestHeaders)
		```

	- ### Method Detail
	
	
	
		- #### acceptedMediaRanges
		
		
		
		```
		public scala.collection.immutable.List<[MediaRange](../model/MediaRange.html "class in akka.http.scaladsl.model")> acceptedMediaRanges()
		```
		
		The media\-ranges accepted by the client according to the given request headers, sorted by
		 1\. increasing generality (i.e. most specific first)
		 2\. decreasing q\-value (only for ranges targeting a single MediaType)
		 3\. order of appearance in the `Accept` header(s)
		
		Returns:
		(undocumented)
		- #### isAccepted
		
		
		
		```
		public boolean isAccepted​([MediaType](../model/MediaType.html "class in akka.http.scaladsl.model") mediaType)
		```
		
		Determines whether the given [`MediaType`](../model/MediaType.html "class in akka.http.scaladsl.model") is accepted by the client.
		
		Parameters:
		`mediaType` \- (undocumented)
		Returns:
		(undocumented)
		- #### qValueFor
		
		
		
		```
		public float qValueFor​([MediaType](../model/MediaType.html "class in akka.http.scaladsl.model") mediaType)
		```
		
		Returns the q\-value that the client (implicitly or explicitly) attaches to the given media\-type.
		 See http://tools.ietf.org/html/rfc7231\#section\-5\.3\.1 for details.
		
		Parameters:
		`mediaType` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/MediaType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MediaTypeNegotiator.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/MediaTypeNegotiator.html)*