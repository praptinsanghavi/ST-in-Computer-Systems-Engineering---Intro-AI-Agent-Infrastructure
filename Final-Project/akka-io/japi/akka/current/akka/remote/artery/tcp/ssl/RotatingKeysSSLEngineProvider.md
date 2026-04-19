---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ssl/RotatingKeysSSLEngineProvider.html
title: RotatingKeysSSLEngineProvider
---

# RotatingKeysSSLEngineProvider

## Content

Package [akka.remote.artery.tcp.ssl](package-summary.html)
## Class RotatingKeysSSLEngineProvider

- java.lang.Object
- - akka.remote.artery.tcp.ssl.RotatingKeysSSLEngineProvider

- All Implemented Interfaces:
`[SSLEngineProvider](../SSLEngineProvider.html "interface in akka.remote.artery.tcp")`

---

```
public final class RotatingKeysSSLEngineProvider
extends java.lang.Object
implements [SSLEngineProvider](../SSLEngineProvider.html "interface in akka.remote.artery.tcp")
```

Variation on ConfigSSLEngineProvider that will periodically reload the keys and certificates
 from disk, to facilitate rolling updates of certificates.
 
 This provider does not perform hostname verification, but instead allows checking
 that the remote certificate has a subject name that matches the subject name of
 the configured certificate.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RotatingKeysSSLEngineProvider](#%3Cinit%3E(akka.actor.ActorSystem))​([ActorSystem](../../../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `[RotatingKeysSSLEngineProvider](#%3Cinit%3E(com.typesafe.config.Config,akka.event.MarkerLoggingAdapter))​(com.typesafe.config.Config config,  [MarkerLoggingAdapter](../../../../event/MarkerLoggingAdapter.html "class in akka.event") log)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `com.typesafe.config.Config` | `[config](#config())()` |  |
	| `javax.net.ssl.SSLEngine` | `[createClientSSLEngine](#createClientSSLEngine(java.lang.String,int))​(java.lang.String hostname,  int port)` |  |
	| `javax.net.ssl.SSLEngine` | `[createServerSSLEngine](#createServerSSLEngine(java.lang.String,int))​(java.lang.String hostname,  int port)` |  |
	| `protected [MarkerLoggingAdapter](../../../../event/MarkerLoggingAdapter.html "class in akka.event")` | `[log](#log())()` |  |
	| `scala.Option<java.lang.Throwable>` | `[verifyClientSession](#verifyClientSession(java.lang.String,javax.net.ssl.SSLSession))​(java.lang.String hostname,  javax.net.ssl.SSLSession session)` | Verification that will be called after every successful handshake  to verify additional session information. |
	| `scala.Option<java.lang.Throwable>` | `[verifyServerSession](#verifyServerSession(java.lang.String,javax.net.ssl.SSLSession))​(java.lang.String hostname,  javax.net.ssl.SSLSession session)` | Verification that will be called after every successful handshake  to verify additional session information. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RotatingKeysSSLEngineProvider
		
		
		
		```
		public RotatingKeysSSLEngineProvider​(com.typesafe.config.Config config,
		                                     [MarkerLoggingAdapter](../../../../event/MarkerLoggingAdapter.html "class in akka.event") log)
		```
		- #### RotatingKeysSSLEngineProvider
		
		
		
		```
		public RotatingKeysSSLEngineProvider​([ActorSystem](../../../../actor/ActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### config
		
		
		
		```
		public com.typesafe.config.Config config()
		```
		- #### log
		
		
		
		```
		protected [MarkerLoggingAdapter](../../../../event/MarkerLoggingAdapter.html "class in akka.event") log()
		```
		- #### createServerSSLEngine
		
		
		
		```
		public javax.net.ssl.SSLEngine createServerSSLEngine​(java.lang.String hostname,
		                                                     int port)
		```
		
		
		Specified by:
		`[createServerSSLEngine](../SSLEngineProvider.html#createServerSSLEngine(java.lang.String,int))` in interface `[SSLEngineProvider](../SSLEngineProvider.html "interface in akka.remote.artery.tcp")`
		- #### createClientSSLEngine
		
		
		
		```
		public javax.net.ssl.SSLEngine createClientSSLEngine​(java.lang.String hostname,
		                                                     int port)
		```
		
		
		Specified by:
		`[createClientSSLEngine](../SSLEngineProvider.html#createClientSSLEngine(java.lang.String,int))` in interface `[SSLEngineProvider](../SSLEngineProvider.html "interface in akka.remote.artery.tcp")`
		- #### verifyClientSession
		
		
		
		```
		public scala.Option<java.lang.Throwable> verifyClientSession​(java.lang.String hostname,
		                                                             javax.net.ssl.SSLSession session)
		```
		
		Description copied from interface: `[SSLEngineProvider](../SSLEngineProvider.html#verifyClientSession(java.lang.String,javax.net.ssl.SSLSession))`
		Verification that will be called after every successful handshake
		 to verify additional session information. Return `None` if valid
		 otherwise `Some` with explaining cause.
		
		Specified by:
		`[verifyClientSession](../SSLEngineProvider.html#verifyClientSession(java.lang.String,javax.net.ssl.SSLSession))` in interface `[SSLEngineProvider](../SSLEngineProvider.html "interface in akka.remote.artery.tcp")`
		- #### verifyServerSession
		
		
		
		```
		public scala.Option<java.lang.Throwable> verifyServerSession​(java.lang.String hostname,
		                                                             javax.net.ssl.SSLSession session)
		```
		
		Description copied from interface: `[SSLEngineProvider](../SSLEngineProvider.html#verifyServerSession(java.lang.String,javax.net.ssl.SSLSession))`
		Verification that will be called after every successful handshake
		 to verify additional session information. Return `None` if valid
		 otherwise `Some` with explaining cause.
		
		Specified by:
		`[verifyServerSession](../SSLEngineProvider.html#verifyServerSession(java.lang.String,javax.net.ssl.SSLSession))` in interface `[SSLEngineProvider](../SSLEngineProvider.html "interface in akka.remote.artery.tcp")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/SSLEngineProvider.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ssl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ssl/RotatingKeysSSLEngineProvider.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ssl/RotatingKeysSSLEngineProvider.html)*