---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ssl/NoopSessionVerifier$.html
title: NoopSessionVerifier$
---

# NoopSessionVerifier$

## Content

Package [akka.remote.artery.tcp.ssl](package-summary.html)
## Class NoopSessionVerifier$

- java.lang.Object
- - akka.remote.artery.tcp.ssl.NoopSessionVerifier$

- All Implemented Interfaces:
`[SessionVerifier](SessionVerifier.html "interface in akka.remote.artery.tcp.ssl")`

---

```
public class NoopSessionVerifier$
extends java.lang.Object
implements [SessionVerifier](SessionVerifier.html "interface in akka.remote.artery.tcp.ssl")
```

This verifier approves all sessions.
 
 INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [NoopSessionVerifier$](NoopSessionVerifier$.html "class in akka.remote.artery.tcp.ssl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoopSessionVerifier$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<java.lang.Throwable>` | `[verifyClientSession](#verifyClientSession(java.lang.String,javax.net.ssl.SSLSession))​(java.lang.String hostname,  javax.net.ssl.SSLSession session)` |  |
	| `scala.Option<java.lang.Throwable>` | `[verifyServerSession](#verifyServerSession(java.lang.String,javax.net.ssl.SSLSession))​(java.lang.String hostname,  javax.net.ssl.SSLSession session)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [NoopSessionVerifier$](NoopSessionVerifier$.html "class in akka.remote.artery.tcp.ssl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### NoopSessionVerifier$
		
		
		
		```
		public NoopSessionVerifier$()
		```

	- ### Method Detail
	
	
	
		- #### verifyClientSession
		
		
		
		```
		public scala.Option<java.lang.Throwable> verifyClientSession​(java.lang.String hostname,
		                                                             javax.net.ssl.SSLSession session)
		```
		
		
		Specified by:
		`[verifyClientSession](SessionVerifier.html#verifyClientSession(java.lang.String,javax.net.ssl.SSLSession))` in interface `[SessionVerifier](SessionVerifier.html "interface in akka.remote.artery.tcp.ssl")`
		- #### verifyServerSession
		
		
		
		```
		public scala.Option<java.lang.Throwable> verifyServerSession​(java.lang.String hostname,
		                                                             javax.net.ssl.SSLSession session)
		```
		
		
		Specified by:
		`[verifyServerSession](SessionVerifier.html#verifyServerSession(java.lang.String,javax.net.ssl.SSLSession))` in interface `[SessionVerifier](SessionVerifier.html "interface in akka.remote.artery.tcp.ssl")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ssl/NoopSessionVerifier$.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ssl/SessionVerifier.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ssl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ssl/NoopSessionVerifier$.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ssl/NoopSessionVerifier$.html)*