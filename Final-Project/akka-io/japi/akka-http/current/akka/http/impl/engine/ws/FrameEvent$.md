---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEvent$.html
title: FrameEvent$
---

# FrameEvent$

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Class FrameEvent$

- java.lang.Object
- - akka.http.impl.engine.ws.FrameEvent$

- ---

```
public class FrameEvent$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FrameEvent$](FrameEvent$.html "class in akka.http.impl.engine.ws")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FrameEvent$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws")` | `[closeFrame](#closeFrame(int,java.lang.String,scala.Option))​(int closeCode,  java.lang.String reason,  scala.Option<java.lang.Object> mask)` |  |
	| `[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws")` | `[empty](#empty(akka.http.impl.engine.ws.Protocol.Opcode,boolean,boolean,boolean,boolean))​([Protocol.Opcode](Protocol.Opcode.html "interface in akka.http.impl.engine.ws") opcode,  boolean fin,  boolean rsv1,  boolean rsv2,  boolean rsv3)` |  |
	| `[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws")` | `[emptyLastContinuationFrame](#emptyLastContinuationFrame())()` |  |
	| `[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws")` | `[fullFrame](#fullFrame(akka.http.impl.engine.ws.Protocol.Opcode,scala.Option,akka.util.ByteString,boolean,boolean,boolean,boolean))​([Protocol.Opcode](Protocol.Opcode.html "interface in akka.http.impl.engine.ws") opcode,  scala.Option<java.lang.Object> mask,  akka.util.ByteString data,  boolean fin,  boolean rsv1,  boolean rsv2,  boolean rsv3)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FrameEvent$](FrameEvent$.html "class in akka.http.impl.engine.ws") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FrameEvent$
		
		
		
		```
		public FrameEvent$()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public [FrameStart](FrameStart.html "class in akka.http.impl.engine.ws") empty​([Protocol.Opcode](Protocol.Opcode.html "interface in akka.http.impl.engine.ws") opcode,
		                        boolean fin,
		                        boolean rsv1,
		                        boolean rsv2,
		                        boolean rsv3)
		```
		- #### fullFrame
		
		
		
		```
		public [FrameStart](FrameStart.html "class in akka.http.impl.engine.ws") fullFrame​([Protocol.Opcode](Protocol.Opcode.html "interface in akka.http.impl.engine.ws") opcode,
		                            scala.Option<java.lang.Object> mask,
		                            akka.util.ByteString data,
		                            boolean fin,
		                            boolean rsv1,
		                            boolean rsv2,
		                            boolean rsv3)
		```
		- #### emptyLastContinuationFrame
		
		
		
		```
		public [FrameStart](FrameStart.html "class in akka.http.impl.engine.ws") emptyLastContinuationFrame()
		```
		- #### closeFrame
		
		
		
		```
		public [FrameStart](FrameStart.html "class in akka.http.impl.engine.ws") closeFrame​(int closeCode,
		                             java.lang.String reason,
		                             scala.Option<java.lang.Object> mask)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEvent$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameStart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Protocol.Opcode.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEvent$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEvent$.html)*