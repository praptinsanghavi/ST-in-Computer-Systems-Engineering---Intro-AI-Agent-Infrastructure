---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:30:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/SignalHandler.html
title: SignalHandler
---

# SignalHandler

## Content

Package [akka.persistence.typed.javadsl](package-summary.html)
## Class SignalHandler\<State\>

- java.lang.Object
- - akka.persistence.typed.javadsl.SignalHandler\<State\>

- ---

```
public final class SignalHandler<State>
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SignalHandler](#%3Cinit%3E(scala.PartialFunction))​(scala.PartialFunction<scala.Tuple2<[State](SignalHandler.html "type parameter in SignalHandler"),​[Signal](../../../actor/typed/Signal.html "interface in akka.actor.typed")>,​scala.runtime.BoxedUnit> _handler)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <State> [SignalHandler](SignalHandler.html "class in akka.persistence.typed.javadsl")<State>` | `[empty](#empty())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SignalHandler
		
		
		
		```
		public SignalHandler​(scala.PartialFunction<scala.Tuple2<[State](SignalHandler.html "type parameter in SignalHandler"),​[Signal](../../../actor/typed/Signal.html "interface in akka.actor.typed")>,​scala.runtime.BoxedUnit> _handler)
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public static <State> [SignalHandler](SignalHandler.html "class in akka.persistence.typed.javadsl")<State> empty()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/SignalHandler.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/SignalHandler.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/SignalHandler.html)*