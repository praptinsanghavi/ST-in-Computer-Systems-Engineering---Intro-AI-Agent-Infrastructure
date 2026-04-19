---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:55:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/WithMdcBehaviorInterceptor$.html
title: WithMdcBehaviorInterceptor$
---

# WithMdcBehaviorInterceptor$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class WithMdcBehaviorInterceptor$

- java.lang.Object
- - akka.actor.typed.internal.WithMdcBehaviorInterceptor$

- ---

```
public class WithMdcBehaviorInterceptor$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [WithMdcBehaviorInterceptor$](WithMdcBehaviorInterceptor$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WithMdcBehaviorInterceptor$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[apply](#apply(scala.collection.immutable.Map,scala.Function1,akka.actor.typed.Behavior,scala.reflect.ClassTag))​(scala.collection.immutable.Map<java.lang.String,​java.lang.String> staticMdc,  scala.Function1<T,​scala.collection.immutable.Map<java.lang.String,​java.lang.String>> mdcForMessage,  [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior,  scala.reflect.ClassTag<T> evidence$1)` |  |
	| `scala.Function1<java.lang.Object,​scala.collection.immutable.Map<java.lang.String,​java.lang.String>>` | `[noMdcPerMessage](#noMdcPerMessage())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [WithMdcBehaviorInterceptor$](WithMdcBehaviorInterceptor$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WithMdcBehaviorInterceptor$
		
		
		
		```
		public WithMdcBehaviorInterceptor$()
		```

	- ### Method Detail
	
	
	
		- #### noMdcPerMessage
		
		
		
		```
		public scala.Function1<java.lang.Object,​scala.collection.immutable.Map<java.lang.String,​java.lang.String>> noMdcPerMessage()
		```
		- #### apply
		
		
		
		```
		public <T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> apply​(scala.collection.immutable.Map<java.lang.String,​java.lang.String> staticMdc,
		                             scala.Function1<T,​scala.collection.immutable.Map<java.lang.String,​java.lang.String>> mdcForMessage,
		                             [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior,
		                             scala.reflect.ClassTag<T> evidence$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/WithMdcBehaviorInterceptor$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/WithMdcBehaviorInterceptor$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/WithMdcBehaviorInterceptor$.html)*