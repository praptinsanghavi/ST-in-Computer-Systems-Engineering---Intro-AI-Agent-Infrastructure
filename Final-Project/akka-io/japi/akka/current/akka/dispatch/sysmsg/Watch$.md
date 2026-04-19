---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:15:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/Watch$.html
title: Watch$
---

# Watch$

## Content

Package [akka.dispatch.sysmsg](package-summary.html)
## Class Watch$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<akka.actor.InternalActorRef,​akka.actor.InternalActorRef,​akka.dispatch.sysmsg.Watch\>
	- - akka.dispatch.sysmsg.Watch$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<akka.actor.InternalActorRef,​akka.actor.InternalActorRef,​akka.dispatch.sysmsg.Watch>`

---

```
public class Watch$
extends scala.runtime.AbstractFunction2<akka.actor.InternalActorRef,​akka.actor.InternalActorRef,​akka.dispatch.sysmsg.Watch>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.dispatch.sysmsg.Watch$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Watch$](Watch$.html "class in akka.dispatch.sysmsg")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Watch$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.dispatch.sysmsg.Watch` | `[apply](#apply(akka.actor.InternalActorRef,akka.actor.InternalActorRef))​(akka.actor.InternalActorRef watchee,  akka.actor.InternalActorRef watcher)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<akka.actor.InternalActorRef,​akka.actor.InternalActorRef>>` | `[unapply](#unapply(akka.dispatch.sysmsg.Watch))​(akka.dispatch.sysmsg.Watch x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Watch$](Watch$.html "class in akka.dispatch.sysmsg") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Watch$
		
		
		
		```
		public Watch$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<akka.actor.InternalActorRef,​akka.actor.InternalActorRef,​akka.dispatch.sysmsg.Watch>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<akka.actor.InternalActorRef,​akka.actor.InternalActorRef,​akka.dispatch.sysmsg.Watch>`
		- #### apply
		
		
		
		```
		public akka.dispatch.sysmsg.Watch apply​(akka.actor.InternalActorRef watchee,
		                                        akka.actor.InternalActorRef watcher)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<akka.actor.InternalActorRef,​akka.actor.InternalActorRef,​akka.dispatch.sysmsg.Watch>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<akka.actor.InternalActorRef,​akka.actor.InternalActorRef>> unapply​(akka.dispatch.sysmsg.Watch x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/Watch$.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/Watch$.html](https://doc.akka.io/japi/akka/current/akka/dispatch/sysmsg/Watch$.html)*