---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:46:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ConnectHttp.html
title: ConnectHttp
---

# ConnectHttp

## Content

Package [akka.http.javadsl](package-summary.html)
## Class ConnectHttp

- java.lang.Object
- - akka.http.javadsl.ConnectHttp

- Direct Known Subclasses:
`[ConnectHttpImpl](ConnectHttpImpl.html "class in akka.http.javadsl")`, `[ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl")`

---

```
public abstract class ConnectHttp
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConnectHttp](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract java.util.Optional<[HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl")>` | `[connectionContext](#connectionContext())()` |  |
	| `[ConnectionContext](ConnectionContext.html "class in akka.http.javadsl")` | `[effectiveConnectionContext](#effectiveConnectionContext(akka.http.javadsl.ConnectionContext))​([ConnectionContext](ConnectionContext.html "class in akka.http.javadsl") fallbackContext)` |  |
	| `[HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl")` | `[effectiveHttpsConnectionContext](#effectiveHttpsConnectionContext(akka.http.javadsl.HttpsConnectionContext))​([HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") fallbackContext)` |  |
	| `abstract java.lang.String` | `[host](#host())()` |  |
	| `abstract boolean` | `[isHttps](#isHttps())()` |  |
	| `abstract int` | `[port](#port())()` |  |
	| `static [ConnectHttp](ConnectHttp.html "class in akka.http.javadsl")` | `[toHost](#toHost(akka.http.javadsl.model.Uri))​([Uri](model/Uri.html "class in akka.http.javadsl.model") uriHost)` | Extracts HTTP or HTTPS connection data from given Uri. |
	| `static [ConnectHttp](ConnectHttp.html "class in akka.http.javadsl")` | `[toHost](#toHost(java.lang.String))​(java.lang.String host)` | Extract HTTP or HTTPS connection data from given host. |
	| `static [ConnectHttp](ConnectHttp.html "class in akka.http.javadsl")` | `[toHost](#toHost(java.lang.String,int))​(java.lang.String host,  int port)` | Extracts HTTP or HTTPS connection data from given host and port. |
	| `static [ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl")` | `[toHostHttps](#toHostHttps(akka.http.javadsl.model.Uri))​([Uri](model/Uri.html "class in akka.http.javadsl.model") uriHost)` | Extracts HTTPS connection data from given host and port. |
	| `static [ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl")` | `[toHostHttps](#toHostHttps(java.lang.String))​(java.lang.String host)` | Extracts HTTPS connection data from given host and port. |
	| `static [ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl")` | `[toHostHttps](#toHostHttps(java.lang.String,int))​(java.lang.String host,  int port)` | Extracts HTTPS connection data from given host and port, using the default HTTPS context. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ConnectHttp
		
		
		
		```
		public ConnectHttp()
		```

	- ### Method Detail
	
	
	
		- #### toHost
		
		
		
		```
		public static [ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") toHost​([Uri](model/Uri.html "class in akka.http.javadsl.model") uriHost)
		```
		
		Extracts HTTP or HTTPS connection data from given Uri.
		- #### toHost
		
		
		
		```
		public static [ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") toHost​(java.lang.String host)
		```
		
		Extract HTTP or HTTPS connection data from given host.
		 
		 The host string may contain a URI or a : pair.
		
		
		
		Parameters:
		`host` \- (undocumented)
		Returns:
		(undocumented)
		- #### toHost
		
		
		
		```
		public static [ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") toHost​(java.lang.String host,
		                                 int port)
		```
		
		Extracts HTTP or HTTPS connection data from given host and port.
		 
		 The host string may contain a URI or a : pair. In both cases the
		 port is ignored.
		 
		 If the given port is 0, a new local port will be assigned by the operating system,
		 which can then be retrieved by the materialized `akka.http.javadsl.Http.ServerBinding`.
		
		
		
		
		
		Parameters:
		`host` \- (undocumented)
		`port` \- (undocumented)
		Returns:
		(undocumented)
		- #### toHostHttps
		
		
		
		```
		public static [ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl") toHostHttps​([Uri](model/Uri.html "class in akka.http.javadsl.model") uriHost)
		                                    throws java.lang.IllegalArgumentException
		```
		
		Extracts HTTPS connection data from given host and port.
		 
		 Uses the default HTTPS context.
		
		
		
		Parameters:
		`uriHost` \- (undocumented)
		Returns:
		(undocumented)
		Throws:
		`java.lang.IllegalArgumentException`
		- #### toHostHttps
		
		
		
		```
		public static [ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl") toHostHttps​(java.lang.String host)
		                                    throws java.lang.IllegalArgumentException
		```
		
		Extracts HTTPS connection data from given host and port.
		 
		 The host string may contain a URI or a : pair.
		 
		 Uses the default HTTPS context.
		
		
		
		
		
		Parameters:
		`host` \- (undocumented)
		Returns:
		(undocumented)
		Throws:
		`java.lang.IllegalArgumentException`
		- #### toHostHttps
		
		
		
		```
		public static [ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl") toHostHttps​(java.lang.String host,
		                                           int port)
		                                    throws java.lang.IllegalArgumentException
		```
		
		Extracts HTTPS connection data from given host and port, using the default HTTPS context.
		 
		 The host string may contain a URI or a : pair. In both cases the
		 port is ignored.
		 
		 If the given port is 0, a new local port will be assigned by the operating system,
		 which can then be retrieved by the materialized `akka.http.javadsl.Http.ServerBinding`.
		 
		
		
		 Uses the default HTTPS context.
		
		
		
		
		
		Parameters:
		`host` \- (undocumented)
		`port` \- (undocumented)
		Returns:
		(undocumented)
		Throws:
		`java.lang.IllegalArgumentException`
		- #### host
		
		
		
		```
		public abstract java.lang.String host()
		```
		- #### port
		
		
		
		```
		public abstract int port()
		```
		- #### isHttps
		
		
		
		```
		public abstract boolean isHttps()
		```
		- #### connectionContext
		
		
		
		```
		public abstract java.util.Optional<[HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl")> connectionContext()
		```
		- #### effectiveHttpsConnectionContext
		
		
		
		```
		public final [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") effectiveHttpsConnectionContext​([HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") fallbackContext)
		```
		- #### effectiveConnectionContext
		
		
		
		```
		public final [ConnectionContext](ConnectionContext.html "class in akka.http.javadsl") effectiveConnectionContext​([ConnectionContext](ConnectionContext.html "class in akka.http.javadsl") fallbackContext)
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ConnectHttp.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ConnectHttpImpl.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ConnectWithHttps.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ConnectionContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/HttpsConnectionContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ConnectHttp.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/ConnectHttp.html)*