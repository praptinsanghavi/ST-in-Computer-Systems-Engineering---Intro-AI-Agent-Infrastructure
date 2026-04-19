---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:35:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/WatchedActorTerminatedException.html
title: WatchedActorTerminatedException
---

# WatchedActorTerminatedException

## Content

Package [akka.stream](package-summary.html)
## Class WatchedActorTerminatedException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - akka.stream.WatchedActorTerminatedException

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public final class WatchedActorTerminatedException
extends java.lang.RuntimeException
```

Used as failure exception by an `ask` operator if the target actor terminates.
 See `Flow.ask` and `Flow.watch`.

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.WatchedActorTerminatedException)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WatchedActorTerminatedException](#%3Cinit%3E(java.lang.String,akka.actor.ActorRef))​(java.lang.String watchingStageName,  [ActorRef](../actor/ActorRef.html "class in akka.actor") ref)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[ref](#ref())()` |  |
	| `java.lang.String` | `[watchingStageName](#watchingStageName())()` |  |
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### WatchedActorTerminatedException
		
		
		
		```
		public WatchedActorTerminatedException​(java.lang.String watchingStageName,
		                                       [ActorRef](../actor/ActorRef.html "class in akka.actor") ref)
		```

	- ### Method Detail
	
	
	
		- #### ref
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") ref()
		```
		- #### watchingStageName
		
		
		
		```
		public java.lang.String watchingStageName()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/WatchedActorTerminatedException.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/WatchedActorTerminatedException.html)*