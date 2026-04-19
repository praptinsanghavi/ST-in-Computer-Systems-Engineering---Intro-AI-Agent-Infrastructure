---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:55:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/DeathWatchNotification$.html
title: DeathWatchNotification$
---

# DeathWatchNotification$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class DeathWatchNotification$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<[ActorRef](../ActorRef.html "interface in akka.actor.typed")\<scala.runtime.Nothing$\>,​java.lang.Throwable,​akka.actor.typed.internal.DeathWatchNotification\>
	- - akka.actor.typed.internal.DeathWatchNotification$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​java.lang.Throwable,​akka.actor.typed.internal.DeathWatchNotification>`

---

```
public class DeathWatchNotification$
extends scala.runtime.AbstractFunction2<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​java.lang.Throwable,​akka.actor.typed.internal.DeathWatchNotification>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.internal.DeathWatchNotification$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DeathWatchNotification$](DeathWatchNotification$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeathWatchNotification$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.actor.typed.internal.DeathWatchNotification` | `[apply](#apply(akka.actor.typed.ActorRef,java.lang.Throwable))​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> actor,  java.lang.Throwable failureCause)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​java.lang.Throwable>>` | `[unapply](#unapply(akka.actor.typed.internal.DeathWatchNotification))​(akka.actor.typed.internal.DeathWatchNotification x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DeathWatchNotification$](DeathWatchNotification$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DeathWatchNotification$
		
		
		
		```
		public DeathWatchNotification$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​java.lang.Throwable,​akka.actor.typed.internal.DeathWatchNotification>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​java.lang.Throwable,​akka.actor.typed.internal.DeathWatchNotification>`
		- #### apply
		
		
		
		```
		public akka.actor.typed.internal.DeathWatchNotification apply​([ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$> actor,
		                                                              java.lang.Throwable failureCause)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​java.lang.Throwable,​akka.actor.typed.internal.DeathWatchNotification>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[ActorRef](../ActorRef.html "interface in akka.actor.typed")<scala.runtime.Nothing$>,​java.lang.Throwable>> unapply​(akka.actor.typed.internal.DeathWatchNotification x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/DeathWatchNotification$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/DeathWatchNotification$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/DeathWatchNotification$.html)*