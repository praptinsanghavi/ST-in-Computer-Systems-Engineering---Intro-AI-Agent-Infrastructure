---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:30:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharset$.html
title: HttpCharset$
---

# HttpCharset$

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class HttpCharset$

- java.lang.Object
- - akka.http.scaladsl.model.HttpCharset$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class HttpCharset$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.scaladsl.model.HttpCharset$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpCharset$](HttpCharset$.html "class in akka.http.scaladsl.model")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpCharset$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[HttpCharset](HttpCharset.html "class in akka.http.scaladsl.model")` | `[custom](#custom(java.lang.String,scala.collection.immutable.Seq))​(java.lang.String value,  scala.collection.immutable.Seq<java.lang.String> aliases)` |  |
	| `scala.util.Try<java.nio.charset.Charset>` | `[findNioCharset](#findNioCharset(java.lang.String))​(java.lang.String name)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HttpCharset$](HttpCharset$.html "class in akka.http.scaladsl.model") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HttpCharset$
		
		
		
		```
		public HttpCharset$()
		```

	- ### Method Detail
	
	
	
		- #### custom
		
		
		
		```
		public [HttpCharset](HttpCharset.html "class in akka.http.scaladsl.model") custom​(java.lang.String value,
		                          scala.collection.immutable.Seq<java.lang.String> aliases)
		```
		- #### findNioCharset
		
		
		
		```
		public scala.util.Try<java.nio.charset.Charset> findNioCharset​(java.lang.String name)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharset$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharset.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharset$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpCharset$.html)*