---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:08:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/coordination/lease/LeaseException.html
title: LeaseException
---

# LeaseException

## Content

Package [akka.coordination.lease](package-summary.html)
## Class LeaseException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.coordination.lease.LeaseException

- All Implemented Interfaces:
`java.io.Serializable`

Direct Known Subclasses:
`[LeaseTimeoutException](LeaseTimeoutException.html "class in akka.coordination.lease")`

---

```
public class LeaseException
extends java.lang.RuntimeException
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.coordination.lease.LeaseException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LeaseException](#%3Cinit%3E(java.lang.String))​(java.lang.String message)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### LeaseException
		
		
		
		```
		public LeaseException​(java.lang.String message)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/coordination/lease/LeaseTimeoutException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/coordination/lease/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/coordination/lease/LeaseException.html](https://doc.akka.io/japi/akka-core/2.10/akka/coordination/lease/LeaseException.html)*