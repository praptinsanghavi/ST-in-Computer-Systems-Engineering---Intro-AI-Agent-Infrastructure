---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpChallenge.html
title: HttpChallenge
---

# HttpChallenge

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class HttpChallenge

- java.lang.Object
- - akka.http.javadsl.model.headers.HttpChallenge

- Direct Known Subclasses:
`[HttpChallenge](../../../scaladsl/model/headers/HttpChallenge.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class HttpChallenge
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpChallenge](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [HttpChallenge](HttpChallenge.html "class in akka.http.javadsl.model.headers")` | `[create](#create(java.lang.String,akka.japi.Option))​(java.lang.String scheme,  akka.japi.Option<java.lang.String> realm)` |  |
	| `static [HttpChallenge](HttpChallenge.html "class in akka.http.javadsl.model.headers")` | `[create](#create(java.lang.String,akka.japi.Option,java.util.Map))​(java.lang.String scheme,  akka.japi.Option<java.lang.String> realm,  java.util.Map<java.lang.String,​java.lang.String> params)` |  |
	| `static [HttpChallenge](HttpChallenge.html "class in akka.http.javadsl.model.headers")` | `[create](#create(java.lang.String,java.lang.String))​(java.lang.String scheme,  java.lang.String realm)` |  |
	| `static [HttpChallenge](HttpChallenge.html "class in akka.http.javadsl.model.headers")` | `[create](#create(java.lang.String,java.lang.String,java.util.Map))​(java.lang.String scheme,  java.lang.String realm,  java.util.Map<java.lang.String,​java.lang.String> params)` |  |
	| `static [HttpChallenge](HttpChallenge.html "class in akka.http.javadsl.model.headers")` | `[createBasic](#createBasic(java.lang.String))​(java.lang.String realm)` |  |
	| `static [HttpChallenge](HttpChallenge.html "class in akka.http.javadsl.model.headers")` | `[createOAuth2](#createOAuth2(java.lang.String))​(java.lang.String realm)` |  |
	| `abstract java.util.Map<java.lang.String,​java.lang.String>` | `[getParams](#getParams())()` |  |
	| `abstract java.lang.String` | `[realm](#realm())()` |  |
	| `abstract java.lang.String` | `[scheme](#scheme())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpChallenge
		
		
		
		```
		public HttpChallenge()
		```

	- ### Method Detail
	
	
	
		- #### scheme
		
		
		
		```
		public abstract java.lang.String scheme()
		```
		- #### realm
		
		
		
		```
		public abstract java.lang.String realm()
		```
		- #### getParams
		
		
		
		```
		public abstract java.util.Map<java.lang.String,​java.lang.String> getParams()
		```
		- #### create
		
		
		
		```
		public static [HttpChallenge](HttpChallenge.html "class in akka.http.javadsl.model.headers") create​(java.lang.String scheme,
		                                   java.lang.String realm)
		```
		- #### create
		
		
		
		```
		public static [HttpChallenge](HttpChallenge.html "class in akka.http.javadsl.model.headers") create​(java.lang.String scheme,
		                                   java.lang.String realm,
		                                   java.util.Map<java.lang.String,​java.lang.String> params)
		```
		- #### create
		
		
		
		```
		public static [HttpChallenge](HttpChallenge.html "class in akka.http.javadsl.model.headers") create​(java.lang.String scheme,
		                                   akka.japi.Option<java.lang.String> realm)
		```
		- #### create
		
		
		
		```
		public static [HttpChallenge](HttpChallenge.html "class in akka.http.javadsl.model.headers") create​(java.lang.String scheme,
		                                   akka.japi.Option<java.lang.String> realm,
		                                   java.util.Map<java.lang.String,​java.lang.String> params)
		```
		- #### createBasic
		
		
		
		```
		public static [HttpChallenge](HttpChallenge.html "class in akka.http.javadsl.model.headers") createBasic​(java.lang.String realm)
		```
		- #### createOAuth2
		
		
		
		```
		public static [HttpChallenge](HttpChallenge.html "class in akka.http.javadsl.model.headers") createOAuth2​(java.lang.String realm)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpChallenge.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpChallenge.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpChallenge.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpChallenge.html)*