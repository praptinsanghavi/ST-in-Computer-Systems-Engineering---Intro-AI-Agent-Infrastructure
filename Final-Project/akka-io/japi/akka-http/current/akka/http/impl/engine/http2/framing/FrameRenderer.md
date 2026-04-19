---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:30:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/framing/FrameRenderer.html
title: FrameRenderer
---

# FrameRenderer

## Content

Package [akka.http.impl.engine.http2\.framing](package-summary.html)
## Class FrameRenderer

- java.lang.Object
- - akka.http.impl.engine.http2\.framing.FrameRenderer

- ---

```
public class FrameRenderer
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FrameRenderer](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static java.nio.ByteOrder` | `[byteOrder](#byteOrder())()` |  |
	| `static akka.util.ByteString` | `[render](#render(akka.http.impl.engine.http2.FrameEvent))​([FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2") frame)` |  |
	| `static akka.util.ByteString` | `[renderFrame](#renderFrame(akka.http.impl.engine.http2.Http2Protocol.FrameType,akka.http.impl.engine.http2.ByteFlag,int,akka.util.ByteString))​([Http2Protocol.FrameType](../Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") tpe,  [ByteFlag](../ByteFlag.html "class in akka.http.impl.engine.http2") flags,  int streamId,  akka.util.ByteString payload)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FrameRenderer
		
		
		
		```
		public FrameRenderer()
		```

	- ### Method Detail
	
	
	
		- #### byteOrder
		
		
		
		```
		public static java.nio.ByteOrder byteOrder()
		```
		- #### render
		
		
		
		```
		public static akka.util.ByteString render​([FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2") frame)
		```
		- #### renderFrame
		
		
		
		```
		public static akka.util.ByteString renderFrame​([Http2Protocol.FrameType](../Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") tpe,
		                                               [ByteFlag](../ByteFlag.html "class in akka.http.impl.engine.http2") flags,
		                                               int streamId,
		                                               akka.util.ByteString payload)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/ByteFlag.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol.FrameType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/framing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/framing/FrameRenderer.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/framing/FrameRenderer.html)*