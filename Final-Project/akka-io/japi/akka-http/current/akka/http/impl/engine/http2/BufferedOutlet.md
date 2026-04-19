---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:30:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/BufferedOutlet.html
title: BufferedOutlet
---

# BufferedOutlet

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class BufferedOutlet\<T\>

- java.lang.Object
- - akka.http.impl.engine.http2\.BufferedOutlet\<T\>

- All Implemented Interfaces:
`akka.stream.stage.OutHandler`

---

```
public class BufferedOutlet<T>
extends java.lang.Object
implements akka.stream.stage.OutHandler
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BufferedOutlet](#%3Cinit%3E(akka.http.impl.engine.http2.GenericOutlet))​([GenericOutlet](GenericOutlet.html "interface in akka.http.impl.engine.http2")<[T](BufferedOutlet.html "type parameter in BufferedOutlet")> outlet)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.util.ArrayDeque<[T](BufferedOutlet.html "type parameter in BufferedOutlet")>` | `[buffer](#buffer())()` |  |
	| `void` | `[complete](#complete())()` |  |
	| `boolean` | `[completed](#completed())()` |  |
	| `protected void` | `[doPush](#doPush(T))​([T](BufferedOutlet.html "type parameter in BufferedOutlet") elem)` | override to hook into actually pushing, e.g. to keep track how much  has been pushed already (in contract, to being still cached) |
	| `void` | `[fail](#fail(java.lang.Throwable))​(java.lang.Throwable cause)` |  |
	| `void` | `[onPull](#onPull())()` |  |
	| `void` | `[push](#push(T))​([T](BufferedOutlet.html "type parameter in BufferedOutlet") elem)` |  |
	| `void` | `[tryFlush](#tryFlush())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.stream.stage.OutHandler
		
		
		`onDownstreamFinish, onDownstreamFinish`

- - ### Constructor Detail
	
	
	
		- #### BufferedOutlet
		
		
		
		```
		public BufferedOutlet​([GenericOutlet](GenericOutlet.html "interface in akka.http.impl.engine.http2")<[T](BufferedOutlet.html "type parameter in BufferedOutlet")> outlet)
		```

	- ### Method Detail
	
	
	
		- #### buffer
		
		
		
		```
		public java.util.ArrayDeque<[T](BufferedOutlet.html "type parameter in BufferedOutlet")> buffer()
		```
		- #### complete
		
		
		
		```
		public void complete()
		```
		- #### completed
		
		
		
		```
		public boolean completed()
		```
		- #### doPush
		
		
		
		```
		protected void doPush​([T](BufferedOutlet.html "type parameter in BufferedOutlet") elem)
		```
		
		override to hook into actually pushing, e.g. to keep track how much
		 has been pushed already (in contract, to being still cached)
		
		Parameters:
		`elem` \- (undocumented)
		- #### fail
		
		
		
		```
		public void fail​(java.lang.Throwable cause)
		```
		- #### onPull
		
		
		
		```
		public void onPull()
		```
		
		
		Specified by:
		`onPull` in interface `akka.stream.stage.OutHandler`
		- #### push
		
		
		
		```
		public void push​([T](BufferedOutlet.html "type parameter in BufferedOutlet") elem)
		```
		- #### tryFlush
		
		
		
		```
		public void tryFlush()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/BufferedOutlet.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/GenericOutlet.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/BufferedOutlet.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/BufferedOutlet.html)*