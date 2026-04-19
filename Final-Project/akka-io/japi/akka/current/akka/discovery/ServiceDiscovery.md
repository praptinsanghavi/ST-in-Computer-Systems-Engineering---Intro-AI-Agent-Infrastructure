---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:13:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/discovery/ServiceDiscovery.DiscoveryTimeoutException.html
title: ServiceDiscovery.DiscoveryTimeoutException
---

# ServiceDiscovery.DiscoveryTimeoutException

## Content

Package [akka.discovery](package-summary.html)
## Class ServiceDiscovery.DiscoveryTimeoutException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.discovery.ServiceDiscovery.DiscoveryTimeoutException

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[ServiceDiscovery](ServiceDiscovery.html "class in akka.discovery")

---

```
public static final class ServiceDiscovery.DiscoveryTimeoutException
extends java.lang.RuntimeException
```

Future returned by resolve(name, timeout) should be failed with this exception
 if the underlying mechanism was unable to resolve the name within the given timeout.
 
 It is up to each implementation to implement timeouts.

See Also:
[Serialized Form](../../serialized-form.html#akka.discovery.ServiceDiscovery.DiscoveryTimeoutException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DiscoveryTimeoutException](#%3Cinit%3E(java.lang.String))​(java.lang.String reason)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### DiscoveryTimeoutException
		
		
		
		```
		public DiscoveryTimeoutException​(java.lang.String reason)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/discovery/ServiceDiscovery.html
- https://doc.akka.io/japi/akka/current/akka/discovery/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/discovery/ServiceDiscovery.DiscoveryTimeoutException.html](https://doc.akka.io/japi/akka/current/akka/discovery/ServiceDiscovery.DiscoveryTimeoutException.html)*