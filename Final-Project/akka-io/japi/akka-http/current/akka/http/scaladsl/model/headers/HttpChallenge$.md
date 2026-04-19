---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:35:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpChallenge$.html
title: HttpChallenge$
---

# HttpChallenge$

## Content

Package [akka.http.scaladsl.model.headers](package-summary.html)
## Class HttpChallenge$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<java.lang.String,​java.lang.String,​scala.collection.immutable.Map\<java.lang.String,​java.lang.String\>,​[HttpChallenge](HttpChallenge.html "class in akka.http.scaladsl.model.headers")\>
	- - akka.http.scaladsl.model.headers.HttpChallenge$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<java.lang.String,​java.lang.String,​scala.collection.immutable.Map<java.lang.String,​java.lang.String>,​[HttpChallenge](HttpChallenge.html "class in akka.http.scaladsl.model.headers")>`

---

```
public class HttpChallenge$
extends scala.runtime.AbstractFunction3<java.lang.String,​java.lang.String,​scala.collection.immutable.Map<java.lang.String,​java.lang.String>,​[HttpChallenge](HttpChallenge.html "class in akka.http.scaladsl.model.headers")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.scaladsl.model.headers.HttpChallenge$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpChallenge$](HttpChallenge$.html "class in akka.http.scaladsl.model.headers")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpChallenge$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[HttpChallenge](HttpChallenge.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(java.lang.String,scala.Option))​(java.lang.String scheme,  scala.Option<java.lang.String> realm)` |  |
	| `[HttpChallenge](HttpChallenge.html "class in akka.http.scaladsl.model.headers")` | `[apply](#apply(java.lang.String,scala.Option,scala.collection.immutable.Map))​(java.lang.String scheme,  scala.Option<java.lang.String> realm,  scala.collection.immutable.Map<java.lang.String,​java.lang.String> params)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, toString, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function3
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HttpChallenge$](HttpChallenge$.html "class in akka.http.scaladsl.model.headers") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HttpChallenge$
		
		
		
		```
		public HttpChallenge$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [HttpChallenge](HttpChallenge.html "class in akka.http.scaladsl.model.headers") apply​(java.lang.String scheme,
		                           scala.Option<java.lang.String> realm)
		```
		- #### apply
		
		
		
		```
		public [HttpChallenge](HttpChallenge.html "class in akka.http.scaladsl.model.headers") apply​(java.lang.String scheme,
		                           scala.Option<java.lang.String> realm,
		                           scala.collection.immutable.Map<java.lang.String,​java.lang.String> params)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpChallenge$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpChallenge.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpChallenge$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpChallenge$.html)*