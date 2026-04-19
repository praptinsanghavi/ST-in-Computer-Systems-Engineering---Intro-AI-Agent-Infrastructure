---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolFlow.RequestContext$.html
title: PoolFlow.RequestContext$
---

# PoolFlow.RequestContext$

## Content

Package [akka.http.impl.engine.client](package-summary.html)
## Class PoolFlow.RequestContext$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Promise\<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")\>,​java.lang.Object,​[PoolFlow.RequestContext](PoolFlow.RequestContext.html "class in akka.http.impl.engine.client")\>
	- - akka.http.impl.engine.client.PoolFlow.RequestContext$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Promise<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")>,​java.lang.Object,​[PoolFlow.RequestContext](PoolFlow.RequestContext.html "class in akka.http.impl.engine.client")>`

Enclosing class:
[PoolFlow](PoolFlow.html "class in akka.http.impl.engine.client")

---

```
public static class PoolFlow.RequestContext$
extends scala.runtime.AbstractFunction3<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Promise<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")>,​java.lang.Object,​[PoolFlow.RequestContext](PoolFlow.RequestContext.html "class in akka.http.impl.engine.client")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.impl.engine.client.PoolFlow.RequestContext$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [PoolFlow.RequestContext$](PoolFlow.RequestContext$.html "class in akka.http.impl.engine.client")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RequestContext$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, toString, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function3
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [PoolFlow.RequestContext$](PoolFlow.RequestContext$.html "class in akka.http.impl.engine.client") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RequestContext$
		
		
		
		```
		public RequestContext$()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolFlow.RequestContext$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolFlow.RequestContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolFlow.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolFlow.RequestContext$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolFlow.RequestContext$.html)*