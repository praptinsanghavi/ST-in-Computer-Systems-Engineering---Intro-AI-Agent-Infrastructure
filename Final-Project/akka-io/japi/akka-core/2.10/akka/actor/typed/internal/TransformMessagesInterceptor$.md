---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:59:38Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/TransformMessagesInterceptor$.html
title: TransformMessagesInterceptor$
---

# TransformMessagesInterceptor$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class TransformMessagesInterceptor$

- java.lang.Object
- - akka.actor.typed.internal.TransformMessagesInterceptor$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class TransformMessagesInterceptor$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.internal.TransformMessagesInterceptor$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TransformMessagesInterceptor$](TransformMessagesInterceptor$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TransformMessagesInterceptor$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<O,​I>akka.actor.typed.internal.TransformMessagesInterceptor<O,​I>` | `[apply](#apply(scala.PartialFunction,scala.reflect.ClassTag))​(scala.PartialFunction<O,​I> matcher,  scala.reflect.ClassTag<O> evidence$2)` | INTERNAL API |
	| `<O,​I>scala.Option<scala.PartialFunction<O,​I>>` | `[unapply](#unapply(akka.actor.typed.internal.TransformMessagesInterceptor))​(akka.actor.typed.internal.TransformMessagesInterceptor<O,​I> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TransformMessagesInterceptor$](TransformMessagesInterceptor$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TransformMessagesInterceptor$
		
		
		
		```
		public TransformMessagesInterceptor$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <O,​I> akka.actor.typed.internal.TransformMessagesInterceptor<O,​I> apply​(scala.PartialFunction<O,​I> matcher,
		                                                                                           scala.reflect.ClassTag<O> evidence$2)
		```
		
		INTERNAL API
		- #### unapply
		
		
		
		```
		public <O,​I> scala.Option<scala.PartialFunction<O,​I>> unapply​(akka.actor.typed.internal.TransformMessagesInterceptor<O,​I> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/TransformMessagesInterceptor$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/TransformMessagesInterceptor$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/TransformMessagesInterceptor$.html)*