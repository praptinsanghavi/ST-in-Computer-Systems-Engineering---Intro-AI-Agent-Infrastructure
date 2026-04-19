---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:57:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCookiePair.html
title: HttpCookiePair
---

# HttpCookiePair

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class HttpCookiePair

- java.lang.Object
- - akka.http.javadsl.model.headers.HttpCookiePair

- Direct Known Subclasses:
`[HttpCookiePair](../../../scaladsl/model/headers/HttpCookiePair.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class HttpCookiePair
extends java.lang.Object
```

Represents a cookie pair as used in the \`Cookie\` header as specified in
 http://tools.ietf.org/search/rfc6265\#section\-4\.2\.1

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpCookiePair](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [HttpCookiePair](HttpCookiePair.html "class in akka.http.javadsl.model.headers")` | `[create](#create(java.lang.String,java.lang.String))​(java.lang.String name,  java.lang.String value)` |  |
	| `static [HttpCookiePair](HttpCookiePair.html "class in akka.http.javadsl.model.headers")` | `[createRaw](#createRaw(java.lang.String,java.lang.String))​(java.lang.String name,  java.lang.String value)` |  |
	| `abstract java.lang.String` | `[name](#name())()` |  |
	| `abstract [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers")` | `[toCookie](#toCookie())()` | Converts this cookie pair into an HttpCookie to be used with the  \`Set\-Cookie\` header. |
	| `abstract java.lang.String` | `[value](#value())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpCookiePair
		
		
		
		```
		public HttpCookiePair()
		```

	- ### Method Detail
	
	
	
		- #### name
		
		
		
		```
		public abstract java.lang.String name()
		```
		- #### value
		
		
		
		```
		public abstract java.lang.String value()
		```
		- #### toCookie
		
		
		
		```
		public abstract [HttpCookie](HttpCookie.html "class in akka.http.javadsl.model.headers") toCookie()
		```
		
		Converts this cookie pair into an HttpCookie to be used with the
		 \`Set\-Cookie\` header.
		- #### create
		
		
		
		```
		public static [HttpCookiePair](HttpCookiePair.html "class in akka.http.javadsl.model.headers") create​(java.lang.String name,
		                                    java.lang.String value)
		```
		- #### createRaw
		
		
		
		```
		public static [HttpCookiePair](HttpCookiePair.html "class in akka.http.javadsl.model.headers") createRaw​(java.lang.String name,
		                                       java.lang.String value)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCookie.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCookiePair.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/HttpCookiePair.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCookiePair.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/HttpCookiePair.html)*