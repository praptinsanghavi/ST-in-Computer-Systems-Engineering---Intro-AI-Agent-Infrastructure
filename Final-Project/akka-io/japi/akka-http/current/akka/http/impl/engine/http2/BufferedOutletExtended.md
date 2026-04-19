---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:30:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/BufferedOutletExtended.html
title: BufferedOutletExtended
---

# BufferedOutletExtended

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class BufferedOutletExtended\<T\>

- java.lang.Object
- - akka.http.impl.engine.http2\.BufferedOutletExtended\<T\>

- All Implemented Interfaces:
`akka.stream.stage.OutHandler`

---

```
public class BufferedOutletExtended<T>
extends java.lang.Object
implements akka.stream.stage.OutHandler
```

INTERNAL API

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `class` | `[BufferedOutletExtended.ElementAndTrigger](BufferedOutletExtended.ElementAndTrigger.html "class in akka.http.impl.engine.http2")` |  |
	| `class` | `[BufferedOutletExtended.ElementAndTrigger$](BufferedOutletExtended.ElementAndTrigger$.html "class in akka.http.impl.engine.http2")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BufferedOutletExtended](#%3Cinit%3E(akka.http.impl.engine.http2.GenericOutlet))​([GenericOutlet](GenericOutlet.html "interface in akka.http.impl.engine.http2")<[T](BufferedOutletExtended.html "type parameter in BufferedOutletExtended")> outlet)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.util.ArrayDeque<[BufferedOutletExtended.ElementAndTrigger](BufferedOutletExtended.ElementAndTrigger.html "class in akka.http.impl.engine.http2")>` | `[buffer](#buffer())()` |  |
	| `protected void` | `[doPush](#doPush(akka.http.impl.engine.http2.BufferedOutletExtended.ElementAndTrigger))​([BufferedOutletExtended.ElementAndTrigger](BufferedOutletExtended.ElementAndTrigger.html "class in akka.http.impl.engine.http2") elem)` | override to hook into actually pushing, e.g. to keep track how much  has been pushed already (in contract, to being still cached) |
	| `void` | `[onPull](#onPull())()` |  |
	| `void` | `[push](#push(T))​([T](BufferedOutletExtended.html "type parameter in BufferedOutletExtended") element)` |  |
	| `void` | `[pushWithTrigger](#pushWithTrigger(T,scala.Function0))​([T](BufferedOutletExtended.html "type parameter in BufferedOutletExtended") elem,  scala.Function0<scala.runtime.BoxedUnit> trigger)` |  |
	| `void` | `[tryFlush](#tryFlush())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.stage.OutHandler
		
		
		`onDownstreamFinish, onDownstreamFinish`

- - ### Constructor Detail
	
	
	
		- #### BufferedOutletExtended
		
		
		
		```
		public BufferedOutletExtended​([GenericOutlet](GenericOutlet.html "interface in akka.http.impl.engine.http2")<[T](BufferedOutletExtended.html "type parameter in BufferedOutletExtended")> outlet)
		```

	- ### Method Detail
	
	
	
		- #### buffer
		
		
		
		```
		public final java.util.ArrayDeque<[BufferedOutletExtended.ElementAndTrigger](BufferedOutletExtended.ElementAndTrigger.html "class in akka.http.impl.engine.http2")> buffer()
		```
		- #### doPush
		
		
		
		```
		protected void doPush​([BufferedOutletExtended.ElementAndTrigger](BufferedOutletExtended.ElementAndTrigger.html "class in akka.http.impl.engine.http2") elem)
		```
		
		override to hook into actually pushing, e.g. to keep track how much
		 has been pushed already (in contract, to being still cached)
		
		Parameters:
		`elem` \- (undocumented)
		- #### onPull
		
		
		
		```
		public void onPull()
		```
		
		
		Specified by:
		`onPull` in interface `akka.stream.stage.OutHandler`
		- #### push
		
		
		
		```
		public final void push​([T](BufferedOutletExtended.html "type parameter in BufferedOutletExtended") element)
		```
		- #### pushWithTrigger
		
		
		
		```
		public final void pushWithTrigger​([T](BufferedOutletExtended.html "type parameter in BufferedOutletExtended") elem,
		                                  scala.Function0<scala.runtime.BoxedUnit> trigger)
		```
		- #### tryFlush
		
		
		
		```
		public void tryFlush()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/BufferedOutletExtended.ElementAndTrigger$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/BufferedOutletExtended.ElementAndTrigger.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/BufferedOutletExtended.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/GenericOutlet.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/BufferedOutletExtended.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/BufferedOutletExtended.html)*