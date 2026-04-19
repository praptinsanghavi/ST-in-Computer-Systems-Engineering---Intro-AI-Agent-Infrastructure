---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:08:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/sysmsg/DeathWatchNotification$.html
title: DeathWatchNotification$
---

# DeathWatchNotification$

## Content

Package [akka.dispatch.sysmsg](package-summary.html)
## Class DeathWatchNotification$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​java.lang.Object,​java.lang.Object,​akka.dispatch.sysmsg.DeathWatchNotification\>
	- - akka.dispatch.sysmsg.DeathWatchNotification$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​java.lang.Object,​java.lang.Object,​akka.dispatch.sysmsg.DeathWatchNotification>`

---

```
public class DeathWatchNotification$
extends scala.runtime.AbstractFunction3<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​java.lang.Object,​java.lang.Object,​akka.dispatch.sysmsg.DeathWatchNotification>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.dispatch.sysmsg.DeathWatchNotification$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DeathWatchNotification$](DeathWatchNotification$.html "class in akka.dispatch.sysmsg")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeathWatchNotification$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.dispatch.sysmsg.DeathWatchNotification` | `[apply](#apply(akka.actor.ActorRef,boolean,boolean))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actor,  boolean existenceConfirmed,  boolean addressTerminated)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.dispatch.sysmsg.DeathWatchNotification))​(akka.dispatch.sysmsg.DeathWatchNotification x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function3
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DeathWatchNotification$](DeathWatchNotification$.html "class in akka.dispatch.sysmsg") MODULE$
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
		`toString` in interface `scala.Function3<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​java.lang.Object,​java.lang.Object,​akka.dispatch.sysmsg.DeathWatchNotification>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​java.lang.Object,​java.lang.Object,​akka.dispatch.sysmsg.DeathWatchNotification>`
		- #### apply
		
		
		
		```
		public akka.dispatch.sysmsg.DeathWatchNotification apply​([ActorRef](../../actor/ActorRef.html "class in akka.actor") actor,
		                                                         boolean existenceConfirmed,
		                                                         boolean addressTerminated)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​java.lang.Object,​java.lang.Object>> unapply​(akka.dispatch.sysmsg.DeathWatchNotification x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/sysmsg/DeathWatchNotification$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/sysmsg/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/sysmsg/DeathWatchNotification$.html](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/sysmsg/DeathWatchNotification$.html)*