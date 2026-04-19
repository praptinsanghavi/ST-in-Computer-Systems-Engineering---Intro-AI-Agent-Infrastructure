---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:35:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncodings$.html
title: HttpEncodings$
---

# HttpEncodings$

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class HttpEncodings$

- java.lang.Object
- - akka.http.scaladsl.model.headers.HttpEncodings$

- All Implemented Interfaces:
`[ObjectRegistry](../../../impl/util/ObjectRegistry.html "interface in akka.http.impl.util")<java.lang.String,​[HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers")>`

---

```
public class HttpEncodings$
extends java.lang.Object
implements [ObjectRegistry](../../../impl/util/ObjectRegistry.html "interface in akka.http.impl.util")<java.lang.String,​[HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers")>
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpEncodings$](HttpEncodings$.html "class in akka.http.scaladsl.model.headers")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpEncodings$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers")` | `[chunked](#chunked())()` |  |
	| `[HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers")` | `[compress](#compress())()` |  |
	| `[HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers")` | `[deflate](#deflate())()` |  |
	| `[HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers")` | `[gzip](#gzip())()` |  |
	| `[HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers")` | `[identity](#identity())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[ObjectRegistry](../../../impl/util/ObjectRegistry.html "interface in akka.http.impl.util")
		
		
		`[getForKey](../../../impl/util/ObjectRegistry.html#getForKey(K)), [getForKeyCaseInsensitive](../../../impl/util/ObjectRegistry.html#getForKeyCaseInsensitive(java.lang.String,scala.$less$colon$less)), [register](../../../impl/util/ObjectRegistry.html#register(K,V))`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HttpEncodings$](HttpEncodings$.html "class in akka.http.scaladsl.model.headers") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HttpEncodings$
		
		
		
		```
		public HttpEncodings$()
		```

	- ### Method Detail
	
	
	
		- #### compress
		
		
		
		```
		public [HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers") compress()
		```
		- #### chunked
		
		
		
		```
		public [HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers") chunked()
		```
		- #### deflate
		
		
		
		```
		public [HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers") deflate()
		```
		- #### gzip
		
		
		
		```
		public [HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers") gzip()
		```
		- #### identity
		
		
		
		```
		public [HttpEncoding](HttpEncoding.html "class in akka.http.scaladsl.model.headers") identity()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/ObjectRegistry.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncoding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncodings$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncodings$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpEncodings$.html)*