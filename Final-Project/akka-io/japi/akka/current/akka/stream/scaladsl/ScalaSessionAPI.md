---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:40:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ScalaSessionAPI.html
title: ScalaSessionAPI
---

# ScalaSessionAPI

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Interface ScalaSessionAPI

- All Known Implementing Classes:
`[TLSProtocol.SessionBytes](../TLSProtocol.SessionBytes.html "class in akka.stream")`

---

```
public interface ScalaSessionAPI
```

Allows access to an SSLSession with Scala types

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.List<java.security.cert.Certificate>` | `[localCertificates](#localCertificates())()` | Scala API: Extract the certificates that were actually used by this  engine during this session\&rsquo;s negotiation. |
	| `scala.Option<java.security.Principal>` | `[localPrincipal](#localPrincipal())()` | Scala API: Extract the Principal that was actually used by this engine  during this session\&rsquo;s negotiation. |
	| `scala.collection.immutable.List<java.security.cert.Certificate>` | `[peerCertificates](#peerCertificates())()` | Scala API: Extract the certificates that were used by the peer engine  during this session\&rsquo;s negotiation. |
	| `scala.Option<java.security.Principal>` | `[peerPrincipal](#peerPrincipal())()` | Scala API: Extract the Principal that the peer engine presented during  this session\&rsquo;s negotiation. |
	| `javax.net.ssl.SSLSession` | `[session](#session())()` | The underlying `SSLSession`. |

- - ### Method Detail
	
	
	
		- #### session
		
		
		
		```
		javax.net.ssl.SSLSession session()
		```
		
		The underlying `SSLSession`.
		- #### localCertificates
		
		
		
		```
		scala.collection.immutable.List<java.security.cert.Certificate> localCertificates()
		```
		
		Scala API: Extract the certificates that were actually used by this
		 engine during this session\&rsquo;s negotiation. The list is empty if no
		 certificates were used.
		- #### localPrincipal
		
		
		
		```
		scala.Option<java.security.Principal> localPrincipal()
		```
		
		Scala API: Extract the Principal that was actually used by this engine
		 during this session\&rsquo;s negotiation.
		- #### peerCertificates
		
		
		
		```
		scala.collection.immutable.List<java.security.cert.Certificate> peerCertificates()
		```
		
		Scala API: Extract the certificates that were used by the peer engine
		 during this session\&rsquo;s negotiation. The list is empty if no certificates
		 were used.
		- #### peerPrincipal
		
		
		
		```
		scala.Option<java.security.Principal> peerPrincipal()
		```
		
		Scala API: Extract the Principal that the peer engine presented during
		 this session\&rsquo;s negotiation.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/TLSProtocol.SessionBytes.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ScalaSessionAPI.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ScalaSessionAPI.html)*