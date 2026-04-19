---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:55:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/InterceptorImpl$.html
title: InterceptorImpl$
---

# InterceptorImpl$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class InterceptorImpl$

- java.lang.Object
- - akka.actor.typed.internal.InterceptorImpl$

- ---

```
public class InterceptorImpl$
extends java.lang.Object
```

Provides the impl of any behavior that could nest another behavior
 
 INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [InterceptorImpl$](InterceptorImpl$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[InterceptorImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<O,​I>[Behavior](../Behavior.html "class in akka.actor.typed")<O>` | `[apply](#apply(scala.Function0,akka.actor.typed.Behavior))​(scala.Function0<[BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")<O,​I>> interceptor,  [Behavior](../Behavior.html "class in akka.actor.typed")<I> nestedBehavior)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [InterceptorImpl$](InterceptorImpl$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### InterceptorImpl$
		
		
		
		```
		public InterceptorImpl$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <O,​I> [Behavior](../Behavior.html "class in akka.actor.typed")<O> apply​(scala.Function0<[BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")<O,​I>> interceptor,
		                                     [Behavior](../Behavior.html "class in akka.actor.typed")<I> nestedBehavior)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/InterceptorImpl$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/InterceptorImpl$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/InterceptorImpl$.html)*