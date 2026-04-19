---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/HttpMessageRendering.html
title: HttpMessageRendering
---

# HttpMessageRendering

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class HttpMessageRendering

- java.lang.Object
- - akka.http.impl.engine.http2\.HttpMessageRendering

- ---

```
public class HttpMessageRendering
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpMessageRendering](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static void` | `[addContentHeaders](#addContentHeaders(scala.collection.immutable.VectorBuilder,akka.http.scaladsl.model.HttpEntity))​(scala.collection.immutable.VectorBuilder<scala.Tuple2<java.lang.String,​java.lang.String>> headerPairs,  [HttpEntity](../../../scaladsl/model/HttpEntity.html "interface in akka.http.scaladsl.model") entity)` | Mutates `headerPairs` adding headers related to content (type and length). |
	| `static scala.collection.immutable.Seq<scala.Tuple2<java.lang.String,​java.lang.String>>` | `[renderHeaders](#renderHeaders(scala.collection.immutable.Seq,akka.event.LoggingAdapter,boolean,boolean,akka.http.impl.engine.rendering.DateHeaderRendering))​(scala.collection.immutable.Seq<[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")> headers,  akka.event.LoggingAdapter log,  boolean isServer,  boolean shouldRenderAutoHeaders,  [DateHeaderRendering](../rendering/DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") dateHeaderRendering)` |  |
	| `static void` | `[renderHeaders](#renderHeaders(scala.collection.immutable.Seq,scala.collection.immutable.VectorBuilder,scala.Option,akka.event.LoggingAdapter,boolean,boolean,akka.http.impl.engine.rendering.DateHeaderRendering))​(scala.collection.immutable.Seq<[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")> headersSeq,  scala.collection.immutable.VectorBuilder<scala.Tuple2<java.lang.String,​java.lang.String>> headerPairs,  scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>> peerIdHeader,  akka.event.LoggingAdapter log,  boolean isServer,  boolean shouldRenderAutoHeaders,  [DateHeaderRendering](../rendering/DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") dateHeaderRendering)` | Mutates `headerPairs` adding any valid header from `headersSeq`. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpMessageRendering
		
		
		
		```
		public HttpMessageRendering()
		```

	- ### Method Detail
	
	
	
		- #### addContentHeaders
		
		
		
		```
		public static void addContentHeaders​(scala.collection.immutable.VectorBuilder<scala.Tuple2<java.lang.String,​java.lang.String>> headerPairs,
		                                     [HttpEntity](../../../scaladsl/model/HttpEntity.html "interface in akka.http.scaladsl.model") entity)
		```
		
		Mutates `headerPairs` adding headers related to content (type and length).
		
		Parameters:
		`headerPairs` \- (undocumented)
		`entity` \- (undocumented)
		- #### renderHeaders
		
		
		
		```
		public static scala.collection.immutable.Seq<scala.Tuple2<java.lang.String,​java.lang.String>> renderHeaders​(scala.collection.immutable.Seq<[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")> headers,
		                                                                                                                  akka.event.LoggingAdapter log,
		                                                                                                                  boolean isServer,
		                                                                                                                  boolean shouldRenderAutoHeaders,
		                                                                                                                  [DateHeaderRendering](../rendering/DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") dateHeaderRendering)
		```
		- #### renderHeaders
		
		
		
		```
		public static void renderHeaders​(scala.collection.immutable.Seq<[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")> headersSeq,
		                                 scala.collection.immutable.VectorBuilder<scala.Tuple2<java.lang.String,​java.lang.String>> headerPairs,
		                                 scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>> peerIdHeader,
		                                 akka.event.LoggingAdapter log,
		                                 boolean isServer,
		                                 boolean shouldRenderAutoHeaders,
		                                 [DateHeaderRendering](../rendering/DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") dateHeaderRendering)
		```
		
		Mutates `headerPairs` adding any valid header from `headersSeq`.
		
		Parameters:
		`peerIdHeader` \- a header providing extra information (e.g. vendor and version) about the
		 peer. For example, a User\-Agent on the client or a Server header on the server.
		`headersSeq` \- (undocumented)
		`headerPairs` \- (undocumented)
		`log` \- (undocumented)
		`isServer` \- (undocumented)
		`shouldRenderAutoHeaders` \- (undocumented)
		`dateHeaderRendering` \- (undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/DateHeaderRendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/HttpMessageRendering.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/HttpMessageRendering.html)*