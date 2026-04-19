---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/HttpsConnectionContext.html
title: HttpsConnectionContext
---

# HttpsConnectionContext

## Content

Package [akka.http.javadsl](package-summary.html)
## Class HttpsConnectionContext

- java.lang.Object
- - [akka.http.javadsl.ConnectionContext](ConnectionContext.html "class in akka.http.javadsl")
	- - akka.http.javadsl.HttpsConnectionContext

- Direct Known Subclasses:
`[HttpsConnectionContext](../scaladsl/HttpsConnectionContext.html "class in akka.http.scaladsl")`

---

```
public abstract class HttpsConnectionContext
extends [ConnectionContext](ConnectionContext.html "class in akka.http.javadsl")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpsConnectionContext](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[isSecure](#isSecure())()` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.[ConnectionContext](ConnectionContext.html "class in akka.http.javadsl")
		
		
		`[httpsClient](ConnectionContext.html#httpsClient(akka.japi.function.Function2)), [httpsClient](ConnectionContext.html#httpsClient(javax.net.ssl.SSLContext)), [httpsServer](ConnectionContext.html#httpsServer(akka.japi.function.Creator)), [httpsServer](ConnectionContext.html#httpsServer(javax.net.ssl.SSLContext)), [noEncryption](ConnectionContext.html#noEncryption())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpsConnectionContext
		
		
		
		```
		public HttpsConnectionContext()
		```

	- ### Method Detail
	
	
	
		- #### isSecure
		
		
		
		```
		public final boolean isSecure()
		```
		
		
		Specified by:
		`[isSecure](ConnectionContext.html#isSecure())` in class `[ConnectionContext](ConnectionContext.html "class in akka.http.javadsl")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpsConnectionContext.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/HttpsConnectionContext.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/HttpsConnectionContext.html)*