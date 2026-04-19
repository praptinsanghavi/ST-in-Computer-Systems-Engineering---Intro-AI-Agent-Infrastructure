---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:35:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCookiePair$.html
title: HttpCookiePair$
---

# HttpCookiePair$

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class HttpCookiePair$

- java.lang.Object
- - akka.http.scaladsl.model.headers.HttpCookiePair$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class HttpCookiePair$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.HttpCookiePair$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpCookiePair$](HttpCookiePair$.html "class in akka.http.scaladsl.model.headers")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpCookiePair$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(java.lang.String,java.lang.String))​(java.lang.String name,  java.lang.String value)` |  |
	| `[HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(scala.Tuple2))​(scala.Tuple2<java.lang.String,​java.lang.String> pair)` |  |
	| `[HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers")` | `[raw](#raw(java.lang.String,java.lang.String))​(java.lang.String name,  java.lang.String value)` |  |
	| `[HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers")` | `[raw](#raw(scala.Tuple2))​(scala.Tuple2<java.lang.String,​java.lang.String> pair)` |  |
	| `void` | `[validate](#validate(java.lang.String,java.lang.String))​(java.lang.String name,  java.lang.String value)` |  |
	| `void` | `[validateRaw](#validateRaw(java.lang.String,java.lang.String))​(java.lang.String name,  java.lang.String value)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HttpCookiePair$](HttpCookiePair$.html "class in akka.http.scaladsl.model.headers") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HttpCookiePair$
		
		
		
		```
		public HttpCookiePair$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers") apply​(scala.Tuple2<java.lang.String,​java.lang.String> pair)
		```
		- #### apply
		
		
		
		```
		public [HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers") apply​(java.lang.String name,
		                            java.lang.String value)
		```
		- #### raw
		
		
		
		```
		public [HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers") raw​(scala.Tuple2<java.lang.String,​java.lang.String> pair)
		```
		- #### raw
		
		
		
		```
		public [HttpCookiePair](HttpCookiePair.html "class in akka.http.scaladsl.model.headers") raw​(java.lang.String name,
		                          java.lang.String value)
		```
		- #### validate
		
		
		
		```
		public void validate​(java.lang.String name,
		                     java.lang.String value)
		```
		- #### validateRaw
		
		
		
		```
		public void validateRaw​(java.lang.String name,
		                        java.lang.String value)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCookiePair$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCookiePair.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCookiePair$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCookiePair$.html)*