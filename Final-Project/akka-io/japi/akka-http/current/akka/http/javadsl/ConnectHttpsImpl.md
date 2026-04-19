---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectHttpsImpl.html
title: ConnectHttpsImpl
---

# ConnectHttpsImpl

## Content

Package [akka.http.javadsl](package-summary.html)
## Class ConnectHttpsImpl

- java.lang.Object
- - [akka.http.javadsl.ConnectHttp](ConnectHttp.html "class in akka.http.javadsl")
	- - [akka.http.javadsl.ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl")
		- - akka.http.javadsl.ConnectHttpsImpl

- ---

```
public final class ConnectHttpsImpl
extends [ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl")
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConnectHttpsImpl](#%3Cinit%3E(java.lang.String,int,java.util.Optional))​(java.lang.String host,  int port,  java.util.Optional<[HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl")> context)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.util.Optional<[HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl")>` | `[connectionContext](#connectionContext())()` |  |
	| `java.util.Optional<[HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl")>` | `[context](#context())()` |  |
	| `java.lang.String` | `[host](#host())()` |  |
	| `boolean` | `[isHttps](#isHttps())()` |  |
	| `int` | `[port](#port())()` |  |
	| `[ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl")` | `[withCustomHttpsContext](#withCustomHttpsContext(akka.http.javadsl.HttpsConnectionContext))​([HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") context)` |  |
	| `[ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl")` | `[withDefaultHttpsContext](#withDefaultHttpsContext())()` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.[ConnectHttp](ConnectHttp.html "class in akka.http.javadsl")
		
		
		`[effectiveConnectionContext](ConnectHttp.html#effectiveConnectionContext(akka.http.javadsl.ConnectionContext)), [effectiveHttpsConnectionContext](ConnectHttp.html#effectiveHttpsConnectionContext(akka.http.javadsl.HttpsConnectionContext)), [toHost](ConnectHttp.html#toHost(akka.http.javadsl.model.Uri)), [toHost](ConnectHttp.html#toHost(java.lang.String)), [toHost](ConnectHttp.html#toHost(java.lang.String,int)), [toHostHttps](ConnectHttp.html#toHostHttps(akka.http.javadsl.model.Uri)), [toHostHttps](ConnectHttp.html#toHostHttps(java.lang.String)), [toHostHttps](ConnectHttp.html#toHostHttps(java.lang.String,int)), [toString](ConnectHttp.html#toString())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ConnectHttpsImpl
		
		
		
		```
		public ConnectHttpsImpl​(java.lang.String host,
		                        int port,
		                        java.util.Optional<[HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl")> context)
		```

	- ### Method Detail
	
	
	
		- #### host
		
		
		
		```
		public java.lang.String host()
		```
		
		
		Specified by:
		`[host](ConnectHttp.html#host())` in class `[ConnectHttp](ConnectHttp.html "class in akka.http.javadsl")`
		- #### port
		
		
		
		```
		public int port()
		```
		
		
		Specified by:
		`[port](ConnectHttp.html#port())` in class `[ConnectHttp](ConnectHttp.html "class in akka.http.javadsl")`
		- #### context
		
		
		
		```
		public java.util.Optional<[HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl")> context()
		```
		- #### isHttps
		
		
		
		```
		public boolean isHttps()
		```
		
		
		Specified by:
		`[isHttps](ConnectHttp.html#isHttps())` in class `[ConnectHttp](ConnectHttp.html "class in akka.http.javadsl")`
		- #### withCustomHttpsContext
		
		
		
		```
		public [ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl") withCustomHttpsContext​([HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") context)
		```
		
		
		Specified by:
		`[withCustomHttpsContext](ConnectWithHttps.html#withCustomHttpsContext(akka.http.javadsl.HttpsConnectionContext))` in class `[ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl")`
		- #### withDefaultHttpsContext
		
		
		
		```
		public [ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl") withDefaultHttpsContext()
		```
		
		
		Specified by:
		`[withDefaultHttpsContext](ConnectWithHttps.html#withDefaultHttpsContext())` in class `[ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl")`
		- #### connectionContext
		
		
		
		```
		public java.util.Optional<[HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl")> connectionContext()
		```
		
		
		Specified by:
		`[connectionContext](ConnectHttp.html#connectionContext())` in class `[ConnectHttp](ConnectHttp.html "class in akka.http.javadsl")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectHttp.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectWithHttps.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/HttpsConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectHttpsImpl.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectHttpsImpl.html)*