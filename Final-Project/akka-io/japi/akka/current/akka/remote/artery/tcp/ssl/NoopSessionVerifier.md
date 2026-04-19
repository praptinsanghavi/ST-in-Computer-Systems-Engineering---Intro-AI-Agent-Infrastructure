---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ssl/NoopSessionVerifier.html
title: NoopSessionVerifier
---

# NoopSessionVerifier

## Content

Package [akka.remote.artery.tcp.ssl](package-summary.html)
## Class NoopSessionVerifier

- java.lang.Object
- - akka.remote.artery.tcp.ssl.NoopSessionVerifier

- ---

```
public class NoopSessionVerifier
extends java.lang.Object
```

This verifier approves all sessions.
 
 INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoopSessionVerifier](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.Option<java.lang.Throwable>` | `[verifyClientSession](#verifyClientSession(java.lang.String,javax.net.ssl.SSLSession))​(java.lang.String hostname,  javax.net.ssl.SSLSession session)` |  |
	| `static scala.Option<java.lang.Throwable>` | `[verifyServerSession](#verifyServerSession(java.lang.String,javax.net.ssl.SSLSession))​(java.lang.String hostname,  javax.net.ssl.SSLSession session)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### NoopSessionVerifier
		
		
		
		```
		public NoopSessionVerifier()
		```

	- ### Method Detail
	
	
	
		- #### verifyClientSession
		
		
		
		```
		public static scala.Option<java.lang.Throwable> verifyClientSession​(java.lang.String hostname,
		                                                                    javax.net.ssl.SSLSession session)
		```
		- #### verifyServerSession
		
		
		
		```
		public static scala.Option<java.lang.Throwable> verifyServerSession​(java.lang.String hostname,
		                                                                    javax.net.ssl.SSLSession session)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ssl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ssl/NoopSessionVerifier.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ssl/NoopSessionVerifier.html)*