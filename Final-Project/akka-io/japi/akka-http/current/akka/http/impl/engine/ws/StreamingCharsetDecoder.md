---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/StreamingCharsetDecoder.html
title: StreamingCharsetDecoder
---

# StreamingCharsetDecoder

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Interface StreamingCharsetDecoder

- All Known Implementing Classes:
`[Utf8Decoder$](Utf8Decoder$.html "class in akka.http.impl.engine.ws")`

---

```
public interface StreamingCharsetDecoder
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[StreamingCharsetDecoderInstance](StreamingCharsetDecoderInstance.html "interface in akka.http.impl.engine.ws")` | `[create](#create())()` |  |
	| `scala.util.Try<java.lang.String>` | `[decode](#decode(akka.util.ByteString))​(akka.util.ByteString bytes)` |  |

- - ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		[StreamingCharsetDecoderInstance](StreamingCharsetDecoderInstance.html "interface in akka.http.impl.engine.ws") create()
		```
		- #### decode
		
		
		
		```
		scala.util.Try<java.lang.String> decode​(akka.util.ByteString bytes)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/StreamingCharsetDecoderInstance.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Utf8Decoder$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/StreamingCharsetDecoder.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/StreamingCharsetDecoder.html)*