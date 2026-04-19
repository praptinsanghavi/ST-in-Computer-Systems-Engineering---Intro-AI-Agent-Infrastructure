---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:29:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/AbruptStreamTerminationException.html
title: AbruptStreamTerminationException
---

# AbruptStreamTerminationException

## Content

Package [akka.stream](package-summary.html)
## Class AbruptStreamTerminationException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.stream.AbruptStreamTerminationException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.util.control.NoStackTrace`

Direct Known Subclasses:
`[AbruptStageTerminationException](AbruptStageTerminationException.html "class in akka.stream")`, `[AbruptTerminationException](AbruptTerminationException.html "class in akka.stream")`

---

```
public class AbruptStreamTerminationException
extends java.lang.RuntimeException
implements scala.util.control.NoStackTrace
```

A base exception for abrupt stream termination.
 
 Not for user extension

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.AbruptStreamTerminationException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbruptStreamTerminationException](#%3Cinit%3E(java.lang.String,java.lang.Throwable))​(java.lang.String msg,  java.lang.Throwable cause)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`

- - ### Constructor Detail
	
	
	
		- #### AbruptStreamTerminationException
		
		
		
		```
		public AbruptStreamTerminationException​(java.lang.String msg,
		                                        java.lang.Throwable cause)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/AbruptStageTerminationException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/AbruptTerminationException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/AbruptStreamTerminationException.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/AbruptStreamTerminationException.html)*