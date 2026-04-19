---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectWithHttps.html
title: ConnectWithHttps
---

# ConnectWithHttps

## Content

Package [akka.http.javadsl](package-summary.html)
## Class ConnectWithHttps

- java.lang.Object
- - [akka.http.javadsl.ConnectHttp](ConnectHttp.html "class in akka.http.javadsl")
	- - akka.http.javadsl.ConnectWithHttps

- Direct Known Subclasses:
`[ConnectHttpsImpl](ConnectHttpsImpl.html "class in akka.http.javadsl")`

---

```
public abstract class ConnectWithHttps
extends [ConnectHttp](ConnectHttp.html "class in akka.http.javadsl")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConnectWithHttps](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract [ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl")` | `[withCustomHttpsContext](#withCustomHttpsContext(akka.http.javadsl.HttpsConnectionContext))​([HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") context)` |  |
	| `abstract [ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl")` | `[withDefaultHttpsContext](#withDefaultHttpsContext())()` |  |
	
	
		- ### Methods inherited from class akka.http.javadsl.[ConnectHttp](ConnectHttp.html "class in akka.http.javadsl")
		
		
		`[connectionContext](ConnectHttp.html#connectionContext()), [effectiveConnectionContext](ConnectHttp.html#effectiveConnectionContext(akka.http.javadsl.ConnectionContext)), [effectiveHttpsConnectionContext](ConnectHttp.html#effectiveHttpsConnectionContext(akka.http.javadsl.HttpsConnectionContext)), [host](ConnectHttp.html#host()), [isHttps](ConnectHttp.html#isHttps()), [port](ConnectHttp.html#port()), [toHost](ConnectHttp.html#toHost(akka.http.javadsl.model.Uri)), [toHost](ConnectHttp.html#toHost(java.lang.String)), [toHost](ConnectHttp.html#toHost(java.lang.String,int)), [toHostHttps](ConnectHttp.html#toHostHttps(akka.http.javadsl.model.Uri)), [toHostHttps](ConnectHttp.html#toHostHttps(java.lang.String)), [toHostHttps](ConnectHttp.html#toHostHttps(java.lang.String,int)), [toString](ConnectHttp.html#toString())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ConnectWithHttps
		
		
		
		```
		public ConnectWithHttps()
		```

	- ### Method Detail
	
	
	
		- #### withCustomHttpsContext
		
		
		
		```
		public abstract [ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl") withCustomHttpsContext​([HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") context)
		```
		- #### withDefaultHttpsContext
		
		
		
		```
		public abstract [ConnectWithHttps](ConnectWithHttps.html "class in akka.http.javadsl") withDefaultHttpsContext()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectHttp.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectHttpsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectWithHttps.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/HttpsConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectWithHttps.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectWithHttps.html)*