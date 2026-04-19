---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2.html
title: Http2
---

# Http2

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class Http2

- java.lang.Object
- - akka.http.impl.engine.http2\.Http2

- ---

```
public class Http2
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Http2](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2")` | `[apply](#apply(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static [Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2")` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​(akka.actor.ClassicActorSystemProvider system)` |  |
	| `static [Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​(akka.actor.ExtendedActorSystem system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2")` | `[get](#get(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static [Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​(akka.actor.ClassicActorSystemProvider system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static akka.actor.ExtensionId<? extends akka.actor.Extension>` | `[lookup](#lookup())()` |  |
	| `static akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​scala.concurrent.Future<[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")>>` | `[priorKnowledge](#priorKnowledge(akka.stream.scaladsl.Flow,akka.stream.scaladsl.Flow))​(akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> http1,  akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> http2)` |  |
	| `static [AttributeKey](../../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<java.lang.Object>` | `[streamId](#streamId())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Http2
		
		
		
		```
		public Http2()
		```

	- ### Method Detail
	
	
	
		- #### streamId
		
		
		
		```
		public static [AttributeKey](../../../scaladsl/model/AttributeKey.html "class in akka.http.scaladsl.model")<java.lang.Object> streamId()
		```
		- #### get
		
		
		
		```
		public static [Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2") get​(akka.actor.ActorSystem system)
		```
		- #### get
		
		
		
		```
		public static [Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2") get​(akka.actor.ClassicActorSystemProvider system)
		```
		- #### apply
		
		
		
		```
		public static [Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2") apply​(akka.actor.ClassicActorSystemProvider system)
		```
		- #### apply
		
		
		
		```
		public static [Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2") apply​(akka.actor.ActorSystem system)
		```
		- #### lookup
		
		
		
		```
		public static akka.actor.ExtensionId<? extends akka.actor.Extension> lookup()
		```
		- #### createExtension
		
		
		
		```
		public static [Http2Ext](Http2Ext.html "class in akka.http.impl.engine.http2") createExtension​(akka.actor.ExtendedActorSystem system)
		```
		- #### priorKnowledge
		
		
		
		```
		public static akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​scala.concurrent.Future<[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")>> priorKnowledge​(akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> http1,
		                                                                                                                                                        akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> http2)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Ext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/ServerTerminator.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/AttributeKey.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2.html)*