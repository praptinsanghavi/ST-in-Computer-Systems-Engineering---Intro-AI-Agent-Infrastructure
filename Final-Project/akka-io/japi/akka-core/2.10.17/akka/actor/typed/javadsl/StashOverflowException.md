---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:31:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/StashOverflowException.html
title: StashOverflowException
---

# StashOverflowException

## Content

Package [akka.actor.typed.javadsl](package-summary.html)
## Class StashOverflowException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.actor.typed.scaladsl.StashOverflowException](../scaladsl/StashOverflowException.html "class in akka.actor.typed.scaladsl")
				- - akka.actor.typed.javadsl.StashOverflowException

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public final class StashOverflowException
extends [StashOverflowException](../scaladsl/StashOverflowException.html "class in akka.actor.typed.scaladsl")
```

Is thrown when the size of the stash exceeds the capacity of the stash buffer.

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.javadsl.StashOverflowException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StashOverflowException](#%3Cinit%3E(java.lang.String))​(java.lang.String message)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### StashOverflowException
		
		
		
		```
		public StashOverflowException​(java.lang.String message)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/scaladsl/StashOverflowException.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/StashOverflowException.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/StashOverflowException.html)*