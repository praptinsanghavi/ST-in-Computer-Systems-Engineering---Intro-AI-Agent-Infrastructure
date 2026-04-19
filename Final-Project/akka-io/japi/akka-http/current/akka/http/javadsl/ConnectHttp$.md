---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectHttp$.html
title: ConnectHttp$
---

# ConnectHttp$

## Content

Package [akka.http.javadsl](package-summary.html)
## Class ConnectHttp$

- java.lang.Object
- - akka.http.javadsl.ConnectHttp$

- ---

```
public class ConnectHttp$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ConnectHttp$](ConnectHttp$.html "class in akka.http.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConnectHttp$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ConnectHttp](ConnectHttp.html "class in akka.http.javadsl")` | `[toHost](#toHost(akka.http.javadsl.model.Uri))​([Uri](model/Uri.html "class in akka.http.javadsl.model") uriHost)` | Extracts HTTP or HTTPS connection data from given Uri. |
	| `[ConnectHttp](ConnectHttp.html "class in akka.http.javadsl")` | `[toHost](#toHost(java.lang.String))​(java.lang.String host)` | Extract HTTP or HTTPS connection data from given host. |
	| `[ConnectHttp](ConnectHttp.html "class in akka.http.javadsl")` | `[toHost](#toHost(java.lang.String,int))​(java.lang.String host,  int port)` | Extracts HTTP or HTTPS connection data from given host and port. |
	| `[ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl")` | `[toHostHttps](#toHostHttps(akka.http.javadsl.model.Uri))​([Uri](model/Uri.html "class in akka.http.javadsl.model") uriHost)` | Extracts HTTPS connection data from given host and port. |
	| `[ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl")` | `[toHostHttps](#toHostHttps(java.lang.String))​(java.lang.String host)` | Extracts HTTPS connection data from given host and port. |
	| `[ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl")` | `[toHostHttps](#toHostHttps(java.lang.String,int))​(java.lang.String host,  int port)` | Extracts HTTPS connection data from given host and port, using the default HTTPS context. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ConnectHttp$](ConnectHttp$.html "class in akka.http.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ConnectHttp$
		
		
		
		```
		public ConnectHttp$()
		```

	- ### Method Detail
	
	
	
		- #### toHost
		
		
		
		```
		public [ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") toHost​([Uri](model/Uri.html "class in akka.http.javadsl.model") uriHost)
		```
		
		Extracts HTTP or HTTPS connection data from given Uri.
		- #### toHost
		
		
		
		```
		public [ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") toHost​(java.lang.String host)
		```
		
		Extract HTTP or HTTPS connection data from given host.
		 
		 The host string may contain a URI or a : pair.
		
		
		
		Parameters:
		`host` \- (undocumented)
		Returns:
		(undocumented)
		- #### toHost
		
		
		
		```
		public [ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") toHost​(java.lang.String host,
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
		public [ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl") toHostHttps​([Uri](model/Uri.html "class in akka.http.javadsl.model") uriHost)
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
		public [ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl") toHostHttps​(java.lang.String host)
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
		public [ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl") toHostHttps​(java.lang.String host,
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectHttp$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectHttp.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectWithHttps.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/Uri.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectHttp$.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectHttp$.html)*