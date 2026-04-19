---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:42:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/TLSPlacebo$.html
title: TLSPlacebo$
---

# TLSPlacebo$

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class TLSPlacebo$

- java.lang.Object
- - akka.stream.scaladsl.TLSPlacebo$

- ---

```
public class TLSPlacebo$
extends java.lang.Object
```

This object holds simple wrapping [`BidiFlow`](BidiFlow.html "class in akka.stream.scaladsl") implementations that can
 be used instead of [`TLS`](TLS.html "class in akka.stream.scaladsl") when no encryption is desired. The flows will
 just adapt the message protocol by wrapping into `SessionBytes` and
 unwrapping `SendBytes`.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TLSPlacebo$](TLSPlacebo$.html "class in akka.stream.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TLSPlacebo$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[TLSProtocol.SslTlsOutbound](../TLSProtocol.SslTlsOutbound.html "interface in akka.stream"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[TLSProtocol.SessionBytes](../TLSProtocol.SessionBytes.html "class in akka.stream"),​[NotUsed](../../NotUsed.html "class in akka")>` | `[apply](#apply())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TLSPlacebo$](TLSPlacebo$.html "class in akka.stream.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TLSPlacebo$
		
		
		
		```
		public TLSPlacebo$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [BidiFlow](BidiFlow.html "class in akka.stream.scaladsl")<[TLSProtocol.SslTlsOutbound](../TLSProtocol.SslTlsOutbound.html "interface in akka.stream"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​[TLSProtocol.SessionBytes](../TLSProtocol.SessionBytes.html "class in akka.stream"),​[NotUsed](../../NotUsed.html "class in akka")> apply()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/TLSProtocol.SessionBytes.html
- https://doc.akka.io/japi/akka/current/akka/stream/TLSProtocol.SslTlsOutbound.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/BidiFlow.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/TLS.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/TLSPlacebo$.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/TLSPlacebo$.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/TLSPlacebo$.html)*