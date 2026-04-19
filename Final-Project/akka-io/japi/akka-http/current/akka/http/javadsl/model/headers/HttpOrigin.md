---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:45:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpOrigin.html
title: HttpOrigin
---

# HttpOrigin

## Content

Package [akka.http.javadsl.model.headers](package-summary.html)
## Class HttpOrigin

- java.lang.Object
- - akka.http.javadsl.model.headers.HttpOrigin

- Direct Known Subclasses:
`[HttpOrigin](../../../scaladsl/model/headers/HttpOrigin.html "class in akka.http.scaladsl.model.headers")`

---

```
public abstract class HttpOrigin
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpOrigin](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [HttpOrigin](HttpOrigin.html "class in akka.http.javadsl.model.headers")` | `[create](#create(java.lang.String,akka.http.javadsl.model.headers.Host))​(java.lang.String scheme,  [Host](Host.html "class in akka.http.javadsl.model.headers") host)` |  |
	| `abstract [Host](Host.html "class in akka.http.javadsl.model.headers")` | `[host](#host())()` |  |
	| `static [HttpOrigin](HttpOrigin.html "class in akka.http.javadsl.model.headers")` | `[parse](#parse(java.lang.String))​(java.lang.String originString)` |  |
	| `abstract java.lang.String` | `[scheme](#scheme())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpOrigin
		
		
		
		```
		public HttpOrigin()
		```

	- ### Method Detail
	
	
	
		- #### scheme
		
		
		
		```
		public abstract java.lang.String scheme()
		```
		- #### host
		
		
		
		```
		public abstract [Host](Host.html "class in akka.http.javadsl.model.headers") host()
		```
		- #### create
		
		
		
		```
		public static [HttpOrigin](HttpOrigin.html "class in akka.http.javadsl.model.headers") create​(java.lang.String scheme,
		                                [Host](Host.html "class in akka.http.javadsl.model.headers") host)
		```
		- #### parse
		
		
		
		```
		public static [HttpOrigin](HttpOrigin.html "class in akka.http.javadsl.model.headers") parse​(java.lang.String originString)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpOrigin.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/HttpOrigin.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpOrigin.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/HttpOrigin.html)*