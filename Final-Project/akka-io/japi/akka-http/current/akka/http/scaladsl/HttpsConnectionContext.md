---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpsConnectionContext.html
title: HttpsConnectionContext
---

# HttpsConnectionContext

## Content

Package [akka.http.scaladsl](package-summary.html)
## Class HttpsConnectionContext

- java.lang.Object
- - [akka.http.javadsl.ConnectionContext](../javadsl/ConnectionContext.html "class in akka.http.javadsl")
	- - [akka.http.javadsl.HttpsConnectionContext](../javadsl/HttpsConnectionContext.html "class in akka.http.javadsl")
		- - akka.http.scaladsl.HttpsConnectionContext

- All Implemented Interfaces:
`[ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl")`

---

```
public final class HttpsConnectionContext
extends [HttpsConnectionContext](../javadsl/HttpsConnectionContext.html "class in akka.http.javadsl")
implements [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl")
```

Context with all information needed to set up a HTTPS connection
 
 This constructor is INTERNAL API, use ConnectionContext.httpsClient instead

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpsConnectionContext](#%3Cinit%3E(scala.Function1))​(scala.Function1<scala.Option<scala.Tuple2<java.lang.String,​java.lang.Object>>,​javax.net.ssl.SSLEngine> sslContextData)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected int` | `[defaultPort](#defaultPort())()` | INTERNAL API |
	| `scala.Function1<scala.Option<scala.Tuple2<java.lang.String,​java.lang.Object>>,​javax.net.ssl.SSLEngine>` | `[sslContextData](#sslContextData())()` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.[HttpsConnectionContext](../javadsl/HttpsConnectionContext.html "class in akka.http.javadsl")
		
		
		`[isSecure](../javadsl/HttpsConnectionContext.html#isSecure())`
		- ### Methods inherited from class akka.http.javadsl.[ConnectionContext](../javadsl/ConnectionContext.html "class in akka.http.javadsl")
		
		
		`[httpsClient](../javadsl/ConnectionContext.html#httpsClient(akka.japi.function.Function2)), [httpsClient](../javadsl/ConnectionContext.html#httpsClient(javax.net.ssl.SSLContext)), [httpsServer](../javadsl/ConnectionContext.html#httpsServer(akka.japi.function.Creator)), [httpsServer](../javadsl/ConnectionContext.html#httpsServer(javax.net.ssl.SSLContext)), [noEncryption](../javadsl/ConnectionContext.html#noEncryption())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpsConnectionContext
		
		
		
		```
		public HttpsConnectionContext​(scala.Function1<scala.Option<scala.Tuple2<java.lang.String,​java.lang.Object>>,​javax.net.ssl.SSLEngine> sslContextData)
		```

	- ### Method Detail
	
	
	
		- #### defaultPort
		
		
		
		```
		protected final int defaultPort()
		```
		
		Description copied from interface: `[ConnectionContext](ConnectionContext.html#defaultPort())`
		INTERNAL API
		
		Specified by:
		`[defaultPort](ConnectionContext.html#defaultPort())` in interface `[ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl")`
		- #### sslContextData
		
		
		
		```
		public scala.Function1<scala.Option<scala.Tuple2<java.lang.String,​java.lang.Object>>,​javax.net.ssl.SSLEngine> sslContextData()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/HttpsConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpsConnectionContext.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpsConnectionContext.html)*