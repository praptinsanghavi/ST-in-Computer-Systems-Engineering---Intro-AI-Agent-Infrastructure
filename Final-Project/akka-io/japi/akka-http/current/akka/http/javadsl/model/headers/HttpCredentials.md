---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpCredentials.html
title: HttpCredentials
---

# HttpCredentials

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class HttpCredentials

- java.lang.Object
- - akka.http.javadsl.model.headers.HttpCredentials

- Direct Known Subclasses:
`[HttpCredentials](../../../scaladsl/model/headers/HttpCredentials.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class HttpCredentials
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpCredentials](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [HttpCredentials](HttpCredentials.html "class in akka.http.javadsl.model.headers")` | `[create](#create(java.lang.String,java.lang.String))​(java.lang.String scheme,  java.lang.String token)` |  |
	| `static [HttpCredentials](HttpCredentials.html "class in akka.http.javadsl.model.headers")` | `[create](#create(java.lang.String,java.lang.String,java.util.Map))​(java.lang.String scheme,  java.lang.String token,  java.util.Map<java.lang.String,​java.lang.String> params)` |  |
	| `static [BasicHttpCredentials](BasicHttpCredentials.html "class in akka.http.javadsl.model.headers")` | `[createBasicHttpCredentials](#createBasicHttpCredentials(java.lang.String,java.lang.String))​(java.lang.String username,  java.lang.String password)` |  |
	| `static [OAuth2BearerToken](OAuth2BearerToken.html "class in akka.http.javadsl.model.headers")` | `[createOAuth2BearerToken](#createOAuth2BearerToken(java.lang.String))​(java.lang.String token)` |  |
	| `abstract java.util.Map<java.lang.String,​java.lang.String>` | `[getParams](#getParams())()` |  |
	| `abstract java.lang.String` | `[scheme](#scheme())()` |  |
	| `abstract java.lang.String` | `[token](#token())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpCredentials
		
		
		
		```
		public HttpCredentials()
		```

	- ### Method Detail
	
	
	
		- #### scheme
		
		
		
		```
		public abstract java.lang.String scheme()
		```
		- #### token
		
		
		
		```
		public abstract java.lang.String token()
		```
		- #### getParams
		
		
		
		```
		public abstract java.util.Map<java.lang.String,​java.lang.String> getParams()
		```
		- #### create
		
		
		
		```
		public static [HttpCredentials](HttpCredentials.html "class in akka.http.javadsl.model.headers") create​(java.lang.String scheme,
		                                     java.lang.String token)
		```
		- #### create
		
		
		
		```
		public static [HttpCredentials](HttpCredentials.html "class in akka.http.javadsl.model.headers") create​(java.lang.String scheme,
		                                     java.lang.String token,
		                                     java.util.Map<java.lang.String,​java.lang.String> params)
		```
		- #### createBasicHttpCredentials
		
		
		
		```
		public static [BasicHttpCredentials](BasicHttpCredentials.html "class in akka.http.javadsl.model.headers") createBasicHttpCredentials​(java.lang.String username,
		                                                              java.lang.String password)
		```
		- #### createOAuth2BearerToken
		
		
		
		```
		public static [OAuth2BearerToken](OAuth2BearerToken.html "class in akka.http.javadsl.model.headers") createOAuth2BearerToken​(java.lang.String token)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/BasicHttpCredentials.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpCredentials.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/OAuth2BearerToken.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpCredentials.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpCredentials.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpCredentials.html)*