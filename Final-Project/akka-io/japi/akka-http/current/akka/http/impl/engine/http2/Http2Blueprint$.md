---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Blueprint$.html
title: Http2Blueprint$
---

# Http2Blueprint$

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class Http2Blueprint$

- java.lang.Object
- - akka.http.impl.engine.http2\.Http2Blueprint$

- ---

```
public class Http2Blueprint$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Http2Blueprint$](Http2Blueprint$.html "class in akka.http.impl.engine.http2")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Http2Blueprint$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.BidiFlow<[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2"),​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")>` | `[clientDemux](#clientDemux(akka.http.scaladsl.settings.Http2ClientSettings,akka.http.impl.engine.parsing.HttpHeaderParser))​([Http2ClientSettings](../../../scaladsl/settings/Http2ClientSettings.html "interface in akka.http.scaladsl.settings") settings,  [HttpHeaderParser](../parsing/HttpHeaderParser.html "class in akka.http.impl.engine.parsing") masterHttpHeaderParser)` | Creates substreams for every stream and manages stream state machines  and handles priorization (TODO: later) |
	| `akka.stream.scaladsl.BidiFlow<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.util.ByteString,​akka.util.ByteString,​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[clientStack](#clientStack(akka.http.scaladsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter,akka.http.impl.engine.http2.TelemetrySpi))​([ClientConnectionSettings](../../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log,  [TelemetrySpi](TelemetrySpi.html "interface in akka.http.impl.engine.http2") telemetry)` |  |
	| `akka.stream.scaladsl.BidiFlow<akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed>` | `[errorHandling](#errorHandling(akka.event.LoggingAdapter))​(akka.event.LoggingAdapter log)` |  |
	| `akka.stream.scaladsl.BidiFlow<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​akka.util.ByteString,​akka.util.ByteString,​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​akka.NotUsed>` | `[framing](#framing(akka.http.scaladsl.settings.Http2ServerSettings,akka.event.LoggingAdapter))​([Http2ServerSettings](../../../scaladsl/settings/Http2ServerSettings.html "interface in akka.http.scaladsl.settings") http2ServerSettings,  akka.event.LoggingAdapter log)` |  |
	| `akka.stream.scaladsl.BidiFlow<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​akka.util.ByteString,​akka.util.ByteString,​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​akka.NotUsed>` | `[framingClient](#framingClient(akka.event.LoggingAdapter))​(akka.event.LoggingAdapter log)` |  |
	| `akka.stream.scaladsl.Flow<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[handleWithStreamIdHeader](#handleWithStreamIdHeader(int,scala.Function1,scala.concurrent.ExecutionContext))​(int parallelism,  scala.Function1<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")>> handler,  scala.concurrent.ExecutionContext ec)` | Returns a flow that handles `parallelism` requests in parallel, automatically keeping track of the  Http2StreamIdHeader between request and responses. |
	| `akka.stream.scaladsl.BidiFlow<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​akka.NotUsed>` | `[hpackCoding](#hpackCoding(akka.http.impl.engine.parsing.HttpHeaderParser,akka.http.scaladsl.settings.ParserSettings))​([HttpHeaderParser](../parsing/HttpHeaderParser.html "class in akka.http.impl.engine.parsing") masterHttpHeaderParser,  [ParserSettings](../../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings)` | Runs hpack encoding and decoding. |
	| `akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2"),​[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[httpLayer](#httpLayer(akka.http.scaladsl.settings.ServerSettings,akka.event.LoggingAdapter,akka.http.impl.engine.rendering.DateHeaderRendering))​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log,  [DateHeaderRendering](../rendering/DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") dateHeaderRendering)` | Translation between substream frames and Http messages (both directions) |
	| `akka.stream.scaladsl.BidiFlow<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2"),​[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[httpLayerClient](#httpLayerClient(akka.http.impl.engine.parsing.HttpHeaderParser,akka.http.scaladsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter))​([HttpHeaderParser](../parsing/HttpHeaderParser.html "class in akka.http.impl.engine.parsing") masterHttpHeaderParser,  [ClientConnectionSettings](../../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` |  |
	| `akka.stream.scaladsl.BidiFlow<akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed>` | `[idleTimeoutIfConfigured](#idleTimeoutIfConfigured(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration timeout)` |  |
	| `void` | `[logParsingError](#logParsingError(akka.http.scaladsl.model.ErrorInfo,akka.event.LoggingAdapter,akka.http.scaladsl.settings.ParserSettings.ErrorLoggingVerbosity))​([ErrorInfo](../../../scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model") info,  akka.event.LoggingAdapter log,  [ParserSettings.ErrorLoggingVerbosity](../../../scaladsl/settings/ParserSettings.ErrorLoggingVerbosity.html "interface in akka.http.scaladsl.settings") setting)` |  |
	| `akka.stream.scaladsl.BidiFlow<[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2"),​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")>` | `[serverDemux](#serverDemux(akka.http.scaladsl.settings.Http2ServerSettings,scala.collection.immutable.Seq,boolean,scala.Option))​([Http2ServerSettings](../../../scaladsl/settings/Http2ServerSettings.html "interface in akka.http.scaladsl.settings") settings,  scala.collection.immutable.Seq<[FrameEvent.Setting](FrameEvent.Setting.html "class in akka.http.impl.engine.http2")> initialDemuxerSettings,  boolean upgraded,  scala.Option<akka.event.LoggingAdapter> log)` | Creates substreams for every stream and manages stream state machines  and handles priorization (TODO: later) |
	| `akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.util.ByteString,​akka.util.ByteString,​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")>` | `[serverStack](#serverStack(akka.http.scaladsl.settings.ServerSettings,akka.event.LoggingAdapter,scala.collection.immutable.Seq,boolean,akka.http.impl.engine.http2.TelemetrySpi,akka.http.impl.engine.rendering.DateHeaderRendering))​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log,  scala.collection.immutable.Seq<[FrameEvent.Setting](FrameEvent.Setting.html "class in akka.http.impl.engine.http2")> initialDemuxerSettings,  boolean upgraded,  [TelemetrySpi](TelemetrySpi.html "interface in akka.http.impl.engine.http2") telemetry,  [DateHeaderRendering](../rendering/DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") dateHeaderRendering)` |  |
	| `akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")>` | `[serverStackTls](#serverStackTls(akka.http.scaladsl.settings.ServerSettings,akka.event.LoggingAdapter,akka.http.impl.engine.http2.TelemetrySpi,akka.http.impl.engine.rendering.DateHeaderRendering))​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log,  [TelemetrySpi](TelemetrySpi.html "interface in akka.http.impl.engine.http2") telemetry,  [DateHeaderRendering](../rendering/DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") dateHeaderRendering)` |  |
	| `akka.stream.scaladsl.BidiFlow<akka.util.ByteString,​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​akka.util.ByteString,​akka.NotUsed>` | `[unwrapTls](#unwrapTls())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Http2Blueprint$](Http2Blueprint$.html "class in akka.http.impl.engine.http2") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Http2Blueprint$
		
		
		
		```
		public Http2Blueprint$()
		```

	- ### Method Detail
	
	
	
		- #### serverStackTls
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> serverStackTls​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                                                                                    akka.event.LoggingAdapter log,
		                                                                                                                                                                                                    [TelemetrySpi](TelemetrySpi.html "interface in akka.http.impl.engine.http2") telemetry,
		                                                                                                                                                                                                    [DateHeaderRendering](../rendering/DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") dateHeaderRendering)
		```
		- #### serverStack
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.util.ByteString,​akka.util.ByteString,​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> serverStack​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                                              akka.event.LoggingAdapter log,
		                                                                                                                                                              scala.collection.immutable.Seq<[FrameEvent.Setting](FrameEvent.Setting.html "class in akka.http.impl.engine.http2")> initialDemuxerSettings,
		                                                                                                                                                              boolean upgraded,
		                                                                                                                                                              [TelemetrySpi](TelemetrySpi.html "interface in akka.http.impl.engine.http2") telemetry,
		                                                                                                                                                              [DateHeaderRendering](../rendering/DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") dateHeaderRendering)
		```
		- #### clientStack
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.util.ByteString,​akka.util.ByteString,​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed> clientStack​([ClientConnectionSettings](../../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                                          akka.event.LoggingAdapter log,
		                                                                                                                                                          [TelemetrySpi](TelemetrySpi.html "interface in akka.http.impl.engine.http2") telemetry)
		```
		- #### httpLayerClient
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2"),​[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed> httpLayerClient​([HttpHeaderParser](../parsing/HttpHeaderParser.html "class in akka.http.impl.engine.parsing") masterHttpHeaderParser,
		                                                                                                                                                  [ClientConnectionSettings](../../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                                  akka.event.LoggingAdapter log)
		```
		- #### idleTimeoutIfConfigured
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> idleTimeoutIfConfigured​(scala.concurrent.duration.Duration timeout)
		```
		- #### errorHandling
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> errorHandling​(akka.event.LoggingAdapter log)
		```
		- #### framing
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​akka.util.ByteString,​akka.util.ByteString,​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​akka.NotUsed> framing​([Http2ServerSettings](../../../scaladsl/settings/Http2ServerSettings.html "interface in akka.http.scaladsl.settings") http2ServerSettings,
		                                                                                                                                                   akka.event.LoggingAdapter log)
		```
		- #### framingClient
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​akka.util.ByteString,​akka.util.ByteString,​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​akka.NotUsed> framingClient​(akka.event.LoggingAdapter log)
		```
		- #### hpackCoding
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​akka.NotUsed> hpackCoding​([HttpHeaderParser](../parsing/HttpHeaderParser.html "class in akka.http.impl.engine.parsing") masterHttpHeaderParser,
		                                                                                                                                   [ParserSettings](../../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings)
		```
		
		Runs hpack encoding and decoding. Incoming frames that are processed are HEADERS and CONTINUATION.
		 Outgoing frame is ParsedHeadersFrame.
		 Other frames are propagated unchanged.
		 
		 TODO: introduce another FrameEvent type that exclude HeadersFrame and ContinuationFrame from
		 reaching the higher\-level.
		
		
		
		Parameters:
		`masterHttpHeaderParser` \- (undocumented)
		`parserSettings` \- (undocumented)
		Returns:
		(undocumented)
		- #### serverDemux
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2"),​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> serverDemux​([Http2ServerSettings](../../../scaladsl/settings/Http2ServerSettings.html "interface in akka.http.scaladsl.settings") settings,
		                                                                                                                                               scala.collection.immutable.Seq<[FrameEvent.Setting](FrameEvent.Setting.html "class in akka.http.impl.engine.http2")> initialDemuxerSettings,
		                                                                                                                                               boolean upgraded,
		                                                                                                                                               scala.Option<akka.event.LoggingAdapter> log)
		```
		
		Creates substreams for every stream and manages stream state machines
		 and handles priorization (TODO: later)
		
		Parameters:
		`settings` \- (undocumented)
		`initialDemuxerSettings` \- (undocumented)
		`upgraded` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### clientDemux
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2"),​[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2"),​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> clientDemux​([Http2ClientSettings](../../../scaladsl/settings/Http2ClientSettings.html "interface in akka.http.scaladsl.settings") settings,
		                                                                                                                                               [HttpHeaderParser](../parsing/HttpHeaderParser.html "class in akka.http.impl.engine.parsing") masterHttpHeaderParser)
		```
		
		Creates substreams for every stream and manages stream state machines
		 and handles priorization (TODO: later)
		
		Parameters:
		`settings` \- (undocumented)
		`masterHttpHeaderParser` \- (undocumented)
		Returns:
		(undocumented)
		- #### httpLayer
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2"),​[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2"),​[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.NotUsed> httpLayer​([ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                            akka.event.LoggingAdapter log,
		                                                                                                                                            [DateHeaderRendering](../rendering/DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") dateHeaderRendering)
		```
		
		Translation between substream frames and Http messages (both directions)
		 
		 To make use of parallelism requests and responses need to be associated (other than by ordering), suggestion
		 is to add a special (virtual) header containing the streamId (or any other kind of token) is added to the HttRequest
		 that must be reproduced in an HttpResponse. This can be done automatically for the `bind` API but for
		 `bindFlow` the user needs to take of this manually.
		
		
		
		Parameters:
		`settings` \- (undocumented)
		`log` \- (undocumented)
		`dateHeaderRendering` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleWithStreamIdHeader
		
		
		
		```
		public akka.stream.scaladsl.Flow<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed> handleWithStreamIdHeader​(int parallelism,
		                                                                                                             scala.Function1<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")>> handler,
		                                                                                                             scala.concurrent.ExecutionContext ec)
		```
		
		Returns a flow that handles `parallelism` requests in parallel, automatically keeping track of the
		 Http2StreamIdHeader between request and responses.
		
		Parameters:
		`parallelism` \- (undocumented)
		`handler` \- (undocumented)
		`ec` \- (undocumented)
		Returns:
		(undocumented)
		- #### logParsingError
		
		
		
		```
		public void logParsingError​([ErrorInfo](../../../scaladsl/model/ErrorInfo.html "class in akka.http.scaladsl.model") info,
		                            akka.event.LoggingAdapter log,
		                            [ParserSettings.ErrorLoggingVerbosity](../../../scaladsl/settings/ParserSettings.ErrorLoggingVerbosity.html "interface in akka.http.scaladsl.settings") setting)
		```
		- #### unwrapTls
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<akka.util.ByteString,​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​akka.util.ByteString,​akka.NotUsed> unwrapTls()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.Setting.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Blueprint$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2SubStream.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/TelemetrySpi.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/parsing/HttpHeaderParser.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/DateHeaderRendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/ServerTerminator.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ErrorInfo.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ClientSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.ErrorLoggingVerbosity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Blueprint$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Blueprint$.html)*