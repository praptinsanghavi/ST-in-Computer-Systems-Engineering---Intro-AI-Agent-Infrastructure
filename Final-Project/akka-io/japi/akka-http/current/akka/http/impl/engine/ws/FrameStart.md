---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameStart.html
title: FrameStart
---

# FrameStart

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Class FrameStart

- java.lang.Object
- - akka.http.impl.engine.ws.FrameStart

- All Implemented Interfaces:
`[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws")`, `[FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class FrameStart
extends java.lang.Object
implements [FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"), scala.Product, java.io.Serializable
```

Starts a frame. Contains the frame's headers. May contain all the data of the frame if `lastPart == true`. Otherwise,
 following events will be `FrameData` events that contain the remaining data of the frame.

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.http.impl.engine.ws.FrameStart)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FrameStart](#%3Cinit%3E(akka.http.impl.engine.ws.FrameHeader,akka.util.ByteString))​([FrameHeader](FrameHeader.html "class in akka.http.impl.engine.ws") header,  akka.util.ByteString data)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract static R` | `[apply](#apply(T1,T2))​(T1 v1,  T2 v2)` |  |
	| `akka.util.ByteString` | `[data](#data())()` |  |
	| `[FrameHeader](FrameHeader.html "class in akka.http.impl.engine.ws")` | `[header](#header())()` |  |
	| `boolean` | `[isFullMessage](#isFullMessage())()` |  |
	| `boolean` | `[lastPart](#lastPart())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws")` | `[withData](#withData(akka.util.ByteString))​(akka.util.ByteString data)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator, productPrefix`

- - ### Constructor Detail
	
	
	
		- #### FrameStart
		
		
		
		```
		public FrameStart​([FrameHeader](FrameHeader.html "class in akka.http.impl.engine.ws") header,
		                  akka.util.ByteString data)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public abstract static R apply​(T1 v1,
		                               T2 v2)
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### header
		
		
		
		```
		public [FrameHeader](FrameHeader.html "class in akka.http.impl.engine.ws") header()
		```
		- #### data
		
		
		
		```
		public akka.util.ByteString data()
		```
		
		
		Specified by:
		`[data](FrameEvent.html#data())` in interface `[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws")`
		- #### lastPart
		
		
		
		```
		public boolean lastPart()
		```
		
		
		Specified by:
		`[lastPart](FrameEvent.html#lastPart())` in interface `[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws")`
		- #### withData
		
		
		
		```
		public [FrameStart](FrameStart.html "class in akka.http.impl.engine.ws") withData​(akka.util.ByteString data)
		```
		
		
		Specified by:
		`[withData](FrameEvent.html#withData(akka.util.ByteString))` in interface `[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws")`
		- #### isFullMessage
		
		
		
		```
		public boolean isFullMessage()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEventOrError.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameStart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameStart.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameStart.html)*