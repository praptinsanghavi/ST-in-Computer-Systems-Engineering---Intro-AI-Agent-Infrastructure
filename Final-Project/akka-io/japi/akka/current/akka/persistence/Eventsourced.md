---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:22:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/Eventsourced.StashingHandlerInvocation$.html
title: Eventsourced.StashingHandlerInvocation$
---

# Eventsourced.StashingHandlerInvocation$

## Content

Package [akka.persistence](package-summary.html)
## Class Eventsourced.StashingHandlerInvocation$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<java.lang.Object,​scala.Function1\<java.lang.Object,​scala.runtime.BoxedUnit\>,​[Eventsourced.StashingHandlerInvocation](Eventsourced.StashingHandlerInvocation.html "class in akka.persistence")\>
	- - akka.persistence.Eventsourced.StashingHandlerInvocation$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<java.lang.Object,​scala.Function1<java.lang.Object,​scala.runtime.BoxedUnit>,​[Eventsourced.StashingHandlerInvocation](Eventsourced.StashingHandlerInvocation.html "class in akka.persistence")>`

Enclosing interface:
[Eventsourced](Eventsourced.html "interface in akka.persistence")

---

```
public static class Eventsourced.StashingHandlerInvocation$
extends scala.runtime.AbstractFunction2<java.lang.Object,​scala.Function1<java.lang.Object,​scala.runtime.BoxedUnit>,​[Eventsourced.StashingHandlerInvocation](Eventsourced.StashingHandlerInvocation.html "class in akka.persistence")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.Eventsourced.StashingHandlerInvocation$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Eventsourced.StashingHandlerInvocation$](Eventsourced.StashingHandlerInvocation$.html "class in akka.persistence")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StashingHandlerInvocation$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Eventsourced.StashingHandlerInvocation](Eventsourced.StashingHandlerInvocation.html "class in akka.persistence")` | `[apply](#apply(java.lang.Object,scala.Function1))​(java.lang.Object evt,  scala.Function1<java.lang.Object,​scala.runtime.BoxedUnit> handler)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<java.lang.Object,​scala.Function1<java.lang.Object,​scala.runtime.BoxedUnit>>>` | `[unapply](#unapply(akka.persistence.Eventsourced.StashingHandlerInvocation))​([Eventsourced.StashingHandlerInvocation](Eventsourced.StashingHandlerInvocation.html "class in akka.persistence") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Eventsourced.StashingHandlerInvocation$](Eventsourced.StashingHandlerInvocation$.html "class in akka.persistence") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### StashingHandlerInvocation$
		
		
		
		```
		public StashingHandlerInvocation$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<java.lang.Object,​scala.Function1<java.lang.Object,​scala.runtime.BoxedUnit>,​[Eventsourced.StashingHandlerInvocation](Eventsourced.StashingHandlerInvocation.html "class in akka.persistence")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<java.lang.Object,​scala.Function1<java.lang.Object,​scala.runtime.BoxedUnit>,​[Eventsourced.StashingHandlerInvocation](Eventsourced.StashingHandlerInvocation.html "class in akka.persistence")>`
		- #### apply
		
		
		
		```
		public [Eventsourced.StashingHandlerInvocation](Eventsourced.StashingHandlerInvocation.html "class in akka.persistence") apply​(java.lang.Object evt,
		                                                    scala.Function1<java.lang.Object,​scala.runtime.BoxedUnit> handler)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<java.lang.Object,​scala.Function1<java.lang.Object,​scala.runtime.BoxedUnit>,​[Eventsourced.StashingHandlerInvocation](Eventsourced.StashingHandlerInvocation.html "class in akka.persistence")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​scala.Function1<java.lang.Object,​scala.runtime.BoxedUnit>>> unapply​([Eventsourced.StashingHandlerInvocation](Eventsourced.StashingHandlerInvocation.html "class in akka.persistence") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/Eventsourced.StashingHandlerInvocation$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/Eventsourced.StashingHandlerInvocation.html
- https://doc.akka.io/japi/akka/current/akka/persistence/Eventsourced.html
- https://doc.akka.io/japi/akka/current/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/Eventsourced.StashingHandlerInvocation$.html](https://doc.akka.io/japi/akka/current/akka/persistence/Eventsourced.StashingHandlerInvocation$.html)*