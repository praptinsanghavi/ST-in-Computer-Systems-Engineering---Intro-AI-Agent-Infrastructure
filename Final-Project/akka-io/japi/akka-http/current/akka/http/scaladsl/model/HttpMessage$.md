---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:31:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage$.html
title: HttpMessage$
---

# HttpMessage$

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class HttpMessage$

- java.lang.Object
- - akka.http.scaladsl.model.HttpMessage$

- ---

```
public class HttpMessage$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpMessage$](HttpMessage$.html "class in akka.http.scaladsl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpMessage$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[HttpMessage.DiscardedEntity](HttpMessage.DiscardedEntity.html "class in akka.http.scaladsl.model")` | `[AlreadyDiscardedEntity](#AlreadyDiscardedEntity())()` |  |
	| `boolean` | `[connectionCloseExpected](#connectionCloseExpected(akka.http.scaladsl.model.HttpProtocol,scala.Option))​([HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol,  scala.Option<[Connection](headers/Connection.html "class in akka.http.scaladsl.model.headers")> connectionHeader)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HttpMessage$](HttpMessage$.html "class in akka.http.scaladsl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HttpMessage$
		
		
		
		```
		public HttpMessage$()
		```

	- ### Method Detail
	
	
	
		- #### connectionCloseExpected
		
		
		
		```
		public boolean connectionCloseExpected​([HttpProtocol](HttpProtocol.html "class in akka.http.scaladsl.model") protocol,
		                                       scala.Option<[Connection](headers/Connection.html "class in akka.http.scaladsl.model.headers")> connectionHeader)
		```
		- #### AlreadyDiscardedEntity
		
		
		
		```
		public [HttpMessage.DiscardedEntity](HttpMessage.DiscardedEntity.html "class in akka.http.scaladsl.model") AlreadyDiscardedEntity()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.DiscardedEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpProtocol.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Connection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage$.html)*