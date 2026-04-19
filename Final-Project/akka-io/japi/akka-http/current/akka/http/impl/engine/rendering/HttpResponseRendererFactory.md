---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:32:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/HttpResponseRendererFactory.html
title: HttpResponseRendererFactory
---

# HttpResponseRendererFactory

## Content

Package [akka.http.impl.engine.rendering](package-summary.html)
## Class HttpResponseRendererFactory

- java.lang.Object
- - akka.http.impl.engine.rendering.HttpResponseRendererFactory

- ---

```
public class HttpResponseRendererFactory
extends java.lang.Object
```

INTERNAL API

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `class` | `[HttpResponseRendererFactory.CloseConnection](HttpResponseRendererFactory.CloseConnection.html "class in akka.http.impl.engine.rendering")` |  |
	| `class` | `[HttpResponseRendererFactory.CloseConnection$](HttpResponseRendererFactory.CloseConnection$.html "class in akka.http.impl.engine.rendering")` |  |
	| `static interface` | `[HttpResponseRendererFactory.CloseMode](HttpResponseRendererFactory.CloseMode.html "interface in akka.http.impl.engine.rendering")` |  |
	| `class` | `[HttpResponseRendererFactory.DontClose](HttpResponseRendererFactory.DontClose.html "class in akka.http.impl.engine.rendering")` |  |
	| `class` | `[HttpResponseRendererFactory.DontClose$](HttpResponseRendererFactory.DontClose$.html "class in akka.http.impl.engine.rendering")` |  |
	| `class` | `[HttpResponseRendererFactory.HttpResponseRenderer](HttpResponseRendererFactory.HttpResponseRenderer.html "class in akka.http.impl.engine.rendering")` |  |
	| `class` | `[HttpResponseRendererFactory.HttpResponseRenderer$](HttpResponseRendererFactory.HttpResponseRenderer$.html "class in akka.http.impl.engine.rendering")` |  |
	| `class` | `[HttpResponseRendererFactory.SwitchToOtherProtocol](HttpResponseRendererFactory.SwitchToOtherProtocol.html "class in akka.http.impl.engine.rendering")` |  |
	| `class` | `[HttpResponseRendererFactory.SwitchToOtherProtocol$](HttpResponseRendererFactory.SwitchToOtherProtocol$.html "class in akka.http.impl.engine.rendering")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpResponseRendererFactory](#%3Cinit%3E(scala.Option,int,akka.event.LoggingAdapter,akka.http.impl.engine.rendering.DateHeaderRendering))​(scala.Option<[Server](../../../scaladsl/model/headers/Server.html "class in akka.http.scaladsl.model.headers")> serverHeader,  int responseHeaderSizeHint,  akka.event.LoggingAdapter log,  [DateHeaderRendering](DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") dateHeaderRendering)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[HttpResponseRendererFactory.CloseConnection$](HttpResponseRendererFactory.CloseConnection$.html "class in akka.http.impl.engine.rendering")` | `[CloseConnection](#CloseConnection())()` |  |
	| `[HttpResponseRendererFactory.DontClose$](HttpResponseRendererFactory.DontClose$.html "class in akka.http.impl.engine.rendering")` | `[DontClose](#DontClose())()` |  |
	| `[HttpResponseRendererFactory.HttpResponseRenderer$](HttpResponseRendererFactory.HttpResponseRenderer$.html "class in akka.http.impl.engine.rendering")` | `[HttpResponseRenderer](#HttpResponseRenderer())()` |  |
	| `akka.stream.scaladsl.Flow<[ResponseRenderingContext](ResponseRenderingContext.html "class in akka.http.impl.engine.rendering"),​[ResponseRenderingOutput](ResponseRenderingOutput.html "interface in akka.http.impl.engine.rendering"),​akka.NotUsed>` | `[renderer](#renderer())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpResponseRendererFactory
		
		
		
		```
		public HttpResponseRendererFactory​(scala.Option<[Server](../../../scaladsl/model/headers/Server.html "class in akka.http.scaladsl.model.headers")> serverHeader,
		                                   int responseHeaderSizeHint,
		                                   akka.event.LoggingAdapter log,
		                                   [DateHeaderRendering](DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") dateHeaderRendering)
		```

	- ### Method Detail
	
	
	
		- #### CloseConnection
		
		
		
		```
		public [HttpResponseRendererFactory.CloseConnection$](HttpResponseRendererFactory.CloseConnection$.html "class in akka.http.impl.engine.rendering") CloseConnection()
		```
		- #### DontClose
		
		
		
		```
		public [HttpResponseRendererFactory.DontClose$](HttpResponseRendererFactory.DontClose$.html "class in akka.http.impl.engine.rendering") DontClose()
		```
		- #### HttpResponseRenderer
		
		
		
		```
		public [HttpResponseRendererFactory.HttpResponseRenderer$](HttpResponseRendererFactory.HttpResponseRenderer$.html "class in akka.http.impl.engine.rendering") HttpResponseRenderer()
		```
		- #### renderer
		
		
		
		```
		public akka.stream.scaladsl.Flow<[ResponseRenderingContext](ResponseRenderingContext.html "class in akka.http.impl.engine.rendering"),​[ResponseRenderingOutput](ResponseRenderingOutput.html "interface in akka.http.impl.engine.rendering"),​akka.NotUsed> renderer()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/DateHeaderRendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/HttpResponseRendererFactory.CloseConnection$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/HttpResponseRendererFactory.CloseConnection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/HttpResponseRendererFactory.CloseMode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/HttpResponseRendererFactory.DontClose$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/HttpResponseRendererFactory.DontClose.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/HttpResponseRendererFactory.HttpResponseRenderer$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/HttpResponseRendererFactory.HttpResponseRenderer.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/HttpResponseRendererFactory.SwitchToOtherProtocol$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/HttpResponseRendererFactory.SwitchToOtherProtocol.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/ResponseRenderingContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/ResponseRenderingOutput.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Server.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/HttpResponseRendererFactory.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/HttpResponseRendererFactory.html)*