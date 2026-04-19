---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ssl/SessionVerifier.html
title: SessionVerifier
---

# SessionVerifier

## Content

Package [akka.remote.artery.tcp.ssl](package-summary.html)
## Interface SessionVerifier

- All Known Implementing Classes:
`[NoopSessionVerifier$](NoopSessionVerifier$.html "class in akka.remote.artery.tcp.ssl")`

---

```
public interface SessionVerifier
```

Allows hooking in extra verification before finishing the SSL handshake.
 
 INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<java.lang.Throwable>` | `[verifyClientSession](#verifyClientSession(java.lang.String,javax.net.ssl.SSLSession))​(java.lang.String hostname,  javax.net.ssl.SSLSession session)` |  |
	| `scala.Option<java.lang.Throwable>` | `[verifyServerSession](#verifyServerSession(java.lang.String,javax.net.ssl.SSLSession))​(java.lang.String hostname,  javax.net.ssl.SSLSession session)` |  |

- - ### Method Detail
	
	
	
		- #### verifyClientSession
		
		
		
		```
		scala.Option<java.lang.Throwable> verifyClientSession​(java.lang.String hostname,
		                                                      javax.net.ssl.SSLSession session)
		```
		- #### verifyServerSession
		
		
		
		```
		scala.Option<java.lang.Throwable> verifyServerSession​(java.lang.String hostname,
		                                                      javax.net.ssl.SSLSession session)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ssl/NoopSessionVerifier$.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ssl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ssl/SessionVerifier.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ssl/SessionVerifier.html)*