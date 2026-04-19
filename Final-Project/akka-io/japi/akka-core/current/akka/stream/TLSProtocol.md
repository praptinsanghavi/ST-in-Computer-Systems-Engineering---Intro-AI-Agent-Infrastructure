---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:03:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/TLSProtocol.SessionTruncated.html
title: TLSProtocol.SessionTruncated
---

# TLSProtocol.SessionTruncated

## Content

Package [akka.stream](package-summary.html)
## Class TLSProtocol.SessionTruncated

- java.lang.Object
- - akka.stream.TLSProtocol.SessionTruncated

- All Implemented Interfaces:
`[TLSProtocol.SslTlsInbound](TLSProtocol.SslTlsInbound.html "interface in akka.stream")`

Direct Known Subclasses:
`[TLSProtocol.SessionTruncated$](TLSProtocol.SessionTruncated$.html "class in akka.stream")`

Enclosing class:
[TLSProtocol](TLSProtocol.html "class in akka.stream")

---

```
public abstract static class TLSProtocol.SessionTruncated
extends java.lang.Object
implements [TLSProtocol.SslTlsInbound](TLSProtocol.SslTlsInbound.html "interface in akka.stream")
```

If the underlying transport is closed before the final TLS closure command
 is received from the peer then the SSLEngine will throw an SSLException that
 warns about possible truncation attacks. This exception is caught and
 translated into this message when encountered. Most of the time this occurs
 not because of a malicious attacker but due to a connection abort or a
 misbehaving communication peer.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SessionTruncated](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SessionTruncated
		
		
		
		```
		public SessionTruncated()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/stream/TLSProtocol.SessionTruncated$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/TLSProtocol.SslTlsInbound.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/TLSProtocol.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/TLSProtocol.SessionTruncated.html](https://doc.akka.io/japi/akka-core/current/akka/stream/TLSProtocol.SessionTruncated.html)*