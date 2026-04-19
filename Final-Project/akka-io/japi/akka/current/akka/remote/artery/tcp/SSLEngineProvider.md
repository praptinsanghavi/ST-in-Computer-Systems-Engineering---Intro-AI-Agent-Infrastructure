---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/SSLEngineProvider.html
title: SSLEngineProvider
---

# SSLEngineProvider

## Content

Package [akka.remote.artery.tcp](package-summary.html)
## Interface SSLEngineProvider

- All Known Implementing Classes:
`[ConfigSSLEngineProvider](ConfigSSLEngineProvider.html "class in akka.remote.artery.tcp")`, `[RotatingKeysSSLEngineProvider](ssl/RotatingKeysSSLEngineProvider.html "class in akka.remote.artery.tcp.ssl")`

---

```
public interface SSLEngineProvider
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `javax.net.ssl.SSLEngine` | `[createClientSSLEngine](#createClientSSLEngine(java.lang.String,int))​(java.lang.String hostname,  int port)` |  |
	| `javax.net.ssl.SSLEngine` | `[createServerSSLEngine](#createServerSSLEngine(java.lang.String,int))​(java.lang.String hostname,  int port)` |  |
	| `scala.Option<java.lang.Throwable>` | `[verifyClientSession](#verifyClientSession(java.lang.String,javax.net.ssl.SSLSession))​(java.lang.String hostname,  javax.net.ssl.SSLSession session)` | Verification that will be called after every successful handshake  to verify additional session information. |
	| `scala.Option<java.lang.Throwable>` | `[verifyServerSession](#verifyServerSession(java.lang.String,javax.net.ssl.SSLSession))​(java.lang.String hostname,  javax.net.ssl.SSLSession session)` | Verification that will be called after every successful handshake  to verify additional session information. |

- - ### Method Detail
	
	
	
		- #### createClientSSLEngine
		
		
		
		```
		javax.net.ssl.SSLEngine createClientSSLEngine​(java.lang.String hostname,
		                                              int port)
		```
		- #### createServerSSLEngine
		
		
		
		```
		javax.net.ssl.SSLEngine createServerSSLEngine​(java.lang.String hostname,
		                                              int port)
		```
		- #### verifyClientSession
		
		
		
		```
		scala.Option<java.lang.Throwable> verifyClientSession​(java.lang.String hostname,
		                                                      javax.net.ssl.SSLSession session)
		```
		
		Verification that will be called after every successful handshake
		 to verify additional session information. Return `None` if valid
		 otherwise `Some` with explaining cause.
		- #### verifyServerSession
		
		
		
		```
		scala.Option<java.lang.Throwable> verifyServerSession​(java.lang.String hostname,
		                                                      javax.net.ssl.SSLSession session)
		```
		
		Verification that will be called after every successful handshake
		 to verify additional session information. Return `None` if valid
		 otherwise `Some` with explaining cause.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ConfigSSLEngineProvider.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ssl/RotatingKeysSSLEngineProvider.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/SSLEngineProvider.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/SSLEngineProvider.html)*