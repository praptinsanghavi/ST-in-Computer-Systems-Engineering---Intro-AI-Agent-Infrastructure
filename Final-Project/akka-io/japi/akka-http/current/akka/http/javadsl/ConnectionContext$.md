---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectionContext$.html
title: ConnectionContext$
---

# ConnectionContext$

## Content

Package [akka.http.javadsl](package-summary.html)
## Class ConnectionContext$

- java.lang.Object
- - akka.http.javadsl.ConnectionContext$

- ---

```
public class ConnectionContext$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ConnectionContext$](ConnectionContext$.html "class in akka.http.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConnectionContext$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl")` | `[httpsClient](#httpsClient(akka.japi.function.Function2))​(akka.japi.function.Function2<java.lang.String,​java.lang.Integer,​javax.net.ssl.SSLEngine> createEngine)` | If you want complete control over how to create the SSLEngine you can use this method. |
	| `[HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl")` | `[httpsClient](#httpsClient(javax.net.ssl.SSLContext))​(javax.net.ssl.SSLContext sslContext)` | Creates an HttpsConnectionContext for client\-side use from the given SSLContext. |
	| `[HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl")` | `[httpsServer](#httpsServer(akka.japi.function.Creator))​(akka.japi.function.Creator<javax.net.ssl.SSLEngine> createEngine)` | If you want complete control over how to create the SSLEngine you can use this method. |
	| `[HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl")` | `[httpsServer](#httpsServer(javax.net.ssl.SSLContext))​(javax.net.ssl.SSLContext sslContext)` | Creates an HttpsConnectionContext for server\-side use from the given SSLContext. |
	| `[HttpConnectionContext](HttpConnectionContext.html "class in akka.http.javadsl")` | `[noEncryption](#noEncryption())()` | Used to serve HTTP traffic. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ConnectionContext$](ConnectionContext$.html "class in akka.http.javadsl") MODULE$
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
		public [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") httpsServer​(javax.net.ssl.SSLContext sslContext)
		```
		
		Creates an HttpsConnectionContext for server\-side use from the given SSLContext.
		
		Parameters:
		`sslContext` \- (undocumented)
		Returns:
		(undocumented)
		- #### httpsServer
		
		
		
		```
		public [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") httpsServer​(akka.japi.function.Creator<javax.net.ssl.SSLEngine> createEngine)
		```
		
		If you want complete control over how to create the SSLEngine you can use this method.
		
		Parameters:
		`createEngine` \- (undocumented)
		Returns:
		(undocumented)
		- #### httpsClient
		
		
		
		```
		public [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") httpsClient​(javax.net.ssl.SSLContext sslContext)
		```
		
		Creates an HttpsConnectionContext for client\-side use from the given SSLContext.
		
		Parameters:
		`sslContext` \- (undocumented)
		Returns:
		(undocumented)
		- #### httpsClient
		
		
		
		```
		public [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") httpsClient​(akka.japi.function.Function2<java.lang.String,​java.lang.Integer,​javax.net.ssl.SSLEngine> createEngine)
		```
		
		If you want complete control over how to create the SSLEngine you can use this method.
		 
		 Note that this means it is up to you to make sure features like SNI and hostname verification
		 are enabled as needed.
		
		
		
		Parameters:
		`createEngine` \- (undocumented)
		Returns:
		(undocumented)
		- #### noEncryption
		
		
		
		```
		public [HttpConnectionContext](HttpConnectionContext.html "class in akka.http.javadsl") noEncryption()
		```
		
		Used to serve HTTP traffic.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectionContext$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/HttpConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/HttpsConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectionContext$.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectionContext$.html)*