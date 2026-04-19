---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:30:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/TelemetrySpi.html
title: TelemetrySpi
---

# TelemetrySpi

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Interface TelemetrySpi

- All Known Implementing Classes:
`[NoOpTelemetry$](NoOpTelemetry$.html "class in akka.http.impl.engine.http2")`

---

```
public interface TelemetrySpi
```

INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.BidiFlow<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[client](#client())()` | Flow to intercept server connections. |
	| `akka.stream.scaladsl.Flow<akka.stream.scaladsl.Tcp.IncomingConnection,​akka.stream.scaladsl.Tcp.IncomingConnection,​akka.NotUsed>` | `[serverBinding](#serverBinding())()` | Flow to intercept server binding. |
	| `akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[serverConnection](#serverConnection())()` | Flow to intercept server connections. |

- - ### Method Detail
	
	
	
		- #### client
		
		
		
		```
		akka.stream.scaladsl.BidiFlow<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed> client()
		```
		
		Flow to intercept server connections. When run the flow will have the ClientMeta attribute set.
		
		Returns:
		(undocumented)
		- #### serverBinding
		
		
		
		```
		akka.stream.scaladsl.Flow<akka.stream.scaladsl.Tcp.IncomingConnection,​akka.stream.scaladsl.Tcp.IncomingConnection,​akka.NotUsed> serverBinding()
		```
		
		Flow to intercept server binding.
		
		Returns:
		(undocumented)
		- #### serverConnection
		
		
		
		```
		akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.NotUsed> serverConnection()
		```
		
		Flow to intercept server connections.
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/NoOpTelemetry$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/TelemetrySpi.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/TelemetrySpi.html)*