---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:51:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/ActorInterruptedException.html
title: ActorInterruptedException
---

# ActorInterruptedException

## Content

Package [akka.actor](package-summary.html)
## Class ActorInterruptedException

- java.lang.Object
- - java.lang.Throwable
	- - java.lang.Exception
		- - java.lang.RuntimeException
			- - [akka.AkkaException](../AkkaException.html "class in akka")
				- - akka.actor.ActorInterruptedException

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ActorInterruptedException
extends [AkkaException](../AkkaException.html "class in akka")
```

When an InterruptedException is thrown inside an Actor, it is wrapped as an ActorInterruptedException as to
 avoid cascading interrupts to other threads than the originally interrupted one.

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.ActorInterruptedException)

- - ### Method Summary
	
	
		- ### Methods inherited from class java.lang.Throwable
		
		
		`addSuppressed, fillInStackTrace, getCause, getLocalizedMessage, getMessage, getStackTrace, getSuppressed, initCause, printStackTrace, printStackTrace, printStackTrace, setStackTrace, toString`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/AkkaException.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/ActorInterruptedException.html](https://doc.akka.io/japi/akka/current/akka/actor/ActorInterruptedException.html)*