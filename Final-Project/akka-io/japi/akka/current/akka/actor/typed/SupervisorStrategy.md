---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:39:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/SupervisorStrategy.Resume$.html
title: SupervisorStrategy.Resume$
---

# SupervisorStrategy.Resume$

## Content

Package [akka.actor.typed](package-summary.html)
## Class SupervisorStrategy.Resume$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<java.lang.Object,​org.slf4j.event.Level,​akka.actor.typed.SupervisorStrategy.Resume\>
	- - akka.actor.typed.SupervisorStrategy.Resume$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<java.lang.Object,​org.slf4j.event.Level,​akka.actor.typed.SupervisorStrategy.Resume>`

Enclosing class:
[SupervisorStrategy](SupervisorStrategy.html "class in akka.actor.typed")

---

```
public static class SupervisorStrategy.Resume$
extends scala.runtime.AbstractFunction2<java.lang.Object,​org.slf4j.event.Level,​akka.actor.typed.SupervisorStrategy.Resume>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.actor.typed.SupervisorStrategy.Resume$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SupervisorStrategy.Resume$](SupervisorStrategy.Resume$.html "class in akka.actor.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Resume$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.actor.typed.SupervisorStrategy.Resume` | `[apply](#apply(boolean,org.slf4j.event.Level))​(boolean loggingEnabled,  org.slf4j.event.Level logLevel)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<java.lang.Object,​org.slf4j.event.Level>>` | `[unapply](#unapply(akka.actor.typed.SupervisorStrategy.Resume))​(akka.actor.typed.SupervisorStrategy.Resume x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function2
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SupervisorStrategy.Resume$](SupervisorStrategy.Resume$.html "class in akka.actor.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Resume$
		
		
		
		```
		public Resume$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<java.lang.Object,​org.slf4j.event.Level,​akka.actor.typed.SupervisorStrategy.Resume>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<java.lang.Object,​org.slf4j.event.Level,​akka.actor.typed.SupervisorStrategy.Resume>`
		- #### apply
		
		
		
		```
		public akka.actor.typed.SupervisorStrategy.Resume apply​(boolean loggingEnabled,
		                                                        org.slf4j.event.Level logLevel)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​org.slf4j.event.Level>> unapply​(akka.actor.typed.SupervisorStrategy.Resume x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/SupervisorStrategy.Resume$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/SupervisorStrategy.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/SupervisorStrategy.Resume$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/SupervisorStrategy.Resume$.html)*