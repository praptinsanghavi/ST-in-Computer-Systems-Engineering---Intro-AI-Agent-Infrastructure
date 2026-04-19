---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractActor.Receive.html
title: AbstractActor.Receive
---

# AbstractActor.Receive

## Content

Package [akka.actor](package-summary.html)
## Class AbstractActor.Receive

- java.lang.Object
- - akka.actor.AbstractActor.Receive

- Enclosing class:
[AbstractActor](AbstractActor.html "class in akka.actor")

---

```
public static final class AbstractActor.Receive
extends java.lang.Object
```

Defines which messages the Actor can handle, along with the implementation of
 how the messages should be processed. You can build such behavior with the
 [`ReceiveBuilder`](../japi/pf/ReceiveBuilder.html "class in akka.japi.pf") but it can be implemented in other ways than
 using the `ReceiveBuilder` since it in the end is just a wrapper around a
 Scala `PartialFunction`. In Java, you can implement `PartialFunction` by
 extending `AbstractPartialFunction`.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Receive](#%3Cinit%3E(scala.PartialFunction))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> onMessage)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[onMessage](#onMessage())()` |  |
	| `[AbstractActor.Receive](AbstractActor.Receive.html "class in akka.actor")` | `[orElse](#orElse(akka.actor.AbstractActor.Receive))​([AbstractActor.Receive](AbstractActor.Receive.html "class in akka.actor") other)` | Composes this `Receive` with a fallback which gets applied  where this partial function is not defined. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Receive
		
		
		
		```
		public Receive​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> onMessage)
		```

	- ### Method Detail
	
	
	
		- #### onMessage
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> onMessage()
		```
		- #### orElse
		
		
		
		```
		public [AbstractActor.Receive](AbstractActor.Receive.html "class in akka.actor") orElse​([AbstractActor.Receive](AbstractActor.Receive.html "class in akka.actor") other)
		```
		
		Composes this `Receive` with a fallback which gets applied
		 where this partial function is not defined.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractActor.Receive.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractActor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/pf/ReceiveBuilder.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractActor.Receive.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractActor.Receive.html)*