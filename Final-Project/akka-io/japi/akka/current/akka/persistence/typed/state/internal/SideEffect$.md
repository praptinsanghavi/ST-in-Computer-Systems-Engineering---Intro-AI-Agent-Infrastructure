---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/SideEffect$.html
title: SideEffect$
---

# SideEffect$

## Content

Package [akka.persistence.typed.state.internal](package-summary.html)
## Class SideEffect$

- java.lang.Object
- - akka.persistence.typed.state.internal.SideEffect$

- ---

```
public class SideEffect$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SideEffect$](SideEffect$.html "class in akka.persistence.typed.state.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SideEffect$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<State> akka.persistence.typed.state.internal.SideEffect<State>` | `[apply](#apply(scala.Function1))​(scala.Function1<State,​scala.runtime.BoxedUnit> callback)` |  |
	| `<State> akka.persistence.typed.state.internal.SideEffect<State>` | `[unstashAll](#unstashAll())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SideEffect$](SideEffect$.html "class in akka.persistence.typed.state.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SideEffect$
		
		
		
		```
		public SideEffect$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <State> akka.persistence.typed.state.internal.SideEffect<State> apply​(scala.Function1<State,​scala.runtime.BoxedUnit> callback)
		```
		- #### unstashAll
		
		
		
		```
		public <State> akka.persistence.typed.state.internal.SideEffect<State> unstashAll()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/SideEffect$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/SideEffect$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/SideEffect$.html)*