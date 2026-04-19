---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/ProtocolSwitch$.html
title: ProtocolSwitch$
---

# ProtocolSwitch$

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class ProtocolSwitch$

- java.lang.Object
- - akka.http.impl.engine.http2\.ProtocolSwitch$

- ---

```
public class ProtocolSwitch$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ProtocolSwitch$](ProtocolSwitch$.html "class in akka.http.impl.engine.http2")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ProtocolSwitch$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​scala.concurrent.Future<[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")>>` | `[apply](#apply(scala.Function1,akka.stream.scaladsl.Flow,akka.stream.scaladsl.Flow))​(scala.Function1<akka.stream.TLSProtocol.SessionBytes,​java.lang.String> chosenProtocolAccessor,  akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> http1Stack,  akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> http2Stack)` |  |
	| `akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​scala.concurrent.Future<[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")>>` | `[byPreface](#byPreface(akka.stream.scaladsl.Flow,akka.stream.scaladsl.Flow))​(akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> http1Stack,  akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> http2Stack)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ProtocolSwitch$](ProtocolSwitch$.html "class in akka.http.impl.engine.http2") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ProtocolSwitch$
		
		
		
		```
		public ProtocolSwitch$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​scala.concurrent.Future<[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")>> apply​(scala.Function1<akka.stream.TLSProtocol.SessionBytes,​java.lang.String> chosenProtocolAccessor,
		                                                                                                                                                                           akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> http1Stack,
		                                                                                                                                                                           akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> http2Stack)
		```
		- #### byPreface
		
		
		
		```
		public akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​scala.concurrent.Future<[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")>> byPreface​(akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> http1Stack,
		                                                                                                                                                                               akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> http2Stack)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/ProtocolSwitch$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/ServerTerminator.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/ProtocolSwitch$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/ProtocolSwitch$.html)*