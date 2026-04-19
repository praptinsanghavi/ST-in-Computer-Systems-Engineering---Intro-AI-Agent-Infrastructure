---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:30:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/StashOverflowException.html
title: StashOverflowException
---

# StashOverflowException

## Content

Package [akka.actor](package-summary.html)
## Class StashOverflowException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.AkkaException](../AkkaException.html "class in akka")
				- - akka.actor.StashOverflowException

- All Implemented Interfaces:
`java.io.Serializable`, `scala.util.control.NoStackTrace`

---

```
public class StashOverflowException
extends [AkkaException](../AkkaException.html "class in akka")
implements scala.util.control.NoStackTrace
```

Is thrown when the size of the Stash exceeds the capacity of the Stash

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.StashOverflowException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StashOverflowException](#%3Cinit%3E(java.lang.String,java.lang.Throwable))​(java.lang.String message,  java.lang.Throwable cause)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static java.lang.Throwable` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.util.control.NoStackTrace
		
		
		`fillInStackTrace`

- - ### Constructor Detail
	
	
	
		- #### StashOverflowException
		
		
		
		```
		public StashOverflowException​(java.lang.String message,
		                              java.lang.Throwable cause)
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public static java.lang.Throwable $lessinit$greater$default$2()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/AkkaException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/StashOverflowException.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/StashOverflowException.html)*