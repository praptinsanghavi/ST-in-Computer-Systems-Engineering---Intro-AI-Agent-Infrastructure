---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/RequestRendering.html
title: RequestRendering
---

# RequestRendering

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class RequestRendering

- java.lang.Object
- - [akka.http.impl.engine.http2\.MessageRendering](MessageRendering.html "class in akka.http.impl.engine.http2")\<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")\>
	- - akka.http.impl.engine.http2\.RequestRendering

- All Implemented Interfaces:
`scala.Function1<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2")>`

---

```
public class RequestRendering
extends [MessageRendering](MessageRendering.html "class in akka.http.impl.engine.http2")<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")>
```

INTERNAL API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RequestRendering](#%3Cinit%3E(akka.http.scaladsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter))​([ClientConnectionSettings](../../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected [DateHeaderRendering](../rendering/DateHeaderRendering.html "interface in akka.http.impl.engine.rendering")` | `[dateHeaderRendering](#dateHeaderRendering())()` |  |
	| `protected scala.collection.immutable.VectorBuilder<scala.Tuple2<java.lang.String,​java.lang.String>>` | `[initialHeaderPairs](#initialHeaderPairs(akka.http.scaladsl.model.HttpRequest))​([HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model") request)` |  |
	| `akka.event.LoggingAdapter` | `[log](#log())()` |  |
	| `protected int` | `[nextStreamId](#nextStreamId(akka.http.scaladsl.model.HttpRequest))​([HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model") r)` |  |
	| `scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>>` | `[peerIdHeader](#peerIdHeader())()` |  |
	
	
		- ### Methods inherited from class akka.http.impl.engine.http2\.[MessageRendering](MessageRendering.html "class in akka.http.impl.engine.http2")
		
		
		`[apply](MessageRendering.html#apply(R))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Function1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose, toString`

- - ### Constructor Detail
	
	
	
		- #### RequestRendering
		
		
		
		```
		public RequestRendering​([ClientConnectionSettings](../../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,
		                        akka.event.LoggingAdapter log)
		```

	- ### Method Detail
	
	
	
		- #### dateHeaderRendering
		
		
		
		```
		protected [DateHeaderRendering](../rendering/DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") dateHeaderRendering()
		```
		
		
		Specified by:
		`[dateHeaderRendering](MessageRendering.html#dateHeaderRendering())` in class `[MessageRendering](MessageRendering.html "class in akka.http.impl.engine.http2")<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")>`
		- #### initialHeaderPairs
		
		
		
		```
		protected scala.collection.immutable.VectorBuilder<scala.Tuple2<java.lang.String,​java.lang.String>> initialHeaderPairs​([HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model") request)
		```
		
		
		Specified by:
		`[initialHeaderPairs](MessageRendering.html#initialHeaderPairs(R))` in class `[MessageRendering](MessageRendering.html "class in akka.http.impl.engine.http2")<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")>`
		- #### log
		
		
		
		```
		public akka.event.LoggingAdapter log()
		```
		
		
		Specified by:
		`[log](MessageRendering.html#log())` in class `[MessageRendering](MessageRendering.html "class in akka.http.impl.engine.http2")<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")>`
		- #### nextStreamId
		
		
		
		```
		protected int nextStreamId​([HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model") r)
		```
		
		
		Specified by:
		`[nextStreamId](MessageRendering.html#nextStreamId(R))` in class `[MessageRendering](MessageRendering.html "class in akka.http.impl.engine.http2")<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")>`
		- #### peerIdHeader
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>> peerIdHeader()
		```
		
		
		Specified by:
		`[peerIdHeader](MessageRendering.html#peerIdHeader())` in class `[MessageRendering](MessageRendering.html "class in akka.http.impl.engine.http2")<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2SubStream.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/MessageRendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/DateHeaderRendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/RequestRendering.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/RequestRendering.html)*