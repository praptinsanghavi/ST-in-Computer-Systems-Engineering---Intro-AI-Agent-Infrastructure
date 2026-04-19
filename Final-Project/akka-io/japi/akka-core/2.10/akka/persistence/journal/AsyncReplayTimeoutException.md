---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:12:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncReplayTimeoutException.html
title: AsyncReplayTimeoutException
---

# AsyncReplayTimeoutException

## Content

Package [akka.persistence.journal](package-summary.html)
## Class AsyncReplayTimeoutException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.AkkaException](../../AkkaException.html "class in akka")
				- - akka.persistence.journal.AsyncReplayTimeoutException

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class AsyncReplayTimeoutException
extends [AkkaException](../../AkkaException.html "class in akka")
```

Thrown if replay inactivity exceeds a specified timeout.

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.journal.AsyncReplayTimeoutException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AsyncReplayTimeoutException](#%3Cinit%3E(java.lang.String))​(java.lang.String msg)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AsyncReplayTimeoutException
		
		
		
		```
		public AsyncReplayTimeoutException​(java.lang.String msg)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/AkkaException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncReplayTimeoutException.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/AsyncReplayTimeoutException.html)*