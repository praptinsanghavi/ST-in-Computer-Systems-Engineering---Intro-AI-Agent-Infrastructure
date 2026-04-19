---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/MessageRendering.html
title: MessageRendering
---

# MessageRendering

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class MessageRendering\<R extends [HttpMessage](../../../scaladsl/model/HttpMessage.html "interface in akka.http.scaladsl.model")\>

- java.lang.Object
- - akka.http.impl.engine.http2\.MessageRendering\<R\>

- All Implemented Interfaces:
`scala.Function1<R,​[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2")>`

Direct Known Subclasses:
`[RequestRendering](RequestRendering.html "class in akka.http.impl.engine.http2")`, `[ResponseRendering](ResponseRendering.html "class in akka.http.impl.engine.http2")`

---

```
public abstract class MessageRendering<R extends [HttpMessage](../../../scaladsl/model/HttpMessage.html "interface in akka.http.scaladsl.model")>
extends java.lang.Object
implements scala.Function1<R,​[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2")>
```

INTERNAL API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageRendering](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2")` | `[apply](#apply(R))​([R](MessageRendering.html "type parameter in MessageRendering") r)` |  |
	| `protected abstract [DateHeaderRendering](../rendering/DateHeaderRendering.html "interface in akka.http.impl.engine.rendering")` | `[dateHeaderRendering](#dateHeaderRendering())()` |  |
	| `protected abstract scala.collection.immutable.VectorBuilder<scala.Tuple2<java.lang.String,​java.lang.String>>` | `[initialHeaderPairs](#initialHeaderPairs(R))​([R](MessageRendering.html "type parameter in MessageRendering") r)` |  |
	| `protected abstract akka.event.LoggingAdapter` | `[log](#log())()` |  |
	| `protected abstract int` | `[nextStreamId](#nextStreamId(R))​([R](MessageRendering.html "type parameter in MessageRendering") r)` |  |
	| `protected abstract scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>>` | `[peerIdHeader](#peerIdHeader())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Function1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose, toString`

- - ### Constructor Detail
	
	
	
		- #### MessageRendering
		
		
		
		```
		public MessageRendering()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2") apply​([R](MessageRendering.html "type parameter in MessageRendering") r)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[R](MessageRendering.html "type parameter in MessageRendering") extends [HttpMessage](../../../scaladsl/model/HttpMessage.html "interface in akka.http.scaladsl.model"),​[Http2SubStream](Http2SubStream.html "class in akka.http.impl.engine.http2")>`
		- #### dateHeaderRendering
		
		
		
		```
		protected abstract [DateHeaderRendering](../rendering/DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") dateHeaderRendering()
		```
		- #### initialHeaderPairs
		
		
		
		```
		protected abstract scala.collection.immutable.VectorBuilder<scala.Tuple2<java.lang.String,​java.lang.String>> initialHeaderPairs​([R](MessageRendering.html "type parameter in MessageRendering") r)
		```
		- #### log
		
		
		
		```
		protected abstract akka.event.LoggingAdapter log()
		```
		- #### nextStreamId
		
		
		
		```
		protected abstract int nextStreamId​([R](MessageRendering.html "type parameter in MessageRendering") r)
		```
		- #### peerIdHeader
		
		
		
		```
		protected abstract scala.Option<scala.Tuple2<java.lang.String,​java.lang.String>> peerIdHeader()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2SubStream.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/MessageRendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/RequestRendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/ResponseRendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/DateHeaderRendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpMessage.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/MessageRendering.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/MessageRendering.html)*