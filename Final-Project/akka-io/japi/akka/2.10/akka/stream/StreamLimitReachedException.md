---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T17:05:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/StreamLimitReachedException.html
title: StreamLimitReachedException
---

# StreamLimitReachedException

## Content

Package [akka.stream](package-summary.html)
## Class StreamLimitReachedException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.stream.StreamLimitReachedException

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class StreamLimitReachedException
extends java.lang.RuntimeException
```

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.StreamLimitReachedException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StreamLimitReachedException](#%3Cinit%3E(long))​(long n)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `long` | `[n](#n())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### StreamLimitReachedException
		
		
		
		```
		public StreamLimitReachedException​(long n)
		```

	- ### Method Detail
	
	
	
		- #### n
		
		
		
		```
		public long n()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/StreamLimitReachedException.html](https://doc.akka.io/japi/akka/2.10/akka/stream/StreamLimitReachedException.html)*