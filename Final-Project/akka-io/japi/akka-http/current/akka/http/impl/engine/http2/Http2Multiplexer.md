---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:30:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Multiplexer.html
title: Http2Multiplexer
---

# Http2Multiplexer

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Interface Http2Multiplexer

- ---

```
public interface Http2Multiplexer
```

INTERNAL API
 
 The internal interface Http2ServerDemux uses to drive the multiplexer.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[closeStream](#closeStream(int))​(int streamId)` |  |
	| `int` | `[currentInitialWindow](#currentInitialWindow())()` |  |
	| `void` | `[enqueueOutStream](#enqueueOutStream(int))​(int streamId)` |  |
	| `boolean` | `[hasFlushedAllData](#hasFlushedAllData())()` |  |
	| `int` | `[maxBytesToBufferPerSubstream](#maxBytesToBufferPerSubstream())()` |  |
	| `void` | `[pushControlFrame](#pushControlFrame(akka.http.impl.engine.http2.FrameEvent))​([FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2") frame)` |  |
	| `void` | `[reportTimings](#reportTimings())()` |  |
	| `void` | `[updateConnectionLevelWindow](#updateConnectionLevelWindow(int))​(int increment)` |  |
	| `void` | `[updateDefaultWindow](#updateDefaultWindow(int))​(int newDefaultWindow)` |  |
	| `void` | `[updateMaxFrameSize](#updateMaxFrameSize(int))​(int newMaxFrameSize)` |  |
	| `void` | `[updatePriority](#updatePriority(akka.http.impl.engine.http2.FrameEvent.PriorityFrame))​([FrameEvent.PriorityFrame](FrameEvent.PriorityFrame.html "class in akka.http.impl.engine.http2") priorityFrame)` |  |

- - ### Method Detail
	
	
	
		- #### closeStream
		
		
		
		```
		void closeStream​(int streamId)
		```
		- #### currentInitialWindow
		
		
		
		```
		int currentInitialWindow()
		```
		- #### enqueueOutStream
		
		
		
		```
		void enqueueOutStream​(int streamId)
		```
		- #### hasFlushedAllData
		
		
		
		```
		boolean hasFlushedAllData()
		```
		- #### maxBytesToBufferPerSubstream
		
		
		
		```
		int maxBytesToBufferPerSubstream()
		```
		- #### pushControlFrame
		
		
		
		```
		void pushControlFrame​([FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2") frame)
		```
		- #### reportTimings
		
		
		
		```
		void reportTimings()
		```
		- #### updateConnectionLevelWindow
		
		
		
		```
		void updateConnectionLevelWindow​(int increment)
		```
		- #### updateDefaultWindow
		
		
		
		```
		void updateDefaultWindow​(int newDefaultWindow)
		```
		- #### updateMaxFrameSize
		
		
		
		```
		void updateMaxFrameSize​(int newMaxFrameSize)
		```
		- #### updatePriority
		
		
		
		```
		void updatePriority​([FrameEvent.PriorityFrame](FrameEvent.PriorityFrame.html "class in akka.http.impl.engine.http2") priorityFrame)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.PriorityFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Multiplexer.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Multiplexer.html)*