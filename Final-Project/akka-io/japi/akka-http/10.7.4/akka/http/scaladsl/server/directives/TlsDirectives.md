---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/TlsDirectives.html
title: TlsDirectives
---

# TlsDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface TlsDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`, `[TlsDirectives$](TlsDirectives$.html "class in akka.http.scaladsl.server.directives")`

---

```
public interface TlsDirectives
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.security.cert.X509Certificate>>` | `[extractClientCertificate](#extractClientCertificate())()` | Extract the client certificate, or reject the request with a `TlsClientUnverifiedRejection`. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<javax.net.ssl.SSLSession>>` | `[extractSslSession](#extractSslSession())()` | Extract the current SSLSession. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit>` | `[requireClientCertificateIdentity](#requireClientCertificateIdentity(scala.util.matching.Regex))​(scala.util.matching.Regex cnRegex)` | Require the client to be authenticated, if not reject the request with a `TlsClientUnverifiedRejection`, also require  the one of the client certificate `ip` or `dns` SANs (Subject Alternative Name) or if non exists, the CN (Common Name)  to match the given regular expression, if not the request is rejected with a `TlsClientIdentityRejection` |

- - ### Method Detail
	
	
	
		- #### extractSslSession
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<javax.net.ssl.SSLSession>> extractSslSession()
		```
		
		Extract the current SSLSession.
		 
		 Note: Using this directives requires tls\-session info parsing to be enabled: `akka.http.server.parsing.tls-session-info-header = on`
		
		
		
		Returns:
		(undocumented)
		- #### extractClientCertificate
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<java.security.cert.X509Certificate>> extractClientCertificate()
		```
		
		Extract the client certificate, or reject the request with a `TlsClientUnverifiedRejection`.
		 
		 Using this directives requires tls\-session info parsing to be enabled: `akka.http.server.parsing.tls-session-info-header = on`
		
		
		
		 The `SSLEngine` for the server needs to be set up with `setWantClientAuth(true)` or `setNeedClientAuth(true)`
		 or else every request will be failed.
		
		
		
		Returns:
		(undocumented)
		- #### requireClientCertificateIdentity
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.runtime.BoxedUnit> requireClientCertificateIdentity​(scala.util.matching.Regex cnRegex)
		```
		
		Require the client to be authenticated, if not reject the request with a `TlsClientUnverifiedRejection`, also require
		 the one of the client certificate `ip` or `dns` SANs (Subject Alternative Name) or if non exists, the CN (Common Name)
		 to match the given regular expression, if not the request is rejected with a `TlsClientIdentityRejection`
		
		 Using this directives requires tls\-session info parsing to be enabled: `akka.http.server.parsing.tls-session-info-header = on`
		
		
		
		 The `SSLEngine` for the server needs to be set up with `setWantClientAuth(true)` or `setNeedClientAuth(true)`
		 or else every request will be failed.
		
		
		
		Parameters:
		`cnRegex` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/TlsDirectives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/TlsDirectives.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/TlsDirectives.html)*