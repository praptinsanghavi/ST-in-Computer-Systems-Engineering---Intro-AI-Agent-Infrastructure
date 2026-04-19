---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:59:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/MonitorInterceptor$.html
title: MonitorInterceptor$
---

# MonitorInterceptor$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class MonitorInterceptor$

- java.lang.Object
- - akka.actor.typed.internal.MonitorInterceptor$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class MonitorInterceptor$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.internal.MonitorInterceptor$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MonitorInterceptor$](MonitorInterceptor$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MonitorInterceptor$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> akka.actor.typed.internal.MonitorInterceptor<T>` | `[apply](#apply(akka.actor.typed.ActorRef,scala.reflect.ClassTag))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> actorRef,  scala.reflect.ClassTag<T> evidence$1)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<T> scala.Option<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>>` | `[unapply](#unapply(akka.actor.typed.internal.MonitorInterceptor))​(akka.actor.typed.internal.MonitorInterceptor<T> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MonitorInterceptor$](MonitorInterceptor$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MonitorInterceptor$
		
		
		
		```
		public MonitorInterceptor$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public <T> akka.actor.typed.internal.MonitorInterceptor<T> apply​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<T> actorRef,
		                                                                 scala.reflect.ClassTag<T> evidence$1)
		```
		- #### unapply
		
		
		
		```
		public <T> scala.Option<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<T>> unapply​(akka.actor.typed.internal.MonitorInterceptor<T> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/MonitorInterceptor$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/MonitorInterceptor$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/MonitorInterceptor$.html)*