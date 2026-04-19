---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:45:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/TLSPlacebo.html
title: TLSPlacebo
---

# TLSPlacebo

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class TLSPlacebo

- java.lang.Object
- - akka.stream.javadsl.TLSPlacebo

- ---

```
public class TLSPlacebo
extends java.lang.Object
```

This object holds simple wrapping [`BidiFlow`](../scaladsl/BidiFlow.html "class in akka.stream.scaladsl") implementations that can
 be used instead of [`TLS`](TLS.html "class in akka.stream.javadsl") when no encryption is desired. The flows will
 just adapt the message protocol by wrapping into `SessionBytes` and
 unwrapping `SendBytes`.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TLSPlacebo](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [BidiFlow](BidiFlow.html "class in akka.stream.javadsl")<[TLSProtocol.SslTlsOutbound](../TLSProtocol.SslTlsOutbound.html "interface in akka.stream"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[TLSProtocol.SessionBytes](../TLSProtocol.SessionBytes.html "class in akka.stream"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[getInstance](#getInstance())()` | Returns a reusable [`BidiFlow`](BidiFlow.html "class in akka.stream.javadsl") instance representing a [`TLSPlacebo$`](TLSPlacebo$.html "class in akka.stream.javadsl"). |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### TLSPlacebo
		
		
		
		```
		public TLSPlacebo()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public static [BidiFlow](BidiFlow.html "class in akka.stream.javadsl")<[TLSProtocol.SslTlsOutbound](../TLSProtocol.SslTlsOutbound.html "interface in akka.stream"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[TLSProtocol.SessionBytes](../TLSProtocol.SessionBytes.html "class in akka.stream"),​[NotUsed](../../NotUsed.html "class in akka")> getInstance()
		```
		
		Returns a reusable [`BidiFlow`](BidiFlow.html "class in akka.stream.javadsl") instance representing a [`TLSPlacebo$`](TLSPlacebo$.html "class in akka.stream.javadsl").

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/TLSProtocol.SessionBytes.html
- https://doc.akka.io/japi/akka/current/akka/stream/TLSProtocol.SslTlsOutbound.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/BidiFlow.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/TLS.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/TLSPlacebo$.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/BidiFlow.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/TLSPlacebo.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/TLSPlacebo.html)*