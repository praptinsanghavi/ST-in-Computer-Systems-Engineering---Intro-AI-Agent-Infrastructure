---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:50:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/NotAllowedClassRemoteDeploymentAttemptException.html
title: NotAllowedClassRemoteDeploymentAttemptException
---

# NotAllowedClassRemoteDeploymentAttemptException

## Content

Package [akka.remote](package-summary.html)
## Class NotAllowedClassRemoteDeploymentAttemptException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.remote.NotAllowedClassRemoteDeploymentAttemptException

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public final class NotAllowedClassRemoteDeploymentAttemptException
extends java.lang.RuntimeException
```

INTERNAL API

See Also:
[Serialized Form](../../serialized-form.html#akka.remote.NotAllowedClassRemoteDeploymentAttemptException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NotAllowedClassRemoteDeploymentAttemptException](#%3Cinit%3E(java.lang.Class,scala.collection.immutable.Set))​(java.lang.Class<?> illegal,  scala.collection.immutable.Set<java.lang.String> allowedClassNames)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### NotAllowedClassRemoteDeploymentAttemptException
		
		
		
		```
		public NotAllowedClassRemoteDeploymentAttemptException​(java.lang.Class<?> illegal,
		                                                       scala.collection.immutable.Set<java.lang.String> allowedClassNames)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/NotAllowedClassRemoteDeploymentAttemptException.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/remote/NotAllowedClassRemoteDeploymentAttemptException.html)*