---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2$.html
title: Http2$
---

# Http2$

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class Http2$

- java.lang.Object
- - akka.http.impl.engine.http2\.Http2$

- All Implemented Interfaces:
`akka.actor.ExtensionId<[Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2")>`, `akka.actor.ExtensionIdProvider`

---

```
public class Http2$
extends java.lang.Object
implements akka.actor.ExtensionId<[Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2")>, akka.actor.ExtensionIdProvider
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Http2$](Http2$.html "class in akka.http.impl.engine.http2")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Http2$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2")` | `[apply](#apply(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `[Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2")` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​(akka.actor.ClassicActorSystemProvider system)` |  |
	| `[Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​(akka.actor.ExtendedActorSystem system)` |  |
	| `[Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2")` | `[get](#get(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `[Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​(akka.actor.ClassicActorSystemProvider system)` |  |
	| `akka.actor.ExtensionId<? extends akka.actor.Extension>` | `[lookup](#lookup())()` |  |
	| `akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​scala.concurrent.Future<[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")>>` | `[priorKnowledge](#priorKnowledge(akka.stream.scaladsl.Flow,akka.stream.scaladsl.Flow))​(akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> http1,  akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> http2)` |  |
	| `[AttributeKey](../../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<java.lang.Object>` | `[streamId](#streamId())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.ExtensionId
		
		
		`equals, hashCode`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Http2$](Http2$.html "class in akka.http.impl.engine.http2") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Http2$
		
		
		
		```
		public Http2$()
		```

	- ### Method Detail
	
	
	
		- #### streamId
		
		
		
		```
		public [AttributeKey](../../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<java.lang.Object> streamId()
		```
		- #### get
		
		
		
		```
		public [Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2") get​(akka.actor.ActorSystem system)
		```
		
		
		Specified by:
		`get` in interface `akka.actor.ExtensionId<[Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2")>`
		- #### get
		
		
		
		```
		public [Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2") get​(akka.actor.ClassicActorSystemProvider system)
		```
		
		
		Specified by:
		`get` in interface `akka.actor.ExtensionId<[Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2")>`
		- #### apply
		
		
		
		```
		public [Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2") apply​(akka.actor.ClassicActorSystemProvider system)
		```
		
		
		Specified by:
		`apply` in interface `akka.actor.ExtensionId<[Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2")>`
		- #### apply
		
		
		
		```
		public [Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2") apply​(akka.actor.ActorSystem system)
		```
		
		
		Specified by:
		`apply` in interface `akka.actor.ExtensionId<[Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2")>`
		- #### lookup
		
		
		
		```
		public akka.actor.ExtensionId<? extends akka.actor.Extension> lookup()
		```
		
		
		Specified by:
		`lookup` in interface `akka.actor.ExtensionIdProvider`
		- #### createExtension
		
		
		
		```
		public [Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2") createExtension​(akka.actor.ExtendedActorSystem system)
		```
		
		
		Specified by:
		`createExtension` in interface `akka.actor.ExtensionId<[Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2")>`
		- #### priorKnowledge
		
		
		
		```
		public akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​scala.concurrent.Future<[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")>> priorKnowledge​(akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> http1,
		                                                                                                                                                 akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> http2)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Ext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/ServerTerminator.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/AttributeKey.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2$.html)*