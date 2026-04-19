---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:30:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2MultiplexerSupport.StateTimingSupport.html
title: Http2MultiplexerSupport.StateTimingSupport
---

# Http2MultiplexerSupport.StateTimingSupport

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Interface Http2MultiplexerSupport.StateTimingSupport

- Enclosing interface:
[Http2MultiplexerSupport](Http2MultiplexerSupport.html "interface in akka.http.impl.engine.http2")

---

```
public static interface Http2MultiplexerSupport.StateTimingSupport
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `long` | `[lastTimestamp](#lastTimestamp())()` |  |
	| `void` | `[recordStateChange](#recordStateChange(java.lang.String,java.lang.String))​(java.lang.String oldState,  java.lang.String newState)` |  |
	| `void` | `[reportTimings](#reportTimings())()` | Logs DEBUG level timing data for the output side of the multiplexer |
	| `scala.collection.immutable.Map<java.lang.String,​java.lang.Object>` | `[timings](#timings())()` |  |

- - ### Method Detail
	
	
	
		- #### lastTimestamp
		
		
		
		```
		long lastTimestamp()
		```
		- #### recordStateChange
		
		
		
		```
		void recordStateChange​(java.lang.String oldState,
		                       java.lang.String newState)
		```
		- #### reportTimings
		
		
		
		```
		void reportTimings()
		```
		
		Logs DEBUG level timing data for the output side of the multiplexer
		- #### timings
		
		
		
		```
		scala.collection.immutable.Map<java.lang.String,​java.lang.Object> timings()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2MultiplexerSupport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2MultiplexerSupport.StateTimingSupport.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2MultiplexerSupport.StateTimingSupport.html)*