---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:48:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/TLSProtocol.SessionBytes.html
title: TLSProtocol.SessionBytes
---

# TLSProtocol.SessionBytes

## Content

Package [akka.stream](package-summary.html)
## Class TLSProtocol.SessionBytes

- java.lang.Object
- - akka.stream.TLSProtocol.SessionBytes

- All Implemented Interfaces:
`[ScalaSessionAPI](scaladsl/ScalaSessionAPI.html "interface in akka.stream.scaladsl")`, `[TLSProtocol.SslTlsInbound](TLSProtocol.SslTlsInbound.html "interface in akka.stream")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[TLSProtocol](TLSProtocol.html "class in akka.stream")

---

```
public static final class TLSProtocol.SessionBytes
extends java.lang.Object
implements [TLSProtocol.SslTlsInbound](TLSProtocol.SslTlsInbound.html "interface in akka.stream"), [ScalaSessionAPI](scaladsl/ScalaSessionAPI.html "interface in akka.stream.scaladsl"), scala.Product, java.io.Serializable
```

Plaintext bytes emitted by the SSLEngine are received over one specific
 encryption session and this class bundles the bytes with the SSLSession
 object. When the session changes due to renegotiation (which can be
 initiated by either party) the new session value will not compare equal to
 the previous one.
 
 The Java API for getting session information is given by the SSLSession object,
 the Scala API adapters are offered below.

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.TLSProtocol.SessionBytes)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SessionBytes](#%3Cinit%3E(javax.net.ssl.SSLSession,akka.util.ByteString))​(javax.net.ssl.SSLSession session,  [ByteString](../util/ByteString.html "class in akka.util") bytes)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ByteString](../util/ByteString.html "class in akka.util")` | `[bytes](#bytes())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[TLSProtocol.SessionBytes](TLSProtocol.SessionBytes.html "class in akka.stream")` | `[copy](#copy(javax.net.ssl.SSLSession,akka.util.ByteString))​(javax.net.ssl.SSLSession session,  [ByteString](../util/ByteString.html "class in akka.util") bytes)` |  |
	| `javax.net.ssl.SSLSession` | `[copy$default$1](#copy$default$1())()` |  |
	| `[ByteString](../util/ByteString.html "class in akka.util")` | `[copy$default$2](#copy$default$2())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `javax.net.ssl.SSLSession` | `[session](#session())()` | The underlying `SSLSession`. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`
		- ### Methods inherited from interface akka.stream.scaladsl.[ScalaSessionAPI](scaladsl/ScalaSessionAPI.html "interface in akka.stream.scaladsl")
		
		
		`[localCertificates](scaladsl/ScalaSessionAPI.html#localCertificates()), [localPrincipal](scaladsl/ScalaSessionAPI.html#localPrincipal()), [peerCertificates](scaladsl/ScalaSessionAPI.html#peerCertificates()), [peerPrincipal](scaladsl/ScalaSessionAPI.html#peerPrincipal())`

- - ### Constructor Detail
	
	
	
		- #### SessionBytes
		
		
		
		```
		public SessionBytes​(javax.net.ssl.SSLSession session,
		                    [ByteString](../util/ByteString.html "class in akka.util") bytes)
		```

	- ### Method Detail
	
	
	
		- #### session
		
		
		
		```
		public javax.net.ssl.SSLSession session()
		```
		
		Description copied from interface: `[ScalaSessionAPI](scaladsl/ScalaSessionAPI.html#session())`
		The underlying `SSLSession`.
		
		Specified by:
		`[session](scaladsl/ScalaSessionAPI.html#session())` in interface `[ScalaSessionAPI](scaladsl/ScalaSessionAPI.html "interface in akka.stream.scaladsl")`
		- #### bytes
		
		
		
		```
		public [ByteString](../util/ByteString.html "class in akka.util") bytes()
		```
		- #### copy
		
		
		
		```
		public [TLSProtocol.SessionBytes](TLSProtocol.SessionBytes.html "class in akka.stream") copy​(javax.net.ssl.SSLSession session,
		                                     [ByteString](../util/ByteString.html "class in akka.util") bytes)
		```
		- #### copy$default$1
		
		
		
		```
		public javax.net.ssl.SSLSession copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public [ByteString](../util/ByteString.html "class in akka.util") copy$default$2()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/TLSProtocol.SessionBytes.html
- https://doc.akka.io/japi/akka/current/akka/stream/TLSProtocol.SslTlsInbound.html
- https://doc.akka.io/japi/akka/current/akka/stream/TLSProtocol.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/ScalaSessionAPI.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/TLSProtocol.SessionBytes.html](https://doc.akka.io/japi/akka/current/akka/stream/TLSProtocol.SessionBytes.html)*