---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:04:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/TooManySubstreamsOpenException.html
title: TooManySubstreamsOpenException
---

# TooManySubstreamsOpenException

## Content

Package [akka.stream](package-summary.html)
## Class TooManySubstreamsOpenException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - java.lang.IllegalStateException
				- - akka.stream.TooManySubstreamsOpenException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.util.control.NoStackTrace`

---

```
public final class TooManySubstreamsOpenException
extends java.lang.IllegalStateException
implements scala.util.control.NoStackTrace
```

This exception signals that the maximum number of substreams declared has been exceeded.
 A finite limit is imposed so that memory usage is controlled.

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.TooManySubstreamsOpenException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TooManySubstreamsOpenException](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`

- - ### Constructor Detail
	
	
	
		- #### TooManySubstreamsOpenException
		
		
		
		```
		public TooManySubstreamsOpenException()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/TooManySubstreamsOpenException.html](https://doc.akka.io/japi/akka-core/current/akka/stream/TooManySubstreamsOpenException.html)*