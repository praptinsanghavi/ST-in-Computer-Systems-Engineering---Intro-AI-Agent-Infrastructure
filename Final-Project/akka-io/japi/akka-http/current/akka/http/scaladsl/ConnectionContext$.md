---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ConnectionContext$.html
title: ConnectionContext$
---

# ConnectionContext$

## Content

Package [akka.http.scaladsl](package-summary.html)
## Class ConnectionContext$

- java.lang.Object
- - akka.http.scaladsl.ConnectionContext$

- ---

```
public class ConnectionContext$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ConnectionContext$](ConnectionContext$.html "class in akka.http.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConnectionContext$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl")` | `[httpsClient](#httpsClient(javax.net.ssl.SSLContext))​(javax.net.ssl.SSLContext context)` | Creates an HttpsConnectionContext for client\-side use from the given SSLContext. |
	| `[HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl")` | `[httpsClient](#httpsClient(scala.Function2))​(scala.Function2<java.lang.String,​java.lang.Object,​javax.net.ssl.SSLEngine> createSSLEngine)` | If you want complete control over how to create the SSLEngine you can use this method. |
	| `[HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl")` | `[httpsServer](#httpsServer(javax.net.ssl.SSLContext))​(javax.net.ssl.SSLContext sslContext)` | Creates an HttpsConnectionContext for server\-side use from the given SSLContext. |
	| `[HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl")` | `[httpsServer](#httpsServer(scala.Function0))​(scala.Function0<javax.net.ssl.SSLEngine> createSSLEngine)` | If you want complete control over how to create the SSLEngine you can use this method. |
	| `[HttpConnectionContext$](HttpConnectionContext$.html "class in akka.http.scaladsl")` | `[noEncryption](#noEncryption())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ConnectionContext$](ConnectionContext$.html "class in akka.http.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ConnectionContext$
		
		
		
		```
		public ConnectionContext$()
		```

	- ### Method Detail
	
	
	
		- #### httpsServer
		
		
		
		```
		public [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl") httpsServer​(javax.net.ssl.SSLContext sslContext)
		```
		
		Creates an HttpsConnectionContext for server\-side use from the given SSLContext.
		
		Parameters:
		`sslContext` \- (undocumented)
		Returns:
		(undocumented)
		- #### httpsServer
		
		
		
		```
		public [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl") httpsServer​(scala.Function0<javax.net.ssl.SSLEngine> createSSLEngine)
		```
		
		If you want complete control over how to create the SSLEngine you can use this method.
		
		Parameters:
		`createSSLEngine` \- (undocumented)
		Returns:
		(undocumented)
		- #### httpsClient
		
		
		
		```
		public [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl") httpsClient​(javax.net.ssl.SSLContext context)
		```
		
		Creates an HttpsConnectionContext for client\-side use from the given SSLContext.
		
		Parameters:
		`context` \- (undocumented)
		Returns:
		(undocumented)
		- #### httpsClient
		
		
		
		```
		public [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl") httpsClient​(scala.Function2<java.lang.String,​java.lang.Object,​javax.net.ssl.SSLEngine> createSSLEngine)
		```
		
		If you want complete control over how to create the SSLEngine you can use this method.
		 
		 Note that this means it is up to you to make sure features like SNI and hostname verification
		 are enabled as needed.
		
		
		
		Parameters:
		`createSSLEngine` \- (undocumented)
		Returns:
		(undocumented)
		- #### noEncryption
		
		
		
		```
		public [HttpConnectionContext$](HttpConnectionContext$.html "class in akka.http.scaladsl") noEncryption()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ConnectionContext$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpConnectionContext$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpsConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ConnectionContext$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ConnectionContext$.html)*