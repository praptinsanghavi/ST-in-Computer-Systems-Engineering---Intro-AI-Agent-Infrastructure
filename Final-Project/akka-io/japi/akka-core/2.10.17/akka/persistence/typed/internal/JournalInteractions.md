---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:48:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/JournalInteractions.EventToPersist$.html
title: JournalInteractions.EventToPersist$
---

# JournalInteractions.EventToPersist$

## Content

Package [akka.persistence.typed.internal](package-summary.html)
## Class JournalInteractions.EventToPersist$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<java.lang.Object,​java.lang.String,​scala.Option\<java.lang.Object\>,​[JournalInteractions.EventToPersist](JournalInteractions.EventToPersist.html "class in akka.persistence.typed.internal")\>
	- - akka.persistence.typed.internal.JournalInteractions.EventToPersist$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<java.lang.Object,​java.lang.String,​scala.Option<java.lang.Object>,​[JournalInteractions.EventToPersist](JournalInteractions.EventToPersist.html "class in akka.persistence.typed.internal")>`

Enclosing interface:
[JournalInteractions](JournalInteractions.html "interface in akka.persistence.typed.internal")\<[C](JournalInteractions.html "type parameter in JournalInteractions"),​[E](JournalInteractions.html "type parameter in JournalInteractions"),​[S](JournalInteractions.html "type parameter in JournalInteractions")\>

---

```
public static class JournalInteractions.EventToPersist$
extends scala.runtime.AbstractFunction3<java.lang.Object,​java.lang.String,​scala.Option<java.lang.Object>,​[JournalInteractions.EventToPersist](JournalInteractions.EventToPersist.html "class in akka.persistence.typed.internal")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.internal.JournalInteractions.EventToPersist$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [JournalInteractions.EventToPersist$](JournalInteractions.EventToPersist$.html "class in akka.persistence.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventToPersist$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[JournalInteractions.EventToPersist](JournalInteractions.EventToPersist.html "class in akka.persistence.typed.internal")` | `[apply](#apply(java.lang.Object,java.lang.String,scala.Option))​(java.lang.Object adaptedEvent,  java.lang.String manifest,  scala.Option<java.lang.Object> metadata)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<java.lang.Object,​java.lang.String,​scala.Option<java.lang.Object>>>` | `[unapply](#unapply(akka.persistence.typed.internal.JournalInteractions.EventToPersist))​([JournalInteractions.EventToPersist](JournalInteractions.EventToPersist.html "class in akka.persistence.typed.internal") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [JournalInteractions.EventToPersist$](JournalInteractions.EventToPersist$.html "class in akka.persistence.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventToPersist$
		
		
		
		```
		public EventToPersist$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<java.lang.Object,​java.lang.String,​scala.Option<java.lang.Object>,​[JournalInteractions.EventToPersist](JournalInteractions.EventToPersist.html "class in akka.persistence.typed.internal")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<java.lang.Object,​java.lang.String,​scala.Option<java.lang.Object>,​[JournalInteractions.EventToPersist](JournalInteractions.EventToPersist.html "class in akka.persistence.typed.internal")>`
		- #### apply
		
		
		
		```
		public [JournalInteractions.EventToPersist](JournalInteractions.EventToPersist.html "class in akka.persistence.typed.internal") apply​(java.lang.Object adaptedEvent,
		                                                java.lang.String manifest,
		                                                scala.Option<java.lang.Object> metadata)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function3<java.lang.Object,​java.lang.String,​scala.Option<java.lang.Object>,​[JournalInteractions.EventToPersist](JournalInteractions.EventToPersist.html "class in akka.persistence.typed.internal")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<java.lang.Object,​java.lang.String,​scala.Option<java.lang.Object>>> unapply​([JournalInteractions.EventToPersist](JournalInteractions.EventToPersist.html "class in akka.persistence.typed.internal") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/JournalInteractions.EventToPersist$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/JournalInteractions.EventToPersist.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/JournalInteractions.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/JournalInteractions.EventToPersist$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/internal/JournalInteractions.EventToPersist$.html)*