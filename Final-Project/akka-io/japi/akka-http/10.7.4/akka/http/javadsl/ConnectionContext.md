---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:47:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ConnectionContext.html
title: ConnectionContext
---

# ConnectionContext

## Content

Package [akka.http.javadsl](package-summary.html)
## Class ConnectionContext

- java.lang.Object
- - akka.http.javadsl.ConnectionContext

- Direct Known Subclasses:
`[HttpConnectionContext](HttpConnectionContext.html "class in akka.http.javadsl")`, `[HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl")`

---

```
public abstract class ConnectionContext
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConnectionContext](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl")` | `[httpsClient](#httpsClient(akka.japi.function.Function2))​(akka.japi.function.Function2<java.lang.String,​java.lang.Integer,​javax.net.ssl.SSLEngine> createEngine)` | If you want complete control over how to create the SSLEngine you can use this method. |
	| `static [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl")` | `[httpsClient](#httpsClient(javax.net.ssl.SSLContext))​(javax.net.ssl.SSLContext sslContext)` | Creates an HttpsConnectionContext for client\-side use from the given SSLContext. |
	| `static [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl")` | `[httpsServer](#httpsServer(akka.japi.function.Creator))​(akka.japi.function.Creator<javax.net.ssl.SSLEngine> createEngine)` | If you want complete control over how to create the SSLEngine you can use this method. |
	| `static [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl")` | `[httpsServer](#httpsServer(javax.net.ssl.SSLContext))​(javax.net.ssl.SSLContext sslContext)` | Creates an HttpsConnectionContext for server\-side use from the given SSLContext. |
	| `abstract boolean` | `[isSecure](#isSecure())()` |  |
	| `static [HttpConnectionContext](HttpConnectionContext.html "class in akka.http.javadsl")` | `[noEncryption](#noEncryption())()` | Used to serve HTTP traffic. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ConnectionContext
		
		
		
		```
		public ConnectionContext()
		```

	- ### Method Detail
	
	
	
		- #### httpsServer
		
		
		
		```
		public static [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") httpsServer​(javax.net.ssl.SSLContext sslContext)
		```
		
		Creates an HttpsConnectionContext for server\-side use from the given SSLContext.
		
		Parameters:
		`sslContext` \- (undocumented)
		Returns:
		(undocumented)
		- #### httpsServer
		
		
		
		```
		public static [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") httpsServer​(akka.japi.function.Creator<javax.net.ssl.SSLEngine> createEngine)
		```
		
		If you want complete control over how to create the SSLEngine you can use this method.
		
		Parameters:
		`createEngine` \- (undocumented)
		Returns:
		(undocumented)
		- #### httpsClient
		
		
		
		```
		public static [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") httpsClient​(javax.net.ssl.SSLContext sslContext)
		```
		
		Creates an HttpsConnectionContext for client\-side use from the given SSLContext.
		
		Parameters:
		`sslContext` \- (undocumented)
		Returns:
		(undocumented)
		- #### httpsClient
		
		
		
		```
		public static [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") httpsClient​(akka.japi.function.Function2<java.lang.String,​java.lang.Integer,​javax.net.ssl.SSLEngine> createEngine)
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
		public static [HttpConnectionContext](HttpConnectionContext.html "class in akka.http.javadsl") noEncryption()
		```
		
		Used to serve HTTP traffic.
		- #### isSecure
		
		
		
		```
		public abstract boolean isSecure()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/HttpConnectionContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/HttpsConnectionContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ConnectionContext.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ConnectionContext.html)*