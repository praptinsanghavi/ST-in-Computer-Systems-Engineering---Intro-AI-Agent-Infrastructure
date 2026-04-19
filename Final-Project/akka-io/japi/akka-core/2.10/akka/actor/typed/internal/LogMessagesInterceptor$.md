---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:00:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/LogMessagesInterceptor$.html
title: LogMessagesInterceptor$
---

# LogMessagesInterceptor$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class LogMessagesInterceptor$

- java.lang.Object
- - akka.actor.typed.internal.LogMessagesInterceptor$

- ---

```
public class LogMessagesInterceptor$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LogMessagesInterceptor$](LogMessagesInterceptor$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LogMessagesInterceptor$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")<T,​T>` | `[apply](#apply(akka.actor.typed.LogOptions))​([LogOptions](../LogOptions.html "class in akka.actor.typed") opts)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LogMessagesInterceptor$](LogMessagesInterceptor$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LogMessagesInterceptor$
		
		
		
		```
		public LogMessagesInterceptor$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")<T,​T> apply​([LogOptions](../LogOptions.html "class in akka.actor.typed") opts)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/LogOptions.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/LogMessagesInterceptor$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/LogMessagesInterceptor$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/LogMessagesInterceptor$.html)*