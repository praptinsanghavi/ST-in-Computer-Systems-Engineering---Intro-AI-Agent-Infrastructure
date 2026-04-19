---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:30:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/framing/Http2FrameParsing$.html
title: Http2FrameParsing$
---

# Http2FrameParsing$

## Content

Package [akka.http.impl.engine.http2\.framing](package-summary.html)
## Class Http2FrameParsing$

- java.lang.Object
- - akka.http.impl.engine.http2\.framing.Http2FrameParsing$

- ---

```
public class Http2FrameParsing$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Http2FrameParsing$](Http2FrameParsing$.html "class in akka.http.impl.engine.http2.framing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Http2FrameParsing$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2")` | `[parseFrame](#parseFrame(akka.http.impl.engine.http2.Http2Protocol.FrameType,akka.http.impl.engine.http2.ByteFlag,int,akka.stream.impl.io.ByteStringParser.ByteReader,akka.event.LoggingAdapter))​([Http2Protocol.FrameType](../Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") tpe,  [ByteFlag](../ByteFlag.html "class in akka.http.impl.engine.http2") flags,  int streamId,  akka.stream.impl.io.ByteStringParser.ByteReader payload,  akka.event.LoggingAdapter log)` |  |
	| `scala.collection.immutable.Seq<[FrameEvent.Setting](../FrameEvent.Setting.html "class in akka.http.impl.engine.http2")>` | `[readSettings](#readSettings(akka.stream.impl.io.ByteStringParser.ByteReader,akka.event.LoggingAdapter))​(akka.stream.impl.io.ByteStringParser.ByteReader payload,  akka.event.LoggingAdapter log)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Http2FrameParsing$](Http2FrameParsing$.html "class in akka.http.impl.engine.http2.framing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Http2FrameParsing$
		
		
		
		```
		public Http2FrameParsing$()
		```

	- ### Method Detail
	
	
	
		- #### readSettings
		
		
		
		```
		public scala.collection.immutable.Seq<[FrameEvent.Setting](../FrameEvent.Setting.html "class in akka.http.impl.engine.http2")> readSettings​(akka.stream.impl.io.ByteStringParser.ByteReader payload,
		                                                                       akka.event.LoggingAdapter log)
		```
		- #### parseFrame
		
		
		
		```
		public [FrameEvent](../FrameEvent.html "interface in akka.http.impl.engine.http2") parseFrame​([Http2Protocol.FrameType](../Http2Protocol.FrameType.html "class in akka.http.impl.engine.http2") tpe,
		                             [ByteFlag](../ByteFlag.html "class in akka.http.impl.engine.http2") flags,
		                             int streamId,
		                             akka.stream.impl.io.ByteStringParser.ByteReader payload,
		                             akka.event.LoggingAdapter log)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/ByteFlag.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.Setting.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Protocol.FrameType.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/framing/Http2FrameParsing$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/framing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/framing/Http2FrameParsing$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/framing/Http2FrameParsing$.html)*