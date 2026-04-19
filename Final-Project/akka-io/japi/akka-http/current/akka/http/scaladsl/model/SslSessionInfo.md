---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:32:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/SslSessionInfo.html
title: SslSessionInfo
---

# SslSessionInfo

## Content

Package [akka.http.scaladsl.model](package-summary.html)
## Class SslSessionInfo

- java.lang.Object
- - akka.http.scaladsl.model.SslSessionInfo

- All Implemented Interfaces:
`[SslSessionInfo](../../javadsl/model/SslSessionInfo.html "interface in akka.http.javadsl.model")`, `akka.stream.scaladsl.ScalaSessionAPI`

---

```
public class SslSessionInfo
extends java.lang.Object
implements [SslSessionInfo](../../javadsl/model/SslSessionInfo.html "interface in akka.http.javadsl.model"), akka.stream.scaladsl.ScalaSessionAPI
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SslSessionInfo](#%3Cinit%3E(javax.net.ssl.SSLSession))​(javax.net.ssl.SSLSession session)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [SslSessionInfo](SslSessionInfo.html "class in akka.http.scaladsl.model")` | `[apply](#apply(javax.net.ssl.SSLSession))​(javax.net.ssl.SSLSession session)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `javax.net.ssl.SSLSession` | `[getSession](#getSession())()` | Java API |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `javax.net.ssl.SSLSession` | `[session](#session())()` |  |
	| `static scala.Option<javax.net.ssl.SSLSession>` | `[unapply](#unapply(akka.http.scaladsl.model.SslSessionInfo))​([SslSessionInfo](SslSessionInfo.html "class in akka.http.scaladsl.model") sslSession)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.scaladsl.ScalaSessionAPI
		
		
		`localCertificates, localPrincipal, peerCertificates, peerPrincipal`

- - ### Constructor Detail
	
	
	
		- #### SslSessionInfo
		
		
		
		```
		public SslSessionInfo​(javax.net.ssl.SSLSession session)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [SslSessionInfo](SslSessionInfo.html "class in akka.http.scaladsl.model") apply​(javax.net.ssl.SSLSession session)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<javax.net.ssl.SSLSession> unapply​([SslSessionInfo](SslSessionInfo.html "class in akka.http.scaladsl.model") sslSession)
		```
		- #### session
		
		
		
		```
		public javax.net.ssl.SSLSession session()
		```
		
		
		Specified by:
		`session` in interface `akka.stream.scaladsl.ScalaSessionAPI`
		- #### getSession
		
		
		
		```
		public javax.net.ssl.SSLSession getSession()
		```
		
		Java API
		
		Specified by:
		`[getSession](../../javadsl/model/SslSessionInfo.html#getSession())` in interface `[SslSessionInfo](../../javadsl/model/SslSessionInfo.html "interface in akka.http.javadsl.model")`
		Returns:
		(undocumented)
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object other)
		```
		
		
		Overrides:
		`equals` in class `java.lang.Object`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/SslSessionInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/SslSessionInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/SslSessionInfo.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/SslSessionInfo.html)*