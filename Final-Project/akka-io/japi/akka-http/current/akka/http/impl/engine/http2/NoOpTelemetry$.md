---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/NoOpTelemetry$.html
title: NoOpTelemetry$
---

# NoOpTelemetry$

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class NoOpTelemetry$

- java.lang.Object
- - akka.http.impl.engine.http2\.NoOpTelemetry$

- All Implemented Interfaces:
`[TelemetrySpi](TelemetrySpi.html "interface in akka.http.impl.engine.http2")`

---

```
public class NoOpTelemetry$
extends java.lang.Object
implements [TelemetrySpi](TelemetrySpi.html "interface in akka.http.impl.engine.http2")
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [NoOpTelemetry$](NoOpTelemetry$.html "class in akka.http.impl.engine.http2")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoOpTelemetry$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.BidiFlow<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[client](#client())()` | Flow to intercept server connections. |
	| `akka.stream.scaladsl.Flow<akka.stream.scaladsl.Tcp.IncomingConnection,​akka.stream.scaladsl.Tcp.IncomingConnection,​akka.NotUsed>` | `[serverBinding](#serverBinding())()` | Flow to intercept server binding. |
	| `akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[serverConnection](#serverConnection())()` | Flow to intercept server connections. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [NoOpTelemetry$](NoOpTelemetry$.html "class in akka.http.impl.engine.http2") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### NoOpTelemetry$
		
		
		
		```
		public NoOpTelemetry$()
		```

	- ### Method Detail
	
	
	
		- #### client
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed> client()
		```
		
		Description copied from interface: `[TelemetrySpi](TelemetrySpi.html#client())`
		Flow to intercept server connections. When run the flow will have the ClientMeta attribute set.
		
		Specified by:
		`[client](TelemetrySpi.html#client())` in interface `[TelemetrySpi](TelemetrySpi.html "interface in akka.http.impl.engine.http2")`
		Returns:
		(undocumented)
		- #### serverBinding
		
		
		
		```
		public akka.stream.scaladsl.Flow<akka.stream.scaladsl.Tcp.IncomingConnection,​akka.stream.scaladsl.Tcp.IncomingConnection,​akka.NotUsed> serverBinding()
		```
		
		Description copied from interface: `[TelemetrySpi](TelemetrySpi.html#serverBinding())`
		Flow to intercept server binding.
		
		Specified by:
		`[serverBinding](TelemetrySpi.html#serverBinding())` in interface `[TelemetrySpi](TelemetrySpi.html "interface in akka.http.impl.engine.http2")`
		Returns:
		(undocumented)
		- #### serverConnection
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.NotUsed> serverConnection()
		```
		
		Description copied from interface: `[TelemetrySpi](TelemetrySpi.html#serverConnection())`
		Flow to intercept server connections.
		
		Specified by:
		`[serverConnection](TelemetrySpi.html#serverConnection())` in interface `[TelemetrySpi](TelemetrySpi.html "interface in akka.http.impl.engine.http2")`
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/NoOpTelemetry$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/TelemetrySpi.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/NoOpTelemetry$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/NoOpTelemetry$.html)*