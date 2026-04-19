---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpServerBluePrint$.html
title: HttpServerBluePrint$
---

# HttpServerBluePrint$

## Content

Package [akka.http.impl.engine.server](package-summary.html)
## Class HttpServerBluePrint$

- java.lang.Object
- - akka.http.impl.engine.server.HttpServerBluePrint$

- ---

```
public class HttpServerBluePrint$
extends java.lang.Object
```

INTERNAL API
 
 HTTP pipeline setup (without the underlying SSL/TLS (un)wrapping and the websocket switch):
 

 \+\-\-\-\-\-\-\-\-\-\-\+ \+\-\-\-\-\-\-\-\-\-\-\-\-\-\+ \+\-\-\-\-\-\-\-\-\-\-\-\-\-\+ \+\-\-\-\-\-\-\-\-\-\-\-\+
 HttpRequest \| \| Http\- \| request\- \| Request\- \| \| Request\- \| request\- \| ByteString
 \| \<\-\-\-\-\-\-\-\-\-\-\-\-\+ \<\-\-\-\-\-\-\-\-\-\-\+ Preparation \<\-\-\-\-\-\-\-\-\-\-\+ \<\-\-\-\-\-\-\-\-\-\-\-\-\-\+ Parsing \<\-\-\-\-\-\-\-\-\-\-\-
 \| \| \| Request \| \| Output \| \| Output \| \|
 \| \| \| \+\-\-\-\-\-\-\-\-\-\-\-\-\-\+ \| \| \+\-\-\-\-\-\-\-\-\-\-\-\+
 \| \| \| \| \|
 \| Application\- \| One2One\- \| \| controller\- \|
 \| Flow \| Bidi \| \| Stage \|
 \| \| \| \| \|
 \| \| \| \| \| \+\-\-\-\-\-\-\-\-\-\-\-\+
 \| HttpResponse \| \| HttpResponse \| \| Response\- \| renderer\- \| ByteString
 v \-\-\-\-\-\-\-\-\-\-\-\-\-\> \+\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\-\> \+\-\-\-\-\-\-\-\-\-\-\-\-\-\> Pipeline \+\-\-\-\-\-\-\-\-\-\-\>
 \| \| \| \| Rendering\- \| \|
 \+\-\-\-\-\-\-\-\-\-\-\+ \+\-\-\-\-\-\-\-\-\-\-\-\-\-\+ Context \+\-\-\-\-\-\-\-\-\-\-\-\+

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HttpServerBluePrint$](HttpServerBluePrint$.html "class in akka.http.impl.engine.server")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpServerBluePrint$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[apply](#apply(akka.http.scaladsl.settings.ServerSettings,akka.event.LoggingAdapter,boolean,akka.http.impl.engine.rendering.DateHeaderRendering))​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log,  boolean isSecureConnection,  [DateHeaderRendering](../rendering/DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") dateHeaderRendering)` |  |
	| `akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[ResponseRenderingContext](../rendering/ResponseRenderingContext.html "class in akka.http.impl.engine.rendering"),​[ParserOutput.RequestOutput](../parsing/ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing"),​[ParserOutput.RequestOutput](../parsing/ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing"),​akka.NotUsed>` | `[controller](#controller(akka.http.scaladsl.settings.ServerSettings,akka.event.LoggingAdapter))​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` |  |
	| `akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SessionBytes,​[ParserOutput.RequestOutput](../parsing/ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing"),​akka.NotUsed>` | `[parsing](#parsing(akka.http.scaladsl.settings.ServerSettings,akka.event.LoggingAdapter,boolean))​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log,  boolean isSecureConnection)` |  |
	| `akka.stream.scaladsl.BidiFlow<[ResponseRenderingContext](../rendering/ResponseRenderingContext.html "class in akka.http.impl.engine.rendering"),​[ResponseRenderingOutput](../rendering/ResponseRenderingOutput.html "interface in akka.http.impl.engine.rendering"),​akka.stream.TLSProtocol.SessionBytes,​[ParserOutput.RequestOutput](../parsing/ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing"),​akka.NotUsed>` | `[parsingRendering](#parsingRendering(akka.http.scaladsl.settings.ServerSettings,akka.event.LoggingAdapter,boolean,akka.http.impl.engine.rendering.DateHeaderRendering))​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log,  boolean isSecureConnection,  [DateHeaderRendering](../rendering/DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") dateHeaderRendering)` |  |
	| `akka.stream.scaladsl.Flow<[ResponseRenderingContext](../rendering/ResponseRenderingContext.html "class in akka.http.impl.engine.rendering"),​[ResponseRenderingOutput](../rendering/ResponseRenderingOutput.html "interface in akka.http.impl.engine.rendering"),​akka.NotUsed>` | `[rendering](#rendering(akka.http.scaladsl.settings.ServerSettings,akka.event.LoggingAdapter,akka.http.impl.engine.rendering.DateHeaderRendering))​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log,  [DateHeaderRendering](../rendering/DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") dateHeaderRendering)` |  |
	| `akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[ParserOutput.RequestOutput](../parsing/ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[requestPreparation](#requestPreparation(akka.http.scaladsl.settings.ServerSettings))​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings)` |  |
	| `akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[requestTimeoutSupport](#requestTimeoutSupport(scala.concurrent.duration.Duration,akka.event.LoggingAdapter))​(scala.concurrent.duration.Duration timeout,  akka.event.LoggingAdapter log)` |  |
	| `akka.stream.scaladsl.BidiFlow<akka.util.ByteString,​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SessionBytes,​akka.NotUsed>` | `[tlsSupport](#tlsSupport())()` |  |
	| `akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[userHandlerGuard](#userHandlerGuard(int))​(int pipeliningLimit)` | Ensures that the user handler  \- produces exactly one response per request  \- has not more than `pipeliningLimit` responses outstanding |
	| `akka.stream.scaladsl.BidiFlow<[ResponseRenderingOutput](../rendering/ResponseRenderingOutput.html "interface in akka.http.impl.engine.rendering"),​akka.util.ByteString,​akka.stream.TLSProtocol.SessionBytes,​akka.stream.TLSProtocol.SessionBytes,​akka.NotUsed>` | `[websocketSupport](#websocketSupport(akka.http.scaladsl.settings.ServerSettings,akka.event.LoggingAdapter))​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [HttpServerBluePrint$](HttpServerBluePrint$.html "class in akka.http.impl.engine.server") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HttpServerBluePrint$
		
		
		
		```
		public HttpServerBluePrint$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.NotUsed> apply​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                                                                       akka.event.LoggingAdapter log,
		                                                                                                                                                                                       boolean isSecureConnection,
		                                                                                                                                                                                       [DateHeaderRendering](../rendering/DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") dateHeaderRendering)
		```
		- #### tlsSupport
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<akka.util.ByteString,​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SessionBytes,​akka.NotUsed> tlsSupport()
		```
		- #### websocketSupport
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[ResponseRenderingOutput](../rendering/ResponseRenderingOutput.html "interface in akka.http.impl.engine.rendering"),​akka.util.ByteString,​akka.stream.TLSProtocol.SessionBytes,​akka.stream.TLSProtocol.SessionBytes,​akka.NotUsed> websocketSupport​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                                                                                                   akka.event.LoggingAdapter log)
		```
		- #### parsingRendering
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[ResponseRenderingContext](../rendering/ResponseRenderingContext.html "class in akka.http.impl.engine.rendering"),​[ResponseRenderingOutput](../rendering/ResponseRenderingOutput.html "interface in akka.http.impl.engine.rendering"),​akka.stream.TLSProtocol.SessionBytes,​[ParserOutput.RequestOutput](../parsing/ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing"),​akka.NotUsed> parsingRendering​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                                                                                             akka.event.LoggingAdapter log,
		                                                                                                                                                                                                             boolean isSecureConnection,
		                                                                                                                                                                                                             [DateHeaderRendering](../rendering/DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") dateHeaderRendering)
		```
		- #### controller
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[ResponseRenderingContext](../rendering/ResponseRenderingContext.html "class in akka.http.impl.engine.rendering"),​[ParserOutput.RequestOutput](../parsing/ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing"),​[ParserOutput.RequestOutput](../parsing/ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing"),​akka.NotUsed> controller​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                                                                  akka.event.LoggingAdapter log)
		```
		- #### requestPreparation
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[ParserOutput.RequestOutput](../parsing/ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.NotUsed> requestPreparation​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings)
		```
		- #### requestTimeoutSupport
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.NotUsed> requestTimeoutSupport​(scala.concurrent.duration.Duration timeout,
		                                                                                                                                                   akka.event.LoggingAdapter log)
		```
		- #### parsing
		
		
		
		```
		public akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SessionBytes,​[ParserOutput.RequestOutput](../parsing/ParserOutput.RequestOutput.html "interface in akka.http.impl.engine.parsing"),​akka.NotUsed> parsing​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                   akka.event.LoggingAdapter log,
		                                                                                                                                   boolean isSecureConnection)
		```
		- #### rendering
		
		
		
		```
		public akka.stream.scaladsl.Flow<[ResponseRenderingContext](../rendering/ResponseRenderingContext.html "class in akka.http.impl.engine.rendering"),​[ResponseRenderingOutput](../rendering/ResponseRenderingOutput.html "interface in akka.http.impl.engine.rendering"),​akka.NotUsed> rendering​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                      akka.event.LoggingAdapter log,
		                                                                                                                      [DateHeaderRendering](../rendering/DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") dateHeaderRendering)
		```
		- #### userHandlerGuard
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.NotUsed> userHandlerGuard​(int pipeliningLimit)
		```
		
		Ensures that the user handler
		 \- produces exactly one response per request
		 \- has not more than `pipeliningLimit` responses outstanding
		
		Parameters:
		`pipeliningLimit` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/ParserOutput.RequestOutput.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/DateHeaderRendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/ResponseRenderingContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/ResponseRenderingOutput.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpServerBluePrint$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpServerBluePrint$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/HttpServerBluePrint$.html)*