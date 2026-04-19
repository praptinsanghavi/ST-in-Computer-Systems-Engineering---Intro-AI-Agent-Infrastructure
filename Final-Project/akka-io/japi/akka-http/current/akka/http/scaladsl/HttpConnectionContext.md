---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpConnectionContext.html
title: HttpConnectionContext
---

# HttpConnectionContext

## Content

Package [akka.http.scaladsl](package-summary.html)
## Class HttpConnectionContext

- java.lang.Object
- - [akka.http.javadsl.ConnectionContext](../javadsl/ConnectionContext.html "class in akka.http.javadsl")
	- - [akka.http.javadsl.HttpConnectionContext](../javadsl/HttpConnectionContext.html "class in akka.http.javadsl")
		- - akka.http.scaladsl.HttpConnectionContext

- All Implemented Interfaces:
`[ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl")`

Direct Known Subclasses:
`[HttpConnectionContext$](HttpConnectionContext$.html "class in akka.http.scaladsl")`

---

```
public class HttpConnectionContext
extends [HttpConnectionContext](../javadsl/HttpConnectionContext.html "class in akka.http.javadsl")
implements [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpConnectionContext](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [HttpConnectionContext](HttpConnectionContext.html "class in akka.http.scaladsl")` | `[apply](#apply())()` |  |
	| `static [HttpConnectionContext$](HttpConnectionContext$.html "class in akka.http.scaladsl")` | `[create](#create())()` | Java API |
	| `protected int` | `[defaultPort](#defaultPort())()` | INTERNAL API |
	| `static [HttpConnectionContext$](HttpConnectionContext$.html "class in akka.http.scaladsl")` | `[getInstance](#getInstance())()` | Java API |
	| `static boolean` | `[isSecure](#isSecure())()` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.[HttpConnectionContext](../javadsl/HttpConnectionContext.html "class in akka.http.javadsl")
		
		
		`[isSecure](../javadsl/HttpConnectionContext.html#isSecure())`
		- ### Methods inherited from class akka.http.javadsl.[ConnectionContext](../javadsl/ConnectionContext.html "class in akka.http.javadsl")
		
		
		`[httpsClient](../javadsl/ConnectionContext.html#httpsClient(akka.japi.function.Function2)), [httpsClient](../javadsl/ConnectionContext.html#httpsClient(javax.net.ssl.SSLContext)), [httpsServer](../javadsl/ConnectionContext.html#httpsServer(akka.japi.function.Creator)), [httpsServer](../javadsl/ConnectionContext.html#httpsServer(javax.net.ssl.SSLContext)), [noEncryption](../javadsl/ConnectionContext.html#noEncryption())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpConnectionContext
		
		
		
		```
		public HttpConnectionContext()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public static [HttpConnectionContext$](HttpConnectionContext$.html "class in akka.http.scaladsl") getInstance()
		```
		
		Java API
		- #### create
		
		
		
		```
		public static [HttpConnectionContext$](HttpConnectionContext$.html "class in akka.http.scaladsl") create()
		```
		
		Java API
		- #### apply
		
		
		
		```
		public static [HttpConnectionContext](HttpConnectionContext.html "class in akka.http.scaladsl") apply()
		```
		- #### isSecure
		
		
		
		```
		public static final boolean isSecure()
		```
		- #### defaultPort
		
		
		
		```
		protected final int defaultPort()
		```
		
		Description copied from interface: `[ConnectionContext](ConnectionContext.html#defaultPort())`
		INTERNAL API
		
		Specified by:
		`[defaultPort](ConnectionContext.html#defaultPort())` in interface `[ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/HttpConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpConnectionContext$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpConnectionContext.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpConnectionContext.html)*