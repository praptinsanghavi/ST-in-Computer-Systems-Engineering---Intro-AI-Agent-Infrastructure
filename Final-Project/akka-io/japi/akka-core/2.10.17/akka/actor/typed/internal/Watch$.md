---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:30:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/Watch$.html
title: Watch$
---

# Watch$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class Watch$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<[ActorRef](../ActorRef.html "interface in akka.actor.typed")\<scala.runtime.Nothing$\>,​[ActorRef](../ActorRef.html "interface in akka.actor.typed")\<scala.runtime.Nothing$\>,​akka.actor.typed.internal.Watch\>
	- - akka.actor.typed.internal.Watch$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​akka.actor.typed.internal.Watch>`

---

```
public class Watch$
extends scala.runtime.AbstractFunction2<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​akka.actor.typed.internal.Watch>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.internal.Watch$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Watch$](Watch$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Watch$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.actor.typed.internal.Watch` | `[apply](#apply(akka.actor.typed.ActorRef,akka.actor.typed.ActorRef))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> watchee,  [ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> watcher)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>>>` | `[unapply](#unapply(akka.actor.typed.internal.Watch))​(akka.actor.typed.internal.Watch x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Watch$](Watch$.html "class in akka.actor.typed.internal") MODULE$
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
		`toString` in interface `scala.Function2<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​akka.actor.typed.internal.Watch>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​akka.actor.typed.internal.Watch>`
		- #### apply
		
		
		
		```
		public akka.actor.typed.internal.Watch apply​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> watchee,
		                                             [ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> watcher)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​akka.actor.typed.internal.Watch>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>>> unapply​(akka.actor.typed.internal.Watch x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/Watch$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/Watch$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/Watch$.html)*