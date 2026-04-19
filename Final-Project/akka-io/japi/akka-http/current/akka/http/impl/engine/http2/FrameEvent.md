---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:30:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.WindowUpdateFrame.html
title: FrameEvent.WindowUpdateFrame
---

# FrameEvent.WindowUpdateFrame

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class FrameEvent.WindowUpdateFrame

- java.lang.Object
- - akka.http.impl.engine.http2\.FrameEvent.WindowUpdateFrame

- All Implemented Interfaces:
`[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2")`, `[FrameEvent.StreamFrameEvent](FrameEvent.StreamFrameEvent.html "interface in akka.http.impl.engine.http2")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing interface:
[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2")

---

```
public static final class FrameEvent.WindowUpdateFrame
extends java.lang.Object
implements [FrameEvent.StreamFrameEvent](FrameEvent.StreamFrameEvent.html "interface in akka.http.impl.engine.http2"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.impl.engine.http2.FrameEvent.WindowUpdateFrame)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.http.impl.engine.http2\.[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2")
		
		
		`[FrameEvent.ContinuationFrame](FrameEvent.ContinuationFrame.html "class in akka.http.impl.engine.http2"), [FrameEvent.ContinuationFrame$](FrameEvent.ContinuationFrame$.html "class in akka.http.impl.engine.http2"), [FrameEvent.DataFrame](FrameEvent.DataFrame.html "class in akka.http.impl.engine.http2"), [FrameEvent.DataFrame$](FrameEvent.DataFrame$.html "class in akka.http.impl.engine.http2"), [FrameEvent.GoAwayFrame](FrameEvent.GoAwayFrame.html "class in akka.http.impl.engine.http2"), [FrameEvent.GoAwayFrame$](FrameEvent.GoAwayFrame$.html "class in akka.http.impl.engine.http2"), [FrameEvent.HeadersFrame](FrameEvent.HeadersFrame.html "class in akka.http.impl.engine.http2"), [FrameEvent.HeadersFrame$](FrameEvent.HeadersFrame$.html "class in akka.http.impl.engine.http2"), [FrameEvent.ParsedHeadersFrame](FrameEvent.ParsedHeadersFrame.html "class in akka.http.impl.engine.http2"), [FrameEvent.ParsedHeadersFrame$](FrameEvent.ParsedHeadersFrame$.html "class in akka.http.impl.engine.http2"), [FrameEvent.PingFrame](FrameEvent.PingFrame.html "class in akka.http.impl.engine.http2"), [FrameEvent.PingFrame$](FrameEvent.PingFrame$.html "class in akka.http.impl.engine.http2"), [FrameEvent.PriorityFrame](FrameEvent.PriorityFrame.html "class in akka.http.impl.engine.http2"), [FrameEvent.PriorityFrame$](FrameEvent.PriorityFrame$.html "class in akka.http.impl.engine.http2"), [FrameEvent.PushPromiseFrame](FrameEvent.PushPromiseFrame.html "class in akka.http.impl.engine.http2"), [FrameEvent.PushPromiseFrame$](FrameEvent.PushPromiseFrame$.html "class in akka.http.impl.engine.http2"), [FrameEvent.RstStreamFrame](FrameEvent.RstStreamFrame.html "class in akka.http.impl.engine.http2"), [FrameEvent.RstStreamFrame$](FrameEvent.RstStreamFrame$.html "class in akka.http.impl.engine.http2"), [FrameEvent.Setting](FrameEvent.Setting.html "class in akka.http.impl.engine.http2"), [FrameEvent.Setting$](FrameEvent.Setting$.html "class in akka.http.impl.engine.http2"), [FrameEvent.SettingsAckFrame](FrameEvent.SettingsAckFrame.html "class in akka.http.impl.engine.http2"), [FrameEvent.SettingsAckFrame$](FrameEvent.SettingsAckFrame$.html "class in akka.http.impl.engine.http2"), [FrameEvent.SettingsFrame](FrameEvent.SettingsFrame.html "class in akka.http.impl.engine.http2"), [FrameEvent.SettingsFrame$](FrameEvent.SettingsFrame$.html "class in akka.http.impl.engine.http2"), [FrameEvent.StreamFrameEvent](FrameEvent.StreamFrameEvent.html "interface in akka.http.impl.engine.http2"), [FrameEvent.UnknownFrameEvent](FrameEvent.UnknownFrameEvent.html "class in akka.http.impl.engine.http2"), [FrameEvent.UnknownFrameEvent$](FrameEvent.UnknownFrameEvent$.html "class in akka.http.impl.engine.http2"), [FrameEvent.WindowUpdateFrame](FrameEvent.WindowUpdateFrame.html "class in akka.http.impl.engine.http2"), [FrameEvent.WindowUpdateFrame$](FrameEvent.WindowUpdateFrame$.html "class in akka.http.impl.engine.http2")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WindowUpdateFrame](#%3Cinit%3E(int,int))​(int streamId,  int windowSizeIncrement)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `int` | `[streamId](#streamId())()` |  |
	| `int` | `[windowSizeIncrement](#windowSizeIncrement())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface akka.http.impl.engine.http2\.[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.http2")
		
		
		`[frameTypeName](FrameEvent.html#frameTypeName())`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### WindowUpdateFrame
		
		
		
		```
		public WindowUpdateFrame​(int streamId,
		                         int windowSizeIncrement)
		```

	- ### Method Detail
	
	
	
		- #### streamId
		
		
		
		```
		public int streamId()
		```
		
		
		Specified by:
		`[streamId](FrameEvent.StreamFrameEvent.html#streamId())` in interface `[FrameEvent.StreamFrameEvent](FrameEvent.StreamFrameEvent.html "interface in akka.http.impl.engine.http2")`
		- #### windowSizeIncrement
		
		
		
		```
		public int windowSizeIncrement()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.ContinuationFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.ContinuationFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.DataFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.DataFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.GoAwayFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.GoAwayFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.HeadersFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.HeadersFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.ParsedHeadersFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.ParsedHeadersFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.PingFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.PingFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.PriorityFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.PriorityFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.PushPromiseFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.PushPromiseFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.RstStreamFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.RstStreamFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.Setting$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.Setting.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.SettingsAckFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.SettingsAckFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.SettingsFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.SettingsFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.StreamFrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.UnknownFrameEvent$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.UnknownFrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.WindowUpdateFrame$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.WindowUpdateFrame.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.WindowUpdateFrame.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/FrameEvent.WindowUpdateFrame.html)*