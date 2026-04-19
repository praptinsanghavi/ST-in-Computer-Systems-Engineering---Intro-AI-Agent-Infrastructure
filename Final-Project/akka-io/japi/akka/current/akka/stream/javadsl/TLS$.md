---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:45:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/TLS$.html
title: TLS$
---

# TLS$

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class TLS$

- java.lang.Object
- - akka.stream.javadsl.TLS$

- ---

```
public class TLS$
extends java.lang.Object
```

Stream cipher support based upon JSSE.
 
 The underlying SSLEngine has four ports: plaintext input/output and
 ciphertext input/output. These are modeled as a [`BidiShape`](../BidiShape.html "class in akka.stream")
 element for use in stream topologies, where the plaintext ports are on the
 left hand side of the shape and the ciphertext ports on the right hand side.
 

 Configuring JSSE is a rather complex topic, please refer to the JDK platform
 documentation or the excellent user guide that is part of the Play Framework
 documentation. The philosophy of this integration into Akka Streams is to
 expose all knobs and dials to client code and therefore not limit the
 configuration possibilities. In particular the client code will have to
 provide the SSLEngine, which is typically created from a SSLContext. Handshake
 parameters and other parameters are defined when creating the SSLEngine.
 

 '''IMPORTANT NOTE'''
 

 The TLS specification until version 1\.2 did not permit half\-closing of the user data session
 that it transports—to be precise a half\-close will always promptly lead to a
 full close. This means that canceling the plaintext output or completing the
 plaintext input of the SslTls operator will lead to full termination of the
 secure connection without regard to whether bytes are remaining to be sent or
 received, respectively. Especially for a client the common idiom of attaching
 a finite Source to the plaintext input and transforming the plaintext response
 bytes coming out will not work out of the box due to early termination of the
 connection. For this reason there is a parameter that determines whether the
 SslTls operator shall ignore completion and/or cancellation events, and the
 default is to ignore completion (in view of the client–server scenario). In
 order to terminate the connection the client will then need to cancel the
 plaintext output as soon as all expected bytes have been received. When
 ignoring both types of events the operator will shut down once both events have
 been received. See also `TLSClosing`. For now, half\-closing is also not
 supported with TLS 1\.3 where the spec allows it.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TLS$](TLS$.html "class in akka.stream.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TLS$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[BidiFlow](BidiFlow.html "class in akka.stream.javadsl")<[TLSProtocol.SslTlsOutbound](../TLSProtocol.SslTlsOutbound.html "interface in akka.stream"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[TLSProtocol.SslTlsInbound](../TLSProtocol.SslTlsInbound.html "interface in akka.stream"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(java.util.function.Supplier,akka.stream.TLSClosing))​(java.util.function.Supplier<javax.net.ssl.SSLEngine> sslEngineCreator,  [TLSClosing](../TLSClosing.html "class in akka.stream") closing)` | Create a StreamTls [`BidiFlow`](BidiFlow.html "class in akka.stream.javadsl"). |
	| `[BidiFlow](BidiFlow.html "class in akka.stream.javadsl")<[TLSProtocol.SslTlsOutbound](../TLSProtocol.SslTlsOutbound.html "interface in akka.stream"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[TLSProtocol.SslTlsInbound](../TLSProtocol.SslTlsInbound.html "interface in akka.stream"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[create](#create(java.util.function.Supplier,java.util.function.Consumer,akka.stream.TLSClosing))​(java.util.function.Supplier<javax.net.ssl.SSLEngine> sslEngineCreator,  java.util.function.Consumer<javax.net.ssl.SSLSession> sessionVerifier,  [TLSClosing](../TLSClosing.html "class in akka.stream") closing)` | Create a StreamTls [`BidiFlow`](BidiFlow.html "class in akka.stream.javadsl"). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TLS$](TLS$.html "class in akka.stream.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TLS$
		
		
		
		```
		public TLS$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public [BidiFlow](BidiFlow.html "class in akka.stream.javadsl")<[TLSProtocol.SslTlsOutbound](../TLSProtocol.SslTlsOutbound.html "interface in akka.stream"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[TLSProtocol.SslTlsInbound](../TLSProtocol.SslTlsInbound.html "interface in akka.stream"),​[NotUsed](../../NotUsed.html "class in akka")> create​(java.util.function.Supplier<javax.net.ssl.SSLEngine> sslEngineCreator,
		                                                                                                                                   java.util.function.Consumer<javax.net.ssl.SSLSession> sessionVerifier,
		                                                                                                                                   [TLSClosing](../TLSClosing.html "class in akka.stream") closing)
		```
		
		Create a StreamTls [`BidiFlow`](BidiFlow.html "class in akka.stream.javadsl"). This is a low\-level interface.
		 
		 You specify a factory `sslEngineCreator` to create an SSLEngine that must already be configured for
		 client and server mode and with all the parameters for the first session.
		 
		
		
		 You can specify a verification function `sessionVerifier` that will be called
		 after every successful handshake to verify additional session information.
		 
		
		
		 For a description of the `closing` parameter please refer to `TLSClosing`.
		- #### create
		
		
		
		```
		public [BidiFlow](BidiFlow.html "class in akka.stream.javadsl")<[TLSProtocol.SslTlsOutbound](../TLSProtocol.SslTlsOutbound.html "interface in akka.stream"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[TLSProtocol.SslTlsInbound](../TLSProtocol.SslTlsInbound.html "interface in akka.stream"),​[NotUsed](../../NotUsed.html "class in akka")> create​(java.util.function.Supplier<javax.net.ssl.SSLEngine> sslEngineCreator,
		                                                                                                                                   [TLSClosing](../TLSClosing.html "class in akka.stream") closing)
		```
		
		Create a StreamTls [`BidiFlow`](BidiFlow.html "class in akka.stream.javadsl"). This is a low\-level interface.
		 
		 You specify a factory `sslEngineCreator` to create an SSLEngine that must already be configured for
		 client and server mode and with all the parameters for the first session.
		 
		
		
		 For a description of the `closing` parameter please refer to `TLSClosing`.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/BidiShape.html
- https://doc.akka.io/japi/akka/current/akka/stream/TLSClosing.html
- https://doc.akka.io/japi/akka/current/akka/stream/TLSProtocol.SslTlsInbound.html
- https://doc.akka.io/japi/akka/current/akka/stream/TLSProtocol.SslTlsOutbound.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/BidiFlow.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/TLS$.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/TLS$.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/TLS$.html)*