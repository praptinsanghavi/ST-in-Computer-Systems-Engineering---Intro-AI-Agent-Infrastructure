---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:38:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/CharsetNegotiator.html
title: CharsetNegotiator
---

# CharsetNegotiator

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class CharsetNegotiator

- java.lang.Object
- - akka.http.scaladsl.server.CharsetNegotiator

- ---

```
public final class CharsetNegotiator
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CharsetNegotiator](#%3Cinit%3E(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")> requestHeaders)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.List<[HttpCharsetRange](../model/HttpCharsetRange.html "class in akka.http.scaladsl.model")>` | `[acceptedCharsetRanges](#acceptedCharsetRanges())()` | The charset\-ranges accepted by the client according to given request headers, sorted by  1\. increasing generality (i.e. most specific first)  2\. decreasing q\-value (only for ranges targeting a single HttpCharset)  3\. order of appearance in the `Accept-Charset` header(s) |
	| `boolean` | `[isAccepted](#isAccepted(akka.http.scaladsl.model.HttpCharset))​([HttpCharset](../model/HttpCharset.html "class in akka.http.scaladsl.model") charset)` | Determines whether the given charset is accepted by the client. |
	| `scala.Option<[HttpCharset](../model/HttpCharset.html "class in akka.http.scaladsl.model")>` | `[pickBest](#pickBest())()` | Picks the charset that is most preferred by the client with a bias towards UTF\-8,  i.e. if the client accepts all charsets with equal preference then UTF\-8 is picked. |
	| `float` | `[qValueFor](#qValueFor(akka.http.scaladsl.model.HttpCharset))​([HttpCharset](../model/HttpCharset.html "class in akka.http.scaladsl.model") charset)` | Returns the q\-value that the client (implicitly or explicitly) attaches to the given charset. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### CharsetNegotiator
		
		
		
		```
		public CharsetNegotiator​(scala.collection.immutable.Seq<[HttpHeader](../model/HttpHeader.html "class in akka.http.scaladsl.model")> requestHeaders)
		```

	- ### Method Detail
	
	
	
		- #### acceptedCharsetRanges
		
		
		
		```
		public scala.collection.immutable.List<[HttpCharsetRange](../model/HttpCharsetRange.html "class in akka.http.scaladsl.model")> acceptedCharsetRanges()
		```
		
		The charset\-ranges accepted by the client according to given request headers, sorted by
		 1\. increasing generality (i.e. most specific first)
		 2\. decreasing q\-value (only for ranges targeting a single HttpCharset)
		 3\. order of appearance in the `Accept-Charset` header(s)
		
		Returns:
		(undocumented)
		- #### isAccepted
		
		
		
		```
		public boolean isAccepted​([HttpCharset](../model/HttpCharset.html "class in akka.http.scaladsl.model") charset)
		```
		
		Determines whether the given charset is accepted by the client.
		
		Parameters:
		`charset` \- (undocumented)
		Returns:
		(undocumented)
		- #### pickBest
		
		
		
		```
		public scala.Option<[HttpCharset](../model/HttpCharset.html "class in akka.http.scaladsl.model")> pickBest()
		```
		
		Picks the charset that is most preferred by the client with a bias towards UTF\-8,
		 i.e. if the client accepts all charsets with equal preference then UTF\-8 is picked.
		 If the client doesn't accept any charsets the method returns `None`.
		 
		 See also: http://tools.ietf.org/html/rfc7231\#section\-5\.3\.3
		
		
		
		Returns:
		(undocumented)
		- #### qValueFor
		
		
		
		```
		public float qValueFor​([HttpCharset](../model/HttpCharset.html "class in akka.http.scaladsl.model") charset)
		```
		
		Returns the q\-value that the client (implicitly or explicitly) attaches to the given charset.
		 See http://tools.ietf.org/html/rfc7231\#section\-5\.3\.1 for details.
		
		Parameters:
		`charset` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharsetRange.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/CharsetNegotiator.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/CharsetNegotiator.html)*