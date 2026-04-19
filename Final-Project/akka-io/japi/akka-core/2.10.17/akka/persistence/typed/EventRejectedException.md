---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:02:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/EventRejectedException.html
title: EventRejectedException
---

# EventRejectedException

## Content

Package [akka.persistence.typed](package-summary.html)
## Class EventRejectedException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.persistence.typed.EventRejectedException

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public final class EventRejectedException
extends java.lang.RuntimeException
```

Thrown if a journal rejects an event e.g. due to a serialization error.

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.typed.EventRejectedException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventRejectedException](#%3Cinit%3E(akka.persistence.typed.PersistenceId,long,java.lang.Throwable))​([PersistenceId](PersistenceId.html "class in akka.persistence.typed") persistenceId,  long sequenceNr,  java.lang.Throwable cause)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EventRejectedException
		
		
		
		```
		public EventRejectedException​([PersistenceId](PersistenceId.html "class in akka.persistence.typed") persistenceId,
		                              long sequenceNr,
		                              java.lang.Throwable cause)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/EventRejectedException.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/EventRejectedException.html)*