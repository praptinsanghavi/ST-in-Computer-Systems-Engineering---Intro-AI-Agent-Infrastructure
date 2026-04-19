---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:31:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest$.html
title: HttpRequest$
---

# HttpRequest$

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class HttpRequest$

- java.lang.Object
- - akka.http.scaladsl.model.HttpRequest$

- ---

```
public class HttpRequest$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpRequest$](HttpRequest$.html "class in akka.http.scaladsl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpRequest$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model")` | `[apply](#apply(akka.http.scaladsl.model.HttpMethod,akka.http.scaladsl.model.Uri,scala.collection.immutable.Seq,akka.http.scaladsl.model.RequestEntity,akka.http.scaladsl.model.HttpProtocol))​([HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") method,  [Uri](Uri.html "class in akka.http.scaladsl.model") uri,  scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,  [RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") entity,  [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol)` |  |
	| `[Uri](Uri.html "class in akka.http.scaladsl.model")` | `[effectiveUri](#effectiveUri(akka.http.scaladsl.model.Uri,scala.collection.immutable.Seq,boolean,akka.http.scaladsl.model.headers.Host))​([Uri](Uri.html "class in akka.http.scaladsl.model") uri,  scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,  boolean securedConnection,  [Host](headers/Host.html "class in akka.http.scaladsl.model.headers") defaultHostHeader)` | Determines the effective request URI according to the logic defined at  http://tools.ietf.org/html/rfc7230\#section\-5\.5 |
	| `[OptHttpRequest](OptHttpRequest.html "class in akka.http.scaladsl.model")` | `[unapply](#unapply(akka.http.scaladsl.model.HttpRequest))​([HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") any)` |  |
	| `void` | `[verifyUri](#verifyUri(akka.http.scaladsl.model.Uri))​([Uri](Uri.html "class in akka.http.scaladsl.model") uri)` | Verifies that the given [`Uri`](Uri.html "class in akka.http.scaladsl.model") is non\-empty and has either scheme `http`, `https`, `ws`, `wss` or no scheme at all. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HttpRequest$](HttpRequest$.html "class in akka.http.scaladsl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HttpRequest$
		
		
		
		```
		public HttpRequest$()
		```

	- ### Method Detail
	
	
	
		- #### effectiveUri
		
		
		
		```
		public [Uri](Uri.html "class in akka.http.scaladsl.model") effectiveUri​([Uri](Uri.html "class in akka.http.scaladsl.model") uri,
		                        scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,
		                        boolean securedConnection,
		                        [Host](headers/Host.html "class in akka.http.scaladsl.model.headers") defaultHostHeader)
		```
		
		Determines the effective request URI according to the logic defined at
		 http://tools.ietf.org/html/rfc7230\#section\-5\.5
		 
		 Throws an [`IllegalUriException`](IllegalUriException.html "class in akka.http.scaladsl.model") if the URI is relative and the `headers` don't
		 include a valid [`Host`](headers/Host.html "class in akka.http.scaladsl.model.headers") header or if URI authority and [`Host`](headers/Host.html "class in akka.http.scaladsl.model.headers") header don't match.
		
		
		
		Parameters:
		`uri` \- (undocumented)
		`headers` \- (undocumented)
		`securedConnection` \- (undocumented)
		`defaultHostHeader` \- (undocumented)
		Returns:
		(undocumented)
		- #### verifyUri
		
		
		
		```
		public void verifyUri​([Uri](Uri.html "class in akka.http.scaladsl.model") uri)
		```
		
		Verifies that the given [`Uri`](Uri.html "class in akka.http.scaladsl.model") is non\-empty and has either scheme `http`, `https`, `ws`, `wss` or no scheme at all.
		 If any of these conditions is not met the method throws an [`IllegalUriException`](IllegalUriException.html "class in akka.http.scaladsl.model").
		
		Parameters:
		`uri` \- (undocumented)
		- #### apply
		
		
		
		```
		public [HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") apply​([HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") method,
		                         [Uri](Uri.html "class in akka.http.scaladsl.model") uri,
		                         scala.collection.immutable.Seq<[HttpHeader](HttpHeader.html "class in akka.http.scaladsl.model")> headers,
		                         [RequestEntity](RequestEntity.html "interface in akka.http.scaladsl.model") entity,
		                         [HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol)
		```
		- #### unapply
		
		
		
		```
		public [OptHttpRequest](OptHttpRequest.html "class in akka.http.scaladsl.model") unapply​([HttpRequest](HttpRequest.html "class in akka.http.scaladsl.model") any)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpProtocol.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/IllegalUriException.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/OptHttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/RequestEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest$.html)*