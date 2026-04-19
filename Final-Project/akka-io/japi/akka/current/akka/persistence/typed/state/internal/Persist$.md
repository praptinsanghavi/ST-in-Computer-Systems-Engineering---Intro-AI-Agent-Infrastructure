---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:31:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/Persist$.html
title: Persist$
---

# Persist$

## Content

Package [akka.persistence.typed.state.internal](package-summary.html)
## Class Persist$

- java.lang.Object
- - akka.persistence.typed.state.internal.Persist$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class Persist$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.persistence.typed.state.internal.Persist$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Persist$](Persist$.html "class in akka.persistence.typed.state.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Persist$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<State> akka.persistence.typed.state.internal.Persist<State>` | `[apply](#apply(State))​(State newState)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<State> scala.Option<State>` | `[unapply](#unapply(akka.persistence.typed.state.internal.Persist))​(akka.persistence.typed.state.internal.Persist<State> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Persist$](Persist$.html "class in akka.persistence.typed.state.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Persist$
		
		
		
		```
		public Persist$()
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
		public <State> akka.persistence.typed.state.internal.Persist<State> apply​(State newState)
		```
		- #### unapply
		
		
		
		```
		public <State> scala.Option<State> unapply​(akka.persistence.typed.state.internal.Persist<State> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/Persist$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/Persist$.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/state/internal/Persist$.html)*