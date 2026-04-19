---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:31:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethods$.html
title: HttpMethods$
---

# HttpMethods$

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class HttpMethods$

- java.lang.Object
- - akka.http.scaladsl.model.HttpMethods$

- All Implemented Interfaces:
`[ObjectRegistry](../../impl/util/ObjectRegistry.html "interface in akka.http.impl.util")<java.lang.String,​[HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")>`

---

```
public class HttpMethods$
extends java.lang.Object
implements [ObjectRegistry](../../impl/util/ObjectRegistry.html "interface in akka.http.impl.util")<java.lang.String,​[HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")>
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpMethods$](HttpMethods$.html "class in akka.http.scaladsl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpMethods$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[CONNECT](#CONNECT())()` |  |
	| `[HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[DELETE](#DELETE())()` |  |
	| `[HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[GET](#GET())()` |  |
	| `scala.Option<[HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")>` | `[getForKeyCaseInsensitive](#getForKeyCaseInsensitive(java.lang.String,scala.$less$colon$less))​(java.lang.String key,  scala.$less$colon$less<java.lang.String,​java.lang.String> conv)` |  |
	| `[HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[HEAD](#HEAD())()` |  |
	| `[HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[OPTIONS](#OPTIONS())()` |  |
	| `[HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[PATCH](#PATCH())()` |  |
	| `[HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[POST](#POST())()` |  |
	| `[HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[PUT](#PUT())()` |  |
	| `[HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")` | `[TRACE](#TRACE())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[ObjectRegistry](../../impl/util/ObjectRegistry.html "interface in akka.http.impl.util")
		
		
		`[getForKey](../../impl/util/ObjectRegistry.html#getForKey(K)), [register](../../impl/util/ObjectRegistry.html#register(K,V))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HttpMethods$](HttpMethods$.html "class in akka.http.scaladsl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HttpMethods$
		
		
		
		```
		public HttpMethods$()
		```

	- ### Method Detail
	
	
	
		- #### CONNECT
		
		
		
		```
		public [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") CONNECT()
		```
		- #### DELETE
		
		
		
		```
		public [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") DELETE()
		```
		- #### GET
		
		
		
		```
		public [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") GET()
		```
		- #### HEAD
		
		
		
		```
		public [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") HEAD()
		```
		- #### OPTIONS
		
		
		
		```
		public [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") OPTIONS()
		```
		- #### PATCH
		
		
		
		```
		public [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") PATCH()
		```
		- #### POST
		
		
		
		```
		public [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") POST()
		```
		- #### PUT
		
		
		
		```
		public [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") PUT()
		```
		- #### TRACE
		
		
		
		```
		public [HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model") TRACE()
		```
		- #### getForKeyCaseInsensitive
		
		
		
		```
		public scala.Option<[HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")> getForKeyCaseInsensitive​(java.lang.String key,
		                                                         scala.$less$colon$less<java.lang.String,​java.lang.String> conv)
		```
		
		
		Specified by:
		`[getForKeyCaseInsensitive](../../impl/util/ObjectRegistry.html#getForKeyCaseInsensitive(java.lang.String,scala.$less$colon$less))` in interface `[ObjectRegistry](../../impl/util/ObjectRegistry.html "interface in akka.http.impl.util")<java.lang.String,​[HttpMethod](HttpMethod.html "class in akka.http.scaladsl.model")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ObjectRegistry.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethod.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethods$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethods$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMethods$.html)*