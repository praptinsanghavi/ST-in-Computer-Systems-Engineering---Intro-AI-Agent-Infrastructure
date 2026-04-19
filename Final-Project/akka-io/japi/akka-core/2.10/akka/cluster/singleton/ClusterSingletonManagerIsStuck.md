---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:07:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManagerIsStuck.html
title: ClusterSingletonManagerIsStuck
---

# ClusterSingletonManagerIsStuck

## Content

Package [akka.cluster.singleton](package-summary.html)
## Class ClusterSingletonManagerIsStuck

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.AkkaException](../../AkkaException.html "class in akka")
				- - akka.cluster.singleton.ClusterSingletonManagerIsStuck

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ClusterSingletonManagerIsStuck
extends [AkkaException](../../AkkaException.html "class in akka")
```

Thrown when a consistent state can't be determined within the
 defined retry limits. Eventually it will reach a stable state and
 can continue, and that is simplified by starting over with a clean
 state. Parent supervisor should typically restart the actor, i.e.
 default decision.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.singleton.ClusterSingletonManagerIsStuck)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterSingletonManagerIsStuck](#%3Cinit%3E(java.lang.String))​(java.lang.String message)` |  |

	- ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ClusterSingletonManagerIsStuck
		
		
		
		```
		public ClusterSingletonManagerIsStuck​(java.lang.String message)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/AkkaException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManagerIsStuck.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/singleton/ClusterSingletonManagerIsStuck.html)*