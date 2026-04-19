---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:48:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/IOOperationIncompleteException.html
title: IOOperationIncompleteException
---

# IOOperationIncompleteException

## Content

Package [akka.stream](package-summary.html)
## Class IOOperationIncompleteException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.stream.IOOperationIncompleteException

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public final class IOOperationIncompleteException
extends java.lang.RuntimeException
```

This exception signals that a stream has been completed or has an error while
 there was still IO operations in progress
 
 param: count The number of bytes read/written up until the error
 param: cause cause

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.IOOperationIncompleteException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[IOOperationIncompleteException](#%3Cinit%3E(long,java.lang.Throwable))​(long count,  java.lang.Throwable cause)` |  |
	| `[IOOperationIncompleteException](#%3Cinit%3E(java.lang.String,long,java.lang.Throwable))​(java.lang.String message,  long count,  java.lang.Throwable cause)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `long` | `[count](#count())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### IOOperationIncompleteException
		
		
		
		```
		public IOOperationIncompleteException​(java.lang.String message,
		                                      long count,
		                                      java.lang.Throwable cause)
		```
		- #### IOOperationIncompleteException
		
		
		
		```
		public IOOperationIncompleteException​(long count,
		                                      java.lang.Throwable cause)
		```

	- ### Method Detail
	
	
	
		- #### count
		
		
		
		```
		public long count()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/IOOperationIncompleteException.html](https://doc.akka.io/japi/akka/current/akka/stream/IOOperationIncompleteException.html)*