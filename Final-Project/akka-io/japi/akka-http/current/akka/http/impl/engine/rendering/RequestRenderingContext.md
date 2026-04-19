---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/RequestRenderingContext.html
title: RequestRenderingContext
---

# RequestRenderingContext

## Content

Package [akka.http.impl.engine.rendering](package-summary.html)
## Class RequestRenderingContext

- java.lang.Object
- - akka.http.impl.engine.rendering.RequestRenderingContext

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class RequestRenderingContext
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

INTERNAL API
 
 param: request the request to be rendered
 param: hostHeader the host header to render (not necessarily contained in the request.headers)
 param: sendEntityTrigger defined when the request has a `Expect: 100-continue` header; in this case the future will
 be completed successfully when the request entity is allowed to go out onto the wire;
 if the future is completed with an error the connection is to be closed.

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.impl.engine.rendering.RequestRenderingContext)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RequestRenderingContext](#%3Cinit%3E(akka.http.scaladsl.model.HttpRequest,akka.http.scaladsl.model.headers.Host,scala.Option))​([HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model") request,  [Host](../../../scaladsl/model/headers/Host.html "class in akka.http.scaladsl.model.headers") hostHeader,  scala.Option<scala.concurrent.Future<akka.NotUsed>> sendEntityTrigger)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1,T2,T3))​(T1 v1,  T2 v2,  T3 v3)` |  |
	| `[Host](../../../scaladsl/model/headers/Host.html "class in akka.http.scaladsl.model.headers")` | `[hostHeader](#hostHeader())()` |  |
	| `[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")` | `[request](#request())()` |  |
	| `scala.Option<scala.concurrent.Future<akka.NotUsed>>` | `[sendEntityTrigger](#sendEntityTrigger())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### RequestRenderingContext
		
		
		
		```
		public RequestRenderingContext​([HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model") request,
		                               [Host](../../../scaladsl/model/headers/Host.html "class in akka.http.scaladsl.model.headers") hostHeader,
		                               scala.Option<scala.concurrent.Future<akka.NotUsed>> sendEntityTrigger)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1,
		                               T2 v2,
		                               T3 v3)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### request
		
		
		
		```
		public [HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model") request()
		```
		- #### hostHeader
		
		
		
		```
		public [Host](../../../scaladsl/model/headers/Host.html "class in akka.http.scaladsl.model.headers") hostHeader()
		```
		- #### sendEntityTrigger
		
		
		
		```
		public scala.Option<scala.concurrent.Future<akka.NotUsed>> sendEntityTrigger()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Host.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/RequestRenderingContext.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/RequestRenderingContext.html)*