---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/RenderSupport$.html
title: RenderSupport$
---

# RenderSupport$

## Content

Package [akka.http.impl.engine.rendering](package-summary.html)
## Class RenderSupport$

- java.lang.Object
- - akka.http.impl.engine.rendering.RenderSupport$

- ---

```
public class RenderSupport$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RenderSupport$](RenderSupport$.html "class in akka.http.impl.engine.rendering")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RenderSupport$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T,​Mat>akka.stream.scaladsl.Source<T,​Mat>` | `[CancelSecond](#CancelSecond(akka.stream.scaladsl.Source,akka.stream.scaladsl.Source))​(akka.stream.scaladsl.Source<T,​Mat> first,  akka.stream.scaladsl.Source<T,​java.lang.Object> second)` |  |
	| `byte[]` | `[ChunkedBytes](#ChunkedBytes())()` |  |
	| `byte[]` | `[CloseBytes](#CloseBytes())()` |  |
	| `byte[]` | `[ContentLengthBytes](#ContentLengthBytes())()` |  |
	| `byte[]` | `[CrLf](#CrLf())()` |  |
	| `akka.util.ByteString` | `[defaultLastChunkBytes](#defaultLastChunkBytes())()` |  |
	| `byte[]` | `[DefaultStatusLineBytes](#DefaultStatusLineBytes())()` |  |
	| `byte[]` | `[KeepAliveBytes](#KeepAliveBytes())()` |  |
	| `[Rendering](../../util/Rendering.html "interface in akka.http.impl.util")` | `[renderEntityContentType](#renderEntityContentType(akka.http.impl.util.Rendering,akka.http.scaladsl.model.HttpEntity))​([Rendering](../../util/Rendering.html "interface in akka.http.impl.util") r,  [HttpEntity](../../../scaladsl/model/HttpEntity.html "interface in akka.http.scaladsl.model") entity)` |  |
	| `byte[]` | `[StatusLineStartBytes](#StatusLineStartBytes())()` |  |
	| `void` | `[suppressionWarning](#suppressionWarning(akka.event.LoggingAdapter,akka.http.scaladsl.model.HttpHeader,java.lang.String))​(akka.event.LoggingAdapter log,  [HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model") h,  java.lang.String msg)` |  |
	| `[Renderer](../../util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")>>` | `[trailerRenderer](#trailerRenderer())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RenderSupport$](RenderSupport$.html "class in akka.http.impl.engine.rendering") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RenderSupport$
		
		
		
		```
		public RenderSupport$()
		```

	- ### Method Detail
	
	
	
		- #### DefaultStatusLineBytes
		
		
		
		```
		public byte[] DefaultStatusLineBytes()
		```
		- #### StatusLineStartBytes
		
		
		
		```
		public byte[] StatusLineStartBytes()
		```
		- #### ChunkedBytes
		
		
		
		```
		public byte[] ChunkedBytes()
		```
		- #### KeepAliveBytes
		
		
		
		```
		public byte[] KeepAliveBytes()
		```
		- #### CloseBytes
		
		
		
		```
		public byte[] CloseBytes()
		```
		- #### CrLf
		
		
		
		```
		public byte[] CrLf()
		```
		- #### ContentLengthBytes
		
		
		
		```
		public byte[] ContentLengthBytes()
		```
		- #### trailerRenderer
		
		
		
		```
		public [Renderer](../../util/Renderer.html "interface in akka.http.impl.util")<scala.collection.immutable.Iterable<[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")>> trailerRenderer()
		```
		- #### defaultLastChunkBytes
		
		
		
		```
		public akka.util.ByteString defaultLastChunkBytes()
		```
		- #### CancelSecond
		
		
		
		```
		public <T,​Mat> akka.stream.scaladsl.Source<T,​Mat> CancelSecond​(akka.stream.scaladsl.Source<T,​Mat> first,
		                                                                           akka.stream.scaladsl.Source<T,​java.lang.Object> second)
		```
		- #### renderEntityContentType
		
		
		
		```
		public [Rendering](../../util/Rendering.html "interface in akka.http.impl.util") renderEntityContentType​([Rendering](../../util/Rendering.html "interface in akka.http.impl.util") r,
		                                         [HttpEntity](../../../scaladsl/model/HttpEntity.html "interface in akka.http.scaladsl.model") entity)
		```
		- #### suppressionWarning
		
		
		
		```
		public void suppressionWarning​(akka.event.LoggingAdapter log,
		                               [HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model") h,
		                               java.lang.String msg)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/RenderSupport$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Renderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/util/Rendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpEntity.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/RenderSupport$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/RenderSupport$.html)*