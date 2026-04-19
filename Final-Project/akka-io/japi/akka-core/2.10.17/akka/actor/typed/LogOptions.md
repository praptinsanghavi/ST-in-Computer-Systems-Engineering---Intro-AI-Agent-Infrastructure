---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:32:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/LogOptions.LogOptionsImpl$.html
title: LogOptions.LogOptionsImpl$
---

# LogOptions.LogOptionsImpl$

## Content

Package [akka.actor.typed](package-summary.html)
## Class LogOptions.LogOptionsImpl$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<java.lang.Object,​org.slf4j.event.Level,​scala.Option\<org.slf4j.Logger\>,​akka.actor.typed.LogOptions.LogOptionsImpl\>
	- - akka.actor.typed.LogOptions.LogOptionsImpl$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<java.lang.Object,​org.slf4j.event.Level,​scala.Option<org.slf4j.Logger>,​akka.actor.typed.LogOptions.LogOptionsImpl>`

Enclosing class:
[LogOptions](LogOptions.html "class in akka.actor.typed")

---

```
public static class LogOptions.LogOptionsImpl$
extends scala.runtime.AbstractFunction3<java.lang.Object,​org.slf4j.event.Level,​scala.Option<org.slf4j.Logger>,​akka.actor.typed.LogOptions.LogOptionsImpl>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.actor.typed.LogOptions.LogOptionsImpl$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [LogOptions.LogOptionsImpl$](LogOptions.LogOptionsImpl$.html "class in akka.actor.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LogOptionsImpl$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.actor.typed.LogOptions.LogOptionsImpl` | `[apply](#apply(boolean,org.slf4j.event.Level,scala.Option))​(boolean enabled,  org.slf4j.event.Level level,  scala.Option<org.slf4j.Logger> logger)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<java.lang.Object,​org.slf4j.event.Level,​scala.Option<org.slf4j.Logger>>>` | `[unapply](#unapply(akka.actor.typed.LogOptions.LogOptionsImpl))​(akka.actor.typed.LogOptions.LogOptionsImpl x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function3
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [LogOptions.LogOptionsImpl$](LogOptions.LogOptionsImpl$.html "class in akka.actor.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### LogOptionsImpl$
		
		
		
		```
		public LogOptionsImpl$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<java.lang.Object,​org.slf4j.event.Level,​scala.Option<org.slf4j.Logger>,​akka.actor.typed.LogOptions.LogOptionsImpl>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<java.lang.Object,​org.slf4j.event.Level,​scala.Option<org.slf4j.Logger>,​akka.actor.typed.LogOptions.LogOptionsImpl>`
		- #### apply
		
		
		
		```
		public akka.actor.typed.LogOptions.LogOptionsImpl apply​(boolean enabled,
		                                                        org.slf4j.event.Level level,
		                                                        scala.Option<org.slf4j.Logger> logger)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<java.lang.Object,​org.slf4j.event.Level,​scala.Option<org.slf4j.Logger>>> unapply​(akka.actor.typed.LogOptions.LogOptionsImpl x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/LogOptions.LogOptionsImpl$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/LogOptions.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/LogOptions.LogOptionsImpl$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/LogOptions.LogOptionsImpl$.html)*