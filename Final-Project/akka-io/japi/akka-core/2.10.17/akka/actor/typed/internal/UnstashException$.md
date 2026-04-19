---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:30:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/UnstashException$.html
title: UnstashException$
---

# UnstashException$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class UnstashException$

- java.lang.Object
- - akka.actor.typed.internal.UnstashException$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class UnstashException$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.internal.UnstashException$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [UnstashException$](UnstashException$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnstashException$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> akka.actor.typed.internal.UnstashException<T>` | `[apply](#apply(java.lang.Throwable,akka.actor.typed.Behavior))​(java.lang.Throwable cause,  [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)` | INTERNAL API: |
	| `<T> scala.Option<scala.Tuple2<java.lang.Throwable,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>>>` | `[unapply](#unapply(akka.actor.typed.internal.UnstashException))​(akka.actor.typed.internal.UnstashException<T> x$0)` |  |
	| `java.lang.Throwable` | `[unwrap](#unwrap(java.lang.Throwable))​(java.lang.Throwable t)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [UnstashException$](UnstashException$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### UnstashException$
		
		
		
		```
		public UnstashException$()
		```

	- ### Method Detail
	
	
	
		- #### unwrap
		
		
		
		```
		public java.lang.Throwable unwrap​(java.lang.Throwable t)
		```
		- #### apply
		
		
		
		```
		public <T> akka.actor.typed.internal.UnstashException<T> apply​(java.lang.Throwable cause,
		                                                               [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)
		```
		
		INTERNAL API:
		 
		 When unstashing, the exception is wrapped in UnstashException because supervisor strategy
		 and ActorAdapter need the behavior that threw. It will use the behavior in the `UnstashException`
		 to emit the PreRestart and PostStop to the right behavior and install the latest behavior for resume strategy.
		- #### unapply
		
		
		
		```
		public <T> scala.Option<scala.Tuple2<java.lang.Throwable,​[Behavior](../Behavior.html "class in akka.actor.typed")<T>>> unapply​(akka.actor.typed.internal.UnstashException<T> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/UnstashException$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/UnstashException$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/UnstashException$.html)*