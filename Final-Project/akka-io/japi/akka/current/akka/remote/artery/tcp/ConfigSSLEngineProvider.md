---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:36:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ConfigSSLEngineProvider.html
title: ConfigSSLEngineProvider
---

# ConfigSSLEngineProvider

## Content

Package [akka.remote.artery.tcp](package-summary.html)
## Class ConfigSSLEngineProvider

- java.lang.Object
- - akka.remote.artery.tcp.ConfigSSLEngineProvider

- All Implemented Interfaces:
`[SSLEngineProvider](SSLEngineProvider.html "interface in akka.remote.artery.tcp")`

---

```
public class ConfigSSLEngineProvider
extends java.lang.Object
implements [SSLEngineProvider](SSLEngineProvider.html "interface in akka.remote.artery.tcp")
```

Config in akka.remote.artery.ssl.config\-ssl\-engine
 
 Subclass may override protected methods to replace certain parts, such as key and trust manager.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ConfigSSLEngineProvider](#%3Cinit%3E(akka.actor.ActorSystem))​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `[ConfigSSLEngineProvider](#%3Cinit%3E(com.typesafe.config.Config,akka.event.MarkerLoggingAdapter))​(com.typesafe.config.Config config,  [MarkerLoggingAdapter](../../../event/MarkerLoggingAdapter.html "class in akka.event") log)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected com.typesafe.config.Config` | `[config](#config())()` |  |
	| `javax.net.ssl.SSLEngine` | `[createClientSSLEngine](#createClientSSLEngine(java.lang.String,int))​(java.lang.String hostname,  int port)` |  |
	| `java.security.SecureRandom` | `[createSecureRandom](#createSecureRandom())()` |  |
	| `javax.net.ssl.SSLEngine` | `[createServerSSLEngine](#createServerSSLEngine(java.lang.String,int))​(java.lang.String hostname,  int port)` |  |
	| `boolean` | `[HostnameVerification](#HostnameVerification())()` |  |
	| `protected javax.net.ssl.KeyManager[]` | `[keyManagers](#keyManagers())()` | Subclass may override to customize `KeyManager` |
	| `protected java.security.KeyStore` | `[loadKeystore](#loadKeystore(java.lang.String,java.lang.String))​(java.lang.String filename,  java.lang.String password)` | Subclass may override to customize loading of `KeyStore` |
	| `protected [MarkerLoggingAdapter](../../../event/MarkerLoggingAdapter.html "class in akka.event")` | `[log](#log())()` |  |
	| `scala.collection.immutable.Set<java.lang.String>` | `[SSLEnabledAlgorithms](#SSLEnabledAlgorithms())()` |  |
	| `java.lang.String` | `[SSLKeyPassword](#SSLKeyPassword())()` |  |
	| `java.lang.String` | `[SSLKeyStore](#SSLKeyStore())()` |  |
	| `java.lang.String` | `[SSLKeyStorePassword](#SSLKeyStorePassword())()` |  |
	| `java.lang.String` | `[SSLProtocol](#SSLProtocol())()` |  |
	| `java.lang.String` | `[SSLRandomNumberGenerator](#SSLRandomNumberGenerator())()` |  |
	| `boolean` | `[SSLRequireMutualAuthentication](#SSLRequireMutualAuthentication())()` |  |
	| `java.lang.String` | `[SSLTrustStore](#SSLTrustStore())()` |  |
	| `java.lang.String` | `[SSLTrustStorePassword](#SSLTrustStorePassword())()` |  |
	| `protected javax.net.ssl.TrustManager[]` | `[trustManagers](#trustManagers())()` | Subclass may override to customize `TrustManager` |
	| `scala.Option<java.lang.Throwable>` | `[verifyClientSession](#verifyClientSession(java.lang.String,javax.net.ssl.SSLSession))​(java.lang.String hostname,  javax.net.ssl.SSLSession session)` | Verification that will be called after every successful handshake  to verify additional session information. |
	| `scala.Option<java.lang.Throwable>` | `[verifyServerSession](#verifyServerSession(java.lang.String,javax.net.ssl.SSLSession))​(java.lang.String hostname,  javax.net.ssl.SSLSession session)` | Verification that will be called after every successful handshake  to verify additional session information. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ConfigSSLEngineProvider
		
		
		
		```
		public ConfigSSLEngineProvider​(com.typesafe.config.Config config,
		                               [MarkerLoggingAdapter](../../../event/MarkerLoggingAdapter.html "class in akka.event") log)
		```
		- #### ConfigSSLEngineProvider
		
		
		
		```
		public ConfigSSLEngineProvider​([ActorSystem](../../../actor/ActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### HostnameVerification
		
		
		
		```
		public boolean HostnameVerification()
		```
		- #### SSLEnabledAlgorithms
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> SSLEnabledAlgorithms()
		```
		- #### SSLKeyPassword
		
		
		
		```
		public java.lang.String SSLKeyPassword()
		```
		- #### SSLKeyStore
		
		
		
		```
		public java.lang.String SSLKeyStore()
		```
		- #### SSLKeyStorePassword
		
		
		
		```
		public java.lang.String SSLKeyStorePassword()
		```
		- #### SSLProtocol
		
		
		
		```
		public java.lang.String SSLProtocol()
		```
		- #### SSLRandomNumberGenerator
		
		
		
		```
		public java.lang.String SSLRandomNumberGenerator()
		```
		- #### SSLRequireMutualAuthentication
		
		
		
		```
		public boolean SSLRequireMutualAuthentication()
		```
		- #### SSLTrustStore
		
		
		
		```
		public java.lang.String SSLTrustStore()
		```
		- #### SSLTrustStorePassword
		
		
		
		```
		public java.lang.String SSLTrustStorePassword()
		```
		- #### config
		
		
		
		```
		protected com.typesafe.config.Config config()
		```
		- #### createClientSSLEngine
		
		
		
		```
		public javax.net.ssl.SSLEngine createClientSSLEngine​(java.lang.String hostname,
		                                                     int port)
		```
		
		
		Specified by:
		`[createClientSSLEngine](SSLEngineProvider.html#createClientSSLEngine(java.lang.String,int))` in interface `[SSLEngineProvider](SSLEngineProvider.html "interface in akka.remote.artery.tcp")`
		- #### createSecureRandom
		
		
		
		```
		public java.security.SecureRandom createSecureRandom()
		```
		- #### createServerSSLEngine
		
		
		
		```
		public javax.net.ssl.SSLEngine createServerSSLEngine​(java.lang.String hostname,
		                                                     int port)
		```
		
		
		Specified by:
		`[createServerSSLEngine](SSLEngineProvider.html#createServerSSLEngine(java.lang.String,int))` in interface `[SSLEngineProvider](SSLEngineProvider.html "interface in akka.remote.artery.tcp")`
		- #### keyManagers
		
		
		
		```
		protected javax.net.ssl.KeyManager[] keyManagers()
		```
		
		Subclass may override to customize `KeyManager`
		- #### loadKeystore
		
		
		
		```
		protected java.security.KeyStore loadKeystore​(java.lang.String filename,
		                                              java.lang.String password)
		```
		
		Subclass may override to customize loading of `KeyStore`
		- #### log
		
		
		
		```
		protected [MarkerLoggingAdapter](../../../event/MarkerLoggingAdapter.html "class in akka.event") log()
		```
		- #### trustManagers
		
		
		
		```
		protected javax.net.ssl.TrustManager[] trustManagers()
		```
		
		Subclass may override to customize `TrustManager`
		- #### verifyClientSession
		
		
		
		```
		public scala.Option<java.lang.Throwable> verifyClientSession​(java.lang.String hostname,
		                                                             javax.net.ssl.SSLSession session)
		```
		
		Description copied from interface: `[SSLEngineProvider](SSLEngineProvider.html#verifyClientSession(java.lang.String,javax.net.ssl.SSLSession))`
		Verification that will be called after every successful handshake
		 to verify additional session information. Return `None` if valid
		 otherwise `Some` with explaining cause.
		
		Specified by:
		`[verifyClientSession](SSLEngineProvider.html#verifyClientSession(java.lang.String,javax.net.ssl.SSLSession))` in interface `[SSLEngineProvider](SSLEngineProvider.html "interface in akka.remote.artery.tcp")`
		- #### verifyServerSession
		
		
		
		```
		public scala.Option<java.lang.Throwable> verifyServerSession​(java.lang.String hostname,
		                                                             javax.net.ssl.SSLSession session)
		```
		
		Description copied from interface: `[SSLEngineProvider](SSLEngineProvider.html#verifyServerSession(java.lang.String,javax.net.ssl.SSLSession))`
		Verification that will be called after every successful handshake
		 to verify additional session information. Return `None` if valid
		 otherwise `Some` with explaining cause.
		
		Specified by:
		`[verifyServerSession](SSLEngineProvider.html#verifyServerSession(java.lang.String,javax.net.ssl.SSLSession))` in interface `[SSLEngineProvider](SSLEngineProvider.html "interface in akka.remote.artery.tcp")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/SSLEngineProvider.html
- https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ConfigSSLEngineProvider.html](https://doc.akka.io/japi/akka/current/akka/remote/artery/tcp/ConfigSSLEngineProvider.html)*