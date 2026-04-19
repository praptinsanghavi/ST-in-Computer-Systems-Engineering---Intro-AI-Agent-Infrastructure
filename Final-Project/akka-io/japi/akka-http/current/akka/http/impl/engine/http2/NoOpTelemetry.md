---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/NoOpTelemetry.html
title: NoOpTelemetry
---

# NoOpTelemetry

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class NoOpTelemetry

- java.lang.Object
- - akka.http.impl.engine.http2\.NoOpTelemetry

- ---

```
public class NoOpTelemetry
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoOpTelemetry](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.stream.scaladsl.BidiFlow<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[client](#client())()` |  |
	| `static akka.stream.scaladsl.Flow<akka.stream.scaladsl.Tcp.IncomingConnection,​akka.stream.scaladsl.Tcp.IncomingConnection,​akka.NotUsed>` | `[serverBinding](#serverBinding())()` |  |
	| `static akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[serverConnection](#serverConnection())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### NoOpTelemetry
		
		
		
		```
		public NoOpTelemetry()
		```

	- ### Method Detail
	
	
	
		- #### client
		
		
		
		```
		public static akka.stream.scaladsl.BidiFlow<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed> client()
		```
		- #### serverBinding
		
		
		
		```
		public static akka.stream.scaladsl.Flow<akka.stream.scaladsl.Tcp.IncomingConnection,​akka.stream.scaladsl.Tcp.IncomingConnection,​akka.NotUsed> serverBinding()
		```
		- #### serverConnection
		
		
		
		```
		public static akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.NotUsed> serverConnection()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/NoOpTelemetry.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/NoOpTelemetry.html)*