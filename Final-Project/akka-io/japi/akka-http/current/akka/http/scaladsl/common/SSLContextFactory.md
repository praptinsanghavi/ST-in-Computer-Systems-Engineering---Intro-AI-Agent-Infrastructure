---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:29:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/SSLContextFactory.html
title: SSLContextFactory
---

# SSLContextFactory

## Content

Package [akka.http.scaladsl.common](package-summary.html)
## Class SSLContextFactory

- java.lang.Object
- - akka.http.scaladsl.common.SSLContextFactory

- ---

```
public class SSLContextFactory
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SSLContextFactory](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static javax.net.ssl.SSLContext` | `[createSSLContextFromPem](#createSSLContextFromPem(com.typesafe.config.Config))​(com.typesafe.config.Config config)` | Convenience factory for constructing an SSLContext out of a certificate file, a private key file and zero or more  CA\-certificate files defined in config. |
	| `static javax.net.ssl.SSLContext` | `[createSSLContextFromPem](#createSSLContextFromPem(java.nio.file.Path,java.nio.file.Path))​(java.nio.file.Path certificatePath,  java.nio.file.Path privateKeyPath)` | Convenience factory for constructing an SSLContext out of a certificate file, a private key file but use the  default JDK trust store. |
	| `static javax.net.ssl.SSLContext` | `[createSSLContextFromPem](#createSSLContextFromPem(java.nio.file.Path,java.nio.file.Path,scala.collection.immutable.Seq))​(java.nio.file.Path certificatePath,  java.nio.file.Path privateKeyPath,  scala.collection.immutable.Seq<java.nio.file.Path> trustedCaCertificatePaths)` | Convenience factory for constructing an SSLContext out of a certificate file, a private key file but use the  default JDK trust store. |
	| `static javax.net.ssl.SSLContext` | `[createSSLContextFromPem](#createSSLContextFromPem(java.nio.file.Path,java.nio.file.Path,scala.Option,scala.Option))​(java.nio.file.Path certificatePath,  java.nio.file.Path privateKeyPath,  scala.Option<scala.collection.immutable.Seq<java.nio.file.Path>> trustedCaCertificatePaths,  scala.Option<java.security.SecureRandom> secureRandom)` | Convenience factory for constructing an SSLContext out of a certificate file, a private key file and possibly zero or more  CA\-certificate files to trust. |
	| `static scala.Function0<javax.net.ssl.SSLContext>` | `[refreshingSSLContextProvider](#refreshingSSLContextProvider(scala.concurrent.duration.FiniteDuration,scala.Function0))​(scala.concurrent.duration.FiniteDuration refreshAfter,  scala.Function0<javax.net.ssl.SSLContext> construct)` | Keeps a created SSLContext around for a `refreshAfter` period, sharing it among connections, then creates a new  context. |
	| `static scala.Function0<javax.net.ssl.SSLEngine>` | `[refreshingSSLEngineProvider](#refreshingSSLEngineProvider(scala.concurrent.duration.FiniteDuration,scala.Function0))​(scala.concurrent.duration.FiniteDuration refreshAfter,  scala.Function0<javax.net.ssl.SSLContext> construct)` | Keeps a created SSLContext around for a `refreshAfter` period, sharing it among connections, then creates a new  context. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SSLContextFactory
		
		
		
		```
		public SSLContextFactory()
		```

	- ### Method Detail
	
	
	
		- #### createSSLContextFromPem
		
		
		
		```
		public static javax.net.ssl.SSLContext createSSLContextFromPem​(com.typesafe.config.Config config)
		```
		
		Convenience factory for constructing an SSLContext out of a certificate file, a private key file and zero or more
		 CA\-certificate files defined in config.
		 
		 The provided `Config` is required to have the field `certificate` containing
		 a path to a certificate file, `private-key` containing the path to a private key, and the key `trusted-ca-certificates`
		 either with the value "system" to use the default JDK truststore or containing a list of zero to many paths to CA certificate files
		 to explicitly list what CA certs to trust. All files must contain PEM encoded certificates or keys.
		 
		
		
		 Note that the paths are filesystem paths, not class path,
		 certificate files packaged in the JAR cannot be loaded using this method.
		 
		
		
		 Example usage: `createSSLContextFromPem(system.settings.config.getConfig("my-server"))`
		
		
		
		 API May Change
		
		
		
		Parameters:
		`config` \- (undocumented)
		Returns:
		(undocumented)
		- #### createSSLContextFromPem
		
		
		
		```
		public static javax.net.ssl.SSLContext createSSLContextFromPem​(java.nio.file.Path certificatePath,
		                                                               java.nio.file.Path privateKeyPath)
		```
		
		Convenience factory for constructing an SSLContext out of a certificate file, a private key file but use the
		 default JDK trust store. All files must contain PEM encoded certificates or keys.
		 
		 Note that the paths are filesystem paths, not class path,
		 certificate files packaged in the JAR cannot be loaded using this method.
		 
		
		
		 API May Change
		
		
		
		Parameters:
		`certificatePath` \- (undocumented)
		`privateKeyPath` \- (undocumented)
		Returns:
		(undocumented)
		- #### createSSLContextFromPem
		
		
		
		```
		public static javax.net.ssl.SSLContext createSSLContextFromPem​(java.nio.file.Path certificatePath,
		                                                               java.nio.file.Path privateKeyPath,
		                                                               scala.collection.immutable.Seq<java.nio.file.Path> trustedCaCertificatePaths)
		```
		
		Convenience factory for constructing an SSLContext out of a certificate file, a private key file but use the
		 default JDK trust store. All files must contain PEM encoded certificates or keys.
		 
		 Note that the paths are filesystem paths, not class path,
		 certificate files packaged in the JAR cannot be loaded using this method.
		 
		
		
		 API May Change
		
		
		
		Parameters:
		`certificatePath` \- (undocumented)
		`privateKeyPath` \- (undocumented)
		`trustedCaCertificatePaths` \- (undocumented)
		Returns:
		(undocumented)
		- #### createSSLContextFromPem
		
		
		
		```
		public static javax.net.ssl.SSLContext createSSLContextFromPem​(java.nio.file.Path certificatePath,
		                                                               java.nio.file.Path privateKeyPath,
		                                                               scala.Option<scala.collection.immutable.Seq<java.nio.file.Path>> trustedCaCertificatePaths,
		                                                               scala.Option<java.security.SecureRandom> secureRandom)
		```
		
		Convenience factory for constructing an SSLContext out of a certificate file, a private key file and possibly zero or more
		 CA\-certificate files to trust. All files must contain PEM encoded certificates or keys.
		 
		 Note that the paths are filesystem paths, not class path,
		 certificate files packaged in the JAR cannot be loaded using this method.
		 
		
		
		
		Parameters:
		`certificatePath` \- Path to a PEM encoded certificate file
		`privateKeyPath` \- Path to a PEM encoded key file
		`trustedCaCertificatePaths` \- `None` to use the default system trust store, `Some` with one or more CA certificate paths to
		 explicitly control exactly what CAs are trusted
		`secureRandom` \- a secure random to use for the SSL context or none to use a default instance
		 
		 API May Change
		
		
		Returns:
		(undocumented)
		- #### refreshingSSLEngineProvider
		
		
		
		```
		public static scala.Function0<javax.net.ssl.SSLEngine> refreshingSSLEngineProvider​(scala.concurrent.duration.FiniteDuration refreshAfter,
		                                                                                   scala.Function0<javax.net.ssl.SSLContext> construct)
		```
		
		Keeps a created SSLContext around for a `refreshAfter` period, sharing it among connections, then creates a new
		 context. Useful for rotating certificates.
		 
		
		Parameters:
		`refreshAfter` \- Keep a created context around this long, then recreate it
		`construct` \- A factory method to create the context when recreating is needed
		Returns:
		An SSLEngine provider function to use with Akka HTTP `ConnectionContext.httpsServer()` and `ConnectionContext.httpsClient`.
		 
		 API May Change
		- #### refreshingSSLContextProvider
		
		
		
		```
		public static scala.Function0<javax.net.ssl.SSLContext> refreshingSSLContextProvider​(scala.concurrent.duration.FiniteDuration refreshAfter,
		                                                                                     scala.Function0<javax.net.ssl.SSLContext> construct)
		```
		
		Keeps a created SSLContext around for a `refreshAfter` period, sharing it among connections, then creates a new
		 context. Actually constructing the `SSLEngine` is left to caller, to allow additional customization of the `SSLEngine`,
		 for example to require client certificates in a server application.
		 
		
		Parameters:
		`refreshAfter` \- Keep a created context around this long, then recreate it
		`construct` \- A factory method to create the context when recreating is needed
		Returns:
		An SSLEngine provider function to use with Akka HTTP `ConnectionContext.httpsServer()` and `ConnectionContext.httpsClient`.
		 
		 API May Change

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/SSLContextFactory.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/common/SSLContextFactory.html)*