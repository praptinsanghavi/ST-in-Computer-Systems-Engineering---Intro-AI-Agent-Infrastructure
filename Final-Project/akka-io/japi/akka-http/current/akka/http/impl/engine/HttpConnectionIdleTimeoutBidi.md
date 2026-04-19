---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:29:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/HttpConnectionIdleTimeoutBidi.html
title: HttpConnectionIdleTimeoutBidi
---

# HttpConnectionIdleTimeoutBidi

## Content

Package [akka.http.impl.engine](package-summary.html)
## Class HttpConnectionIdleTimeoutBidi

- java.lang.Object
- - akka.http.impl.engine.HttpConnectionIdleTimeoutBidi

- ---

```
public class HttpConnectionIdleTimeoutBidi
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpConnectionIdleTimeoutBidi](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.stream.scaladsl.BidiFlow<akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed>` | `[apply](#apply(scala.concurrent.duration.Duration,scala.Option))​(scala.concurrent.duration.Duration idleTimeout,  scala.Option<java.net.InetSocketAddress> remoteAddress)` |  |
	| `static akka.stream.scaladsl.BidiFlow<akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed>` | `[apply](#apply(scala.concurrent.duration.FiniteDuration,scala.Option))​(scala.concurrent.duration.FiniteDuration idleTimeout,  scala.Option<java.net.InetSocketAddress> remoteAddress)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpConnectionIdleTimeoutBidi
		
		
		
		```
		public HttpConnectionIdleTimeoutBidi()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static akka.stream.scaladsl.BidiFlow<akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> apply​(scala.concurrent.duration.Duration idleTimeout,
		                                                                                                                                                                            scala.Option<java.net.InetSocketAddress> remoteAddress)
		```
		- #### apply
		
		
		
		```
		public static akka.stream.scaladsl.BidiFlow<akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.NotUsed> apply​(scala.concurrent.duration.FiniteDuration idleTimeout,
		                                                                                                                                                                            scala.Option<java.net.InetSocketAddress> remoteAddress)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/HttpConnectionIdleTimeoutBidi.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/HttpConnectionIdleTimeoutBidi.html)*