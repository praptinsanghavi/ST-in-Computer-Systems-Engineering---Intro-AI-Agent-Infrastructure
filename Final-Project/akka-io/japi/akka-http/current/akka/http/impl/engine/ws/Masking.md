---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Masking.html
title: Masking
---

# Masking

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Class Masking

- java.lang.Object
- - akka.http.impl.engine.ws.Masking

- ---

```
public class Masking
extends java.lang.Object
```

Implements WebSocket Frame masking.
 
 INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Masking](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.stream.scaladsl.BidiFlow<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​akka.NotUsed>` | `[apply](#apply(boolean,scala.Function0))​(boolean serverSide,  scala.Function0<java.util.Random> maskRandom)` |  |
	| `static akka.stream.scaladsl.Flow<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​akka.NotUsed>` | `[maskIf](#maskIf(boolean,scala.Function0))​(boolean condition,  scala.Function0<java.util.Random> maskRandom)` |  |
	| `static akka.stream.scaladsl.Flow<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws"),​akka.NotUsed>` | `[unmaskIf](#unmaskIf(boolean))​(boolean condition)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Masking
		
		
		
		```
		public Masking()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static akka.stream.scaladsl.BidiFlow<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​akka.NotUsed> apply​(boolean serverSide,
		                                                                                                                                           scala.Function0<java.util.Random> maskRandom)
		```
		- #### maskIf
		
		
		
		```
		public static akka.stream.scaladsl.Flow<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​akka.NotUsed> maskIf​(boolean condition,
		                                                                                               scala.Function0<java.util.Random> maskRandom)
		```
		- #### unmaskIf
		
		
		
		```
		public static akka.stream.scaladsl.Flow<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws"),​akka.NotUsed> unmaskIf​(boolean condition)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEventOrError.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Masking.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Masking.html)*